package Webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class rowSize_colSize 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\a784748\\OneDrive - Atos\\Desktop\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("C:\\Users\\a784748\\OneDrive - Atos\\Desktop\\study\\Apowersoft\\Demo2.html");
		
		List<WebElement> row = driver.findElements(By.xpath("//table//tr"));
		
		System.out.println("Row size "+row.size());
		
		List<WebElement> col = driver.findElements(By.xpath("//table//tr[2]/td"));
		
		System.out.println("Coloumn size "+col.size());
	

	}

}
