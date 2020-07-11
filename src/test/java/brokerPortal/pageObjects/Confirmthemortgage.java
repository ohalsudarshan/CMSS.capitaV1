package brokerPortal.pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import brokerPortal.testCases.BrokerPortalBaseClass;

public class Confirmthemortgage extends BrokerPortalBaseClass{
WebDriver driver;
	
	public Confirmthemortgage(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	public void ConfirmthemortgageResidential() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(3000);
		Radiobutton("//label[@for='Fees_ProductFees_0__AddToLoan-false'][contains(.,'Pay on application')]");
		logger.info("How will this be paid?*");
		
		driver.findElement(By.xpath("//button[@name='submittedButton'][contains(.,'Continue')]")).click();
		logger.info("Clicked on Confirm the mortgage continue button");
		Thread.sleep(5000);
		validatetitle();
		
		driver.findElement(By.xpath("//button[@name='submittedButton'][contains(.,'Continue')]")).click();
		logger.info("Clicked on Mortgage Illustration summary continue button");
		Thread.sleep(5000);
		validatetitle();
	}
	
	public void ConfirmthemortgageBTL() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(3000);
		Radiobutton("//label[@for='Fees_ProductFees_0__AddToLoan-false'][contains(.,'Pay on application')]");
		logger.info("How will this be paid?*");
		
		driver.findElement(By.xpath("//button[@name='submittedButton'][contains(.,'Continue')]")).click();
		logger.info("Clicked on Confirm the mortgage continue button");
		Thread.sleep(5000);
		validatetitle();
		
		driver.findElement(By.xpath("//button[@name='submittedButton'][contains(.,'Continue')]")).click();
		logger.info("Clicked on Mortgage Illustration summary continue button");
		Thread.sleep(5000);
		validatetitle();
	}
	
	public void ConfirmthemortgageBTLRemo() throws InterruptedException
	{
		ConfirmthemortgageLTB();
	}
	
	public void ConfirmthemortgageLTB() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//label[@for='AcceptAVM-yes'][contains(.,'Yes')]")).click();
		logger.info("Our records indicate that the property is valued higher than the details provided by the applicant(s). Does/Do the applicant(s) wish to use our valuation of £750000?*");
		Thread.sleep(10000);
		
		Radiobutton("//label[@for='Fees_ProductFees_0__AddToLoan-false'][contains(.,'Pay on application')]");
		logger.info("How will this be paid?*");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@name='submittedButton'][contains(.,'Continue')]")).click();
		logger.info("Clicked on Confirm the mortgage continue button");
		Thread.sleep(5000);
		validatetitle();
		
		driver.findElement(By.xpath("//button[@name='submittedButton'][contains(.,'Continue')]")).click();
		logger.info("Clicked on Mortgage Illustration summary continue button");
		Thread.sleep(5000);
		validatetitle();
	}
}
