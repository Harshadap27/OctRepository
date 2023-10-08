package ActionClassMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboardActions {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\a784748\\OneDrive - Atos\\Desktop\\Driver\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://www.facebook.com/");
	    
	    WebElement User=driver.findElement(By.xpath("//input[@id=\"email\"]"));
	    
	    WebElement Pass=driver.findElement(By.xpath("//input[@id=\"pass\"]"));
	    
	    Actions action=new Actions(driver);
	    
	    action.sendKeys(User,"Good").perform();
	    
	    action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
	    
	    action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
	    
	    //action.click(Pass).perform();
	    
	    //Pass.click();
	    
	    action.keyDown(Keys.TAB).build().perform();
	    
	    action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
	    
	     


	}

}
