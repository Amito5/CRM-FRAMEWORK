package Object_Repositry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fblogin {

	public fblogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "email")
	private WebElement un;
	
	@FindBy(id = "pass")
	private WebElement pwd;
	
	@FindBy(name = "login")
	private WebElement lgbtn;

	public WebElement getUn() {
		return un;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public WebElement getLgbtn() {
		return lgbtn;
	}
}
