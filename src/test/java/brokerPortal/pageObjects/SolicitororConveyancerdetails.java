package brokerPortal.pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import brokerPortal.testCases.BrokerPortalBaseClass;

public class SolicitororConveyancerdetails extends BrokerPortalBaseClass{
	
WebDriver driver;
	
	public SolicitororConveyancerdetails(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	public void SolicitororConveyancerdetailsResidential() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(3000);
		Radiobutton("//label[@for='RequiresLegalAdvice-no'][contains(.,'No')]");
		logger.info("Please confirm if Independent Legal Advice is required for any parties to this application?*");
		Thread.sleep(3000);
		
		Sendkeys("SolicitorSearchFirmName", "Capita");
		
		driver.findElement(By.xpath("//button[contains(@id,'searchSolicitorsButton')]")).click();
		logger.info("Clicked on searchSolicitorsButton");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//span[@class='productSelectButton'][contains(.,'Select')])[1]")).click();
		logger.info("Capita Legal Services 1 selected");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[contains(@id,'solicitorContinueButton')]")).click();
		logger.info("Clicked on Solicitor or Conveyancer details continue button");
		Thread.sleep(5000);
		validatetitle();
	}

	public void SolicitororConveyancerdetailsBTL() throws InterruptedException
	{
		SolicitororConveyancerdetailsResidential();
	}
	
	public void SolicitororConveyancerdetailsBTLRemo() throws InterruptedException
	{
		SolicitororConveyancerdetailsLTB();
	}
	
	public void SolicitororConveyancerdetailsLTB() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(3000);
		Radiobutton("//label[@for='SolicitorExists-no'][contains(.,'No')]");
		logger.info("Does the applicant(s) wish to have a conveyancer allocated by HSBC on our assisted legal fees package?*");
		Thread.sleep(3000);
		
		Thread.sleep(3000);
		Radiobutton("//label[@for='RequiresLegalAdvice-no'][contains(.,'No')]");
		logger.info("Please confirm if Independent Legal Advice is required for any parties to this application?*");
		Thread.sleep(3000);
		
		Thread.sleep(3000);
		Radiobutton("//label[@for='MortgageIncludesTransferOfEquity-no'][contains(.,'No')]");
		logger.info("Does this mortgage include a Transfer of Equity?*");
		Thread.sleep(3000);
		
		Sendkeys("SolicitorSearchFirmName", "Capita");
		
		driver.findElement(By.xpath("//button[contains(@id,'searchSolicitorsButton')]")).click();
		logger.info("Clicked on searchSolicitorsButton");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//span[@class='productSelectButton'][contains(.,'Select')])[1]")).click();
		logger.info("Capita Legal Services 1 selected");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[contains(@id,'solicitorContinueButton')]")).click();
		logger.info("Clicked on Solicitor or Conveyancer details continue button");
		Thread.sleep(5000);
		validatetitle();
	}
}
