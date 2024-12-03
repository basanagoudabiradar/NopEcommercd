package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccount  extends BasePage
{

	public MyAccount(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(xpath="//span[@class='user-actions-ico']//*[name()='svg']")
	WebElement acct; //span[@class='user-actions-ico']//*[name()='svg']
    
	void Myaccnt()
	{
		acct.click();
	}
}
