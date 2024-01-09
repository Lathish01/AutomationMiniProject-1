package SwagLabs.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class baseClass {

	//url declaration
	String url = "https://www.saucedemo.com/";
	
	public WebDriver driver = null;
	
	//to start the application
	@BeforeMethod
	public void startApplication() {
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	//to end the application
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}

