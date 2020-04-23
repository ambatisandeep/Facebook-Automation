package com.flipkart.utilites;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScrapTest {

	static WebDriver driver;

	public static String brandSelection(String brandName) {

		String brandString = "//*[@class='_6MvKf3']//following::div[@title='"+brandName+"']/div/div/label/div[@class='_1p7h2j']";
		WebElement b = driver.findElement(By.xpath(brandString));
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(b));
		b.click();

		return brandName;
/*		try {
		prop = new Properties();
		FileInputStream ip = new FileInputStream(file);
		prop.load(ip);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		} */
	}


	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[@class='_2AkmmA _29YdH8']")).click();
		driver.findElement(By.xpath("//*[@class='LM6RPg']")).click();
		driver.findElement(By.xpath("//*[@class='LM6RPg']")).sendKeys("Phones");
		driver.findElement(By.xpath("//*[@class='vh79eN']")).click();
//		driver.findElement(By.xpath("//*[@class='opNt-w _2Tprpw']")).click();
		driver.findElement(By.xpath("//*[@id='container']/div/div[3]/div[2]/div[1]/div[1]/div/div[1]/div/section[5]/div[2]/div[1]/div[1]/input")).click();
		driver.findElement(By.xpath("//*[@id='container']/div/div[3]/div[2]/div[1]/div[1]/div/div[1]/div/section[5]/div[2]/div[1]/div[1]/input")).sendKeys("Nokia");
		WebElement ele = driver.findElement(By.xpath("//*[@placeholder='Search Brand']//following::div[@title='Nokia']/div/div/label/div[@class='_1p7h2j']"));
		Thread.sleep(2000);
		ele.click();
//		driver.findElement(By.xpath("//*[@id='container']/div/div[3]/div[2]/div[1]/div[1]/div/div[1]/div/section[5]/div[2]/div/div[1]/div[2]/div[14]/div/div/div/label/div[1]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id='container']/div/div[3]/div[2]/div[1]/div[1]/div/div[1]/div/section[5]/div[2]/div/div[1]/div[2]/div[336]/div/div/div/label/div[1]")).click();
	}
	

}
