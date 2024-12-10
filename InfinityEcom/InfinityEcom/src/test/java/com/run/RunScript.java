package com.run;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import com.pompojo.Page1Login;
import com.pompojo.Page2Catlog;
import com.pompojo.Page3PreCheckOut;
import com.pompojo.Page4PostCheckOut;
import com.pompojo.Page5FinishCheckOut;
import com.pompojo.Page6Completed;
import com.utility.Baseclass;

public class RunScript extends Baseclass{
	
	
	
	@Test
	public void test1() {
		
		initializeDriver("chrome");
		
		openUrl("https://www.saucedemo.com");
		
		Page1Login p1 = new Page1Login();
				
		WebElement userName = p1.getuN();
		
		passData(userName, "visual_user");
		
		WebElement password = p1.getPwd();
		
		passData(password, "secret_sauce");
		
		WebElement loginButton = p1.getBtnlog();
		
		clickElement(loginButton);
		
	}
	
	@Test
	public void test2() {
		
		Page2Catlog p2 = new Page2Catlog();
		
		WebElement addCart1 = p2.getItem1();
		
		clickElement(addCart1);
		
		WebElement addCart2 = p2.getItem2();
		
		clickElement(addCart2);		
		
		WebElement addCart3 = p2.getItem3();
		
		clickElement(addCart3);
		
		WebElement addCart4 = p2.getItem4();
		
		clickElement(addCart4);			
		
		WebElement addCart5 = p2.getItem5();
		
		clickElement(addCart5);
		
		WebElement addCart6 = p2.getItem6();
		
		clickElement(addCart6);	
		
		WebElement cartButton = p2.getcartButton();
		
		clickElement(cartButton);			
				
	}
		
	
	@Test
	public void test3() {
		
		Page3PreCheckOut p3 = new Page3PreCheckOut();
		
		WebElement pageBottom = p3.getScrollDown();
		
		scrollToElement(pageBottom);
		
		WebElement CheckOut1 = p3.getClickCheckOut1();
		
		clickElement(CheckOut1);
				
	}		
	
	@Test
	public void test4() {
		
		Page4PostCheckOut p4 = new Page4PostCheckOut();
		  
		WebElement firstName = p4.getfN();
		
		passData(firstName, "XiaXi");
		
		WebElement lastName = p4.getlN();
				
		passData(lastName, "Yu");
		
		WebElement zipCode = p4.getZipCode();
		
		passData(zipCode, "P-74182");
		
		WebElement continueNextPage = p4.getClickContinue();
		
		clickElement(continueNextPage);
		
	}		

	@Test
	public void test5() {
		
		Page5FinishCheckOut p5 = new Page5FinishCheckOut();
		
		WebElement orderFinish = p5.getClickFinishBtn();
		
		clickElement(orderFinish);
				
	}

	@Test
	public void test6() throws IOException {
		
		Page6Completed p6 = new Page6Completed();
		
		takeScreenshot("C:\\Users\\AIONE COMPUTER\\eclipse-workspace\\InfinityEcom\\InfinityEcom\\InfinityEcom\\ScreenshotArtifacts\\File1.png");
		
		WebElement printConfirmMsg = p6.getOrderConfirmed();
		
		String orderConfirmed = printConfirmMsg.getText();
		
		System.out.println(orderConfirmed);
		
		WebElement goHomePage = p6.getReturnHome();
		
		clickElement(goHomePage);
	}
}
