package Frame;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExWithDDF {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\a784748\\\\OneDrive - Atos\\\\Desktop\\\\Driver\\\\chromedriver_win32\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		
		FileInputStream file=new FileInputStream("C:\\Users\\a784748\\OneDrive - Atos\\Desktop\\study\\Apowersoft\\Practice\\ParameterizationDemo.xlsx");
        XSSFWorkbook book=new XSSFWorkbook(file);//open excel sheet
        XSSFSheet s=book.getSheet("Frame");
        
        String username=s.getRow(1).getCell(0).getStringCellValue();
        driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys(username);
        
        String password=s.getRow(1).getCell(1).getStringCellValue();
        driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys(password);
        driver.findElement(By.xpath("//button[@data-testid=\"royal_login_button\"]")).click();
		Thread.sleep(1000);
		
		String actualid=driver.findElement(By.xpath("//span[text()=\"Harshada Patil\"]")).getText();
		String expectedid=s.getRow(1).getCell(2).getStringCellValue();
		
		if(actualid.equals(expectedid))
		{
			System.out.println("Test case passed");
		}
		else
		{
			System.out.println("Test case failed");
		}
        
	}

}
