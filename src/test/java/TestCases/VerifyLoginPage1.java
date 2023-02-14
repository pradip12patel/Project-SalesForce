package TestCases;

import java.io.IOException;
import java.time.Duration;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjectModel.LoginPageObject1;
import Resources.Baseclass1;
import Resources.CommanMethods1;
import Resources.Constants1;

public class VerifyLoginPage1 extends Baseclass1{

	
	   @Test(dataProvider = "dataenter")
	   public void login1(String username,String password) throws IOException   {
		   
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   
		   LoginPageObject1 obj1=new LoginPageObject1(driver);
		   
		   obj1.fillusername().sendKeys(username);
		   obj1.enterpassword().sendKeys(password);
		   obj1.clicklogin().click();
		   
          CommanMethods1.handlelogin(obj1.errormessage().getText(),Constants1.errorshow, "please enter valid credetials");
	   }
	      @DataProvider
        Object[][]    dataenter() {
        	
        	Object[][] data=new Object[2][2];
        	data[0][0]=Constants1.username1;
        	data[0][1]=Constants1.password1;
        	data[1][0]=Constants1.username2;
        	data[1][1]=Constants1.password2;
        
			return data;
		}
}
