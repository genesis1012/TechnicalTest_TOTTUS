package com.test.automation.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static com.test.automation.user_interfaces.ProductDetailPage.QUANTITY;
import static com.test.automation.user_interfaces.ProductDetailPage.SAVE_TO_CART;
import static com.test.automation.user_interfaces.ProductDetailPage.STORE_CART_TOTAL;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class BuyThe implements Task{
	
	private Target Product;
	private int Quantity;
	
	public BuyThe(Target product, int quantity) {
		this.Product = product;
		this.Quantity = quantity;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(Product));
		for(int i=1; i < Quantity; i++) {
			actor.attemptsTo(Click.on(QUANTITY));
		}
		actor.attemptsTo(Click.on(SAVE_TO_CART));
		actor.attemptsTo(Click.on(STORE_CART_TOTAL));
	}
	
	public static BuyThe product(Target product, int quantity) {
		return instrumented(BuyThe.class, product, quantity);
	}

}
