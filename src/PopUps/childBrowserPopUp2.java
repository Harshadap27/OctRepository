package PopUps;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childBrowserPopUp2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\a784748\\OneDrive - Atos\\Desktop\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://opensourcedemo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@href=\"https://www.linkedin.com/company/orangehrm/mycompany/\"]")).click();
		driver.findElement(By.xpath("//a[@href=\"https://www.facebook.com/OrangeHRM/\"]")).click();
		driver.findElement(By.xpath("//a[@href=\"https://twitter.com/orangehrm?lang=en\"]")).click();
		
		Thread.sleep(2000);
		
		String parentid=driver.getWindowHandle();
		
		Set<String> childids=driver.getWindowHandles();
		
		for(String s:childids)
		{
			if(!s.equals(parentid))
			{
				String actual = driver.switchTo().window(s).getTitle();
				
				if(s.contains("LinkdIn"))
				{
					driver.findElement(By.xpath("(//button[@aria-label=\"Dismiss\"])[12]")).click();
					Thread.sleep(2000);
					driver.close();
				}
			}
		}

		
	}

}
