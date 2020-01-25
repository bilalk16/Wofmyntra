package myntra.stepDef;

import static org.testng.Assert.fail;

import java.io.IOException;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import myntra.Actions.MyntraAddToBagActions;


public class MyntraAddToBagStepDef {

	MyntraAddToBagActions menuPageAction = new MyntraAddToBagActions();
	
	@Given("^user is on Myntra T-shirts page$")
	public void user_is_on_Myntra_T_shirts_page() throws InterruptedException   {	   	
		menuPageAction.launchMenPage();
	}

	@When("^user hover over to men$")
	public void user_hover_over_to_men() throws InterruptedException  {
			menuPageAction.navigateToMenMenu();
	}

	@When("^user select T-shirts$")
	public void user_select_T_shirts() throws InterruptedException   {
			menuPageAction.navigateToMenTshirts();
	}

	@When("^user select brand name check box$")
	public void user_select_brand_name_check_box() throws InterruptedException   {
			System.out.println("click check box");
			menuPageAction.selectBrandCheckbox();
	}

	@When("^user click add to bag$")
	public void user_click_add_to_bag() throws InterruptedException, IOException   {
	    menuPageAction.clickAddToBag();
	}

	@When("^user select medium size$")
	public void user_select_medium_size()   {
	    menuPageAction.userSelectSize();
	}

	@When("^user click bag$")
	public void user_click_bag()   {
		menuPageAction.userClickBag();
	}

	@Then("^user should be able to see item added to bag$")
	public void user_should_be_able_to_see_item_added_to_bag()   {
		menuPageAction.seeItemOnBag();
		
		String shirtDetails = menuPageAction.seeItemOnBag();
		
		if (shirtDetails.toLowerCase().contains("men")) {
			System.out.println("-------- > Add to Bag Feature: Passed");
		} else {
			System.out.println("-------- > Add to Bag Feature: FAILED");
			fail();

		}
	}
	
}
