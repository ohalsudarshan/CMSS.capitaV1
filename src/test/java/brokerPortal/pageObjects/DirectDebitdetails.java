package brokerPortal.pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import brokerPortal.testCases.BrokerPortalBaseClass;

public class DirectDebitdetails extends BrokerPortalBaseClass{
WebDriver driver;
	
	public DirectDebitdetails(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	public void DirectDebitdetailsResidential() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//label[contains(@class,'checkbox')]")).click();
		logger.info("At least one of the applicants is authorised to request Direct Debits from the account*");
		Thread.sleep(2000);
		
		Sendkeys("BankAccountHolderName", "Sudarshan Ohal");
		Sendkeys("BankSortCode", "99-99-99");
		Sendkeys("BankAccountNo", "8888888888");
		
		Selectdropdown("BankPreferredPaymentDate", "8");
		logger.info("Preferred payment date*");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[contains(@id,'directDebitFindBankButton')]")).click();
		logger.info("Find bank button clicked");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[contains(@id,'directDebitContinueButton')]")).click();
		logger.info("Clicked on Direct Debit details continue button");
		Thread.sleep(5000);
		validatetitle();		
	}
	
	public void DirectDebitdetailsResidentialMultiApplicant() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//label[contains(@class,'checkbox')]")).click();
		logger.info("At least one of the applicants is authorised to request Direct Debits from the account*");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[contains(@for,'LoanApplicantList_0')]")).click();
		logger.info("Who does this apply to?: Applicant 1 selected");
		Thread.sleep(2000);		
		
		Sendkeys("BankAccountHolderName", "Sudarshan Ohal");
		Sendkeys("BankSortCode", "99-99-99");
		Sendkeys("BankAccountNo", "8888888888");
		
		Selectdropdown("BankPreferredPaymentDate", "8");
		logger.info("Preferred payment date*");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[contains(@id,'directDebitFindBankButton')]")).click();
		logger.info("Find bank button clicked");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[contains(@id,'directDebitContinueButton')]")).click();
		logger.info("Clicked on Direct Debit details continue button");
		Thread.sleep(5000);
		validatetitle();		
	}
	
	public void DirectDebitdetailsBTL() throws InterruptedException
	{
		DirectDebitdetailsResidential();
	}
	
	public void DirectDebitdetailsLTB() throws InterruptedException
	{
		DirectDebitdetailsResidential();
	}
}
