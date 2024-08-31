package treinamento_restassured.utils;

import io.qameta.allure.Allure.ThrowableRunnableVoid;

public class ReportGenerico {

    static ReportNome reportName;

    public static void setReport(ReportNome nome) {
        reportName = nome;
    }

    public static void descricaoTeste(String descricao) {

        switch (reportName) {
            case ALLURE_REPORT:
                AllureReport.description(descricao);
                break;
            case EXTENT_REPORT:

                break;
            default:
                break;
        }

    }

    public static void donoTeste(String owner) {

        switch (reportName) {
            case ALLURE_REPORT:
                AllureReport.owner(owner);
                break;
            case EXTENT_REPORT:

                break;
            default:
                break;
        }
    }

    public static void severidadeTeste(String severity) {

        switch (reportName) {
            case ALLURE_REPORT:
                AllureReport.severity(severity);
                break;
            case EXTENT_REPORT:

                break;
            default:
                break;
        }

    }

    public static void linkTeste(String name, String url) {
        switch (reportName) {
            case ALLURE_REPORT:
                AllureReport.link(name, url);
                break;
            case EXTENT_REPORT:

                break;
            default:
                break;
        }

    }

    public static void linkTeste(String url) {
        switch (reportName) {
            case ALLURE_REPORT:
                AllureReport.link(url);
                break;
            case EXTENT_REPORT:

                break;
            default:
                break;
        }

    }

    public static void epicoTeste(String epic) {
        switch (reportName) {
            case ALLURE_REPORT:
                AllureReport.epic(epic);
                break;
            case EXTENT_REPORT:

                break;
            default:
                break;
        }

    }

    public static void featureTeste(String feature) {

        switch (reportName) {
            case ALLURE_REPORT:
                AllureReport.feature(feature);
                break;
            case EXTENT_REPORT:

                break;
            default:
                break;
        }

    }

    public static void historiaTeste(String story) {
        switch (reportName) {
            case ALLURE_REPORT:
                AllureReport.story(story);
                break;
            case EXTENT_REPORT:

                break;
            default:
                break;
        }

    }

    public static void suiteTeste(String suite) {
        switch (reportName) {
            case ALLURE_REPORT:
                AllureReport.suite(suite);
                break;
            case EXTENT_REPORT:

                break;
            default:
                break;
        }
    }

    public static void parentSuiteTeste(String parentSuite) {
        switch (reportName) {
            case ALLURE_REPORT:
                AllureReport.parentSuite(parentSuite);
                break;
            case EXTENT_REPORT:

                break;
            default:
                break;
        }

    }

    public static void subSuiteTeste(String subSuite) {
        switch (reportName) {
            case ALLURE_REPORT:
                AllureReport.subSuite(subSuite);
                break;
            case EXTENT_REPORT:

                break;
            default:
                break;
        }
    }

    public static void step(String step) {
        switch (reportName) {
            case ALLURE_REPORT:
                AllureReport.step(step);
                break;
            case EXTENT_REPORT:

                break;
            default:
                break;
        }
    }

    public static void step(String step, ThrowableRunnableVoid runnable) {
        switch (reportName) {
            case ALLURE_REPORT:
                AllureReport.step(step, runnable);
                break;
            case EXTENT_REPORT:

                break;
            default:
                break;
        }
    }

    public static void parameter(String parameter, String value) {
        switch (reportName) {
            case ALLURE_REPORT:
                AllureReport.parameter(parameter, value);
                break;
            case EXTENT_REPORT:

                break;
            default:
                break;
        }
    }

    // Enum com o nome dos reports que podem ser gerados
    public enum ReportNome {

        ALLURE_REPORT,
        EXTENT_REPORT;

        public String getReportNome() {
            return this.name();
        }
    }

}
