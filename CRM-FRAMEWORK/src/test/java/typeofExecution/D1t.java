package typeofExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class D1t {
	@Test
	public void case3() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://qspiders.com/");
		Thread.sleep(2000);
		driver.quit();
	}

	

}
