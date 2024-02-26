package reusuablefiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Basecode {
	
	 
	public static WebDriver driver; // When we declare as static we can use this driver and its methods in another package as well same for below as well
	
	public static void launchBrowser() throws IOException // Exception will be suggested automatically for properties and fileinputstream class
	{
		FileInputStream fis = new FileInputStream (new File ("src/main/resources/configuration/config.properties")); // Used to locate and read the date from config file
		Properties prob = new Properties();// Has many method so can be used like load etc
		 prob.load(fis);
		 
		 if(prob.getProperty("browser").equalsIgnoreCase("ChromeDriver"))
       {
	      driver = new ChromeDriver();
	      
	      
       }
		 else if(prob.getProperty("browser").equalsIgnoreCase("edge"))
		 {
		 driver = new EdgeDriver();
		 }
		 
		 else 
		 {
		 throw new InvalidArgumentException("Please enter valid browser name");
		 }
		 
		 
	    driver.get(prob.getProperty("environment")); // We are passing the data/key value from config file
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	}


public void CloseBrowser()
{
	driver.close();
	
}
}