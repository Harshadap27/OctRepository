package POM_PageFactory;

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

public class TestNG_TestClass 
{
	WebDriver driver;
	fb_Login_Page flp;
	XSSFSheet s;
	
	@BeforeTest
	public void configureBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\a784748\\OneDrive - Atos\\Desktop\\Driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
	}
	
	@BeforeClass
	public void openBrowser()
	{
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void login() throws IOException, InterruptedException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\a784748\\OneDrive - Atos\\Desktop\\study\\Apowersoft\\Practice\\ParameterizationDemo.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(file);
		s=book.getSheet("Frame");

		flp = new fb_Login_Page(driver);
		flp.enterUsername(s.getRow(1).getCell(0).getStringCellValue());
		Thread.sleep(1000);
		flp.enterPassword(s.getRow(1).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		flp.clickOnLogin();
		Thread.sleep(1000);
		
	}
	
	@Test
	public void userValidation()
	{
		flp.validateUser(s.getRow(1).getCell(2).getStringCellValue());
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


