package PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignupPageObject {
	
	public WebDriver driver;
	 
	public By firstname=By.xpath("//input[@name='UserFirstName']");
	public By lastname=By.xpath("//input[@name='UserLastName']");
	public By email=By.xpath("//input[@name='UserEmail']");
	public By title=By.xpath("//select[@name='UserTitle']");
	public By company=By.xpath("//input[@name='CompanyName']");
	public By employ=By.xpath("//select[@name='CompanyEmployees']");
	public By phone=By.xpath("//input[@name='UserPhone']");
	public By country=By.xpath("//select[@name='CompanyCountry']");
	public By checkbox=By.xpath("//div[@class='checkbox-ui']");
	public By button=By.xpath("//button[@type='submit']");
	
	public SignupPageObject(WebDriver driver2) {
		this.driver=driver2;
	}
	
    public WebElement enterfirstname()  {
		
		return driver.findElement(firstname);
	}
    
   public WebElement enterlastname()  {
		
		return driver.findElement(lastname);
	}
   
   public WebElement entermail()  {
		
		return driver.findElement(email);
	}
   
   public WebElement entertitle()  {
		
		return driver.findElement(title);
}
   
   public WebElement entercompany()  {
		
		return driver.findElement(company);
}
   
   public WebElement enteremploy()  {
		
		return driver.findElement(employ);
}
  

   public WebElement enterphone()  {
		
		return driver.findElement(phone);
}
  

   public WebElement entercountry()  {
		
		return driver.findElement(country);
}
  
   public WebElement clickcheckbox()  {
		
		return driver.findElement(checkbox);
}
   
   public WebElement clickbutton()  {
		
		return driver.findElement(button);
}
}