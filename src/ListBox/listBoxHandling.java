package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listBoxHandling {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\a784748\\OneDrive - Atos\\Desktop\\Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@role=\"button\"and text()=\"Create new account\"]")).click();
		Thread.sleep(2000);
		
		WebElement Year = driver.findElement(By.xpath("//select[@id=\"year\" and @title=\"Year\" ]"));
		Select obj = new Select(Year);
		obj.selectByValue("1997");
		Thread.sleep(2000);
		
		WebElement Month = driver.findElement(By.xpath("//select[@id=\"month\"]"));
		Select obj1 = new Select(Month);
		obj1.selectByIndex(8);
		Thread.sleep(2000);
		
		WebElement Day = driver.findElement(By.xpath("//select[@id=\"day\"]"));
		Select obj2 = new Select(Day);
		obj2.selectByVisibleText("27");
		Thread.sleep(2000);
		
		
		

	}

}
