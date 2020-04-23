package com.flipkart.testcases;

import org.testng.annotations.Test;

import com.flipkart.mobilepageobj.MobilesPageObj;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;

public class TestSuite extends BrowserClass {
	

	@BeforeMethod
	@Parameters({"browserType","url"})
	public void beforeMethod(String browserType,String url) throws InterruptedException {
		OpenBrowser(browserType);
		 driver.get(url);
		 logger.info(url);
		String actualTitle = driver.getTitle();
		 logger.info(actualTitle);
		}

	@Test
	@Parameters({"Product","ram","brandName","mobileName","tabNum"})
	public void TestCase (String Product, String ram, String brandName,String mobileName,int tabNum) throws InterruptedException {
		
		MobilesPageObj page = new MobilesPageObj(driver);
		
		//Closing Popup
		driver.findElement(By.xpath("//*[@class='_2AkmmA _29YdH8']")).click();

		//Searching Product
		page.searchProducts(Product);

		//Ram Selection
		page.ramSelection(ram);

		//Brand Selection		
		page.brandSelection(brandName);

		//Selecting Specified Mobile
		page.selectMobile(mobileName,tabNum);
	}



	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
