package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.WelcomePage;
import testBase.BaseClass;
import utilities.DataProviders;


public class TC002_LoginDDT extends BaseClass{
	
	@Test (dataProvider ="loginData", dataProviderClass=DataProviders.class)
	public void TestLogin(String email, String password, String expData) throws InterruptedException {
		try {
		HomePage hp = new HomePage(driver);
		hp.setUserName(email);
		hp.setPassword(password);
		hp.clickLogin();
		Thread.sleep(5000);
		
		WelcomePage wp = new WelcomePage(driver);
		boolean targetPage = wp.confimMsg();
		
		if(expData.equals("Valid")) {
			if(targetPage==true) {
				wp.clickLogout();
				Assert.assertTrue(true);
			}else {
				Assert.assertTrue(false);
			}
		}
		if(expData.equals("Invalid")) {
			if(targetPage==true) {
				wp.clickLogout();
				Assert.assertTrue(false);
			}else {
				Assert.assertTrue(true);
			}
		}
		Thread.sleep(5000);
		}catch(Exception e) {
			
		}	
		
	}
	
}
