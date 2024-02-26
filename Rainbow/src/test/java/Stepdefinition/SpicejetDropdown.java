package Stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import reusuablefiles.Basecode;

public class SpicejetDropdown extends Basecode{
	
	
	// We can get via xpath  or find elements By, ID, xpath etc else we can set webelemt for the parent node (arrival city) and then we can select the city from that
	// we can do it in 2 ways.
	
	
	@When ("user Clicks on Departure City")
	public void from() {
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='AGR']")).click();
		
    }

	
	@And ("user clicks Arrival City")
	public void to()
	{
		WebElement toelement = driver.findElement(By.xpath("//input[@name='ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTXT']"));
		
		toelement.findElement(By.xpath("//a[@value='LKO']")).click();
	}
	
	@Given ("User Extracts the column value") //// th is used to get first column value
	public void tablecolumncount()
	{
		
		WebElement  wikitable = driver.findElement(By.xpath("//table[@class='infobox vcard']")); 
		int firstcolumncount =wikitable.findElements(By.tagName("th")).size();
		
		for(int j=0; j<firstcolumncount; j++)
		{
			
			String valu = wikitable.findElements(By.tagName("th")).get(j).getText();
			System.out.println(valu);
		}
		
     int secondcolumncount =wikitable.findElements(By.tagName("td")).size(); // td is used to get second column value and make sure loop starts from 2 as its indicates second column
		
		for(int k=2; k<secondcolumncount; k++)
		{
			
			String valu2 = wikitable.findElements(By.tagName("td")).get(k).getText();
			System.out.println(valu2);
	}
	
	}
	
	// How to get particular column value from multiple column table value
	
	@And ("User get multiple column value")
	public void multiplecolumnvalue()
	{
	
	WebElement  multicolumn = driver.findElement(By.xpath("//table[@class='wikitable']")); 
	int multicolumval =multicolumn.findElements(By.xpath("//table[@class='wikitable']//td[2]")).size(); // use indexvalue of td/th to get the particular column value
	for(int s=0; s<multicolumval; s++)
	{
		
		String valu3 = multicolumn.findElements(By.xpath("//table[@class='wikitable']//td[2]")).get(s).getText();
		System.out.println(valu3);
		
		
	}
	
	WebElement  getrow = driver.findElement(By.xpath("//table[@class='wikitable']")); 
	int rowval =getrow.findElements(By.xpath("//table[@class='wikitable']//tr[3]")).size(); // use indexvalue of tr to get the particular row value
	for(int s=0; s<rowval; s++)
	{
		
		String valu4 = multicolumn.findElements(By.xpath("//table[@class='wikitable']//tr[3]")).get(s).getText();
		System.out.println(valu4);
	}
	// For row use tr
	
	
	
	
	
	 
	}
	
	
}


