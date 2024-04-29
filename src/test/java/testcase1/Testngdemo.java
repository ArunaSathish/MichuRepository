package testcase1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testngdemo {
	WebDriver driver;
	@BeforeMethod
	public void OpenBrowser() {
        driver = new ChromeDriver();
        System.out.println("Opened");
	}
		
@AfterMethod
	public void closebrowser() {
		driver.close();
		System.out.println("Closed");
		
	}
@Test
	public void enterurl() {
		driver.get("https://www.facebook.com/");
		System.out.println("Url Passed");
	}
@Test
	public void enterurl2() {
		driver.get("https://www.amazon.in/");
		System.out.println("Another Url Passed");
	}

}


