package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends BasePage
{
   //Constructor
	public Login(WebDriver driver) 
	{
		super(driver);
	}
	
	//Locators
	
	@FindBy(xpath="//input[@id='Username']")
	WebElement login_username;
	
	@FindBy(xpath="//input[@id='Password']")
	WebElement login_password;
	
	@FindBy(xpath="//input[@value='Log in']")
	WebElement login_click;
	
	//Actions
	
	public void User_name(String Email)
	{
		login_username.sendKeys(Email);
	}
	public void User_Password(String pwd)
	{
		login_password.sendKeys(pwd);
	}
	public void User_Login()
	{
		login_click.click();
	}
	
}
