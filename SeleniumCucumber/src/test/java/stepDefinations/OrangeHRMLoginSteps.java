package stepDefinations;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeHRMLoginSteps {
    WebDriver driver;
    
    @Given("I launch Chrome Browser")
    public void i_launch_chrome_browser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    
    @When("I open OrangeHRM homepage")
    public void i_open_orangehrm_homepage() {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
    
    @Then("I verify the presence of Logo")
    public void i_verify_the_presence_of_logo() {
        boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
        Assert.assertTrue("Logo is not displayed on OrangeHRM login page", status);
    }
    
    @Given("User Enter Email")
    public void user_enter_email() {
    	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
    }
    
    @Given("User Enter Password")
    public void user_enter_password() {
    	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
    }

    @When("User Clicks Login Btn")
    public void user_clicks_login_btn() {
    	driver.findElement(By.xpath("//button[text()=' Login ']")).click();
    }

    @Then("User Redirect Home Page")
    public void user_redirect_home_page() {
    	String title = driver.getTitle();
    	Assert.assertEquals("OrangeHRM", title);
    }
    
    @Then("Close Browser")
    public void close_browser() {
        if (driver != null) {
            driver.close();
        }
    }
    
}