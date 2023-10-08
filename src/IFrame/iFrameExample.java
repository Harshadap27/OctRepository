package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class iFrameExample {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\a784748\\OneDrive - Atos\\Desktop\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_post");
		Thread.sleep(2000);
		
		//driver.switchTo().frame("iframeResult");//id
		//driver.switchTo().frame("iframeResult");//name
		//driver.switchTo().frame(1);//index
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id=\"iframeResult\"]")));//webelement
		
		driver.findElement(By.xpath("//input[@id=\"fname\"]")).clear();
		driver.findElement(By.xpath("//input[@id=\"fname\"]")).sendKeys("Hello");
		
		driver.findElement(By.xpath("//input[@id=\"lname\"]")).clear();
		driver.findElement(By.xpath("//input[@id=\"lname\"]")).sendKeys("Mini");
		
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		
		
		

	}

}
