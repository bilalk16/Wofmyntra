package myntra.stepDef;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import myntra.Actions.MenMyntraAction;

public class StepDefMen {

	MenMyntraAction menaction = new MenMyntraAction();

	@Given("^: Myntra USA site is launched$")
	public void myntra_USA_site_is_launched()  {
		menaction.launchLoginPage();
	    	}

	@When("^: Customer explores the MEN menu option$")
	public void customer_explores_the_MEN_menu_option() throws InterruptedException {
		menaction.navigateToMenMenu();
	}

	@And ("^: Customer should be able to access Topwear$")
	public void customer_should_be_able_to_access_Topwear() throws InterruptedException {
		menaction.topWear();
		System.out.println("ok");
	}

	@Then("^:Customer will be able to choose Tshirt of his choice$")
	public void customer_will_be_able_to_choose_Tshirt_of_his_choice() throws InterruptedException {
		menaction.navigateToTShirt();
        System.out.println("ok");
	
}

}
