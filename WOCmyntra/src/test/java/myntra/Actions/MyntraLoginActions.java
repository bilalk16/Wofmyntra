package myntra.Actions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.PageFactory;
import myntra.Elements.MyntraLoginElements;
import myntra.utilities.SetupDrivers;

public class MyntraLoginActions {

	MyntraLoginElements LoginElements;
	
	public MyntraLoginActions() {
		LoginElements =  new MyntraLoginElements();
		PageFactory.initElements(SetupDrivers.driver, LoginElements);
	}
	
	public void launchLoginPage() {
		SetupDrivers.driver.get("https://www.myntra.com/login?referer=https://www.myntra.com/");
		SetupDrivers.driver.manage().window().maximize();
		SetupDrivers.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	public void inputEmail(String email) {
		LoginElements.email.sendKeys("invalid@email.com"); // this will send desired keys
	}
	
	public void inputPassword(String password) {
		LoginElements.password.sendKeys(password);
		
	}

	public void submit() {
		
		
		LoginElements.submit.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println("catch done");
			e.printStackTrace();
		}
	}

	public String errorMsg() {
		String msg = LoginElements.errorMsg.getText();
		return msg;

	}
	
	
}
	
	
	
	
	
	

