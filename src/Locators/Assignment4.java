package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\a784748\\OneDrive - Atos\\Desktop\\Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.youtube.com/");
		
		driver.findElement(By.xpath("//input[@id=\"search\"]")).sendKeys("Tutorial");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id=\"search-icon-legacy\"]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[@title=\"Full Modern React Tutorial\"]")).click();
		
		
		//driver.navigate().back();
		
		//driver.findElement(By.xpath("//input[@id=\"search\"]")).clear();
		
		//driver.findElement(By.xpath("//input[@id=\"search\"]")).sendKeys("Selenium");
		
		//driver.findElement(By.xpath("//button[@id=\"search-icon-legacy\"]")).click();
		
		//driver.findElement(By.xpath("//span[@title=\"Selenium with Java\"]")).click();
		
		
		
	}

}
