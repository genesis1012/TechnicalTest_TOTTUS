package com.test.automation.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.openqa.selenium.Keys;

import com.test.automation.user_interfaces.HomePage;

import static com.test.automation.user_interfaces.HomePage.SEARCH;
import static com.test.automation.user_interfaces.HomePage.CLOSE_PO_PUP;
import static com.test.automation.user_interfaces.HomePage.CANCEL;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;

public class searchFor implements Task{
	
	private String productName;
	
	public searchFor(String ProductName) {
		this.productName = ProductName;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.wasAbleTo(Open.browserOn().the(HomePage.class));
		if(CANCEL.resolveFor(actor).isVisible()) {
			actor.wasAbleTo(Click.on(CANCEL));
		}
		if(CLOSE_PO_PUP.resolveFor(actor).isVisible()) {
			actor.wasAbleTo(Click.on(CLOSE_PO_PUP));
		}
		if(CANCEL.resolveFor(actor).isVisible()) {
			actor.wasAbleTo(Click.on(CANCEL));
		}
		actor.wasAbleTo(Enter.theValue(productName).into(SEARCH).thenHit(Keys.ENTER));		
	}
	
	public static searchFor theProduct(String productName) {
		return instrumented(searchFor.class, productName);
	}

}
