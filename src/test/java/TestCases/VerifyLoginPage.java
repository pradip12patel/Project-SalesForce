package TestCases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.LoginPageObject;
import Resources.BaseClass;
import Resources.CommanMethods;
import Resources.ConstantsLogin;

                                   //if class is another package then ask for import
public class VerifyLoginPage extends BaseClass {
	
	@Test(dataProvider = "Testdata")
	public void login(String username,String password) throws IOException   {
		
		LoginPageObject obj=new LoginPageObject(driver);
		
		//CommanMethods.handleassertion(driver.getCurrentUrl(),"https://login.salesforce.com/", "url is not matching");
		
		obj.enterusername().sendKeys(username);
		obj.enterpassword().sendKeys(password);
		obj.clickonlogin().click();
	
		//SoftAssert assert1=new SoftAssert();
	
	  CommanMethods.handleassertion(obj.showerrortext().getText(), ConstantsLogin.experrormsg, "error message not matching");
	
	//String actual=obj.showerrortext().getText();
	//String expected="Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
	
	//assert1.assertEquals(actual, expected,  "error message didn't match");
	
	//assert1.assertAll();      
	
	
	
	
	
	
	
	}
	
	@DataProvider
	public Object[][]  Testdata()   {
		
		Object[][] obj=new Object[3][2];
		
		obj[0][0]=ConstantsLogin.username1;
		obj[0][1]=ConstantsLogin.password1;
		obj[1][0]=ConstantsLogin.username2;
		obj[1][1]=ConstantsLogin.password2;
		obj[2][0]=ConstantsLogin.username3;
		obj[2][1]=ConstantsLogin.password3;
		
		return obj;
		
		
		
		
	}

}
