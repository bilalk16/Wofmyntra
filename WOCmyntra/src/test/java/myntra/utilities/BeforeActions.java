package myntra.utilities;


import cucumber.api.Scenario;
import cucumber.api.java.Before;

public class BeforeActions {

	@Before
	public void beforeAction (Scenario scen) {
		System.out.println("my msg = initializing chrome driver");
		SetupDrivers.setupDriver();
		System.out.println(scen.getClass().getName());
	}
	
	
}
