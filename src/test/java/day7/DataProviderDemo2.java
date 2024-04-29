package day7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo2 {
	WebDriver driver;

	@Test(dataProvider="dataset")
	public void login(String un, String pass)
	{
		System.out.println("Username is ===>"+un+"  " +"Password is ===>"+pass);
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	@DataProvider(name="dataset")
	public Object [][] dataMethod()
	{
		Object[][] obj= new Object[3][2];
		obj[0][0]="Anu";
		obj[0][1]="Anu123";
		obj[1][0]="Michu";
		obj[1][1]="Michu123";
		obj[2][0]="Nivi";
		obj[2][1]="Nivi123";
		return obj;
				
		
				


	
	
	}	
	

}
