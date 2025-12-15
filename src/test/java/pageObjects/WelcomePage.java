package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomePage extends BasePage {

	public WelcomePage(WebDriver driver) {
		super (driver);
	}
	
	// Locators
	@FindBy(xpath = "//p[normalize-space()='Your account was created successfully. You are now logged in.']") WebElement confirm_msg;
	@FindBy(xpath = "//a[normalize-space()='Log Out']") WebElement link_Logout; 
	
	
	
	// Action methods
	
	public boolean confimMsg() {
		boolean status = false;
		try {
			if(confirm_msg.isDisplayed()==true) {
				status = true;
				return status;
			}else {
				return status;
			}
		}catch(Exception e) {
			return status;
		}
		
	}
	
	public void clickLogout() {
		link_Logout.click();
	}
}
