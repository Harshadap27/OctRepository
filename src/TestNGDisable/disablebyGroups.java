package TestNGDisable;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class disablebyGroups 
{
	@Test(groups="sanity")
	public void TC1()
	{
		Reporter.log("TC1 Running",true);
	}
	
	@Test(groups="regression")
	public void TC2()
	{
		Reporter.log("TC2 Running",true);
	}

	@Test(groups="sanity")
	public void TC3()
	{
		Reporter.log("TC3 Running",true);
	}

	@Test(groups="sanity")
	public void TC4()
	{
		Reporter.log("TC4 Running",true);
	}

	@Test(groups="regression")
	public void TC5()
	{
		Reporter.log("TC5 Running",true);
	}

}
