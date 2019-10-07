package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class CartDefinition {
	WebDriver driver;
	@Given("^Alex has registered into TestMeApp$")
	public void alex_has_registered_into_TestMeApp() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	    driver.findElement(By.name("userName")).sendKeys("jesse");
	    driver.findElement(By.name("password")).sendKeys("jesse");
	    driver.findElement(By.name("Login")).click();
	}

	@When("^Alex search a particular product like headphones$")
	public void alex_search_a_particular_product_like_headphones() throws Throwable {
		driver.findElement(By.name("products")).click();
	    
	    Actions ac = new Actions(driver);
	    ac.sendKeys("h").pause(2000).sendKeys("e").pause(3000).sendKeys("a").pause(3000).sendKeys("d").build().perform();
	    
	    driver.findElement(By.xpath("(//div[contains(.,'Headphone')])[4]")).click();
	    
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@When("^try to proceed to payment without adding any item in the cart$")
	public void try_to_proceed_to_payment_without_adding_any_item_in_the_cart() throws Throwable {
	    String nav = driver.findElement(By.className("shop-menu")).getText();
	    Assert.assertFalse(nav.contains("Cart"));
	}

	@Then("^TestMe doesn't display the cart icon$")
	public void testme_doesn_t_display_the_cart_icon() throws Throwable {
		driver.findElement(By.xpath("//a[contains(.,'Add to cart')]")).click();
		String nav = driver.findElement(By.className("shop-menu")).getText();
	    Assert.assertTrue(nav.contains("Cart"));
	    
	    driver.close();
	}
}
