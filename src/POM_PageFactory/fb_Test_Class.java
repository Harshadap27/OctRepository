package POM_PageFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fb_Test_Class {

	public static void main(String[] args) throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\a784748\\OneDrive - Atos\\Desktop\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		
		FileInputStream file=new FileInputStream("C:\\Users\\a784748\\OneDrive - Atos\\Desktop\\study\\Apowersoft\\Practice\\ParameterizationDemo.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(file);
		XSSFSheet s=book.getSheet("Frame");
		
		//fb_Home_Page fhp = new fb_Home_Page(driver);
		//fhp.alreadyHaveAnAccount();

		fb_Login_Page flp = new fb_Login_Page(driver);
		flp.enterUsername(s.getRow(1).getCell(0).getStringCellValue());
		Thread.sleep(1000);
		flp.enterPassword(s.getRow(1).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		flp.clickOnLogin();
		Thread.sleep(1000);
		
		flp.validateUser(s.getRow(1).getCell(2).getStringCellValue());
		Thread.sleep(1000);
	}

}
