package sampleseleniumprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProgramXpathSample {

	public static void main(String[] args) {
		WebDriver driver1 = new ChromeDriver(); //-> OPEN BROWSER - since we are using chrome we are using chromedriver.
        // this above also same as creating object, but we are using chrome, so we are using Chrome driver to launch the browser.
        driver1.get("https://login.salesforce.com");



        //TC3:
        driver1.findElement(By.xpath("//div[@id='username_container']/descendant::input[@id='username']")).sendKeys("abc");
        driver1.findElement(By.id("password")).sendKeys("123");
	}

}
