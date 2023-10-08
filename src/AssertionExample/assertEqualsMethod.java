package AssertionExample;

import org.testng.Assert;
import org.testng.annotations.*;

public class assertEqualsMethod
{
	@Test
	public void TC1()
	{
		String actual="Google";
		String expected="Google";
		Assert.assertEquals(actual, expected,"Failed: results not matching");
	}
	
	@Test
	public void TC2()
	{
		String actual=null;
		Assert.assertNull(actual);
	}
		
	@Test
	public void TC5()
	{
		String actual="Google";
		String expected="Facebook";
		Assert.assertNotEquals(actual, expected);
	}
	
	@Test
	public void TC6()
	{
		String actual="Google";
		Assert.assertNotNull(actual);
	}

}
