package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	
	public HomePage(WebDriver driver) {
		super (driver);
	}
	
	// Locators
	
	@FindBy (xpath = "//a[normalize-space() = 'Register']") WebElement reg_link;
	
	// Action method
	
	public void click_reg_link() {
		reg_link.click();
	}
	
}
