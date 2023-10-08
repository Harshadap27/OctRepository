package Webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getDataFromWholeTable 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\a784748\\OneDrive - Atos\\Desktop\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www2.asx.com.au/markets/trade-our-cash-market/directory");
		Thread.sleep(2000);
		
		int rowsize=driver.findElements(By.xpath("//table[@class=\"table\"]//tr")).size();
		System.out.println(rowsize);
		
		int colsize=driver.findElements(By.xpath("//table[@class=\"table\"]//tr[2]/td")).size();
		System.out.println(colsize);
		
		for(int i=1;i<=colsize+1;i++)
		{
			String data1=driver.findElement(By.xpath("//table//thead//th["+i+"]")).getText();
			System.out.print(data1);
		}
		System.out.println();
		
		for(int j=1;j<rowsize;j++)
		{
			String headdata=driver.findElement(By.xpath("//table//tbody//tr["+j+"]/th")).getText();
			System.out.print(headdata+"  ");
			
			for(int k=1;k<colsize;k++)
			{
				String data=driver.findElement(By.xpath("//table//tbody//tr["+j+"]/td["+k+"]")).getText();
				System.out.println(data+"   ");
			}
			System.out.println();
		}
		
	}

}
