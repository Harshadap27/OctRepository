package Webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getDataFromOneColumn
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\a784748\\OneDrive - Atos\\Desktop\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("C:\\Users\\a784748\\OneDrive - Atos\\Desktop\\study\\Apowersoft\\Demo2.html");
		
		for(int i=1;i<=4;i++)
		{
			if(i==1)
			{
				String heading = driver.findElement(By.xpath("//table//tr["+i+"]/th[2]")).getText();
				System.out.println(heading);
			}
			else
			{
				String data = driver.findElement(By.xpath("//table//tr["+i+"]/td[2]")).getText();
				System.out.println(data);
			}
		}
		

	}

}
