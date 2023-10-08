package POM_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fb_Home_Page 
{
	@FindBy(xpath="//a[@aria-label=\"Already have an account?\"]") private WebElement account;
	
	public fb_Home_Page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public void alreadyHaveAnAccount()
	{
		account.click();
		
	}
			

}
