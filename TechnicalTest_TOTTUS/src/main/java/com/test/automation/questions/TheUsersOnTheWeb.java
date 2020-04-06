package com.test.automation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;

import static net.serenitybdd.rest.SerenityRest.lastResponse;

@Subject("The users on the web correspond to those of the service")
public class TheUsersOnTheWeb implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        String summaryUsersService = lastResponse().body().asString();
        System.out.println("USUARIOS2 : " + summaryUsersService.toString());
//        return summaryUsersWeb.toString().equals(summaryUsersService.toString());
        return null;
    }

    public static TheUsersOnTheWeb correspondToThoseOfTheService(){
        return new TheUsersOnTheWeb();
    }
}
