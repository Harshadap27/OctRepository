package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class fbScreenshot 
{
	static WebDriver driver;
	
	public static void screenshot(String filename) throws IOException
	{
		TakesScreenshot sc=(TakesScreenshot)driver;
		File src = sc.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\a784748\\OneDrive - Atos\\Desktop\\study\\Apowersoft\\Screenshots\\"+filename+".jpg");
		FileHandler.copy(src, dest);
	}

	public static void main(String[] args) throws InterruptedException, IOException 
	{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\a784748\\OneDrive - Atos\\Desktop\\Driver\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		screenshot("imaage1");
		
		driver.findElement(By.xpath("//a[@role=\"button\"and text()=\"Create new account\"]")).click();
		Thread.sleep(2000);
		screenshot("imaage2");
		
		WebElement Year = driver.findElement(By.xpath("//select[@id=\"year\" and @title=\"Year\" ]"));
		Select obj = new Select(Year);
		obj.selectByValue("1997");
		Thread.sleep(2000);
		screenshot("imaage3");
		
		WebElement Month = driver.findElement(By.xpath("//select[@id=\"month\"]"));
		Select obj1 = new Select(Month);
		obj1.selectByIndex(8);
		Thread.sleep(2000);
		screenshot("imaage4");
		
		WebElement Day = driver.findElement(By.xpath("//select[@id=\"day\"]"));
		Select obj2 = new Select(Day);
		obj2.selectByVisibleText("27");
		Thread.sleep(2000);
		screenshot("imaage5");
		
		
	}

}