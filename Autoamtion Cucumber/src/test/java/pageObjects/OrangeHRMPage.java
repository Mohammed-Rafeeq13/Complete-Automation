package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMPage {
public WebDriver ldriver;
	
	public OrangeHRMPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	// Locators
	@FindBy(how = How.XPATH, using="//input[@name='username']") @CacheLookup WebElement txtUsername;
	@FindBy(how = How.XPATH, using="//input[@name='password']") @CacheLookup WebElement txtPassword;
	@FindBy(how = How.XPATH, using="//button[text()=' Login ']") @CacheLookup WebElement btnLogin;
	
	// Actions
	public void setUsername(String email) {
		txtUsername.sendKeys(email);
	}
	
	public void setPassword(String password) {
		txtPassword.sendKeys(password);
	}
	
	public void clickLogin() {
		btnLogin.click();
	}
}
