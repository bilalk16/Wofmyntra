package myntra.Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenMyntraElement {

	@FindBy(xpath = "//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[1]/div/a")
	public WebElement MenCategory;

	@FindBy(xpath = "//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[1]/div/div/div/div/li[1]/ul/li[1]/a")
	public WebElement CategoryName;

	@FindBy(xpath = "//*[@id=\"mountRoot\"]/div/main/div[3]/div[1]/section/div/div[2]/ul/li[1]/label/span")
	public WebElement TShirts;

	@FindBy(xpath = "// *[@id=\\\"desktopSearchResults\\\"]/div[1]/section/div[2]/ul/li")
	public WebElement msg;

}
