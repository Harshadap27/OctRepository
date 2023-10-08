package CrossBrowserTesting;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

import com.beust.jcommander.Parameter;


public class TestClass1 
{
	@Parameter("browser")
	@Test
	
	public void TC1(String browser)
	{
		WebDriver driver = null;
		if(browser.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\a784748\\OneDrive - Atos\\Desktop\\Driver\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		else if(browser.equals("Edge"))
		{
			System.setProperty("webdriver.edge.driver", "C:\\Users\\a784748\\OneDrive - Atos\\Desktop\\Driver\\edgedriver_win64\\edgedriver.exe");
			driver=new EdgeDriver();
		}
		driver.get("https://www.google.com/");
	}
	

}
