package brokerPortal.pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import brokerPortal.testCases.BrokerPortalBaseClass;

public class Financialcommitments extends BrokerPortalBaseClass{

WebDriver driver;
	
	public Financialcommitments(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	public void FinancialcommitmentsResidential() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//label[@for='CardIndicator-no'][contains(.,'No')]")).click();	
		logger.info("Do the applicant(s) have any credit cards or store cards?*");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[@for='LoanIndicator-no'][contains(.,'No')]")).click();	
		logger.info("Do the applicant(s) have any loans or hire purchase agreements?*");
//		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[@for='AnyOtherBTLProperties_ExistingMortgage-no'][contains(.,'No')]")).click();	
		logger.info("Does the applicant(s) have any BTL properties with an existing mortgage?*");
		
		/*
		 * driver.findElement(By.xpath(
		 * "//label[@for='AnyOtherUBTLPropertiesNew-no'][contains(.,'No')]")).click();
		 * logger.info("Does the applicant(s) have any unencumbered BTL properties?*");
		 * // Thread.sleep(2000);
		 * 
		 * driver.findElement(By.xpath(
		 * "//label[@for='AnyOtherBTLProperties_ExistingMortgage-no'][contains(.,'No')]"
		 * )).click(); logger.
		 * info("Does the applicant(s) have any BTL properties with an existing mortgage?*"
		 * ); // Thread.sleep(2000);
		 */		
		driver.findElement(By.xpath("//label[@for='AnyOtherResidentialProperties_ExistingMortgage-no'][contains(.,'No')]")).click();	
		logger.info("Does the applicant(s) have any other residential properties?*");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[@for='AnyOtherExistingResidentialMortgage-no'][contains(.,'No')]")).click();	
		logger.info("Does the applicant(s) have any existing residential mortgages?*");
//		Thread.sleep(2000);
		
		Selectdropdown("DepositDetails_0__Source", "Savings");
		logger.info("Source of deposit for mortgage*");
		Thread.sleep(2000);
		
		driver.findElement(By.id("DepositDetails_0__Amount")).sendKeys("30000");
		logger.info("Source of deposit amount*");
//		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[@for='HasConnectedParties-no'][contains(.,'No')]")).click();	
		logger.info("Are there any connected parties associated to the applicant(s) and their account(s)?*");
//		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[contains(@id,'commitmentsContinueButton')]")).click();	
		logger.info("Clicked on continue on Financial commitments page");
		Thread.sleep(3000);
		validatetitle();
		
		
	}
	
	public void FinancialcommitmentsBTL() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//label[@for='CardIndicator-no'][contains(.,'No')]")).click();	
		logger.info("Do the applicant(s) have any credit cards or store cards?*");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[@for='LoanIndicator-no'][contains(.,'No')]")).click();	
		logger.info("Do the applicant(s) have any loans or hire purchase agreements?*");
//		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[@for='AnyOtherUBTLPropertiesNew-no'][contains(.,'No')]")).click();	
		logger.info("Does the applicant(s) have any unencumbered BTL properties?*");
//		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[@for='AnyOtherBTLProperties_ExistingMortgage-no'][contains(.,'No')]")).click();	
		logger.info("Does the applicant(s) have any BTL properties with an existing mortgage?*");
//		Thread.sleep(2000);
		
		
		
		
		
//		driver.findElement(By.xpath("//label[@for='AnyOtherResidentialProperties_ExistingMortgage-no'][contains(.,'No')]")).click();	
//		logger.info("Does the applicant(s) have any other residential properties?*");
//		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[@for='AnyOtherExistingResidentialMortgage-no'][contains(.,'No')]")).click();	
		logger.info("Does the applicant(s) have any existing residential mortgages?*");
//		Thread.sleep(2000);
		
		Selectdropdown("DepositDetails_0__Source", "Savings");
		logger.info("Source of deposit for mortgage*");
		Thread.sleep(2000);
		
		driver.findElement(By.id("DepositDetails_0__Amount")).sendKeys("30000");
		logger.info("Source of deposit amount*");
//		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[@for='HasConnectedParties-no'][contains(.,'No')]")).click();	
		logger.info("Are there any connected parties associated to the applicant(s) and their account(s)?*");
//		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[contains(@id,'commitmentsContinueButton')]")).click();	
		logger.info("Clicked on continue on Financial commitments page");
		Thread.sleep(3000);
		validatetitle();
	
	}
	
	public void FinancialcommitmentsBTLRemo() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//label[@for='CardIndicator-no'][contains(.,'No')]")).click();	
		logger.info("Do the applicant(s) have any credit cards or store cards?*");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[@for='LoanIndicator-no'][contains(.,'No')]")).click();	
		logger.info("Do the applicant(s) have any loans or hire purchase agreements?*");
//		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[@for='AnyOtherUBTLPropertiesNew-no'][contains(.,'No')]")).click();	
		logger.info("Does the applicant(s) have any unencumbered BTL properties?*");
//		Thread.sleep(2000);
			
		Sendkeys("ExistingBTLMortgages_0__LenderName", "HDFC");
//		Sendkeys("ExistingResidentialMortgages_0__ReferenceNumber", "6666666666");
		Sendkeys("ExistingBTLMortgages_0__MonthlyPayment", "625");
		Sendkeys("ExistingBTLMortgages_0__MonthlyRentalIncome", "900");
//		Sendkeys("ExistingResidentialMortgages_0__StartDate", "08/01/2010");
		
		logger.info("Existing mortgage details updated");
		
		driver.findElement(By.xpath("//label[@for='ExistingBTLMortgages_0__HasConnectedPartiesCommitmentCheck-no'][contains(.,'No')]")).click();	
		logger.info("Are there any connected parties other than the applicant(s) that are associated to this credit commitment?");
//		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[@for='AnyOtherExistingResidentialMortgage-no'][contains(.,'No')]")).click();	
		logger.info("Does the applicant(s) have any existing residential mortgages?*");
//		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[@for='HasConnectedParties-no'][contains(.,'No')]")).click();	
		logger.info("Are there any connected parties associated to the applicant(s) and their account(s)?*");
//		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[contains(@id,'commitmentsContinueButton')]")).click();	
		logger.info("Clicked on continue on Financial commitments page");
		Thread.sleep(3000);
		validatetitle();
	
	}
	
	
	public void FinancialcommitmentsLTB() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//label[@for='CardIndicator-no'][contains(.,'No')]")).click();	
		logger.info("Do the applicant(s) have any credit cards or store cards?*");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[@for='LoanIndicator-no'][contains(.,'No')]")).click();	
		logger.info("Do the applicant(s) have any loans or hire purchase agreements?*");
//		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[@for='AnyOtherUBTLPropertiesNew-no'][contains(.,'No')]")).click();	
		logger.info("Does the applicant(s) have any unencumbered BTL properties?*");
//		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[@for='AnyOtherBTLProperties_ExistingMortgage-no'][contains(.,'No')]")).click();	
		logger.info("Does the applicant(s) have any BTL properties with an existing mortgage?*");
//		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[@for='AnyOtherResidentialProperties_ExistingMortgage-no'][contains(.,'No')]")).click();	
		logger.info("Does the applicant(s) have any other residential properties?*");
		Thread.sleep(2000);
		
//		driver.findElement(By.xpath("//label[@for='AnyOtherExistingResidentialMortgage-no'][contains(.,'No')]")).click();	
//		logger.info("Does the applicant(s) have any existing residential mortgages?*");
//		Thread.sleep(2000);
		
		Sendkeys("ExistingResidentialMortgages_0__LenderName", "HDFC");
		Sendkeys("ExistingResidentialMortgages_0__ReferenceNumber", "6666666666");
		Sendkeys("ExistingResidentialMortgages_0__MonthlyPayment", "625");
		Sendkeys("ExistingResidentialMortgages_0__StartDate", "08/01/2010");
		
		logger.info("Existing mortgage details updated");
		
		Selectdropdown("ExistingResidentialMortgages_0__OriginalTerm_Year", "10 years");
		logger.info("OriginalTerm_Year updated");
		Selectdropdown("ExistingResidentialMortgages_0__OriginalTerm_Month", "10 months");
		logger.info("OriginalTerm_Month updated");
		
		/*
		 * Selectdropdown("DepositDetails_0__Source", "Savings");
		 * logger.info("Source of deposit for mortgage*"); Thread.sleep(2000);
		 * 
		 * driver.findElement(By.id("DepositDetails_0__Amount")).sendKeys("30000");
		 * logger.info("Source of deposit amount*"); // Thread.sleep(2000);
		 */		
		
		driver.findElement(By.xpath("//label[@for='ExistingResidentialMortgages_0__HasConnectedPartiesCommitmentCheck-no']")).click();	
		logger.info("Are there any connected parties other than the applicant(s) that are associated to this credit commitment?*");
		
		driver.findElement(By.xpath("//label[@for='HasConnectedParties-no'][contains(.,'No')]")).click();	
		logger.info("Are there any connected parties associated to the applicant(s) and their account(s)?*");
//		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[contains(@id,'commitmentsContinueButton')]")).click();	
		logger.info("Clicked on continue on Financial commitments LTB page");
		Thread.sleep(3000);
		validatetitle();
	}
	
}
