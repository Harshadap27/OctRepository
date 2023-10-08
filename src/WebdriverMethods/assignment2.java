package WebdriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment2 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\a784748\\OneDrive - Atos\\Desktop\\study\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		Thread.sleep(1);
		
		Point p = new Point(400,200);
		driver.manage().window().setPosition(p);
		Thread.sleep(2);
		
		driver.manage().window().maximize();
		Thread.sleep(2);
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2);
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(2);
		driver.navigate().to("https://www.meesho.com/");
		Thread.sleep(2);
		driver.navigate().back();
		Thread.sleep(2);
		driver.navigate().back();
		Thread.sleep(2);
		
		Dimension d = new Dimension(700,700);
		driver.manage().window().setSize(d);
		
		Thread.sleep(2);
		driver.navigate().forward();
		
		driver.navigate().refresh();
		Thread.sleep(2);
		
		driver.close();

	}

}
