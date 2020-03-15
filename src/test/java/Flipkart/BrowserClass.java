package Flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserClass {

	public WebDriver driver;

	public  void OpenBrowser(String browserType) {

		if(browserType.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\Projects\\Drivers\\chromedriver.exe");
			driver =new ChromeDriver();
		}else {

			System.setProperty("webdriver.gecko.driver", "D:\\eclipse\\eclipse\\Selenium Jars\\Drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
}
