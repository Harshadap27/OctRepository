package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class id_Locator {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\a784748\\OneDrive - Atos\\Desktop\\Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();  // webdriver object
		
		driver.get("https://www.facebook.com"); //open browser
		
		//WebElement ele = driver.findElement(By.id("email"));
		//ele.sendKeys("harshadabpatil2797@gmail.com");
		
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("harshadabpatil2797@gmail.com");
		
		
		WebElement ele2 = driver.findElement(By.xpath("//input[@name=\"pass\"]"));
		ele2.sendKeys("9637199433");
		
		WebElement ele3 = driver.findElement(By.name("login"));
		ele3.click();
		
		System.out.println("Facebook login successful");
		
		
	 }

}
