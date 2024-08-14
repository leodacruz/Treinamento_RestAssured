package treinamento_restassured.service;

import java.util.Map;

import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class LyricService {

    String baseUriProducao = "https://api.lyrics.ovh";
    String baseUriMock = "";
    String basePath = "/v1/{ARTIST}/{TITLE}";
    RequestSpecBuilder requestSpecBuilder;

    public LyricService() {

        requestSpecBuilder = new RequestSpecBuilder();
        requestSpecBuilder
                .setBaseUri(baseUriProducao)
                .setBasePath(basePath)
                .setContentType(ContentType.JSON)
                .setRelaxedHTTPSValidation();
    }

    public Response getLyric(Map<String, Object> pathParametersMap) {

        Response resposta = RestAssured
                .given()
                .spec(requestSpecBuilder.build())
                .pathParams(pathParametersMap)
                .filter(new AllureRestAssured())
                .log().all()
                .get();
        return resposta;

    }

}
