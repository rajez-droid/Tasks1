package com.pompojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page5FinishCheckOut extends Page4PostCheckOut{
	
	public Page5FinishCheckOut() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="finish")
	private WebElement clickFinishBtn;


	public WebElement getClickFinishBtn() {
		return clickFinishBtn;
	}
	
	
}
