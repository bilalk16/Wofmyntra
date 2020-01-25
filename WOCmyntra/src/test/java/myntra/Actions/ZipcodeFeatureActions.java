package myntra.Actions;

import static org.testng.Assert.fail;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

import myntra.Elements.ZipcodeFeatureElements;
import myntra.utilities.SetupDrivers;

public class ZipcodeFeatureActions {

	ZipcodeFeatureElements zipcodeElements;
	
	Actions actions = new Actions(SetupDrivers.driver);
	
	public ZipcodeFeatureActions() {
		zipcodeElements = new ZipcodeFeatureElements();
		PageFactory.initElements(SetupDrivers.driver, zipcodeElements);
	}
	
	public void launchSweathersPage() {
		
		SetupDrivers.driver.get("https://www.myntra.com/men-sweaters");
		SetupDrivers.driver.manage().window().maximize();
		SetupDrivers.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
	}
	
	public void selectProduct() throws InterruptedException  {
		
		actions.moveToElement(zipcodeElements.roadster);
		Thread.sleep(5000);
		
		actions.click().build().perform();
		Thread.sleep(5000);
		
	}

	public void switchandscrollwindow() throws InterruptedException {
		
		Set<String> AllWindowHandles = SetupDrivers.driver.getWindowHandles();
		
		String window1 = (String) AllWindowHandles.toArray()[0];
		String window2 = (String) AllWindowHandles.toArray()[1];
		
		SetupDrivers.driver.switchTo().window(window2);
		Thread.sleep(5000);
		
		actions.moveToElement(zipcodeElements.zipcode);
		actions.click().build().perform();
		Thread.sleep(5000);
		
	}
	
	public void sendZipcode() throws InterruptedException {
		zipcodeElements.zipcode.sendKeys("456001");
		Thread.sleep(5000);
		
		zipcodeElements.checkBtn.submit();
		Thread.sleep(2000);
		
		((JavascriptExecutor) SetupDrivers.driver).executeScript("arguments[0].scrollIntoView(true);", zipcodeElements.delTitle);
		Thread.sleep(5000);
		
	}
	
	public void msgCheck() throws InterruptedException {
		
		String msg = zipcodeElements.deliveryMsg.getText();
		System.out.println(msg);			
		Thread.sleep(5000);
		
		if (msg.contains("Delivery")) {
			System.out.println("--- My zip code Test Passed");
		} else {
			System.out.println("--- My zip code Test is failed");
			fail();
			
		}
	}
}

