package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject1 {
	
	public WebDriver driver;
	
	public By username=By.xpath("//input[@placeholder='Username']");
	public By password=By.xpath("//input[@name='password']");
	public By login=By.xpath("//button[@type='submit']");
	public By erroetext=By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']");

	public LoginPageObject1(WebDriver driver2) {
		
		this.driver=driver2;
	}

	public WebElement fillusername()   {
    	
    	 return driver.findElement(username);
    }
	
    public WebElement enterpassword()  {
    	
    	return driver.findElement(password);
    }
    
    public WebElement clicklogin()  {
    	
    	return driver.findElement(login);
    }
    
    public WebElement errormessage()  {
    	
    	return driver.findElement(erroetext);
    }
    
}
