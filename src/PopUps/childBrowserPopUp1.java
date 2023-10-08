package PopUps;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childBrowserPopUp1 {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\a784748\\OneDrive - Atos\\Desktop\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id=\"tabButton\"]")).click();
		driver.findElement(By.xpath("//button[@id=\"windowButton\"]")).click();
		driver.findElement(By.xpath("//button[@id=\"messageWindowButton\"]")).click();
		
		String parentid = driver.getWindowHandle();//to get address of main parent window
		System.out.println(parentid);
		
		Set<String> childids = driver.getWindowHandles();//	To get address of child browser and parent browser
		
		System.out.println(childids.size());//4
		
		for(String s:childids) //for each loop
		{
			System.out.println(s);
			if(!s.equals(parentid))
			{
				//switch focus from main window to child
				driver.switchTo().window(s);
				Thread.sleep(2000);
				
				driver.close();//perform action on child browser window
			}
		}
		
		driver.switchTo().window(parentid);
		
		
		
		

	}

}
