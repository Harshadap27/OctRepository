package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hybridXpath 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\a784748\\OneDrive - Atos\\Desktop\\Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		//driver.findElement(By.xpath("//input[@class=\"_2IX_2- VJZDxU\"]")).sendKeys("9637199433");
		
		//driver.findElement(By.xpath("//button[contains(text(),\"Request OTP\")]")).click();
		
		//driver.findElement(By.xpath("//button[contains(text(),\"Verify\")]")).click();
		
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l_2doB4z\" or text()=\"✕\"]")).click();
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//div[contains(@class,\"xtXmba\") and starts-with(text(),\"Grocery\")]"));
		driver.findElement(By.xpath("//div[contains(@class,\"Xmba\") and startswith(text(),\"Mobiles\")]")).click();
		Thread.sleep(2000);
		

	}

}
