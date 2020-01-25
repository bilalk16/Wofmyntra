package myntra.Actions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

import myntra.Elements.MyntraAddToBagElements;
import myntra.utilities.SetupDrivers;

public class MyntraAddToBagActions {

		MyntraAddToBagElements AddToBagElements;
		
		Actions actions = new Actions(SetupDrivers.driver); 
		
		public MyntraAddToBagActions() {
			AddToBagElements =  new MyntraAddToBagElements();
			PageFactory.initElements(SetupDrivers.driver, AddToBagElements);
		}
		
		public void launchMenPage() throws InterruptedException {
			
			SetupDrivers.driver.get("https://www.myntra.com/");
			SetupDrivers.driver.manage().window().maximize();
			SetupDrivers.driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
			
		}
		
		public void navigateToMenMenu() throws InterruptedException  {
			System.out.println(">> Navigating to the MEN menu");
		
			actions.moveToElement(AddToBagElements.Men).perform();
			Thread.sleep(3000);
		}

		public void navigateToMenTshirts() throws InterruptedException  {		
			 System.out.println(">> Navigating to the Men Watches"); 

			 actions.moveToElement(AddToBagElements.MenT);
			 Thread.sleep(2000);
			 actions.click().build().perform();
		}

		public void selectBrandCheckbox() throws InterruptedException {
			System.out.println("selecting puma");
			//Actions actions = new Actions(SetupDrivers.driver);
			actions.moveToElement(AddToBagElements.puma).click().build().perform();
			Thread.sleep(3000);
		}
		
		
		public void clickAddToBag()  throws InterruptedException, IOException    {
			System.out.println("click add to bag");

			actions.moveToElement(AddToBagElements.priceElement).perform();
			Thread.sleep(2000);
			
			actions.moveToElement(AddToBagElements.addBag).click().build().perform();
			Thread.sleep(2000);
			 
		}

		public void userSelectSize() {
			System.out.println("size select");
			actions.moveToElement(AddToBagElements.medSize).click().build().perform();
			SetupDrivers.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}


		public void userClickBag()   {
			System.out.println("clicking add to bag");
			AddToBagElements.bag.click();
			SetupDrivers.driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		}

		
		public String seeItemOnBag()   {
			
			String item = AddToBagElements.shirtDetails.getText();
			return item;

		}
		
		
		
}


	

