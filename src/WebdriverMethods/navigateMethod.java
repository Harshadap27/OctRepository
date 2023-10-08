package WebdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateMethod {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\a784748\\OneDrive - Atos\\Desktop\\study\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.navigate().to("https://www.Flipcart.com/");
		
		driver.navigate().back(); //facebook
		Thread.sleep(2000);
		driver.navigate().back(); //google
		Thread.sleep(2000);
		driver.navigate().forward(); //facebook
		Thread.sleep(2000);
		driver.navigate().forward(); //flipcart
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		
	}

}
