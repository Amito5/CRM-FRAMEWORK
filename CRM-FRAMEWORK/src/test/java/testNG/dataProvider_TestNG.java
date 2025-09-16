package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Object_Repositry.Swaglab;

public class dataProvider_TestNG {
	@Test(dataProvider = "getData")
	public void data_provider(String username, String pswrd) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");
		
		Swaglab dp = new Swaglab(driver);
		WebElement un = dp.getUn();
		WebElement pwd = dp.getPwd();
		WebElement pwdElement = dp.getPwdElement();
		
		un.sendKeys(username);
		pwd.sendKeys(pswrd);
		pwdElement.click();
		Thread.sleep(5000);
		driver.quit();
	}
	@DataProvider
	public Object[][] getData(){
		Object[][] credential = new Object[4][2];
		
		credential[0][0] = "standard_user";
		credential[0][1] = "secret_sauce";
		
		credential[1][0] = "locked_out_user";
        credential[1][1] = "secret_sauce";

        credential[2][0] = "problem_user";
        credential[2][1] = "secret_sauce";

        credential[3][0] = "performance_glitch_user";
        credential[3][1] = "secret_sauce";

      
        return credential;

		
	}
	

}
