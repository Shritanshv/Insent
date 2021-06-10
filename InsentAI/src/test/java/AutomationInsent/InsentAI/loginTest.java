package AutomationInsent.InsentAI;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import resources.base;
import java.io.IOException;
import org.openqa.selenium.WebDriver;



public class loginTest extends base {
    
	
	public WebDriver driver;
	
	
	 
	@BeforeTest
	public void initialize() throws IOException
	{
	
		 driver =initializeDriver();

	}
	
	/*------------------------------------------------------------------------------------*/
	
	@Test(dataProvider="getData")
	
	public void Test1(String Username,String Password) throws IOException
	{

		

		// creating object to that class and invoke methods of it
		driver.get(prop.getProperty("url"));
		
		LoginPage lp= new LoginPage(driver);
		lp.getEmail().sendKeys(Username);
		lp.getPassword().sendKeys(Password);
		lp.getLogin().click();

	}
	 
	/*------------------------------------------------------------------------------------------------*/
	
	@DataProvider
	public Object[][] getData()
	{
		
		Object[][] data=new Object[2][2];
		//0th row
		data[0][0]="verma.shritansh@gmail.com";
		data[0][1]="shritansh789";
		
		//1st row
		data[1][0]="xyz@gmail.com";
		data[1][1]="456788";
		
		
		return data;
		
	}
	
}
	
	
	
	
	
	