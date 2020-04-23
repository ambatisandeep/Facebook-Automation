package com.flipkart.testcases;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BrowserClass {

	public static WebDriver driver;
	
	public  Logger logger;

	public void OpenBrowser(String browserType) {

		if(browserType.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers\\chromedriver.exe");
			driver =new ChromeDriver();
			
			 logger = LogManager.getLogger(BrowserClass.class);
			
		}else {

			System.setProperty("webdriver.gecko.driver", "D:\\eclipse\\eclipse\\Selenium Jars\\Drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
}
