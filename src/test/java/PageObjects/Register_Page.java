package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Register_Page extends BasePage
{
   //Constructor
	public Register_Page(WebDriver driver) 
	{
		super(driver);
	}
	
   //Locators
	@FindBy(xpath="//input[@id='FirstName']")
	WebElement Firstname;
	@FindBy(xpath="//input[@id='LastName']") //input[@id='LastName']
	WebElement Lastname;
	@FindBy(xpath="//input[@id='Email']")
	WebElement Email;
	@FindBy(xpath="//input[@id='ConfirmEmail']")
	WebElement ConfermEmail;
	@FindBy(xpath="//input[@id='Username']")
	WebElement Username;
	@FindBy(xpath="//input[@id='check-availability-button']")
	WebElement Availebility;
	@FindBy(xpath="//select[@id='CountryId']")
	WebElement Country;
	//Select sl=new Select(DropDown);
	@FindBy(xpath="//select[@id='TimeZoneId']")
	WebElement time;
	@FindBy(xpath="//input[@id='Password']")
	WebElement Password;
	@FindBy(xpath="//input[@id='ConfirmPassword']")
	WebElement ConfermPassword;
	@FindBy(xpath="//select[@id='Details_CompanyIndustryId']")
	WebElement primary;
	@FindBy(xpath="//select[@id='Details_CompanyRoleId']")
	WebElement role;
	@FindBy(xpath="//input[@id='register-button']")
	WebElement Register;

	//Actions
	public void firstname(String name)
	{
		Firstname.sendKeys(name);
	}
	public void lastname(String lname)
	{
		Lastname.sendKeys(lname);
	}
	public void mail(String id)
	{
		Email.sendKeys(id);
	}
	public void Cmail(String cid)
	{
		ConfermEmail.sendKeys(cid);
	}
	public void user(String uname)
	{
		Username.sendKeys(uname);
	}
	public void Check()
	{
		Availebility.click();
	}
	public void country()
	{
		Select sl=new Select(Country);
		sl.deselectByIndex(2);
	}
	public void TimeZone()
	{
		Select sl=new Select(time);
		sl.deselectByIndex(2);
	}
	
	public void Password(String pwd)
	{
		Password.sendKeys(pwd);
	}
	
	public void CPassword(String cpwd)
	{
		ConfermPassword.sendKeys(cpwd);
	}
	public void industryType(String itype)
	{
		primary.sendKeys(itype);
	}
	public void role(String Role)
	{
		primary.sendKeys(Role);
	}
	public void register()
	{
		Register.click();
	}


}
