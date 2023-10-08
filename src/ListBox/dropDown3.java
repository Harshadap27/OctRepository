package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropDown3 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\a784748\\OneDrive - Atos\\Desktop\\Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()=\"Currency\"]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()=\"EUR\"]")).click();
		Thread.sleep(2000);
		

	}

}
