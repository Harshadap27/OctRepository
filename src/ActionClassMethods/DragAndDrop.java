package ActionClassMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\a784748\\OneDrive - Atos\\Desktop\\Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(2000);
		
		WebElement drag = driver.findElement(By.xpath("//li[@id=\"credit2\"]"));
		Thread.sleep(2000);
		
		WebElement drop = driver.findElement(By.xpath("//ol[@id=\"bank\"]"));
		Thread.sleep(2000);
		
		Actions action = new Actions(driver);
		
		action.dragAndDrop(drag, drop).perform();
		Thread.sleep(2000);
		
		
		
	

	}

}
