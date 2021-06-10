package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	
	public WebDriver driver;
	
	By email=By.xpath("//*[@id=\"root\"]/div[3]/div[2]/form/div[2]/div/input");
	By password=By.xpath("//*[@id=\"root\"]/div[3]/div[2]/form/div[3]/div/input");
	By login=By.xpath("//*[@id=\"root\"]/div[3]/div[2]/form/button[1]/span/span");
	
	
	//
	
	public LoginPage(WebDriver driver) {
		
		
		this.driver=driver;
		
	}




	public WebElement getEmail()
	{
		return driver.findElement(email);
	}
	

	public WebElement getPassword()
	{
		return driver.findElement(password);
	}
	
	public WebElement getLogin()
	{
		return driver.findElement(login);
	}
	
	
	
}
