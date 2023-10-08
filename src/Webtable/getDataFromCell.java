package Webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getDataFromCell {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\a784748\\OneDrive - Atos\\Desktop\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("C:\\Users\\a784748\\OneDrive - Atos\\Desktop\\study\\Apowersoft\\Demo2.html");
		
		WebElement cell = driver.findElement(By.xpath("//table//tr[3]/td[2]"));
		
		System.out.println(cell.getText());

		System.out.println(driver.findElement(By.xpath("//table//tr[4]/td[3]")).getText());
		
		//We can use these both methods to get cell data
		
		
		
	}

}
