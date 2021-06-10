package AutomationInsent.InsentAI;
import java.util.concurrent.TimeUnit;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;




public class FirstTest {

	 @Test
	public void Test1() 
	{
		 //Add a Greeting message with Personalisation token for First Name and Last Name.

		 
		//when ID and password are correct
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Govt ITI 4\\\\Desktop\\\\shritansh\\\\selenium\\\\chromedriver_win32\\\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.get("https://insentrecruitment2.insent.ai/login?redirectUrl=%2F");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[2]/form/div[2]/div[1]/input")).sendKeys("verma.shritansh@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[2]/form/div[3]/div[1]/input")).sendKeys("shritansh789");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[2]/form/button[1]")).click();

		 
	
	    
		
		driver.findElement(By.xpath("//*[@id=\"toggle-zIndex\"]/div/div[1]/div[3]/div/div/div/div/div/a/img")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[3]/div/div[1]/div[2]/div/a/div")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[2]/div/div[2]")).click();
       
         
        
	    
	    //clicking on text edit box, clear and input
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[3]/div/form/div/div[2]/div/div[2]/div[2]/div/div/div[1]/div/div[2]/div[2]/div[1]/div")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[3]/div/form/div/div[2]/div/div[2]/div[2]/div/div/div[1]/div/div[2]/div[2]/div[1]/div/div/div/div/div[2]/div[1]/div[2]/div/div[2]")).clear();
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[3]/div/form/div/div[2]/div/div[2]/div[2]/div/div/div[1]/div/div[2]/div[2]/div[1]/div/div/div/div/div[2]/div[1]/div[2]/div/div[2]")).sendKeys("Hello");

	
	    //clicking on personalization icon
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[3]/div/form/div/div[2]/div/div[2]/div[2]/div/div/div[1]/div/div[2]/div[2]/div[1]/div/div/div/div/div[2]/div[1]/div[1]/div[2]/div/div/div/div")).click();
	    //clicking on first name
	    driver.findElement(By.xpath("//*[@id=\"formContent\"]/div[1]/div[2]/div/div/div/div[1]/div[1]")).click();
	    
	    Actions e = new Actions(driver);
	    
	    e.moveToElement(driver.findElement(By.xpath("//div[text()='First Name']"))).build().perform();
	    driver.findElement(By.xpath("//div[text()='First Name']")).click(); 
	   //clicking on default value
	    driver.findElement(By.xpath("//*[@id=\"formContent\"]/div[2]/div[2]/div/input")).sendKeys("Jon");
	    
	   //add button
	    driver.findElement(By.xpath("//*[@id=\"formContent\"]/div[3]/button[2]/span/span")).click();
	   //again click on personalization icon
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[3]/div/form/div/div[2]/div/div[2]/div[2]/div[1]/div/div[1]/div/div[2]/div[2]/div[1]/div/div/div/div/div[2]/div[1]/div[1]/div[2]/div/div/div/div")).click();
	    
	    //adding last name
	    driver.findElement(By.xpath("//*[@id=\"formContent\"]/div[1]/div[2]/div/div/div/div[1]")).click();
	      
	    Actions f = new Actions(driver);
	    f.moveToElement(driver.findElement(By.xpath("//div[text()='Last Name']"))).build().perform();
	    driver.findElement(By.xpath("//div[text()='Last Name']")).click();
	    
	    //default value
	    driver.findElement(By.xpath("//*[@id=\"formContent\"]/div[2]/div[2]/div/input")).sendKeys("xyz");
	    //add button'
	    driver.findElement(By.xpath("//*[@id=\"formContent\"]/div[3]/button[2]/span/span")).click();
	    
	   }
	 
	
	 
	 
}














