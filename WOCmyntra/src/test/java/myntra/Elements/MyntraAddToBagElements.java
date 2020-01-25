package myntra.Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyntraAddToBagElements {

		@FindBy(xpath="//*[@id=\"mountRoot\"]/div/main/div[3]/div[1]/section/div/div[2]/ul/li[1]/label/span") // try css selector
		public WebElement tS;

		@FindBy(xpath="//a[@data-group='men']")
		public WebElement Men;
		
		@FindBy(xpath="//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[1]/div/div/div/div/li[1]/ul/li[2]/a")
		public WebElement MenT;
		
		@FindBy(className="login-login-button")
		public WebElement submit;
		
		@FindBy(className="notify-icon-text") //notify-icon-text
		public WebElement errorMsg;
		
		@FindBy(xpath="//a[@data-group='men']")
		public WebElement menMenu;
		
		@FindBy(linkText="Watches")
		public WebElement menWatches;
		
		@FindBy(linkText="//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[2]/div/a")
		public WebElement womenMenu;
		
		@FindBy(xpath="//*[@id=\"mountRoot\"]/div/main/div[3]/div[1]/section/div/div[2]/ul/li[2]/label")
		public WebElement puma;
		
		@FindBy(xpath="//*[@id=\"desktopSearchResults\"]/div[2]/section/ul/li[1]/a/div[1]/div")
		public WebElement waitForPic;
		
		@FindBy(xpath="//*[@id=\"desktopSearchResults\"]/div[2]/section/ul/li[1]/a/div[2]/div/span[1]")
		public WebElement priceElement;
		
		@FindBy(xpath="//*[@id=\"desktopSearchResults\"]/div[2]/section/ul/li[1]/div[3]/span[1]/span")
		public WebElement addBag;
		
		@FindBy(xpath="//*[@id=\"desktopSearchResults\"]/div[2]/section/ul/li[1]/div[4]/div[2]/button[3]")
		public WebElement medSize;
		
		@FindBy(xpath="//*[@id=\"cartItemsList\"]/div/div/div/div/div[2]/div/div[1]/div")
		public WebElement itemPresent;
		
		@FindBy(xpath="//*[@id=\"desktop-header-cnt\"]/div[2]/div[2]/a[2]/span[3]")
		public WebElement bag;
		
		@FindBy(xpath="//*[@id=\"cartItemsList\"]/div[1]/div/div/div/div[2]/div/div[1]/a")
		public WebElement shirtDetails;


	}
		


	

