package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	
	public HomePage(WebDriver driver) {
		super (driver);
	}
	
	// Locators
	
	@FindBy(xpath = "//a[normalize-space() = 'Register']") WebElement reg_link;
	@FindBy(xpath = "//input[@name = 'username']") WebElement user;
	@FindBy(xpath = "//input[@name = 'password']") WebElement pass;
	@FindBy(xpath = "//input[@value = 'Log In']") WebElement login_btn;
	
	
	// Action method
	
	public void click_reg_link() {
		reg_link.click();
	}
	
	public void setUserName(String username) {
		user.sendKeys(username);
	}
	
	public void setPassword(String password) {
		pass.sendKeys(password);
	}
	
	public void clickLogin() {
		login_btn.click();
	}
	
	
}
