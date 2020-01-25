package myntra.Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchElement {

	@FindBy (xpath="//*[@id=\"desktop-header-cnt\"]/div[2]/div[3]/input")
    public WebElement SearchBar;
    
	@FindBy (xpath="//*[@id=\"desktop-header-cnt\"]/div[2]/div[3]/a/span")
    public WebElement SearchBtn;
    
    @FindBy (xpath= "//*[@id=\"mountRoot\"]/div/main/div[3]/div[1]/section/div/div[2]/ul/li[1]/label")
     public WebElement MenCategory;
  
    @FindBy (xpath= "//*[@id=\"mountRoot\"]/div/main/div[3]/div[1]/section/div/div[3]/ul/li[4]/label")
    public WebElement BodyMist;
 
    @FindBy (xpath= "//*[@id=\"desktopSearchResults\"]/div[1]/section/div[2]/ul/li/div")
    public WebElement msg;
 
}
