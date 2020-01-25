package myntra.stepDef;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import myntra.Actions.SearchAction;

public class SearchStepDef {
	SearchAction SrcAction = new SearchAction();

	@Given("^: Customer is on Myntra Homepage$")
	public void customer_is_on_Myntra_Homepage() {
		SrcAction.launchLoginPage();
	}

	@When("^: Customer search for Perfume$")
	public void customer_search_for_Perfume() throws InterruptedException {
		SrcAction.SearchBar();
	}

	@And("^: Customer filter perfume for Men$")
	public void customer_filter_perfume_for_Men() throws InterruptedException {
		SrcAction.MenCategory();
	}

	@And("^: Customer select Body Mist  from category$")
	public void customer_select_Body_Mist_from_category() {
		SrcAction.BodyMist();
	}

	@Then("^: Customer will be able to choose BodyMist from different selection$")
	public void customer_will_be_able_to_choose_BodyMist_from_different_selection() throws InterruptedException {
		SrcAction.PerfumeSearchResult();

	}

}
