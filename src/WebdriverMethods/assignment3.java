package WebdriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment3 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\a784748\\OneDrive - Atos\\Desktop\\study\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2);
		driver.manage().window().minimize();
		Thread.sleep(1);
		Dimension d = new Dimension(1000,700);
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2);
		driver.navigate().to("https://www.meesho.com/");
		driver.navigate().refresh();
		Thread.sleep(2);
		
		Point p = new Point(200,100);
		driver.manage().window().setPosition(p);
		driver.navigate().back();
		driver.navigate().refresh();
		Thread.sleep(2);
		driver.close();
		
		
		
		
		

	}

}
