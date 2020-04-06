package com.test.automation.user_interfaces;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ShoppingCartPage extends PageObject{
	
	public static final Target PRODUCT_NAME = Target.the("Product Name")
			.located(By.className("atg_store_richCartItemDescription"));
	
	public static final Target QUANTITY = Target.the("Quantity")
			.locatedBy("//*[contains(@id,'cs_display_qty')]");
	
	public static final Target TOTAL_PRICE = Target.the("Total Price")
			.locatedBy("//*[@dojoattachpoint='csSubtotal']");

}
