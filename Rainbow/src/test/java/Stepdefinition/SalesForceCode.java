package Stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SalesForceCode {

	WebDriver driver = new ChromeDriver();
			// TODO Auto-generated method stub
	
////@Given("user navigates to webpage")
//public void navigatetourl() throws InterruptedException
//{
	
	//driver.get("https://login.salesforce.com/?locale=in");
	//Thread.sleep(5000);

	//}

@When ("user enters the username {string} and password {string}")
public void enterlogincred(String username, String password)
{
	driver.findElement(By.className("username")).sendKeys(username);  // We are passing the value from feature file so give variable name same as feature file and in method
	driver.findElement(By.id("password")).sendKeys(password);
}
@And("user clicks login button")
public void login() {
	driver.findElement(By.name("Login")).click();
	
}

@Then ("User Verifies the error message")
public void verifylogin()
{
	String title= driver.getTitle();
	System.out.println(title);
	
}


@Given("user moves to webpage")
public void navigatetourl2()
{
	
	
	driver.get("https://login.salesforce.com/?locale=in");

	}

@When ("user gives the username {string} and password {string}")
public void enterlogincred2(String username, String password)/// Parametrization
{
	driver.findElement(By.className("username")).sendKeys(username);
	driver.findElement(By.id("password")).sendKeys(password);
}
@And("user clicks login button again")
public void login2() {
	driver.findElement(By.name("Login")).click();
	
}

@Then ("User Verifies the homepage")
public void verifylogin2()
{
	driver.getTitle();
}


}
