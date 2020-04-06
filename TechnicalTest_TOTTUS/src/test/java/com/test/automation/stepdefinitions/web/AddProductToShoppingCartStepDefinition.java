package com.test.automation.stepdefinitions.web;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.is;

import com.test.automation.questions.shoppingCartDetail;
import com.test.automation.tasks.searchFor;
import com.test.automation.tasks.BuyThe;
import com.test.automation.user_interfaces.ProductsCatalogPage;
import com.test.automation.utils.convertTo;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class AddProductToShoppingCartStepDefinition {
	
	private String quantity;
	private String totalPrice;
	private String productName;
	private String productPrice;
    private static final String HERIBERTO = "Heriberto";
	
	@Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }
	
	@Given("^looking for the \"([^\"]*)\" product$")
	public void looking_for_the_product(String productName) {
		theActorCalled(HERIBERTO).wasAbleTo(searchFor.theProduct(productName));
	}
	
	@When("^purchase (\\d+) of the first product found$")
    public void purchase_of_the_first_product_found(int quantityProduct) {
		productName = ProductsCatalogPage.getProductName(ProductsCatalogPage.FIRST_PRODUCT, theActorInTheSpotlight());
		productPrice = ProductsCatalogPage.getProductPrice(ProductsCatalogPage.FIRST_PRODUCT,theActorInTheSpotlight());
		quantity = ProductsCatalogPage.getProductQuantity(ProductsCatalogPage.FIRST_PRODUCT,theActorInTheSpotlight());
		totalPrice = convertTo.getDecimal(productPrice.substring(3, productPrice.length()), quantityProduct);
		quantity = convertTo.getDecimal(quantity.substring(0, quantity.length()-2), quantityProduct);
		theActorInTheSpotlight().attemptsTo(BuyThe.product(ProductsCatalogPage.FIRST_PRODUCT_IMAGE, quantityProduct));
    }

	@Then("^it must be added to the shopping cart$")
	public void it_must_be_added_to_the_shopping_cart() { 
		theActorInTheSpotlight().should(seeThat(shoppingCartDetail.ProductName(), is(productName)));
		theActorInTheSpotlight().should(seeThat(shoppingCartDetail.Price(), is(totalPrice)));
		theActorInTheSpotlight().should(seeThat(shoppingCartDetail.Quantity(), is(quantity)));
	}
}
