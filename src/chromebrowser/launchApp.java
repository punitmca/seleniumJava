package chromebrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class launchApp {
	public WebDriver driver ;

	@BeforeClass
	public void createChromeDriver() {
		System.setProperty("webdriver.chrome.driver", "src\\chromebrowser\\chromedriver.exe");
		driver =new ChromeDriver();
	}
	
	@Test
	public void openBrowser() {
		driver.get("http://www.google.com");
		String title =driver.getTitle();
		Assert.assertEquals(title, "Google");
		Assert.assertEquals(title, "Google");
		
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.close();
	}
	
	
}
