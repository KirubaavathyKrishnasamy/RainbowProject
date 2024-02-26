package Stepdefinition;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import reusuablefiles.Basecode;

public class AmazonActionclass extends Basecode {
	
	
	@And ("user clicks signin button again")
	public void Signinagain() throws InterruptedException
	{
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='nav-line-1-container']/child::span")).click();
	}
	
	@When ("user enters  Amazon username{string} and password{string} again")
		public void validcredAmazonagain(String username, String password)
	{
		
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.name("password")).sendKeys(password); 
	}
		
	@And ("user clicks Amazon login buttonagain")
	public void UserloginAmazonagain() 
	{
		driver.findElement(By.id("signInSubmit")).click();
		
	
	  }
	
	
	//@Given user navigates to amazon site
	@When ("user mouse hower to particular option")
	public void Mousehower()
	
	{
		
		WebElement accountlistelement = driver.findElement(By.id("nav-link-accountList"));
		Actions action = new Actions(driver);
		action.clickAndHold(accountlistelement).build().perform();
		//driver.findElement(By.xpath("//span[text()='Baby Wishlist']")).click();
		
		// (OR)- either we can do it in 2 ways. ( if any <a> tag or any webelement present as link you can use linktext or partialtext also
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.pollingEvery(Duration.ofSeconds(2));
		wait.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.linkText("Baby Wishlist")));
		driver.findElement(By.linkText("Baby Wishlist")).click();
		
		
		
		
	}
	@And ("user clicks the option")
	public void Click()
	{
		
		
	}
	
	
	@Given ("User handles the drag and drop")
	public void draganddrop()
	{
	    // 
		WebElement frameelement = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frameelement);
		WebElement dragelement = driver.findElement(By.id("draggable"));
		WebElement dropelement = driver.findElement(By.id("droppable"));
		Actions action = new Actions(driver);
		action.dragAndDrop(dragelement, dropelement).build().perform();
		
		driver.switchTo().defaultContent();
		
	}
	
	}
			


