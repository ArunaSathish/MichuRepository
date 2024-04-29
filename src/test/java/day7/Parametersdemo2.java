package day7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametersdemo2 {
	WebDriver driver;
	@Test
	@Parameters({"browser"})
	public void launchbrowser(String browser) {
		System.out.println("Browser is opened" + browser);
		if(browser.equalsIgnoreCase("Chrome")) {
			driver= new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Edge")){
			driver= new EdgeDriver();
			
		}
		else if(browser.equalsIgnoreCase("Firefox")) {
			driver= new FirefoxDriver();
		}
	}
	

}
