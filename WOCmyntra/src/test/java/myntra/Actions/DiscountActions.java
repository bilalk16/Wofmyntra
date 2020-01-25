package myntra.Actions;

import static org.testng.Assert.fail;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import myntra.Elements.DiscountElement;
import myntra.utilities.SetupDrivers;

public class DiscountActions {
	
DiscountElement DisElement;
	
Actions action = new Actions(SetupDrivers.driver);

	public DiscountActions(){
    DisElement= new DiscountElement();
	PageFactory.initElements(SetupDrivers.driver,DisElement);
		}
	
	public String launchLoginPage() {
		SetupDrivers.driver.get("https://www.myntra.com/shop/women");
		SetupDrivers.driver.manage().window().maximize();
		SetupDrivers.driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		String title=SetupDrivers.driver.getTitle();
		return title;
	}
	
	public  void  SelectFlats() throws InterruptedException {		
		System.out.println(">> Navigating to the WOMEN menu");		
		action.moveToElement(DisElement.WomenCategory).perform();
		Thread.sleep(3000);
		
		action.moveToElement(DisElement.Flats);
		Thread.sleep(3000);
		action.click().build().perform();
	}

	public  void  DiscountOption()throws InterruptedException{
	
		Actions action = new Actions(SetupDrivers.driver);
		action.moveToElement(DisElement.Discount).click().build().perform();
		Thread.sleep(5000);
	}
				
	public  void  DiscountResult()throws InterruptedException{
		Actions action = new Actions(SetupDrivers.driver);
		action.moveToElement(DisElement.msg).click().build().perform();
		Thread.sleep(3000);
			if (DisElement.msg.isDisplayed()){
		
			System.out.println("Test Passed");
			} else {
			System.out.println("Test Failed");
			fail();
			}
	}	
}
