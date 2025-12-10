package testBase;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public WebDriver driver;
	
	@BeforeClass
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://parabank.parasoft.com/parabank/index.htm;jsessionid=ED7B4246682E90EF473801277FF612E9");
		driver.manage().window().maximize();
	}
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
	public String randomString() {
		String randomstr = RandomStringUtils.randomAlphabetic(5);
		return randomstr;
	}
	
	public String randomAlphaNum() {
		String alphaNum = RandomStringUtils.randomAlphanumeric(8);
		return alphaNum;
	}
	
	public String randomNum() {
		String ranNum = RandomStringUtils.randomNumeric(6);
		return ranNum;
	}
}
