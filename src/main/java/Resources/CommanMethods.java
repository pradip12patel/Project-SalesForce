package Resources;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class CommanMethods {
	
	public static void selectdropdown(WebElement element,int index)   {
		
		Select s=new Select(element);
		s.selectByIndex(index);
		
	}

	public static void handleassertion(String actual,String expected,String message)    {
		
		SoftAssert s=new SoftAssert();
		
		String ac=actual;
		String ep=expected;
		
		s.assertEquals(ac, ep, message);
		
		s.assertAll();
	}
	
	
}
