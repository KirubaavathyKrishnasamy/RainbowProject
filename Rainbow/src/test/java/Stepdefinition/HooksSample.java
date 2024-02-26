package Stepdefinition;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import reusuablefiles.Basecode;

public class HooksSample extends Basecode {
	
	
	
	@Before
	public void setup() throws IOException {
	
	Basecode.launchBrowser();
	
	}
	
	{
		
	}
	@After
	public void teardown()
	
	{
	 
		driver.quit();
		
	}
	
	@BeforeStep
	public void takescreenshotbefore()
	
	{
		
	}
	
	@AfterStep
	public  void takeSnapShot(Scenario sc){
	
		
		byte[] byteimage = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		sc.attach(byteimage, "image/png", sc.getName());
	{
		
	}
	}


}
