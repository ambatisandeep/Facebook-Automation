package Google;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Flipkart.BrowserClass;

public class googleSearch extends BrowserClass{
	
	@Override
	public void OpenBrowser(String browserType) {
		super.OpenBrowser(browserType);
		
		driver.manage().timeouts().pageLoadTimeout(10000, TimeUnit.MILLISECONDS);
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		driver.get("https://www.google.com");
		WebElement searchBar = driver.findElement(By.xpath("//*[@title='Search']"));
		searchBar.click();
		searchBar.sendKeys("Java");
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbl1']/span"));

		for(int i=0;i<list.size();i++) {
			if (list.get(i).getText().contains("javascript")) {
				list.get(i).click();
				break;
			}
		}
		driver.quit();
	}

	public static void main(String[] args) throws InterruptedException {
		googleSearch obj = new googleSearch();
		obj.OpenBrowser("chrome");
	}

}
