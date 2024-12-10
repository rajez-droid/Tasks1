package com.pompojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page6Completed extends Page5FinishCheckOut{

	public Page6Completed() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//h2[text()='Thank you for your order!']")
	private WebElement orderConfirmed;	
	
	@FindBy(id="back-to-products")
	private WebElement returnHome;

	public WebElement getOrderConfirmed() {
		return orderConfirmed;
	}

	public WebElement getReturnHome() {
		return returnHome;
	}
	
	
}
