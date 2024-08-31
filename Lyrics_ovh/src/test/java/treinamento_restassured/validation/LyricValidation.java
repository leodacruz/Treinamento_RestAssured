package treinamento_restassured.validation;

import java.io.File;

import io.restassured.response.Response;
import treinamento_restassured.utils.ReportGenerico;
import org.junit.jupiter.api.Assertions;

import io.restassured.module.jsv.JsonSchemaValidator;

public class LyricValidation {

    private Response resposta;

    public LyricValidation() {
    }

    public void setResponse(Response resposta) {
        this.resposta = resposta;
        this.resposta.then().log().all();
    }

    public void validarStatusCode(int statusCode) {
        ReportGenerico.step("validar status code",()->{
            int statusCodeReal = this.resposta.getStatusCode();
            Assertions.assertEquals(statusCodeReal, statusCode);
        });
    }

    public void validarContrato(File jsonContrato) {
        ReportGenerico.step("validar Contrato",()->{
            resposta.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonContrato));
        });
    }

    public void validarMensagemErro() {
        ReportGenerico.step("validar mensagem de erro",()->{
            String mensagemAtual = resposta.jsonPath().getString("error");
            Assertions.assertEquals("No lyrics found", mensagemAtual);
        });
    }


}