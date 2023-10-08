package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathwithContains {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\a784748\\OneDrive - Atos\\Desktop\\Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[contains(@placeholder,\"Email address or phone number\")]")).sendKeys("harshadabpatil2797@gmail.com");
		
		driver.findElement(By.xpath("//input[contains(@placeholder,\"Password\")]")).sendKeys("9637199433");
		
		driver.findElement(By.xpath("//button[contains(@type,\"submit\")]")).click();
		
		driver.close();
		

	}

}
