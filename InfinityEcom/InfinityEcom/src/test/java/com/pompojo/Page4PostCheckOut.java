package com.pompojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page4PostCheckOut extends Page3PreCheckOut{
	
		public Page4PostCheckOut() {
			PageFactory.initElements(driver, this);
		}
		

		
		@FindBy(id="first-name")
		private WebElement fN;
		
		@FindBy(id="last-name")
		private WebElement lN;
		
		@FindBy(id="postal-code")
		private WebElement zipCode;
		
		@FindBy(id="continue")
		private WebElement clickContinue;

		public WebElement getfN() {
			return fN;
		}

		public WebElement getlN() {
			return lN;
		}

		public WebElement getZipCode() {
			return zipCode;
		}

		public WebElement getClickContinue() {
			return clickContinue;
		}
				
		
}
