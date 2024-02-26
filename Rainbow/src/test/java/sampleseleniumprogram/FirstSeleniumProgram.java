package sampleseleniumprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumProgram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//WebDriver driver;
        //TC1 & 2:
        WebDriver driver1 = new ChromeDriver(); //-> OPEN BROWSER - since we are using chrome we are using chromedriver.
        // this above also same as creating object, but we are using chrome, so we are using Chrome driver to launch the browser.
        driver1.get("https://login.salesforce.com");

        //TC2:
        Thread.sleep(5000);

        //TC3:
        driver1.findElement(By.id("username")).sendKeys("abc");
        driver1.findElement(By.id("password")).sendKeys("123");

        //TC4:
        driver1.findElement(By.id("Login")).click();
        String actualError =driver1.findElement(By.id("error")).getText();

        System.out.println(actualError);
        String ExpectedError ="Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
        if(actualError.equals(ExpectedError)) // This function is used to compare 2 String
        {
            System.out.println("Its equal");

        }
        else
            System.out.println("Not Equal");
            }


	}


