package myntra.Actions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import myntra.Elements.MyntraSignupElements;
import myntra.utilities.SetupDrivers;

public class MyntraSignUpActions {
	
	public MyntraSignupElements SignupElements;
	
	Actions actions = new Actions(SetupDrivers.driver);
	
	public MyntraSignUpActions() {
		SignupElements = new MyntraSignupElements();
		PageFactory.initElements(SetupDrivers.driver, SignupElements);
	}
	
	public void launchSignupPage() {
		
		SetupDrivers.driver.get("https://www.myntra.com/register?referer=https://www.myntra.com/");
		SetupDrivers.driver.manage().window().maximize();
		SetupDrivers.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
	}
	

	public void enterEmailAndPassword(String email, String password) {
		SignupElements.email.sendKeys(email);
		SignupElements.password.sendKeys(password);
		
	}
	
	public void selectGender() throws InterruptedException {
		SignupElements.male.click();
		Thread.sleep(3000);
	}
	
	public void errorMsg() throws InterruptedException {
		
		SignupElements.reg.click();
		
		Thread.sleep(3000);		
	}
}
