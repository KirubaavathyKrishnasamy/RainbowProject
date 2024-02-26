package Stepdefinition;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import reusuablefiles.Basecode;

public class AmazonWebpage  extends Basecode {
	
	
	
	
	//@Given ("user navigates to Amazon webpage")
	//public void navigatetourlAmazon()
	//{
		//driver.get("https://www.amazon.in/");
		//
			
	//}
	
	
	@And ("user clicks signin button")
	public void Signin() throws InterruptedException
	{
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='nav-line-1-container']/child::span")).click();
	}
	
	@When ("user enters  Amazon username{string} and password{string}")
		public void validcredAmazon(String username, String password)
	{
		
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.name("password")).sendKeys(password); 
	}
		
	@And ("user clicks Amazon login button")
	public void UserloginAmazon() 
	{
		driver.findElement(By.id("signInSubmit")).click();
		
	
	  }
	
	@Then ("User Verifies the Amazon homepage")
	public void UserverfiytheloginAmazon() 
	{
		String tit= driver.getTitle();
		System.out.println(tit);
		
		// select class will acept only the webelement
		WebElement selectelement = driver.findElement(By.id("searchDropdownBox")); //// Use Select class for dropdown either select by value, index, or visible test
		Select Category = new Select(selectelement ); // create class and object of select class.
		Category.selectByVisibleText("Amazon Devices");
		
		int dropdowncount = selectelement.findElements(By.tagName("option")).size();
		for(int i=0; i< dropdowncount ; i++)
		{
			
			String val = selectelement.findElements(By.tagName("option")).get(i).getText();
			System.out.println(val);
		}
		
		
	}
		
       
		//driver.close();
		 
	

	
	
	@Given ("user moves to Amazon webpage")
	public void UsernavigatetourlagainAmazon()
	{
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//div[@class='nav-line-1-container']/child::span")).click();
			
	}
	
	@When ("user enters the Amazon username {string} and password {string} again")
		public void enterinvalidcredAmazon(String username, String password) 
	{
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.name("password")).sendKeys(password); 
	}
		
	@And ("user clicks Amazon signin button")
	public void UsersiginAmazon() 
	{
		driver.findElement(By.id("signInSubmit")).click();
		String tit= driver.getTitle();
		System.out.println(tit);
	  }
	
	///@Then ("User Verifies the Amazon errormessage")
	//public void UserverfiytheerrormessageAmazon() 
	//{
		
		//driver.close();
		 
	//}
	
}
