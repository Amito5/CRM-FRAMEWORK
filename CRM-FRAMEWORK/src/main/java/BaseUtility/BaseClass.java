package BaseUtility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import GenericUtility.FileUtility;
import Object_Repositry.HomePage;
import Object_Repositry.login;
import WebDriverUtility.Wdutility;

public class BaseClass {
	public WebDriver driver = null;
	@BeforeSuite
	public void dbconn() {
		System.out.println("Database connectivity+report configuration");
	}
	
	@BeforeTest
	public void precon() {
		System.out.println("precondition");
	}
	@BeforeClass
	public void openBro() throws IOException {
		FileUtility futil = new FileUtility();
		
		String browser = futil.getDataFromPropertiesFile("bro");
		
		if(browser.equals("chrome")) {
			driver=new ChromeDriver();
		}else if(browser.equals("edge")) {
			driver=new EdgeDriver();
		}else if(browser.equals("firefox")) {
			driver=new FirefoxDriver();
		}else {
			driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@BeforeMethod
	public void login() throws IOException {
		FileUtility futil = new FileUtility();
		String url = futil.getDataFromPropertiesFile("url");
		String un = futil.getDataFromPropertiesFile("un");
		String pwd = futil.getDataFromPropertiesFile("pwd");
		
		driver.get(url);
		login lp = new login(driver);
		lp.loginToCRM(un, pwd);
		
	}
	
	@AfterMethod
	public void logout() {
	HomePage hp = new HomePage(driver);
	WebElement profile = hp.getProfile();
	Wdutility wutil = new Wdutility(driver);
	wutil.hover(profile);
	hp.getSignOut().click();
	
	}
	@AfterClass
	public void closeBRO() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}
	
	@AfterTest
	public void postcon() {
		System.out.println("post condition");
	}
    
	@AfterSuite
	public void ddclose() {
		System.out.println("Database connectivity close + report backup");
	}
}
