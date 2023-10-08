package TestNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class invocationCountKeyword 
{
	@Test(priority=1,invocationCount=4)
	public void TC1()
	{
		Reporter.log("TC1 Running",true);
	}
	
	@Test
	public void TC2()
	{
		Reporter.log("TC2 Running",true);
	}

}
