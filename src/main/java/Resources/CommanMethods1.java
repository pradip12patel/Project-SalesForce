package Resources;

import org.testng.asserts.SoftAssert;

public class CommanMethods1 {
	
	public static void handlelogin(String actual,String expected,String message)   {
		
		SoftAssert as=new SoftAssert();
		
		String act=actual;
		String exp=expected;
		
		as.assertEquals(act, exp, message);
		
		as.assertAll();
	}

}
