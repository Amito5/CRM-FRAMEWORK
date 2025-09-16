package Object_Repositry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Swaglab {
     public Swaglab(WebDriver driver) {
    	 PageFactory.initElements(driver, this);
     }
     @FindBy(id = "user-name")
     private WebElement un;
     
     @FindBy(id = "password")
     private WebElement pwd;
     
     @FindBy(id = "login-button")
     private WebElement pwdElement;

	 public WebElement getUn() {
		 return un;
	 }

	 public WebElement getPwd() {
		 return pwd;
	 }

	 public WebElement getPwdElement() {
		 return pwdElement;
	 }
}
