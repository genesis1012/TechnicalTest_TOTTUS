package com.test.automation.questions;

import static com.test.automation.user_interfaces.ShoppingCartPage.PRODUCT_NAME;
import static com.test.automation.user_interfaces.ShoppingCartPage.QUANTITY;
import static com.test.automation.user_interfaces.ShoppingCartPage.TOTAL_PRICE;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.Value;

public class shoppingCartDetail {
	
	public static Question<String> ProductName() {
        return actor -> Text.of(PRODUCT_NAME).viewedBy(actor).asString();
    }
	
	public static Question<String> Quantity() {
        return actor -> Value.of(QUANTITY).viewedBy(actor).asString();
    }
	
	public static Question<String> Price() {
        return actor -> Text.of(TOTAL_PRICE).viewedBy(actor).asString().substring(3);
    }

}
