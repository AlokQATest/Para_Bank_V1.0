package testCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccRegisterPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC001_AccRegTest extends BaseClass{

	@Test
	public void verifyAccReg() {
		
		HomePage hp = new HomePage(driver);
		hp.click_reg_link(); // Clicking on registration page link
	
		logger.info("Clicked on Registration page link");
		
		AccRegisterPage arp = new AccRegisterPage(driver);
		
		logger.info("Providing user details");
		
		// Filling user registration form
		arp.setFirstName(randomString().toUpperCase());
		arp.setLastName(randomString().toUpperCase());
		arp.setAdd(randomString());
		arp.setCity(randomString());
		arp.setState(randomString());
		arp.setZip(randomNum());
		arp.setPhone(randomNum());
		arp.setSSN(randomAlphaNum());
		arp.setUserName(randomString());
		String pass = randomAlphaNum();
		arp.setPassword(pass);
		arp.setConfirmPass(pass);
		
		arp.clickSubmit();
		
		
		String confirmMsg = arp.getConfirMsg();
		logger.info("Verifying successfull account creation");
		// Validating success message
		Assert.assertEquals(confirmMsg, "Your account was created successfully. You are now logged in.");
		
	}
	
}
