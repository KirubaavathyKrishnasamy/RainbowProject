package runnerfile;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) // Run with used to execute the program and cucumber.class indicate that we are execute the cucumber class)
@CucumberOptions(
		// Feature is use to mention the  root path, Glue is used to mention the step def, and tags is used to execute particular scaerio in among diff feature files.
		// we need to give correct tags as same as feature file for the particular scenario
		features = {"src/test/resources/featurefiles"}, glue = {"Stepdefinition"},tags ="@multiple"
		
		
		)
public class RunnerFile {

	public static void main (String[] args) {
		// TODO Auto-generated method stub

	}

}