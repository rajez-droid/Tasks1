package com.pompojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page2Catlog extends Page1Login{

	public Page2Catlog() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(id="add-to-cart-sauce-labs-backpack")
	private WebElement item1;
	
	@FindBy(id="add-to-cart-sauce-labs-bike-light")
	private WebElement item2;
	
	@FindBy(id="add-to-cart-sauce-labs-bolt-t-shirt")
	private WebElement item3;
	
	@FindBy(id="add-to-cart-sauce-labs-fleece-jacket")
	private WebElement item4;
	
	@FindBy(id="add-to-cart-sauce-labs-onesie")
	private WebElement item5;
	
	@FindBy(id="add-to-cart-test.allthethings()-t-shirt-(red)")
	private WebElement item6;	
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	private WebElement cartButton;

	public WebElement getItem1() {
		return item1;
	}

	public WebElement getItem2() {
		return item2;
	}

	public WebElement getItem3() {
		return item3;
	}

	public WebElement getItem4() {
		return item4;
	}

	public WebElement getItem5() {
		return item5;
	}

	public WebElement getItem6() {
		return item6;
	}

	public WebElement getcartButton() {
		return cartButton;
	}	
	
	
}


