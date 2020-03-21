package Flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public  class MobilesPageObj {
    
	public ramSelection ramObj = null;
	public brandSelection brandObj = null;
	
	
	public MobilesPageObj(WebDriver driver) {
		PageFactory.initElements(driver, this);
		 ramObj = new ramSelection(driver);
		 brandObj = new brandSelection(driver);
	}
	
	public ramSelection getRamObject() {
		return ramObj;
	}
	
	public brandSelection getBrandObject() {
		return brandObj;
	}

	@FindBy(xpath = "//*[@class='LM6RPg']")
	WebElement searchBar;

	@FindBy(xpath = "//*[@class='vh79eN']")
	WebElement searchButton;


	//Clicking search bar & passing product parameter
	public void searchProducts(String Product) throws InterruptedException  {
		searchBar.click();
		searchBar.sendKeys(Product);
		searchButton.click();
		Thread.sleep(2000);
	} 

	//Selection of Ram Types
	public  class ramSelection {
		public ramSelection(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		//6GB
		@FindBy(xpath = "//*[contains(text(),'6 GB & Above')]/preceding::div[@class='_1p7h2j']")
		public WebElement Ram6GB;
		
		//4GB Ram	
		@FindBy(xpath = "//*[contains(text(),'6 GB')]/following::div[@title='4 GB']/div/div/label/div[@class='_1p7h2j']")
		public	WebElement Ram4GB;

		//3GB
		@FindBy(xpath = "//*[contains(text(),'6 GB')]/following::div[@title='3 GB']/div/div/label/div[@class='_1p7h2j']")
		public	WebElement Ram3GB;

		//2GB
		@FindBy(xpath = "//*[contains(text(),'6 GB')]/following::div[@title='2 GB']/div/div/label/div[@class='_1p7h2j']")
		public	WebElement Ram2GB;
		
		//512 MB - 1 GB
		@FindBy(xpath = "//*[contains(text(),'6 GB')]/following::div[@title='512 MB - 1 GB']/div/div/label/div[@class='_1p7h2j']")
		public	WebElement Ram1GBAnd512MB;
		
		//512 MB - 1 GB
		@FindBy(xpath = "//*[contains(text(),'6 GB')]/following::div[@title='Less than 512 MB']/div/div/label/div[@class='_1p7h2j']")
		public	WebElement RamLessThan512MB;
		
	}
	
	//Selection of Brands
	public class brandSelection {
		public brandSelection(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		@FindBy (xpath = "//*[contains(text(),'6 GB')]/following::div[@title='Realme']/div/div/label/div[@class='_1p7h2j']")
		public WebElement Realme;

		@FindBy (xpath = "//*[contains(text(),'6 GB')]/following::div[@title='Samsung']/div/div/label/div[@class='_1p7h2j']")
		public WebElement Samsung;

		@FindBy (xpath = "//*[contains(text(),'6 GB')]/following::div[@title='POCO']/div/div/label/div[@class='_1p7h2j']")
		public WebElement Poco;

		@FindBy (xpath = "//*[contains(text(),'6 GB')]/following::div[@title='Mi']/div/div/label/div[@class='_1p7h2j']")
		public WebElement Mi;

		@FindBy (xpath = "//*[contains(text(),'6 GB')]/following::div[@title='Apple']/div/div/label/div[@class='_1p7h2j']")
		public WebElement Apple;

		@FindBy (xpath = "//*[contains(text(),'6 GB')]/following::div[@title='Infinix']/div/div/label/div[@class='_1p7h2j']")
		public WebElement Infinix;
		
		@FindBy (xpath = "//*[@placeholder='Search Brand']/following::div[@title='Acer']/div/div/label/div[@class='_1p7h2j']")
		public WebElement Acer;
		
		@FindBy (xpath = "//*[@placeholder='Search Brand']//following::div[@title='ZOPO']/div/div/label/div[@class='_1p7h2j']")
		public WebElement ZOPO;
				
		@FindBy (xpath = "//*[contains(text(),'MORE')]")
		public WebElement MoreButton;
		
	}
}