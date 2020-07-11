package brokerPortal.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	

	public void setUsername(String email)
	{
		driver.findElement(By.id("membershipLoginEmail")).sendKeys(email);	
	}

	public void setPassword(String pwd)
	{
		driver.findElement(By.id("membershipLoginPwd")).sendKeys(pwd);	
	}

	public void clksubmitbtn()
	{
		driver.findElement(By.xpath("//button[@type='submit'][contains(.,'Login')]")).click();
	}
	
	public void clkLogoutbtn()
	{
		driver.findElement(By.xpath("//a[@href='/CSSO/LogoutRequest'][contains(.,'Logout')]")).click();
	}
	
}
