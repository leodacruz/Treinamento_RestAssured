package treinamento_restassured.validation;

import java.io.File;

import io.restassured.response.Response;
import io.restassured.RestAssured.*;
import io.restassured.matcher.RestAssuredMatchers.*;
import org.hamcrest.Matchers.*;

import io.restassured.module.jsv.JsonSchemaValidator;

public class LyricValidation {

    private Response resposta;

    public LyricValidation() {
    }

    public void setResponse(Response resposta) {
        this.resposta = resposta;
        resposta.then().log().all();
    }

    public void validarStatusCode(int statusCode){
        resposta.then().assertThat().statusCode(statusCode);
    }

    public void validarContrato(File jsonContrato) {
        resposta.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonContrato));
    }

    







}