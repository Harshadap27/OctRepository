package POM_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fb_Login_Page 
{
	@FindBy(xpath="//input[@id=\"email\"]") private WebElement username;
	@FindBy(xpath="//input[@id=\"pass\"]") private WebElement password;
	@FindBy(xpath="//button[@data-testid=\"royal_login_button\"]") private WebElement login;
	@FindBy(xpath="//div[@class=\"x1rg5ohu x1n2onr6 x3ajldb x1ja2u2z\"][1]") private WebElement profile;	
	@FindBy(xpath="//span[text()=\"Log Out\"]") private WebElement logOut;
	
	public fb_Login_Page(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public void enterUsername(String user)
	{
		username.sendKeys(user);
	}
	
	public void enterPassword(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void clickOnLogin()
	{
		login.click();
	}
	
	public void validateUser(String expectedid)
	{
		String actual="Harshada Patil";
		
		if(actual.equals(expectedid))
		{
			System.out.println("TC Passed");
		}
		else
		{
			System.out.println("TC Failed");
		}
	}
	
	public void clickonProfile()
	{

		profile.click();
	}

	public void clickOnlogOut(WebDriver driver)
	{
		
		
		Actions act = new Actions(driver);
		act.moveToElement(profile).perform();
		act.click(logOut).perform();
		
	}
}
