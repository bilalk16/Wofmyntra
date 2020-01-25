package myntra.stepDef;

import static org.testng.Assert.fail;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import myntra.Actions.MyntraSignUpActions;


public class MyntraSignUpError {
	
	MyntraSignUpActions SignupActions = new MyntraSignUpActions();

	@Given("^user is at sign up page$")
	public void user_is_at_sign_up_page()   {
		SignupActions.launchSignupPage();
	}

	@When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String email, String password)   {
		SignupActions.enterEmailAndPassword(email, password);
	}

	@When("^user select gender$")
	public void user_select_gender() throws InterruptedException   {
		SignupActions.selectGender();		
	}

	@Then("^User gets error message$")
	public void user_gets_error_message() throws InterruptedException   {
		SignupActions.errorMsg();
			
		if(SignupActions.SignupElements.eightChar.isDisplayed()) {
			System.out.println("------- >> Sign up feature:: Test Passed");
			
		} else {
			System.out.println("------- >> Sign up feature:: test failed");
		fail();
	}
		
	}
	
}
