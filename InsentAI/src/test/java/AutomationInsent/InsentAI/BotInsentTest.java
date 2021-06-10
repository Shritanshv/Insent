package AutomationInsent.InsentAI;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class BotInsentTest {

	 

	@Test
	public void BotTest() throws InterruptedException
	
	
	{
		
		    System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Govt ITI 4\\\\Desktop\\\\shritansh\\\\selenium\\\\chromedriver_win32\\\\chromedriver.exe" );
		    WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
			driver.get("https://insentrecruitment2.web.app/BOTTest");
			
			WebDriverWait wait = new WebDriverWait(driver , 30) ;
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@id=\"insent-iframe\"]")));
			
			
			
			
            
			// click on bot
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Hey,JonSu']")));
			
			try {
			    WebElement button = driver.findElement(By.xpath("//*[text()='Hey,JonSu']"));
			            button.click();
			}
			catch(org.openqa.selenium.StaleElementReferenceException ex)
			{
			    WebElement button = driver.findElement(By.xpath("//*[text()='Hey,JonSu']"));
			            button.click();
			}
			
			
			//enter value in name
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"insent-card-container\"]/div[3]/div[1]/div/div/div[1]/div/div[1]/div[2]/div/div/div[2]/form/input")));
			
			try {
			    WebElement button = driver.findElement(By.xpath("//*[@id=\"insent-card-container\"]/div[3]/div[1]/div/div/div[1]/div/div[1]/div[2]/div/div/div[2]/form/input"));
			            button.click();
			}
			catch(org.openqa.selenium.StaleElementReferenceException ex)
			{
			    WebElement button = driver.findElement(By.xpath("//*[@id=\"insent-card-container\"]/div[3]/div[1]/div/div/div[1]/div/div[1]/div[2]/div/div/div[2]/form/input"));
			            button.click();
			}
			
			driver.findElement(By.xpath("//*[@id=\"insent-card-container\"]/div[3]/div[1]/div/div/div[1]/div/div[1]/div[2]/div/div/div[2]/form/input")).sendKeys("shritansh");
			driver.findElement(By.xpath("//*[@id=\"insent-card-container\"]/div[3]/div[1]/div/div/div[1]/div/div[1]/div[2]/div/div/div[2]/form/button")).click();
			
			
			//enter last name 
			
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"insent-card-container\"]/div[3]/div[1]/div/div/div[2]/div/div[1]/div/div/div/div[2]/form/input")));
			
			try {
			    WebElement button = driver.findElement(By.xpath("//*[@id=\"insent-card-container\"]/div[3]/div[1]/div/div/div[2]/div/div[1]/div/div/div/div[2]/form/input"));
			            button.click();
			}
			catch(org.openqa.selenium.StaleElementReferenceException ex)
			{
			    WebElement button = driver.findElement(By.xpath("//*[@id=\"insent-card-container\"]/div[3]/div[1]/div/div/div[2]/div/div[1]/div/div/div/div[2]/form/input"));
			            button.click();
			}
			
			driver.findElement(By.xpath("//*[@id=\"insent-card-container\"]/div[3]/div[1]/div/div/div[2]/div/div[1]/div/div/div/div[2]/form/input")).sendKeys("verma");
			driver.findElement(By.xpath("//*[@id=\"insent-card-container\"]/div[3]/div[1]/div/div/div[2]/div/div[1]/div/div/div/div[2]/form/button")).click();
			
			// enter email
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"insent-card-container\"]/div[3]/div[1]/div/div/div[3]/div/div[1]/div/div/div/div[2]/form/input")));
			
			try {
			    WebElement button = driver.findElement(By.xpath("//*[@id=\"insent-card-container\"]/div[3]/div[1]/div/div/div[3]/div/div[1]/div/div/div/div[2]/form/input"));
			            button.click();
			}
			catch(org.openqa.selenium.StaleElementReferenceException ex)
			{
			    WebElement button = driver.findElement(By.xpath("//*[@id=\"insent-card-container\"]/div[3]/div[1]/div/div/div[3]/div/div[1]/div/div/div/div[2]/form/input"));
			            button.click();
			}
			
			driver.findElement(By.xpath("//*[@id=\"insent-card-container\"]/div[3]/div[1]/div/div/div[3]/div/div[1]/div/div/div/div[2]/form/input")).sendKeys("xyz@gmail.com");
			driver.findElement(By.xpath("//*[@id=\"insent-card-container\"]/div[3]/div[1]/div/div/div[3]/div/div[1]/div/div/div/div[2]/form/button")).click();
				
			
			// click on buttons
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"insent-card-container\"]/div[3]/div[1]/div/div/div[4]/div/div/div/div/div[1]")));
		
			try {
			    WebElement button = driver.findElement(By.xpath("//*[@id=\"insent-card-container\"]/div[3]/div[1]/div/div/div[3]/div/div[1]/div/div/div/div[2]/form/input"));
			            button.click();
			}
			catch(org.openqa.selenium.StaleElementReferenceException ex)
			{
			    WebElement button = driver.findElement(By.xpath("//*[@id=\"insent-card-container\"]/div[3]/div[1]/div/div/div[3]/div/div[1]/div/div/div/div[2]/form/input"));
			            button.click();
			}
			
			
			driver.findElement(By.xpath("//div[text()='Option 1']")).click();
			
			
			//click option 3
			
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"insent-card-container\"]/div[3]/div[1]/div/div/div[5]/div/div/div/div/div")));
			
			try {
			    WebElement button = driver.findElement(By.xpath("//*[@id=\"insent-card-container\"]/div[3]/div[1]/div/div/div[5]/div/div/div/div/div"));
			            button.click();
			}
			catch(org.openqa.selenium.StaleElementReferenceException ex)
			{
			    WebElement button = driver.findElement(By.xpath("//*[@id=\"insent-card-container\"]/div[3]/div[1]/div/div/div[5]/div/div/div/div/div"));
			            button.click();
			}
			
			driver.findElement(By.xpath("//div[text()='Option 3']")).click();
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
	}
	
	
}
