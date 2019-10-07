package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginDefinition {
	WebDriver driver;
	@Given("^User is on Login page$")
	public void user_is_on_Login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	}

	@When("^User enter the \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_the_and(String uname, String pass) throws Throwable {
	    driver.findElement(By.name("userName")).sendKeys(uname);
	    driver.findElement(By.name("password")).sendKeys(pass);
	}

	@Then("^User clicks on Login button$")
	public void user_clicks_on_Login_button() throws Throwable {
		driver.findElement(By.name("Login")).click();
	    driver.close();
	}
}
