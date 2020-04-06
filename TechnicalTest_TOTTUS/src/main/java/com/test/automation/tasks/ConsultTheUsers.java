package com.test.automation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;

import static com.test.automation.utils.RestService.CONSULT_USERS;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ConsultTheUsers implements Task {

    private String consultUsers;

    public ConsultTheUsers(int page) {
        this.consultUsers = String.format(CONSULT_USERS.toString(), page);
    }

    @Override
    public <T extends Actor> void performAs(T theActor) {
        theActor.attemptsTo(
                Get.resource(consultUsers)
        );
    }

    public static ConsultTheUsers ofTheFivePage() {
        return instrumented(ConsultTheUsers.class, 5);
    }
}
