package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage  extends BasePage
{
	
   //Constructor
	public HomePage(WebDriver driver) 
	{
		super(driver);	
	}
	
	//Locators
	
	@FindBy(xpath=" //span[normalize-space()='Log in']")
	WebElement Link_Login;
	
	@FindBy(xpath="//span[normalize-space()='Register']")
	WebElement Link_Register;
	
	//Actions
	
	public void login()
	{
		Link_Login.click();
	}
	
	public void Register()
	{
		Link_Register.click();
	}

}
