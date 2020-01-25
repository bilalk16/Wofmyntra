package myntra.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import myntra.Actions.DiscountActions;

public class StepDefDiscount {
	
	DiscountActions DisAction = new DiscountActions();

	@Given("^: Customer is on Myntra Women site$")
	public void customer_is_on_Myntra_Women_site() {
		DisAction.launchLoginPage();
	}

	@When("^: Customer will select Flats$")
	public void customer_will_select_Flats() throws InterruptedException {
		DisAction.SelectFlats();
	}

	@When("^: Customer will select fifty percent and above discount$")
	public void customer_will_select_fifty_percent_and_above_discount() throws InterruptedException {
		DisAction.DiscountOption();
	}

	@Then("^: Customer should be able to see the products with fifty percent and above discount$")
	public void customer_should_be_able_to_see_the_products_with_fifty_percent_and_above_discount() throws InterruptedException {
		DisAction.DiscountResult();
	}
}
