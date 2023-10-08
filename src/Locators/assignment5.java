package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment5 {

	public static void main(String[] args) 
	{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\a784748\\OneDrive - Atos\\Desktop\\Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
	
		driver.findElement(By.xpath("//a[contains(text(),\"Best Sellers\")]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),\"Mobiles\")]")).click();	
		
		driver.findElement(By.xpath("//a[contains(text(),\"Today's Deals\")]")).click();
		
		driver.close();
		
	}

}
