package TestNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityKeyword 
{
	@Test(priority=1)
	public void TC1()
	{
		Reporter.log("TC1 Running",true);
	}
	
	@Test
	public void TC2()
	{
		Reporter.log("TC2 Running",true);
	}

	@Test
	public void TC3()
	{
		Reporter.log("TC3 Running",true);
	}

	@Test(priority=-1)
	public void TC4()
	{
		Reporter.log("TC4 Running",true);
	}

	@Test(priority=2)
	public void TC5()
	{
		Reporter.log("TC5 Running",true);
	}


}
