package Object_Repositry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {
	
	public login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	 @FindBy(name = "user_name")
	 private WebElement username;
	 
	 @FindBy(name = "user_password")
	 private WebElement pwd;
	 
	 @FindBy(id  = "submitButton")
	 private WebElement logbtn;

	 public WebElement getUsername() {
		 return username;
	 }

	 public WebElement getPwd() {
		 return pwd;
	 }

	 public WebElement getLogbtn() {
		 return logbtn;
	 }
	 
	 
	 

}
