package testCase;

import org.testng.annotations.Test;

import pageObjects.DataEnter;
import testBase.BaseTest;

public class TC_001_DataEnter extends BaseTest {
	
	@Test
	public void validate_DataEnter() {
		DataEnter de = new DataEnter(driver);
		de.enterName("Mohammed");
		de.enterEmail("mohammed@gmail.com");
		de.enterAddress("Hyd");
		de.enterPhone("+91 1234567899");
		de.selectMale();
		de.selectCountry();
		de.selectColor();
		de.selectAnimal();
		de.selectMonday();
	}
	
}
