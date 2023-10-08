package TestNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class enabledKeyword 
{
	@Test
	public void TC1()
	{
		Reporter.log("TC1 Running",true);
	}
	
	@Test(enabled=false)
	public void TC2()
	{
		Reporter.log("TC2 Running",true);
	}

}
