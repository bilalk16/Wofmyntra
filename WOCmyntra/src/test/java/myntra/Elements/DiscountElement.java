package myntra.Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DiscountElement {

	@FindBy (xpath="//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[2]/div/a")
    public WebElement WomenCategory ;

    @FindBy (xpath= "//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[2]/div/div/div/div/li[3]/ul/li[2]/a")
    public WebElement Flats;
    
    @FindBy (xpath= "//*[@id=\"mountRoot\"]/div/main/div[3]/div[1]/section/div/div[6]/ul/li[5]/label")
    public WebElement Discount ;
 
    @FindBy (xpath= "//*[@id=\"desktopSearchResults\"]/div[1]/section/div[2]/ul/li/div/span")
    public WebElement msg;
}
