package ActionClassMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class contextClick {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\a784748\\OneDrive - Atos\\Desktop\\Driver\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://demo.guru99.com/test/drag_drop.html");
	    
	    //To perform right click --> contextClick command is used
	    
	    WebElement right = driver.findElement(By.xpath("//a[text()=\" 5000 \"]"));
	    
	    Actions action = new Actions(driver);
	    
	    action.contextClick(right).perform();
	    
	    for(int i=0;i<5;i++)
	    {
	    	action.sendKeys(Keys.ARROW_DOWN).perform();
	    
	    }
	    
	    action.keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();

	}

}
