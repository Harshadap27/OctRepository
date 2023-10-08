package AssertionExample;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample 
{
	@Test
	public void Tc1()
	{
		String actual="Google";
		String expected="Google";
		
		SoftAssert s=new SoftAssert();
		s.assertEquals(actual, expected);
	}

}
