package treinamento_restassured.testSuite;

import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

import treinamento_restassured.testCase.LyricTestCase;

@Suite
@SelectPackages("treinamento_restassured.testCase")
@SelectClasses({ LyricTestCase.class })
@IncludeTags({ "Regressao" })
public class LyricRegressaoTestSuite {
}