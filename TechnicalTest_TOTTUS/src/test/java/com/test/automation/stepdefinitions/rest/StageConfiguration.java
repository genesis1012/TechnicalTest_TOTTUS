package com.test.automation.stepdefinitions.rest;

import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import static com.test.automation.utils.RestService.BASE_URL;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class StageConfiguration {

    private static final String HERIBERTO = "Heriberto";

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled(HERIBERTO).whoCan(CallAnApi.at(BASE_URL.toString()));
    }
}
