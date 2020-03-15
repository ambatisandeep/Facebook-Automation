package Flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class pageObj {
	WebDriver selfDriver;
	public pageObj(WebDriver driver) {
		PageFactory.initElements(driver, this);
		selfDriver = driver;
	}

	@FindBy(xpath = "//*[@class='LM6RPg']")
	WebElement searchBar;

	@FindBy(xpath = "//*[@class='vh79eN']")
	WebElement searchButton;

	@FindBy(xpath = "//*[@id='container']/div/div[3]/div[2]/div[1]/div[1]/div/div[1]/div/section[4]/div[2]/div/div[1]/div/div/label/div[2]")
	WebElement Ram;

	@FindBy(xpath = "//*[@id='container']/div/div[3]/div[2]/div/div[1]/div/div[1]/div/section[5]/div[2]/div[1]/div[1]/div/div/label/div[1]")
	WebElement realmeBrand;

	@FindBy (xpath = "//*[@id=\"container\"]/div/div[3]/div[2]/div/div[1]/div/div[1]/div/section[5]/div[2]/div[1]/div[3]/div/div/label/div[1]")
	WebElement samsungBrand;

	@FindBy (xpath = "//*[@id=\"container\"]/div/div[3]/div[2]/div/div[1]/div/div[1]/div/section[5]/div[2]/div[1]/div[4]/div/div/label/div[1]")
	WebElement MiBrand;
	
	@FindBy (xpath = "//*[@id=\"container\"]/div/div[3]/div[2]/div/div[1]/div/div[1]/div/section[5]/div[2]/div[1]/div[5]/div/div/label/div[1]")
	WebElement infinixBrand;
	
	@FindBy (xpath = "//*[@id=\"container\"]/div/div[3]/div[2]/div/div[1]/div/div[1]/div/section[5]/div[2]/div[1]/div[6]/div/div/label/div[1]")
	WebElement asusBrand;
	
	@FindBy (xpath = "//*[@id=\"container\"]/div/div[3]/div[2]/div/div[1]/div/div[1]/div/section[5]/div[2]/div[1]/div[7]/div/div/label/div[1]")
	WebElement honorBrand;
	
	public void searchProducts(String Product) throws InterruptedException  {

		searchBar.click();
		searchBar.sendKeys(Product);

		searchButton.click();
		Thread.sleep(2000);
	} 

	public void ramSelection() {
		Ram.click();
	}

	public void brandSelection() throws InterruptedException {

		realmeBrand.click();

		//driver.navigate().back();
		Thread.sleep(1000);
		selfDriver.navigate().forward();
		samsungBrand.click();
		
		Thread.sleep(1000);
		
		MiBrand.click();
		
		Thread.sleep(1000);
		
		infinixBrand.click();
		Thread.sleep(1000);
		
		asusBrand.click();
		Thread.sleep(1000);
		
		honorBrand.click();
	
	}
}