package Facebook;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookFooter {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\Projects\\Drivers\\chromedriver.exe");
		driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);

		//List of facebook footer tabs Links
		List<WebElement> listTabs = driver.findElements(By.xpath("//*[@id='pageFooterChildren']/ul/li"));


		int size = listTabs.size();

		System.out.println(size);
		
		for(int i = 1;i<size-2;i++) {
			Thread.sleep(3000);
			System.out.println("current element:" + i);
			
			//Creating listDuplicate to get rid of Stale Element Exception
			List<WebElement> listTabsDuplicate = driver.findElements(By.xpath("//*[@id='pageFooterChildren']/ul/li"));
			
			WebElement element = listTabsDuplicate.get(i);
			/** Another way of passing fresh elements to get rid of Stale Element Exception
			WebElement element = driver.findElement(By.xpath("//*[@id='pageFooterChildren']/ul/li["+i+"]")); 
			element.click(); **/
			
			element.click();
			String linkTitle = driver.getTitle();
			System.out.println(linkTitle);
			Thread.sleep(1000);
			if(!linkTitle.equals(actualTitle)) {
				driver.navigate().back();
			}else {
				ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
				System.out.println(newTab.size());
				driver.switchTo().window(newTab.get(1));
				driver.close();
				driver.switchTo().window(newTab.get(0));
			}
		}
				driver.quit();
	}
}




