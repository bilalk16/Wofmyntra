package myntra.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import myntra.Actions.ZipcodeFeatureActions;

public class MyntraZipCodeStepDef {

	ZipcodeFeatureActions zipcodeaction = new ZipcodeFeatureActions();
	
	@Given("^User is at myntra Sweaters page$")
	public void user_is_at_myntra_Sweaters_page()   {
		zipcodeaction.launchSweathersPage();
	}

	@When("^when customer selects item$")
	public void when_customer_selects_item() throws InterruptedException   {
		zipcodeaction.selectProduct();
	}

	@When("^customer scrolls to delivery options$")
	public void customer_scrolls_to_delivery_options() throws InterruptedException   {
		zipcodeaction.switchandscrollwindow();
	}

	@When("^customer enters zipcode$")
	public void customer_enters_zipcode() throws InterruptedException   {
		zipcodeaction.sendZipcode();
	}

	@Then("^customer should be able to get available dilvery time$")
	public void customer_should_be_able_to_get_available_dilvery_time() throws InterruptedException   {
		zipcodeaction.msgCheck();

	}
	
}
