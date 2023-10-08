package TestNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class dependsOnMethodsKeyword 
{
	@Test(dependsOnMethods= {"cart"})
	public void buy()
	{
		Reporter.log("buy Running",true);
	}
	
	@Test
	public void login()
	{
		Reporter.log("login Running",true);
	}
	
	@Test(dependsOnMethods= {"login"},priority=1)
	public void cart()
	{
		Reporter.log("cart Running",true);
	}
	
	@Test(dependsOnMethods= {"buy"})
	public void logOut()
	{
		Reporter.log("logOut Running",true);
	}

}
