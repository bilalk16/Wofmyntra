package myntra.Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyntraSignupElements {

	@FindBy(xpath="//*[@id=\"mountRoot\"]/div/div/div/form/fieldset[1]/div[1]/input")
	public WebElement email;
	
	@FindBy(xpath="//*[@id=\"mountRoot\"]/div/div/div/form/fieldset[1]/div[2]/input")
	public WebElement password;
	
	@FindBy(xpath="//*[@id=\"mountRoot\"]/div/div/div/form/fieldset[1]/fieldset/label[1]")
	public WebElement male;

	@FindBy(xpath="//*[@id=\"mountRoot\"]/div/div/div/form/fieldset[2]/button")
	public WebElement reg;
	
	@FindBy(xpath="//*[@id=\"mountRoot\"]/div/div/div/form/fieldset[1]/div[2]/div[1]/span[1]/span")
	public WebElement eightChar;
}
