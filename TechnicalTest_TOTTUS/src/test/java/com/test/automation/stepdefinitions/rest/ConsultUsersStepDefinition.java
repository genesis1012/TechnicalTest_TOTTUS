package com.test.automation.stepdefinitions.rest;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import com.test.automation.questions.LastResponseStatusCode;
import com.test.automation.tasks.ConsultTheUsers;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ConsultUsersStepDefinition {
	
	@When("^consult the users of the fifth page$")
    public void consultTheUsersOfTheFifthPage() {
		theActorInTheSpotlight().attemptsTo(ConsultTheUsers.ofTheFivePage());
    }


    @Then("^I should have response (\\d+)$")
    public void iShouldHaveResponseLoginFailed(int response) {
    	theActorInTheSpotlight().should(seeThat("last response status code is 200" , LastResponseStatusCode.is(response)));
    }
}
