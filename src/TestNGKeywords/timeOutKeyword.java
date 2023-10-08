package TestNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class timeOutKeyword 
{
	@Test(timeOut=2000)
	public void TC1()
	{
		Reporter.log("TC1 Running",true);
	}
	
	@Test(timeOut=1000)
	public void TC2() throws InterruptedException
	{
		Thread.sleep(2000);
		Reporter.log("TC2 Running",true);
	}

}
