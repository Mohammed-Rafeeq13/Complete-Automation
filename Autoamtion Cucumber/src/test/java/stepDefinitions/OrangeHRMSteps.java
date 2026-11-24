package stepDefinitions;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pageObjects.OrangeHRMPage;

public class OrangeHRMSteps extends BaseClass {
	
	@Given("User Opens the Chrome Browser")
	public void user_opens_the_chrome_browser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// INITIALIZE PAGE OBJECT HERE
		ohrm = new OrangeHRMPage(driver);
	}
	
	@When("User Opens the URL {string}")
	public void user_opens_the_url(String url) {
		driver.get(url);
	}
	
	@Then("User Enter Username {string} and Password as {string}")
	public void user_enter_username_and_password_as(String username, String password) {
		ohrm.setUsername(username);
		ohrm.setPassword(password);
	}
	
	@Then("Click on Login button")
	public void click_on_login_button() {
		ohrm.clickLogin();
	}
	
	@Then("User Redirect to the Home Page")
	public void user_redirect_to_the_home_page() {
		String pageTitle = driver.getTitle();
		Assert.assertEquals("OrangeHRM", pageTitle); // Corrected assertion
		
		if (driver != null) {
			driver.quit(); // Clean teardown
		}
	}
}