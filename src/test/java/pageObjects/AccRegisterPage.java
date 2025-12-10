package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccRegisterPage extends BasePage{
	
	public AccRegisterPage(WebDriver driver) {
		super (driver);
	}
	
	// Locators
	
	@FindBy(xpath="//input[@name='customer.firstName']") WebElement fname;
	@FindBy(xpath="//input[@name='customer.lastName']") WebElement lname;
	@FindBy(xpath="//input[@name='customer.address.street']") WebElement address;
	@FindBy(xpath="//input[@name='customer.address.city']") WebElement city;
	@FindBy(xpath="//input[@name='customer.address.state']") WebElement state;
	@FindBy(xpath="//input[@name='customer.address.zipCode']") WebElement zipcode;
	@FindBy(xpath="//input[@name='customer.phoneNumber']") WebElement phonenum;
	@FindBy(xpath="//input[@name='customer.ssn']") WebElement SSN;
	@FindBy(xpath="//input[@name='customer.username']") WebElement username;
	@FindBy(xpath="//input[@name='customer.password']") WebElement password;
	@FindBy(xpath="//input[@name='repeatedPassword']") WebElement conPass;
	@FindBy(xpath="//input[@value='Register']") WebElement submitBtn;
	
	@FindBy(xpath="//div[@id='rightPanel']//p") WebElement confimMsg;
	
	//Action methods
	
	public void setFirstName(String firstName) {
		fname.sendKeys(firstName);
	}
	
	public void setLastName(String lastName) {
		lname.sendKeys(lastName);
	}
	
	public void setAdd(String add) {
		address.sendKeys(add);
	}
	
	public void setCity(String City) {
		city.sendKeys(City);
	}
	
	public void setState(String State) {
		state.sendKeys(State);
	}
	
	public void setZip(String zip) {
		zipcode.sendKeys(zip);
	}
	
	public void setPhone(String phone) {
		phonenum.sendKeys(phone);
	}
	
	public void setSSN(String ssn) {
		SSN.sendKeys(ssn);
	}
	
	public void setUserName(String UserName) {
		username.sendKeys(UserName);
	}
	
	public void setPassword(String Password) {
		password.sendKeys(Password);
	}
	
	public void setConfirmPass(String confirmPass) {
		conPass.sendKeys(confirmPass);
	}
	
	public void clickSubmit() {
		submitBtn.click();
	}
	
	public String getConfirMsg() {
		try {
			 return (confimMsg.getText());
			
		}
		catch(Exception e) {
			return(e.getMessage());
		}
		
	}
	
	
}	
