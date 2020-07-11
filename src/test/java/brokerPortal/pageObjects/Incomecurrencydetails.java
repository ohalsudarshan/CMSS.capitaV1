package brokerPortal.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import brokerPortal.testCases.BrokerPortalBaseClass;

public class Incomecurrencydetails extends BrokerPortalBaseClass {
WebDriver driver;
	
	public Incomecurrencydetails(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	public void IncomecurrencydetailsResidential() throws InterruptedException
	{
		Thread.sleep(3000);
		String ApplicationNumber= driver.findElement(By.id("appNumContainer")).getText();
		System.out.println("Application Number: " +ApplicationNumber);
		
		driver.findElement(By.xpath("//label[@for='ForeignIncomeCurrencyInd-no'][contains(.,'No')]")).click();	
		logger.info("Does any applicant receive income in any currency other than pound sterling (GBP)?");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[contains(@id,'PersonalDetailsIncomeCurrencyContinueButton')]")).click();	
		logger.info("Clicked on continue on Income currency details page");
		Thread.sleep(2000);
		validatetitle();
	}
	
	public void IncomecurrencydetailsBTL() throws InterruptedException
	{
		IncomecurrencydetailsResidential();
	}
	
	public void IncomecurrencydetailsBTLRemo() throws InterruptedException
	{
		IncomecurrencydetailsResidential();
	}
	
	public void IncomecurrencydetailsLTB() throws InterruptedException
	{
		IncomecurrencydetailsResidential();
	}
}
