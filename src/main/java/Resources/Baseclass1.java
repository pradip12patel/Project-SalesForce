package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Baseclass1 {
	
	public WebDriver driver;
	public Properties p;
	
	public void DriverInitilize() throws IOException  {
		
		FileInputStream file=new FileInputStream("C:\\Users\\LENOVO\\eclipse-workspace\\SeleniumTestNG\\src\\main\\java\\Resources\\data1.properties");
		
	    p=new Properties();
		p.load(file);
		
		String key=p.getProperty("browser");
		
		if(key.equalsIgnoreCase("firefox"))   {
			
			 driver=new FirefoxDriver();
		}	
			else if(key.equalsIgnoreCase("chrome"))   {
				
				driver=new ChromeDriver();
			}
			else  {
				
				System.out.println("please enter valid input");
			}	
		}
		
		@BeforeMethod
		public void open() throws IOException  {
			
			DriverInitilize();
			
			String key1=p.getProperty("url");
			
			driver.get(key1);
		}
		
		@AfterMethod
		public void close()   {
			
			driver.quit();
		}
		
		
		
		
		
		
		
		
		
		
	}

	
