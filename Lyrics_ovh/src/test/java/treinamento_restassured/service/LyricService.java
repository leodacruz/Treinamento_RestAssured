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
import treinamento_restassured.utils.ReportGenerico;

public class LyricService {

    RequestSpecBuilder requestSpecBuilder;
    Properties rotaEndpoint;
    Response resposta;

    public LyricService() {
        rotaEndpoint = FileProperties.getProperties("Lyric_RotaEndpoint");
        requestSpecBuilder = new RequestSpecBuilder();
        requestSpecBuilder
                .setBaseUri(rotaEndpoint.getProperty("baseUriProducao"))
                .setContentType(ContentType.JSON)
                .setRelaxedHTTPSValidation();
    }

    public Response getLyric(Map<String, Object> pathParametersMap) {
        
        ReportGenerico.parameter("Artista", pathParametersMap.get("ARTIST").toString());
        ReportGenerico.parameter("Musica", pathParametersMap.get("TITLE").toString());

            resposta = RestAssured
            .given()
            .spec(requestSpecBuilder.build())
            .pathParams(pathParametersMap)
            .log().all()
            .filter(new AllureRestAssured()
                .setResponseAttachmentName("Resposta da Requisição")
                .setRequestAttachmentName("Requisição"))
           .get(rotaEndpoint.getProperty("basePath"));
       
        ReportGenerico.step("Requisição realizada com sucesso");

        return resposta;
    }

}