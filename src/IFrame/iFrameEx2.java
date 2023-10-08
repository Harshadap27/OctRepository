package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class iFrameEx2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\a784748\\OneDrive - Atos\\Desktop\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://chercher.tech/practice/frames");
		Thread.sleep(2000);
		
		driver.switchTo().frame("frame1");
		
		driver.findElement(By.xpath("//input[1]")).sendKeys("Animals Type");
		
		driver.switchTo().frame("frame3");
		driver.findElement(By.xpath("//input[@id=\"a\"]")).click();
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id=\"frame2\"]")));
		
		WebElement data=driver.findElement(By.xpath("//select[@id=\"animals\"]"));
		Select obj=new Select(data);
		obj.selectByIndex(2);
		Thread.sleep(2000);
		
		
		
		
		

	}

}
