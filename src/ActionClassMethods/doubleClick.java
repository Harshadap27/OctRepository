package ActionClassMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleClick {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\a784748\\OneDrive - Atos\\Desktop\\Driver\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://demo.guru99.com/test/drag_drop.html");
	    
	    WebElement click = driver.findElement(By.xpath("//a[text()=\" 5000 \"]"));
	    
	    Actions action = new Actions(driver);
	    
	    action.doubleClick(click).perform();
	    

	}

}
