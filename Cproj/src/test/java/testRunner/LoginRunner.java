package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions (
		features = "features\\Login.feature",
		glue = {"stepDefinition"},
		plugin = {
				"json:target/cucumber-report/Login.json"
		}
		)

public class LoginRunner {

}
