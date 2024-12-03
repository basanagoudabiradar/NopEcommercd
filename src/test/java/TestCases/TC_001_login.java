package TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.Login;
import PageObjects.MyAccount;
import PageObjects.Register_Page;
import TestBase.TestBaseClass;

public class TC_001_login  extends TestBaseClass
{
    WebDriver driver;
    @Test
    public void verify_Account()
    {
    	//MyAccount ma=new MyAccount(driver);
    	
    	Login lg=new Login(driver);
    	lg.User_name("basanagouda@gmail.com");
    	lg.User_Password("Bassu@1992");
    	lg.User_Login(); 
    }
}
