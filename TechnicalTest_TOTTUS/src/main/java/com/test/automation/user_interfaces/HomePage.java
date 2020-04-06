package com.test.automation.user_interfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;

@DefaultUrl("https://www.tottus.com.pe/tottus/")
public class HomePage extends PageObject{
	
	@WhenPageOpens
	public void waitUntilMainElementsAppears() {
		getDriver().manage().window().maximize();
	}
	
	public static final Target CANCEL= Target.the("Cancel")
			.located(By.id("onesignal-popover-cancel-button"));
		
	public static final Target CLOSE_PO_PUP= Target.the("Close popup")
			.located(By.className("closepopup"));
	
	public static final Target SEARCH = Target.the("Search")
			.located(By.name("Ntt"));
	
}
