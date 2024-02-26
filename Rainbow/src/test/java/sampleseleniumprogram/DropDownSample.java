package sampleseleniumprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownSample {
	public static void main (String[] args) {
		
	
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.findElement(By.xpath("//div[@class='nav-line-1-container']/child::span")).click();
	driver.findElement(By.name("email")).sendKeys("9500879414");
	driver.findElement(By.id("continue")).click();
	driver.findElement(By.name("password")).sendKeys("Haki@2409");
	driver.findElement(By.id("signInSubmit")).click();
	String tit= driver.getTitle();
	System.out.println(tit);
	driver.close();
	
	}
	

}
