package Vtiger;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class org {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://localhost:8888/");
		
		//login
		
		WebElement username= driver.findElement(By.name("user_name"));
		username.sendKeys("admin");
		
		WebElement pwd=driver.findElement(By.name("user_password"));
		pwd.sendKeys("manager");
		
		driver.findElement(By.id("submitButton")).click();
		
		//create Organizations
		
		driver.findElement(By.linkText("Organizations")).click();
		driver.findElement(By.cssSelector("img[title='Create Organization...']")).click();
		
		// name 
		
		
		String orgName = "Apple" +(int)(Math.random()*9999);
		WebElement orgfield=driver.findElement(By.name("accountname"));
		orgfield.sendKeys(orgName);
		
		//phone Number
		
		long phoneNum =  (long)(Math.random()* 9000000000L)+1000000000L;
		String phone = String.valueOf(phoneNum);
		
		WebElement ph = driver.findElement(By.id("phone"));
		ph.sendKeys(phone);
		
		//industry 
			
		WebElement industry = driver.findElement(By.name("industry"));
		
		Select industrys = new Select (industry);
		
		boolean status = industrys.isMultiple();
		if (status) {
			System.out.println("Given dropdown is multi select");
		} else {
			System.out.println("Given dropdown is single select");
		}
		
		industrys.selectByIndex(2);
		
		Thread.sleep(6000);
		
		driver.findElement(By.cssSelector("input[title='Save [Alt+S]']")).click();
		
		// Verfication for Organizations
		
		String actualOrgName = driver.findElement(By.id("dtlview_Organization Name")).getText();
		
		if(actualOrgName.equals(orgName)) {
			
			System.out.println("organization created successfully...");
			
		}else {
			System.out.println("organization could not be created successfully..");
		}
		
		// verification for Phone Number
		
		String actualNumber = driver.findElement(By.id("dtlview_Phone")).getText();
		
		if(actualNumber.equals(phone)) {
			
			System.out.println("Number Is currect...");
		}else {
			
			System.out.println("Number is wrong...");
		}
		
//		WebElement OrgName=driver.findElement(By.name("accountname"));
//		OrgName.sendKeys("Nothing");
		
		
		//hover to profile for  logout
		
		WebElement hover=driver.findElement(By.cssSelector("img[src='themes/softed/images/user.PNG']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(hover).build().perform();
		
		driver.findElement(By.linkText("Sign Out")).click();
		
		Thread.sleep(5000);
		driver.quit();
		
	}

	


	}


