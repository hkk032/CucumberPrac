package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions (
		features = "features\\Cart.feature",
		glue = {"stepDefinition"},
		plugin = {
				"json:target/cucumber-report/Cart.json"
		}
		)

public class CartRunner {

}
