package com.pompojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page3PreCheckOut extends Page2Catlog{
	
	public Page3PreCheckOut() {
		PageFactory.initElements(driver, this);
	}
	

	
	@FindBy(xpath="//button[@id='continue-shopping']")
	private WebElement scrollDown;	
	
	@FindBy(xpath="//button[@id='checkout']")
	private WebElement clickCheckOut1;

	public WebElement getScrollDown() {
		return scrollDown;
	}

	public WebElement getClickCheckOut1() {
		return clickCheckOut1;
	}	
	
	
	
	
	
	
}
