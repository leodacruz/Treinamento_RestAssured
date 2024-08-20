package treinamento_restassured.testCase;

import java.util.HashMap;
import java.util.Map;
import io.qameta.allure.*;
import io.qameta.allure.model.Status;

import org.apache.http.HttpStatus;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import io.restassured.response.Response;
import treinamento_restassured.service.LyricService;
import treinamento_restassured.utils.JsonContrato;
import treinamento_restassured.validation.LyricValidation;

public class LyricTestCase {
    private Map<String, Object> pathParametersMap;
    private LyricService lyricService;
    private LyricValidation lyricValidation;

    public LyricTestCase() {
        pathParametersMap = new HashMap<>();
        lyricService = new LyricService();
        lyricValidation = new LyricValidation();
    }

    @Test
    @DisplayName("Validar sucesso ao pesquisar uma Musica")
    @Tag("Regressao")
    public void testLeo() {
        Allure.description("Desccricao bonita do teste que pode ser lida de um JSON !!!!!!!!!!!!!!"); //individual, caso eu bote isso na classe ele vai sobrescrever
        Allure.label("owner", "Leonardo Cruz QA"); //individual, caso eu bote isso na classe ele vai sobrescrever
        
        Allure.step("Iniciando o Teste");  //usado para aparecer no relatorio na aba de execucao do teste        

        Allure.step("Preparação dos Dados",()->{
            pathParametersMap.put("ARTIST", "Emicida");
            pathParametersMap.put("TITLE", "Amarelo"); 
          //  Allure.parameter("Artista", pathParametersMap.get("ARTIST"));
           // Allure.parameter("Musica", pathParametersMap.get("TITLE"));
        });

        Allure.step("Preparação dos Dados",Status.PASSED);
        Response resposta = lyricService.getLyric(pathParametersMap);
        Allure.step("Requisição Realizada",Status.PASSED);
        lyricValidation.setResponse(resposta);
        Allure.step("Preparar para validar a Resposta",Status.PASSED);
        lyricValidation.validarStatusCode(HttpStatus.SC_OK);
        Allure.step("Validacao Status Code",Status.PASSED);


        Allure.step("Validar teste contrato",()->{
             lyricValidation.validarContrato(JsonContrato.getFile("Lyric_2xx_Contrato"));
        });

       
       // Allure.step("Validar teste contrato",Status.PASSED);
    }

}