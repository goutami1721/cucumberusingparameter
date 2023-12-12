package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class testpagestep {
	WebDriver driver;
	@Given("user is on expandtesting page")
	public void user_is_on_expandtesting_page() {
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://practice.expandtesting.com/login");
	}
	@When("^user enters (.+) and (.+)$")
	public void user_enters_username_and_password(String username,String password) throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
	   
	}
	@Then("user clicks on login button")
	public void user_clicks_on_login_button() {
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	}


}
