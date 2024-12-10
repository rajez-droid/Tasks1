package com.utility;

import java.awt.AWTException;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLockInterruptionException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
	public static WebDriver driver;

	
	// 1	
    public static void openedge() {
    	
	    WebDriverManager.edgedriver().setup();
	    driver = new EdgeDriver();
	}
	
    // 2
	public static void openchrome() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
		// 3
	public static void urlpassing(String url) {
		
		driver.get(url);
	}
	

	
	// 4
	public static void printText(WebElement element) {
		
		String text = element.getText();
		System.out.println(text);
	}
	
	// 5
	public static void printAttribute(WebElement element, String name) {
		
		String attribute = element.getAttribute(name);
		System.out.println(attribute);
	}

	
	// 6
	public static void screenshot(String name) throws IOException {
		
		TakesScreenshot tk = (TakesScreenshot) driver;
		File sr = tk.getScreenshotAs(OutputType.FILE);
		File de = new File("C:\\Users\\ADMIN\\eclipse-workspace\\IPTCucumber\\target\\Screenshot\\"+name+".jpg");
		FileUtils.copyFile(sr, de);
	}
	
	// 7
	public static void closebrowser() {
		
		driver.quit();

	}
	
	// 8
	public static void closecurrenttab() {
		
		driver.close();

	}
	
	// 9
	public static void maxwindow() {
		
		driver.manage().window().maximize();
	}
	
	// 10
	public static void filltextbox(WebElement element,String input) {
		
	    element.sendKeys(input);
		
	}
	
	// 11
	public static void toclick(WebElement element) {
		
	    element.click();
		
	}
	
	// 12
	public static void clear(WebElement element) {
		
		element.clear();

	}
	
	// 13
	public static void submit(WebElement element) {
		
		element.submit();

	}
	
	

	// 14
    public static void sleep(int time) throws InterruptedException {
		
		Thread.sleep(time);

	}




}