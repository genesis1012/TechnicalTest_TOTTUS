package com.test.automation.runners;

import static cucumber.api.SnippetType.CAMELCASE;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"src/test/resources/features/rest/ConsultUsers.feature"},
        glue = {"com.test.automation.stepdefinitions.rest"},
        snippets = CAMELCASE)
public class ConsultUsersTestRunner {

}
