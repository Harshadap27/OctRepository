package POM_PageFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\a784748\\OneDrive - Atos\\Desktop\\Driver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		
		//FileInputStream file = new FileInputStream("C:\\Users\\a784748\\OneDrive - Atos\\Desktop\\study\\Apowersoft\\Practice\\ParameterizationDemo.xlsx");
		//XSSFWorkbook book=new XSSFWorkbook(file);
		//XSSFSheet s=book.getSheet("Amazon");
		
		//Amazon_Home_Page ahp=new Amazon_Home_Page(driver);
		//ahp.clickOnSignIn();
		//Thread.sleep(2000);
		
		Amazon_Login_Page alp=new Amazon_Login_Page(driver);
		alp.enterUsername();
		Thread.sleep(2000);
		alp.enterPassword();
		Thread.sleep(2000);
		alp.clickOnLogin();
		Thread.sleep(2000);
		alp.validateUser();
		Thread.sleep(2000);

	}

}
