package com.flipkart.utilites;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;

public class Testutil {
	
	public WebDriver driver;
	
	public int tabNum;
	
	public void switchWindow(int tabNum) {
		ArrayList<String>newTab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(newTab.get(tabNum));
		
	}

}
