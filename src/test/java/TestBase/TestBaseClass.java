package TestBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;

public class TestBaseClass 
{
	 WebDriver  driver;
	@BeforeTest
   public void setup() 
   {
	  
	   driver=new ChromeDriver();
	   driver.manage().deleteAllCookies();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.get("https://www.nopcommerce.com/en/register?returnUrl=%2Fen%2Fdemo");
   }
	
	@AfterClass
	public void teardown()
	{
	  driver.quit();
	}
}
