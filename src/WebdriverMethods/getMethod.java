package WebdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getMethod {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\a784748\\OneDrive - Atos\\Desktop\\study\\chromedriver_win32\\chromedriver.exe");
		
		//Create Webdriver Object 
		WebDriver driver = new ChromeDriver();
		
		//get : Open an application in browser
		driver.get("https://www.google.com");
		
	}

}
