package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions (
		features = "features\\Search.feature",
		glue = {"stepDefinition"},
		plugin = {
				"json:target/cucumber-report/Search.json"
		}
		)

public class SearchRunner {

}
