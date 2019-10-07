package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchDefinition {
	WebDriver driver;
	@Given("^User is on login page of TestMeApp$")
	public void user_is_on_login_page_of_TestMeApp() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	}

	@When("^User logs into the TestMeApp$")
	public void user_logs_into_the_TestMeApp() throws Throwable {
		driver.findElement(By.name("userName")).sendKeys("jesse");
	    driver.findElement(By.name("password")).sendKeys("jesse");
	    driver.findElement(By.name("Login")).click();
	}

	@Then("^Searches for headphone$")
	public void clicks_on_the_product() throws Throwable {
	    driver.findElement(By.name("products")).click();
	    
	    Actions ac = new Actions(driver);
	    ac.sendKeys("h").pause(2000).sendKeys("e").pause(3000).sendKeys("a").pause(3000).sendKeys("d").build().perform();
	    
	    String text = driver.findElement(By.xpath("(//div[contains(.,'Headphone')])[4]")).getText();
	    
	    if(text.equals("Headphone")) {
	    	System.out.println("Product is available");
	    }
	    else {
	    	System.out.println("Product is not available");
	    }
	    
	    driver.close();
	}
}
