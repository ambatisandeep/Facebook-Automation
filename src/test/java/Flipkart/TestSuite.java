package Flipkart;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class TestSuite extends BrowserClass {
	
	@Test
	@Parameters({"Product"})
	public void TestCase (String Product) throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@class='_2AkmmA _29YdH8']")).click();
		MobilesPageObj page = new MobilesPageObj(driver);
		//Searching Product
		Thread.sleep(2000);
		page.searchProducts(Product);
		
		//Ram Selection
		explicitWait(driver,page.getRamObject().Ram4GB, 10);
		
		explicitWait(driver, page.getBrandObject().Realme, 10);
		
		//Brand Selection
//		Thread.sleep(2000);
		page.getBrandObject().Realme.click();
	}
	
	
	public void explicitWait(WebDriver driver, WebElement element, int timeout) {
		new WebDriverWait(driver,timeout).until(ExpectedConditions.visibilityOf(element));
		element.click();
	}


	@BeforeMethod
	@Parameters({"browserType","url"})
	public void beforeMethod(String browserType,String url) throws InterruptedException {
	OpenBrowser(browserType);
	driver.get(url);
	String title = driver.getTitle();
	System.out.println(title);
	}

	@AfterMethod
	public void afterMethod() {

		driver.quit();
	}

}
