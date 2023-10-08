package WebdriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\a784748\\OneDrive - Atos\\Desktop\\Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		Thread.sleep(2);
		
		Dimension d = new Dimension(700,700);
		driver.manage().window().setSize(d);
		Thread.sleep(2);
		
		driver.manage().window().minimize();
		Thread.sleep(2);
		
		driver.manage().window().maximize();
		
		driver.close();
	}

}
