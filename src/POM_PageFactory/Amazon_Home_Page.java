package POM_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Home_Page 
{
	@FindBy(xpath="//a[@class=\"_9bq5\"]") private WebElement signIn;
	
	public Amazon_Home_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnSignIn()
	{
		signIn.click();
	}
 
}
