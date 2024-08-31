package treinamento_restassured.testCase;

import java.util.HashMap;
import java.util.Map;

import org.apache.http.HttpStatus;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import io.restassured.response.Response;
import treinamento_restassured.service.LyricService;
import treinamento_restassured.utils.JsonContrato;
import treinamento_restassured.utils.ReportGenerico;
import treinamento_restassured.validation.LyricValidation;


@TestMethodOrder(OrderAnnotation.class)
public class LyricTestCase extends LyricBaseTestCase {
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
    @Order(1)
    public void sucessoBuscarMusica() {
        ReportGenerico.descricaoTeste("Teste para validar a busca de uma musica");
        ReportGenerico.donoTeste("Leonardo Cruz QA");
        
        pathParametersMap.put("ARTIST", "Emicida");
        pathParametersMap.put("TITLE", "Amarelo"); 
       
        Response resposta = lyricService.getLyric(pathParametersMap);

        //validações
        lyricValidation.setResponse(resposta);
        lyricValidation.validarStatusCode(HttpStatus.SC_OK);
        lyricValidation.validarContrato(JsonContrato.getFile("Lyric_2xx_Contrato"));
    }

    @Test
    @DisplayName("Validar erro ao pesquisar uma Musica")
    @Tag("Regressao")
    @Order(2)
    public void erroBuscarMusica() {
        ReportGenerico.descricaoTeste("Teste para validar o erro ao buscar uma musica");
        ReportGenerico.donoTeste("Leonardo Cruz QA");
        
        pathParametersMap.put("ARTIST", "Emicida");
        pathParametersMap.put("TITLE", "erro musica"); 
        
        Response resposta = lyricService.getLyric(pathParametersMap);

        //validações
        lyricValidation.setResponse(resposta);
        lyricValidation.validarStatusCode(HttpStatus.SC_NOT_FOUND);
        lyricValidation.validarContrato(JsonContrato.getFile("Lyric_4xx_Contrato"));
        lyricValidation.validarMensagemErro();
    }
}