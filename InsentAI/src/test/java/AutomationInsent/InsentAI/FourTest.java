package AutomationInsent.InsentAI;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
 
public class FourTest {
	
	  @Test
	public void Test4()
	
	
	{
		  
		//Capture user data with Email validation for domain disabled.
        // and add user response with new tag value

		
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
		
        
     // click on add step
        driver.findElement(By.xpath("//*[@id=\"AddNewStepButton\"]/span")).click();
        //driver.findElement(By.xpath("//div[text()='Data Capture']")).click();
        
	    Actions a = new Actions(driver);
	    a.moveToElement(driver.findElement(By.xpath("//div[text()='Data Capture']"))).build().perform();
	    driver.findElement(By.xpath("//div[text()='User data capture']")).click(); 
	    
	    
        
	   //adding name
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[3]/div/form/div/div[2]/div/div[2]/div[2]/div[2]/div/div[1]/div/div[2]/div[2]/div[1]/div[1]/div/div[1]/div/div/div[1]/div[1]")).click();
	    
	    Actions b = new Actions(driver);
	    b.moveToElement(driver.findElement(By.xpath("//div[text()='First Name']"))).build().perform();
	    driver.findElement(By.xpath("//div[text()='First Name']")).click(); 
	    
	    //"add" click
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[3]/div/form/div/div[2]/div/div[2]/div[2]/div[2]/div/div[1]/div/div[2]/div[2]/div[2]/div")).click();
	    // adding last mame
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[3]/div/form/div/div[2]/div/div[2]/div[2]/div[2]/div/div[1]/div/div[2]/div[2]/div[2]/div[1]/div/div/div/div/div[1]")).click();
	    
	    Actions c = new Actions(driver);
	    c.moveToElement(driver.findElement(By.xpath("//div[text()='Last Name']"))).build().perform();
	    driver.findElement(By.xpath("//div[text()='Last Name']")).click(); 
	    
	
	    //add click
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[3]/div/form/div/div[2]/div/div[2]/div[2]/div[2]/div/div[1]/div/div[2]/div[2]/div[3]/div")).click();
	    //add email
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[3]/div/form/div/div[2]/div/div[2]/div[2]/div[2]/div/div[1]/div/div[2]/div[2]/div[3]/div[1]/div/div/div/div/div[1]")).click();
	    
	    Actions d = new Actions(driver);
	    d.moveToElement(driver.findElement(By.xpath("//div[text()='Email']"))).build().perform();
	    driver.findElement(By.xpath("//div[text()='Email']")).click(); 
	    
	    
	  //click advanced
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[3]/div/form/div/div[2]/div/div[2]/div[2]/div[2]/div/div[1]/div/div[2]/div[3]/div/button/span/span[1]")).click();
	    
	    
	    //click radio button(block free email providers)
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[3]/div/form/div/div[2]/div/div[2]/div[2]/div[2]/div/div[1]/div/div[2]/div[3]/div/div/div/div/div/div[1]/div/div/div[1]/div/div[1]/button/div/div")).click();
	    
	    
	    
	    
	    
	    
	    
	    //click radio button(insert values to insent fields)
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[3]/div/form/div/div[2]/div/div[2]/div[2]/div[2]/div/div[1]/div/div[2]/div[3]/div/div/div/div/div/div[4]/div/div/div[1]/div[1]/div[1]/button/div")).click();
	    
	    
	    //click on field
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[3]/div/form/div/div[2]/div/div[2]/div[2]/div[2]/div/div[1]/div/div[2]/div[3]/div/div/div/div/div/div[4]/div/div/div[2]/div/div/div/div[1]/div[1]/div[1]/div/div/div[1]/div[1]")).click();
	    
	    //click on visitor tag
	    Actions i = new Actions(driver);
	    i.moveToElement(driver.findElement(By.xpath("//div[text()='Visitor Tag']"))).build().perform();
	    driver.findElement(By.xpath("//div[text()='Visitor Tag']")).click();
	    
	    //click on(create or choose)
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[3]/div/form/div/div[2]/div/div[2]/div[2]/div[2]/div/div[1]/div/div[2]/div[3]/div/div/div/div/div/div[4]/div/div/div[2]/div/div/div/div[1]/div[2]/div[1]/div/div/div[1]/div[1]")).click();
	    
	    Actions j = new Actions(driver);
	    j.moveToElement(driver.findElement(By.xpath("//div[text()='Dummy1']"))).build().perform();
	    driver.findElement(By.xpath("//div[text()='Dummy1']")).click();
	    
		
		
		
		
	}

}
