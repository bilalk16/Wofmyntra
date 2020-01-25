package myntra.Actions;

import static org.testng.Assert.fail;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import myntra.Elements.MenMyntraElement;
import myntra.utilities.SetupDrivers;

public class MenMyntraAction {

	MenMyntraElement MenElement;

	public MenMyntraAction() {
		MenElement = new MenMyntraElement();
		PageFactory.initElements(SetupDrivers.driver, MenElement);
	}

	public String launchLoginPage() {
		SetupDrivers.driver.get(
				"https://www.myntra.com/?utm_source=optimise&utm_medium=affiliate&utm_campaign=963611_9d482b0ef4454ca099c48362bebff1f7");
		SetupDrivers.driver.manage().window().maximize();
		String title = SetupDrivers.driver.getTitle();

		return title;
	}

	public void navigateToMenMenu() throws InterruptedException {
		System.out.println(">> Navigating to the MEN menu");
		Actions action = new Actions(SetupDrivers.driver);
		action.moveToElement(MenElement.MenCategory);
		// action.build();
		action.perform();
		Thread.sleep(7000);
	}

	public void topWear() throws InterruptedException {
		MenElement.CategoryName.click();
		Thread.sleep(7000);

	}

	public void navigateToTShirt() throws InterruptedException {
		System.out.println(">> Navigate to Tshirt");
		
		Actions action = new Actions(SetupDrivers.driver);
		action.moveToElement(MenElement.TShirts).click().build().perform();
		Thread.sleep(9000);

		WebElement TshirtMsg = SetupDrivers.driver.findElement(By.xpath("//*[@id=\"desktopSearchResults\"]/div[1]/section/div[2]/ul/li "));

		if (TshirtMsg.isDisplayed()) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
			fail();
		}
	}

}
