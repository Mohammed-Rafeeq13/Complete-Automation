package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
public WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath="//input[@name='username']") WebElement username;
	@FindBy(xpath="//input[@name='password']") WebElement password;
	@FindBy(xpath="//button[text()=' Login ']") WebElement login;
	
	public void setUsername(String email) {
		username.sendKeys(email);
	}
	
	public void setPassword(String pwd) {
		password.sendKeys(pwd);	
	}
	
	public void clickLogin() {
		login.click();
	}
}
