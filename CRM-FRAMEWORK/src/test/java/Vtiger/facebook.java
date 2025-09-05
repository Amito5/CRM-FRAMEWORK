package Vtiger;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Object_Repositry.fblogin;

public class facebook {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.facebook.com/");
		
		fblogin lp = new fblogin(driver);
		WebElement un = lp.getUn();
		WebElement pwd = lp.getPwd();
		WebElement lgbtn = lp.getLgbtn();
		
		un.sendKeys("admin");
		pwd.sendKeys("sdsdsdd");
		lgbtn.click();
		
		Thread.sleep(5000);
		driver.quit();
	}

}
