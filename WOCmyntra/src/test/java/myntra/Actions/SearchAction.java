package myntra.Actions;

import static org.testng.Assert.fail;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import myntra.Elements.SearchElement;
import myntra.utilities.SetupDrivers;

public class  SearchAction {

	SearchElement SrcElement;
	
	public  SearchAction() {
		SrcElement= new SearchElement();
		PageFactory.initElements(SetupDrivers.driver,SrcElement);
		}
		
	public String launchLoginPage() {
		SetupDrivers.driver.get("https://www.myntra.com/?utm_source=optimise&utm_medium=affiliate&utm_campaign=963611_9d482b0ef4454ca099c48362bebff1f7");
		SetupDrivers.driver.manage().window().maximize();
		String title=SetupDrivers.driver.getTitle();
		
		return title;
	}

	public  void SearchBar()throws InterruptedException {
		SrcElement.SearchBar.sendKeys("Perfume");
		SrcElement.SearchBtn.click();
		Thread.sleep(9000);
		
	}
	
	public  void  MenCategory ()throws InterruptedException {
		SrcElement.MenCategory.click();
		Thread.sleep(2000);
	}

	public  void  BodyMist(){
		SrcElement.BodyMist.click();
		
	}	
		
	public void PerfumeSearchResult() throws InterruptedException {
		System.out.println(">> Navigate to BodyMist");
		Actions action = new Actions(SetupDrivers.driver);
		action.moveToElement(SrcElement.BodyMist).click().build().perform();		
		Thread.sleep(9000);
		

		if (SrcElement.msg.isDisplayed()) {
		
			System.out.println("Test Passed");
			} else {
			System.out.println("Test Failed");
			fail();
			}
		
	}

}


