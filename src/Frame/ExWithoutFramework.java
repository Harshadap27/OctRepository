package Frame;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExWithoutFramework 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\a784748\\\\OneDrive - Atos\\\\Desktop\\\\Driver\\\\chromedriver_win32\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("harshadapatil2797@gmail.com");
		driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("9637199433");
		driver.findElement(By.xpath("//button[@data-testid=\"royal_login_button\"]")).click();
		Thread.sleep(1000);
		
		String actualid=driver.findElement(By.xpath("//span[text()=\"Harshada Patil\"]")).getText();
		String expectedid="Harshada Patil";
		
		Thread.sleep(1000);
		if(actualid.equalsIgnoreCase(expectedid))
		{
			System.out.println("TestCase Passed");
		}
		else
		{
			System.out.println("TestCase Failed");
		}
		
	
		
	}

}
