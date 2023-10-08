package TestNG;

import org.testng.Reporter;
import org.testng.annotations.*;

public class TestNGAnnotations
{
	@BeforeSuite
	public void browserConfigure()
	{
		Reporter.log("Browser setting",true);
	}
	
	@BeforeTest
	public void browserSetting()
	{
		Reporter.log("maximizing browser and wait provided",true);
	}

	@BeforeClass
	public void openApplication()
	{
		Reporter.log("Aapplication opening",true);
	}
	
	@BeforeMethod
	public void login()
	{
		Reporter.log("Logged in applictaion",true);
	}
	
	@Test
	public void testCase1()
	{
		Reporter.log("TC 1 Executing",true);
	}
	
	@Test
	public void testCase2()
	{
		Reporter.log("TC 2 Executing",true);
	}
	
	@Test
	public void testCase3()
	{
		Reporter.log("TC 3 Executing",true);
	}
	
	@AfterMethod
	public void logOut()
	{
		Reporter.log("Application logged out",true);
	}
	@AfterClass
	public void closeAapplication()
	{
		Reporter.log("Application closed",true);
	}
	
	@AfterTest
	public void closeBrowser()
	{
		Reporter.log("closing browser",true);
	}
	
	@AfterSuite
	public void disconnectDatabase()
	{
		Reporter.log("disconnecting database",true);
	}
}
