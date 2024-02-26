package runnerfile;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/featurefiles"}, glue = {"Stepdefinition"},tags ="@WK01")

public class SpicejetRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
