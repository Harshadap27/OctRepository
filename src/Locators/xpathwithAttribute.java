package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathwithAttribute {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\a784748\\OneDrive - Atos\\Desktop\\Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.youtube.com/");
		
		driver.findElement(By.xpath("//input[@id=\"search\"]")).sendKeys("Apna Bana le");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id=\"search-icon-legacy\"]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@title=\"Apna Bana Le - Full Audio | Bhediya | Varun Dhawan, Kriti Sanon| Sachin-Jigar,Arijit Singh,Amitabh B\"]")).click();
		
		Thread.sleep(2000);
		

	}

}
