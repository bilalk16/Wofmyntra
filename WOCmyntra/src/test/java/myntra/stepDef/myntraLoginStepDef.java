package myntra.stepDef;

import static org.testng.Assert.fail;

import java.util.concurrent.TimeUnit;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import myntra.Actions.MyntraLoginActions;
import myntra.utilities.SetupDrivers;


public class myntraLoginStepDef {
	
	MyntraLoginActions loginactions =  new MyntraLoginActions();
	
	
	@Given("^myntra login page is launched$")
	public void myntra_login_page_is_launched()  {
		loginactions.launchLoginPage();
		
		if (SetupDrivers.driver.getTitle().toLowerCase().contains("login")) {
			 System.out.println("mySuccessfylly launched login page for Myntra"); } 
			 else {
			 System.out.println("my Myntra failed"); 
			 fail(); 
			 }
	}

	@When("^user input wrong \"([^\"]*)\" and wrong \"([^\"]*)\"$")
	public void user_input_wrong_and_wrong(String email, String password)  {
		
		loginactions.inputEmail(email);
		loginactions.inputPassword(password);
		loginactions.submit();
	}

	@Then("^user should get error message$")
	public void user_should_get_error_message() {
		System.out.println("My msg: check error");
		
		SetupDrivers.driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		String msg = loginactions.errorMsg();
		if (msg.toLowerCase().contains("account") || msg.toLowerCase().contains("invalid")) {
			System.out.println(">> PASSED");
		} else {
			System.out.println(">> FAILED");
			fail();

		}
	
			
	}

		
}


