package runnerfile;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/featurefiles"}, glue = {"Stepdefinition"},tags ="@Drag", 
                             plugin= {"pretty", "html:target/test-output/report.html", 
                            		 "json:target/test-output/report.json",
                            		  "junit:target/test-output/report.xml"} )

public class Amazonrunnerfile {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

























