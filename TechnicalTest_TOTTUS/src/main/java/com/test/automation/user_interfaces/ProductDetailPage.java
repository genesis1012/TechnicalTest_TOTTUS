package com.test.automation.user_interfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ProductDetailPage extends PageObject{
	
	public static final Target QUANTITY = Target.the("Quantity")
			.locatedBy("//*[contains(@onclick,'addWeightQuantity')]");
	
	public static final Target SAVE_TO_CART = Target.the("save to cart")
			.located(By.className("atg_behavior_addItemToCart"));
	
	public static final Target STORE_CART_TOTAL = Target.the("Shopping Cart")
			.located(By.id("atg_store_cart_total"));
}
