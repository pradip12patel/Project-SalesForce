package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {

	public WebDriver driver;
	public Properties prop;
	             //this code for launch browser not a URL
	public void DriverInitilize() throws IOException   {
		
		//this will read the properties file                          C:\\Users\\LENOVO\\eclipse-workspace\\SeleniumTestNG
		FileInputStream fs=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties");
		
		//access the properties file
	    prop=new Properties();
		prop.load(fs);
		                                                                 //browser=key
		String key=prop.getProperty("browser");                          //chrome=value
		
		if(key.equalsIgnoreCase("chrome"))  {
			
			 ChromeOptions op=new ChromeOptions();
		      op.addArguments("--remote-allow-origins=*"); 
	    	  
	    	 driver=new ChromeDriver(op); 
			
		}
		else if(key.equalsIgnoreCase("firefox"))  {
			
		  driver=new FirefoxDriver();
		}
		else if(key.equalsIgnoreCase("edge"))  {
			
		  driver=new EdgeDriver();
		}
		else {
			System.out.println("please enter cottect browser name");
		}
		
	}
	     @BeforeMethod
		public void openurl() throws IOException   {
			
	    	 DriverInitilize();
	 		
	    	 String key1=prop.getProperty("url"); 
		     driver.get(key1);
		}
	     
	     @AfterMethod
			public void closebrowser() throws IOException   {
				
		    	 driver.quit();
			
			}  
	
	}
	

