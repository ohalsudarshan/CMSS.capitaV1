package brokerPortal.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import brokerPortal.testCases.BrokerPortalBaseClass;

public class Summaryandnextsteps extends BrokerPortalBaseClass{

WebDriver driver;
	
	public Summaryandnextsteps(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	public void SummaryandnextstepsResidential() throws InterruptedException
	{
		driver.findElement(By.xpath("//label[contains(@for,'DiPConfirmed')]")).click();	
		logger.info("I can confirm that the applicant(s) have been given the Credit Reference Check information stated above.");
//		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@name='submittedButton'][contains(.,'Continue')]")).click();	
		logger.info("Clicked on continue on Summaryandnextsteps page");
		Thread.sleep(5000);
		validatetitle();
		
		driver.findElement(By.id("dipSuccessContinueButton")).click();	
		logger.info("DIP Completed");
		Thread.sleep(5000);
		validatetitle();
	}
	
	public void SummaryandnextstepsBTL() throws InterruptedException
	{
		SummaryandnextstepsResidential();
	}
	
	public void SummaryandnextstepsBTLRemo() throws InterruptedException
	{
		SummaryandnextstepsResidential();
	}
	
	public void SummaryandnextstepsLTB() throws InterruptedException
	{
		SummaryandnextstepsResidential();
	}
	
}
