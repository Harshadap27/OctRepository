package Screenshot;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenShot {

	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\a784748\\OneDrive - Atos\\Desktop\\Driver\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://www.facebook.com/");
	    
	    TakesScreenshot sc=(TakesScreenshot)driver;//Typecast driver object in Takesscreenshot Interface
	    
	    File src = sc.getScreenshotAs(OutputType.FILE);//call method to take screenshot
	    
	    File dest = new File("C:\\Users\\a784748\\OneDrive - Atos\\Desktop\\study\\Apowersoft\\Screenshots\\page.jpg");
	    
	    FileHandler.copy(src, dest);//copy file from src to dest
	        
	  

	}

}
