package POM_DDF_TestNG_BaseClass_UtilityClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.*;

public class TestNG_TestClass extends BaseClass
{
	WebDriver driver;
	fb_Login_Page flp;
	fb_Home_Page fhp;
	XSSFSheet s;
	UtilityClass uc;
	
	@BeforeTest
	public void configureBrowser_openApplication() throws IOException
	{
	    configureBrowser();
		flp = new fb_Login_Page(driver);
		fhp = new fb_Home_Page(driver);
		uc=new UtilityClass();
		uc.screenShot("Application opened", driver);
	}
	
	@BeforeMethod
	public void login() throws IOException, InterruptedException
	{
		
		flp.enterUsername(UtilityClass.fetchData(1, 0));
		Thread.sleep(1000);
		flp.enterPassword(UtilityClass.fetchData(1, 1));
		Thread.sleep(1000);
		uc.screenShot("Credentials Entered", driver);
		flp.clickOnLogin();
		Thread.sleep(1000);
		uc.screenShot("logged in", driver);
		
	}
	
	@Test
	public void userValidation() throws IOException, InterruptedException
	{
		Thread.sleep(2000);
		flp.validateUser(UtilityClass.fetchData(1, 2));
	}

	@AfterMethod
	public void profile()
	{
		flp.clickonProfile();
	}
	public void logOut() throws InterruptedException
	{
		Thread.sleep(1000);
		flp.clickOnlogOut(driver);
	}
	
	@AfterClass
	public void closeApplication() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.close();
	}
	
	@AfterTest
	public void closeBrowser()
	{
		Reporter.log("Closing Browser",true);
	}
}


