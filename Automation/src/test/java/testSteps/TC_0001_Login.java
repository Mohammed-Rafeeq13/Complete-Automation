package testSteps;

//import org.testng.Assert;
import org.testng.annotations.Test;
import baseClass.BaseClass;
import pageObjects.LoginPage;

public class TC_0001_Login extends BaseClass{
	
	@Test
	public void LoginTest() {
		LoginPage lp = new LoginPage(driver);
		// String pageTitle = driver.getTitle();
		// Assert.assertEquals("OrangeHRM", pageTitle);
		lp.setUsername("Admin");
		lp.setPassword("admin123");
		lp.clickLogin();
	}
	
}
