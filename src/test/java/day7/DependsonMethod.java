package day7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DependsonMethod {
	WebDriver driver;
	@Test
	public void OpenBrowser() {
		driver= new ChromeDriver();
		System.out.println("Browser opened");
	}
	@Test(dependsOnMethods = {"OpenBrowser"})
	public void Enterurl() {
		driver.get("https://www.facebook.com/");
		System.out.println("Passed url");
	}

}
