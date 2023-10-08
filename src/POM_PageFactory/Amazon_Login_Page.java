package POM_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Login_Page 
{
	@FindBy(xpath="//input[@id=\\\"email\\\"]") private WebElement username;
	@FindBy(xpath="//input[@id=\\\"pass\\\"]") private WebElement password;
	@FindBy(xpath="//button[@data-testid=\\\"royal_login_button\\\"]") private WebElement login;
	
	public Amazon_Login_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterUsername()
	{
		username.sendKeys("harshadapatil2797@gmail.com");
	}
	
	public void enterPassword()
	{
		password.sendKeys("9637199433");
	}
	
	public void clickOnLogin()
	{
		login.click();
	}
	
	public void validateUser()
	{
		String actualid=username.getText();
		String expectedid="Harshada Patil";
		
		if(actualid.equals(expectedid))
		{
			System.out.println("TC Passed");
		}
		else
		{
			System.out.println("TC Failed");
		}
	}

}
