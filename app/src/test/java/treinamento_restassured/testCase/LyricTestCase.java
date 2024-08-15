package treinamento_restassured.testCase;

import java.util.HashMap;
import java.util.Map;
import io.qameta.allure.*;
import io.qameta.allure.Step;
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
    @DisplayName("Teste leo")
    @Description("Teste leo Descricao")
    @Owner("eu mesmo")
    @Tag("Regressao")
    public void testLeo() {
        Allure.step("Iniciando o Teste");
        

        Allure.step("Preparação dos Dados",()->{
            pathParametersMap.put("ARTIST", "Coldplay");
            pathParametersMap.put("TITLE", "Adventure of a Lifetime"); 
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