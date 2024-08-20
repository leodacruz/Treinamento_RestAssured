package treinamento_restassured.service;

import java.util.Map;
import java.util.Properties;

import io.qameta.allure.Allure;
import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import treinamento_restassured.utils.FileProperties;

public class LyricService {

    RequestSpecBuilder requestSpecBuilder;
    Properties rotaEndpoint;

    public LyricService() {
        rotaEndpoint = FileProperties.getProperties("Lyric_RotaEndpoint");
        requestSpecBuilder = new RequestSpecBuilder();
        requestSpecBuilder
                .setBaseUri(rotaEndpoint.getProperty("baseUriProducao"))
                .setContentType(ContentType.JSON)
                .setRelaxedHTTPSValidation();
    }

    public Response getLyric(Map<String, Object> pathParametersMap) {
        Allure.parameter("Artista:", pathParametersMap.get("ARTIST"));
        Allure.parameter("Musica:", pathParametersMap.get("TITLE"));
        Response resposta = RestAssured
                .given()
                .spec(requestSpecBuilder.build())
                .pathParams(pathParametersMap)
                .log().all()
                .filter(new AllureRestAssured())
                .get(rotaEndpoint.getProperty("basePath"));
        return resposta;
    }

}