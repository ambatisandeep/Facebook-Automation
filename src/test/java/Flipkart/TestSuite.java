package Flipkart;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;

public class TestSuite extends BrowserClass {
	@Test
	@Parameters({"Product"})
	public void TestCase (String Product) throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@class='_2AkmmA _29YdH8']")).click();
		pageObj page = new pageObj(driver);
		Thread.sleep(2000);
		page.searchProducts(Product);
		Thread.sleep(2000);
		page.ramSelection();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='container']/div/div[3]/div[2]/div[1]/div[1]/div/div[1]/div/section[4]/div[2]/div/div[4]/div/div/label/div[1]")).click();
		Thread.sleep(2000);
//		page.brandSelection();

	}
	@BeforeMethod
	@Parameters({"browserType","url"})
	public void beforeMethod(String browserType,String url) throws InterruptedException {
	OpenBrowser(browserType);
	driver.get(url);
	}

	@AfterMethod
	public void afterMethod() {
//		pageObj page2 = new pageObj(driver);
//		page2.quit();
//		driver.quit();
	}

}
