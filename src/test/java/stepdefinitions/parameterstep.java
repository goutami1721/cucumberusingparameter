package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class parameterstep {
	
	WebDriver driver;
	@Given("user is on loginpage")
	public void user_is_on_loginpage() {
		 driver =new ChromeDriver();
		 driver.manage().window().maximize();
			driver.get("https://practicetestautomation.com/practice-test-login/");
	}

	@When("^User enters valid (.+) and (.+)$")
	public void user_enters_username_and_password(String username,String password) {
		driver.findElement(By.id("username")).sendKeys(username);
		 driver.findElement(By.id("password")).sendKeys(password);
	}
	@Then("login is successful using parameters")
	public void login_is_successful_using_parameters() {
		driver.findElement(By.id("submit")).click();
	}


}
