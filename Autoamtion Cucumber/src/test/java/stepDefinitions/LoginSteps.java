package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pageObjects.LoginPage;

public class LoginSteps extends BaseClass {
	
	@Then("User opens the URL {string}")
	public void user_opens_the_url(String url) {
		driver.get(url);
	}
	
	@When("User Enter username {string} and Password as {string}")
	public void user_enter_username_and_password(String username, String password) {
		lp.setUsername(username);
		lp.setPassword(password);
	}
	
	@Then("User clicks on Login button")
	public void user_clicks_on_login_button() {
		lp.clickLogin();
	}
	
	@Then("User Closes the Browser")
	public void user_closes_the_browser() {
		if (driver != null) {
			driver.quit(); // Use quit() instead of close() for clean teardown
		}
	}
	
}
