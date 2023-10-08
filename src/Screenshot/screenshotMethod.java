package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshotMethod 
{
	static WebDriver driver;
	
	public static void screenshot(String filename) throws IOException
	{
		TakesScreenshot sc=(TakesScreenshot)driver;
		File s=sc.getScreenshotAs(OutputType.FILE);
		File d=new File("C:\\Users\\a784748\\OneDrive - Atos\\Desktop\\study\\Apowersoft\\Screenshots\\"+filename+".jpg");
		FileHandler.copy(s, d);
		
		
	}

	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\a784748\\OneDrive - Atos\\Desktop\\Driver\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	    
	    driver.get("https://www.facebook.com/");
	    screenshot("facebook");
	    driver.navigate().to("https://www.google.com/");
	    screenshot("google");
	    
	    
	    
	

	}

}
