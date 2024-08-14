package treinamento_restassured.testCase;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import io.qameta.allure.Description;
import io.restassured.response.Response;
import treinamento_restassured.service.LyricService;
import treinamento_restassured.validation.LyricValidation;

public class LyricTestCase {
private Map<String, Object> pathParametersMap;
    private LyricService lyricService;
    private LyricValidation lyricValidation;

    public LyricTestCase() {
        pathParametersMap = new HashMap<>();
        lyricService = new LyricService();
        lyricValidation =  new LyricValidation();
    }

    @Test
    @DisplayName("Teste leo")
    @Description("Teste leo Descricao")
    public void testLeo() {
        pathParametersMap.put("ARTIST", "Coldplay");
        pathParametersMap.put("TITLE", "Adventure of a Lifetime");

        Response resposta = lyricService.getLyric(pathParametersMap);
        lyricValidation.setResponse(resposta);
        lyricValidation.validarStatusCode(200);

    }

}