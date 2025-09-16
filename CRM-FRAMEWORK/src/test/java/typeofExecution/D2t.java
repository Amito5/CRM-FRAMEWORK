package typeofExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class D2t {
	@Test
	public void case2() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.quit();
	}

}
