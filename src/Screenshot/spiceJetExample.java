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

public class spiceJetExample 
{
	static WebDriver driver;
	
	public static void screenshot(String filename) throws IOException
	{
		TakesScreenshot sc =(TakesScreenshot)driver;
		File src=sc.getScreenshotAs(OutputType.FILE);
		File dest= new File("C:\\Users\\a784748\\OneDrive - Atos\\Desktop\\study\\Apowersoft\\Screenshots\\"+filename+".jpg");
		FileHandler.copy(src, dest);	
	}

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\a784748\\OneDrive - Atos\\Desktop\\Driver\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://www.spicejet.com/");
	    
		Thread.sleep(2000);
		screenshot("image2");
		
		driver.findElement(By.xpath("//div[text()=\"Passengers\"]")).click();
		Thread.sleep(2000);
		screenshot("image3");
		
		WebElement adult = driver.findElement(By.xpath("//div[@data-testid=\"Adult-testID-plus-one-cta\"]"));
		
		int i=1;
		
		while(i<5)
		{
			adult.click();
			i++;
		}
		
		Thread.sleep(2000);
		screenshot("image4");
		
		WebElement children = driver.findElement(By.xpath("//div[@data-testid=\"Children-testID-plus-one-cta\"]"));
		
		int m=1;
        while(m<65)
		{
			children.click();
			m++;
		}
        
        Thread.sleep(2000);
        screenshot("image5");
        
        WebElement infant = driver.findElement(By.xpath("//div[@data-testid=\"Infant-testID-plus-one-cta\"]"));
		
        int n=1;
        while(n<5)
		{
        	infant.click();
			n++;
		}
        screenshot("image5");
		

	}

}

