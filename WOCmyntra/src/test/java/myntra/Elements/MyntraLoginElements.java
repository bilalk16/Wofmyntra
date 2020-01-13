package myntra.Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyntraLoginElements {

	@FindBy(name="email")
	public WebElement email;
	
	@FindBy(name="password")
	public WebElement password;
	
	@FindBy(className="login-login-button")
	public WebElement submit;
	
	@FindBy(className="notify-icon-text") //notify-icon-text
	public WebElement errorMsg;
	
	
}
