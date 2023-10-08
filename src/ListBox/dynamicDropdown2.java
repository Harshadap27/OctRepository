package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicDropdown2 {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\a784748\\OneDrive - Atos\\Desktop\\Driver\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.spicejet.com/");
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[text()=\"Passengers\"]")).click();
			
			Thread.sleep(2000);
			
			WebElement adult = driver.findElement(By.xpath("//div[@data-testid=\"Adult-testID-plus-one-cta\"]"));
			
			int i=1;
			
			while(i<5)
			{
				adult.click();
				i++;
			}
			
			Thread.sleep(2000);
			WebElement children = driver.findElement(By.xpath("//div[@data-testid=\"Children-testID-plus-one-cta\"]"));
			
			int m=1;
            while(m<5)
			{
				children.click();
				m++;
			}
            
            Thread.sleep(2000);
            WebElement infant = driver.findElement(By.xpath("//div[@data-testid=\"Infant-testID-plus-one-cta\"]"));
			
            int n=1;
            while(n<5)
			{
            	infant.click();
				n++;
			}
	}

}
