package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class DataEnter extends BasePage{
	
	public DataEnter(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='name']") WebElement name;
	@FindBy(xpath="//input[@id='email']") WebElement email;
	@FindBy(xpath="//input[@id='phone']") WebElement phone;
	@FindBy(xpath="//textarea[@id='textarea']") WebElement address;
	@FindBy(xpath="//input[@id='male']") WebElement genderMale;
	@FindBy(xpath="//input[@id='female']") WebElement genderFemale;
	@FindBy(xpath="//input[@id='monday']") WebElement monday;
	@FindBy(xpath="//select[@id='country']") WebElement country;
	@FindBy(xpath="//select[@id='colors']") WebElement colors;
	@FindBy(xpath="//select[@id='animals']") WebElement animals;
	
	public void enterName(String Name) {
		name.sendKeys(Name);
	}
	
	public void enterEmail(String Email) {
		email.sendKeys(Email);
	}
	
	public void enterPhone(String Phone) {
		phone.sendKeys(Phone);
	}
	
	public void enterAddress(String Address) {
		address.sendKeys(Address);
	}
	
	public void selectMale() {
		genderMale.click();
	}
	
	public void selectFemale() {
		genderFemale.click();
	}
	
	public void selectMonday() {
		monday.click();
	}
	
	public void selectCountry() {
		Select countryOptions = new Select(country);
		countryOptions.selectByVisibleText("India");
	}
	
	public void selectColor() {
		Select colorOptions = new Select(colors);
		colorOptions.selectByVisibleText("Green");
	}
	
	public void selectAnimal() {
		Select animalOptions = new Select(animals);
		animalOptions.selectByVisibleText("Cheetah");
	}
	
}
