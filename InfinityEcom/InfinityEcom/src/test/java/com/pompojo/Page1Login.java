package com.pompojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Baseclass;

public class Page1Login extends Baseclass{
	
		public Page1Login() {
			PageFactory.initElements(driver, this);
		}
		
		
		@FindBy(id="user-name")
		private WebElement uN;
		
		@FindBy(id="password")
		private WebElement pwd;
		
		@FindBy(xpath="//input[@id='login-button']")
		private WebElement btnlog;

		public WebElement getuN() {
			return uN;
		}

		public WebElement getPwd() {
			return pwd;
		}

		public WebElement getBtnlog() {
			return btnlog;
		}
		
		
}
