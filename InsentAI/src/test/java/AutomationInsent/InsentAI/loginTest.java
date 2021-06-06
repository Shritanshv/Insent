package AutomationInsent.InsentAI;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class loginTest {

	
	 @Test
	public void Login1()
	{
		//when ID and password are correct
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Govt ITI 4\\\\Desktop\\\\shritansh\\\\selenium\\\\chromedriver_win32\\\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.get("https://insentrecruitment2.insent.ai/login?redirectUrl=%2F");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[2]/form/div[2]/div[1]/input")).sendKeys("verma.shritansh@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[2]/form/div[3]/div[1]/input")).sendKeys("shritansh789");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[2]/form/button[1]")).click();
		
	
	}
	@Test	
	public void Login2()
	
	{
		//when ID is wrong
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Govt ITI 4\\\\Desktop\\\\shritansh\\\\selenium\\\\chromedriver_win32\\\\chromedriver.exe" );
		WebDriver driver1 = new ChromeDriver();
		driver1.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver1.get("https://insentrecruitment2.insent.ai/login?redirectUrl=%2F");
		driver1.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[2]/form/div[2]/div[1]/input")).sendKeys("verma.shritansh");
		driver1.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[2]/form/div[3]/div[1]/input")).sendKeys("shritansh789");
		driver1.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[2]/form/button[1]")).click();
		
	}  
	
	@Test
	public void Login3()
	
	{
		//when password is wrong
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Govt ITI 4\\\\Desktop\\\\shritansh\\\\selenium\\\\chromedriver_win32\\\\chromedriver.exe" );
		WebDriver driver2 = new ChromeDriver();
		driver2.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver2.get("https://insentrecruitment2.insent.ai/login?redirectUrl=%2F");
		driver2.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[2]/form/div[2]/div[1]/input")).sendKeys("verma.shritansh@gmail.com");
		driver2.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[2]/form/div[3]/div[1]/input")).sendKeys("shritansh123");
		driver2.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[2]/form/button[1]")).click();
	}   ;
	
	
	
}
