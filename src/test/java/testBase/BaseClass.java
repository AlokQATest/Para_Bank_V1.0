package testBase;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	public WebDriver driver;
	public Logger logger;
	public Properties prop;
	public FileInputStream file;
	@BeforeClass
	@Parameters({"os", "browser"})
	public void setup(String os, String br) throws IOException {
		
		//Loading and reading properties file
		file = new FileInputStream("./src/test/resources/config.properties");
		prop = new Properties();
		prop.load(file);
		
		
		logger = LogManager.getLogger(this.getClass());
		logger.info("Starting point");
		switch (br){
		case "chrome": driver = new ChromeDriver(); break;
		case "firefox": driver = new FirefoxDriver();
		default: System.out.println("Invalid browser name");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(prop.getProperty("appURL"));
		driver.manage().window().maximize();
	}
	@AfterClass
	public void tearDown() {
		logger.info("Ending point");
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
