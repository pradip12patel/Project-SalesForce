package TestCases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.LoginPageObject;
import PageObjectModel.SignupPageObject;
import Resources.BaseClass;
import Resources.CommanMethods;
import Resources.ConstantsSignup;

public class VerifySignupPage extends BaseClass {
	
	private WebElement c,d;
	
	@Test
	public void signup() throws IOException  {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		LoginPageObject take=new LoginPageObject(driver);
		
		take.clickonfree().click();
		
		SignupPageObject obj=new SignupPageObject(driver);
		
		obj.enterfirstname().sendKeys(ConstantsSignup.firstname);
		obj.enterlastname().sendKeys(ConstantsSignup.lastname);
		obj.entermail().sendKeys(ConstantsSignup.email);
		
		//a=obj.entertitle();
		//a.click();
		//Select s=new Select(obj.entertitle());                                 //first way for select tagname
		//s.selectByVisibleText("IT Manager");
		//System.out.println(s.getFirstSelectedOption().getText());
		
		CommanMethods.selectdropdown(obj.entertitle(), 4);
		
		
		obj.entercompany().sendKeys(ConstantsSignup.company);
		
		//c=obj.enteremploy();                                                   //second way for select tagname
		//c.click();
		//Select sa=new Select(c);
		//sa.selectByIndex(2);
		//System.out.println(sa.getFirstSelectedOption().getText());
		
		CommanMethods.selectdropdown(obj.enteremploy(), 3);
		
		obj.enterphone().sendKeys(ConstantsSignup.phone);
		
		//d=obj.entercountry();
		//d.click();
		//Select sd=new Select(d);
		//sd.selectByVisibleText("India");
		//System.out.println(sd.getFirstSelectedOption().getText());
		
		CommanMethods.selectdropdown(obj.entercountry(), 9);
		
		obj.clickcheckbox().click();
		obj.clickbutton().click();     
		
		
		
		
		
	}
	
	
	
	
	
	

}
