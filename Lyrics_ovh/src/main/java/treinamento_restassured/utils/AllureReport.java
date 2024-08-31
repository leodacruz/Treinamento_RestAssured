package treinamento_restassured.utils;

import io.qameta.allure.Allure;
import io.qameta.allure.Allure.ThrowableRunnableVoid;

public class AllureReport {

    /**
     * Adiciona uma descrição no teste
     * 
     * @param description
     */
    public static void description(String description) {
        Allure.description(description);
    }

    /**
     * Adiciona um dono para o teste
     * 
     * @param owner
     */
    public static void owner(String owner) {
        Allure.label("owner", owner);
    }

    /**
     * Adiciona uma severidade para o teste
     * 
     * @param severity
     */
    public static void severity(String severity) {
        Allure.label("severity", severity);
    }

    /**
     * Adiciona um link no teste
     * 
     * @param name
     * @param url
     */
    public static void link(String name, String url) {
        Allure.link(name, url);
    }

    /**
     * Adiciona um link no teste
     * 
     * @param url
     */
    public static void link(String url) {
        Allure.link(url);
    }

    /**
     * Adiciona um Epico no teste
     * 
     * @param epic
     */
    public static void epic(String epic) {
        Allure.epic(epic);
    }

    /**
     * Adiciona uma Feature no teste
     * 
     * @param feature
     */
    public static void feature(String feature) {
        Allure.feature(feature);
    }

    /**
     * Adiciona uma historia no teste
     * 
     * @param story
     */
    public static void story(String story) {
        Allure.story(story);
    }

    /**
     * Adiciona uma suite no teste
     * 
     * @param suite
     */
    public static void suite(String suite) {
        Allure.suite(suite);
    }

    /**
     * Adiciona uma suite pai no teste
     * 
     * @param parentSuite
     */
    public static void parentSuite(String parentSuite) {
        Allure.label("parentSuite", parentSuite);
    }

    /**
     * Adiciona uma subSuite no teste
     * 
     * @param subSuite
     */
    public static void subSuite(String subSuite) {
        Allure.label("subSuite", subSuite);
    }

    /**
     * Adiciona um Step simples no teste
     * 
     * @param environment
     */
    public static void step(String step) {
        Allure.step(step);
    }

    /**
     * Adiciona um Step com uma ação no teste
     * 
     * @param environment
     */
    public static void step(String step, ThrowableRunnableVoid runnable) {
        Allure.step(step, runnable);
    }

    /**
     * Adiciona um parametro no teste
     * 
     * @param parameter
     * @param value
     */
    public static void parameter(String parameter, String value) {
        Allure.parameter(parameter, value);
    }

    /*
     * public static void attachment(String name, String type, String content) {
     * Allure.attachment(name, type);
     * }
     * 
     * public static void attachment(String name, String content) {
     * Allure.attachment(name, content);
     * }
     * 
     * public static void attachment(String content) {
     * Allure.attachment(content, "");
     * }
     * 
     * 
     */

}
