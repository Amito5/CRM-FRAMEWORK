package WebDriverUtility;

import org.openqa.selenium.WebDriver;

/**
 * this class contains resuable webdriver utility menthods for 
 * manage methods
 * @author Amit 
 */

public class WebDriverUtiltiy {
	WebDriver driver;
	
	public WebDriverUtiltiy(WebDriver driver) {
		this.driver = driver;
	}
	/**
	 * Maximize the browser window
	 */
	
	public void maximizeWindow() {
		driver.manage().window().maximize();
	}
	/**
	 * Minimize the browser window
	 */
	
	public void minimizeWindow() {
		driver.manage().window().minimize();	
	}
	/**
	 * Fullscreen the browser window
	 */
	
	public void fullscreenWindow() {
		driver.manage().window().fullscreen();
		
	}

}
