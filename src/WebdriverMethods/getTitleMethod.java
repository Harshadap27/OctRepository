package WebdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class getTitleMethod {

	public static void main(String[] args) 
	{
		System.setProperty("webdrive.edge.driver", "C:\\Users\\a784748\\OneDrive - Atos\\Desktop\\Driver\\chromedriver_win64\\edgedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
	    
		System.out.println(driver.getTitle());
		String actualResult = driver.getTitle();
		
		if(actualResult.equalsIgnoreCase("Google"))
		{
			System.out.println("Test case Passed");
		}
		else
		{
			System.out.println("Test case Failed");
		}
		

	}

}
