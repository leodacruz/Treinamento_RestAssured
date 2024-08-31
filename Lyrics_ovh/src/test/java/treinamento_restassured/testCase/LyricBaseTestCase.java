package treinamento_restassured.testCase;

import treinamento_restassured.utils.ReportGenerico;
import treinamento_restassured.utils.ReportGenerico.ReportNome;

public class LyricBaseTestCase {

    public LyricBaseTestCase() {
          ReportGenerico.setReport(ReportNome.ALLURE_REPORT); //seta o report que vai ser gerado
    }   
    
}
