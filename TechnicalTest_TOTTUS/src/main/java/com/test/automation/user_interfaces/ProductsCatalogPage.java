package com.test.automation.user_interfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.targets.Target;

public class ProductsCatalogPage extends PageObject{
	
	public static final Target FIRST_PRODUCT = Target.the("first product")
			.locatedBy("//*[@name='addToCart'][1]//*[@class=' item-product-caption']");
	
	@SuppressWarnings("static-access")
	public static final Target FIRST_PRODUCT_IMAGE = FIRST_PRODUCT.the("first product")
			.locatedBy("//*[@class='caption-top-wrapper']");
	
	public static String getProductName(Target PRODUCT, Actor actor) {
		return PRODUCT.resolveFor(actor).findBy("//*[@class='title']/a/h5/div").getText();
	}
	
	public static String getProductPrice(Target PRODUCT, Actor actor) {
		return PRODUCT.resolveFor(actor).findBy("//*[@class='prices']/span/span[1]").getText();
	}
	
	public static String getProductQuantity(Target PRODUCT, Actor actor) {
		return PRODUCT.resolveFor(actor).findBy("//*[@class='prices']/span/span[2]").getText();
	}
	
}
