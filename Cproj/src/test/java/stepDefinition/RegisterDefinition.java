package stepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterDefinition {
	WebDriver driver;
	@Given("^User is on home page$")
	public void user_is_on_home_page() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	}

	@When("^User clicks on Signup$")
	public void user_clicks_on_Signup() throws Throwable {
	    driver.findElement(By.xpath("//a[contains(.,'SignUp')]")).click();
	}

	@When("^Enters the \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enters_the_and_and_and_and_and_and_and_and_and_and_and_and_and(String uname, String fname, String lname, String pass, String cpass, String gender, String email, String mobno, String month, String year, String date, String address, String ques, String ans, DataTable data) throws Throwable {
	    List<List<String>> cred = data.raw();
		driver.findElement(By.name("userName")).sendKeys(cred.get(0).get(0));
		driver.findElement(By.name("firstName")).sendKeys(cred.get(0).get(1));
		driver.findElement(By.name("lastName")).sendKeys(cred.get(0).get(2));
		driver.findElement(By.name("password")).sendKeys(cred.get(0).get(3));
		driver.findElement(By.name("confirmPassword")).sendKeys(cred.get(0).get(4));
		driver.findElement(By.xpath("//input[@value='"+cred.get(0).get(5)+"']")).click();
		
		driver.findElement(By.name("emailAddress")).sendKeys(cred.get(0).get(6));
		driver.findElement(By.name("mobileNumber")).sendKeys(cred.get(0).get(7));
		
		driver.findElement(By.xpath("//img[@class='ui-datepicker-trigger']")).click();
		Select m = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
		m.selectByVisibleText(cred.get(0).get(8));
		Select y = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
		y.selectByVisibleText(cred.get(0).get(9));
		driver.findElement(By.xpath("//a[contains(.,'"+cred.get(0).get(10)+"')]")).click();
		
		driver.findElement(By.name("address")).sendKeys(cred.get(0).get(11));
		
		Select sec = new Select(driver.findElement(By.name("securityQuestion")));
		sec.selectByVisibleText(cred.get(0).get(12));
		
		driver.findElement(By.name("answer")).sendKeys(cred.get(0).get(13));
	}

	@Then("^User clicks on Register$")
	public void user_clicks_on_Register() throws Throwable {
	    driver.findElement(By.name("Submit")).click();
	    driver.close();
	}
}
