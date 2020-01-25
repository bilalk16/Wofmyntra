package myntra.Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ZipcodeFeatureElements {

		@FindBy(xpath="//*[@id=\"desktopSearchResults\"]/div[2]/section/ul/li[2]/a/div[2]/div")
		public WebElement roadster;	
		
		@FindBy(xpath="//*[@id=\"mountRoot\"]/div/div/main/div[2]/div[2]/div[7]/div/span/div/form/input[1]")
		public WebElement zipcode;
		
		@FindBy(xpath="//*[@id=\"mountRoot\"]/div/div/main/div[2]/div[2]/div[7]/div/span/div/form/input[2]")
		public WebElement checkBtn;
		@FindBy(xpath="//*[@id=\"mountRoot\"]/div/div/main/div[2]/div[2]/div[7]/div/span/div/ul/li[1]/div[2]/h4")
		public WebElement deliveryMsg;

		@FindBy(xpath="//*[@id=\"mountRoot\"]/div/div/main/div[2]/div[2]/div[7]/div/span/div/h4/span")
		public WebElement delTitle;
}

	



