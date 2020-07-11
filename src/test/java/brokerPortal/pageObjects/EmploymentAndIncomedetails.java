package brokerPortal.pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import brokerPortal.testCases.BrokerPortalBaseClass;

public class EmploymentAndIncomedetails extends BrokerPortalBaseClass{
	
WebDriver driver;
	
	public EmploymentAndIncomedetails(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	public void EmploymentAndIncomedetailsResidentials() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Select dropdown1= new Select(driver.findElement(By.id("ApplicantCurrentEmploymentAndIncomes_0__EmploymentType")));
		dropdown1.selectByVisibleText("Employed - full time");	
		logger.info("ApplicantCurrentEmploymentAndIncomes_0__EmploymentType Employed - full time Selected");
		Thread.sleep(2000);
				
		driver.findElement(By.id("ApplicantCurrentEmploymentAndIncomes_0__EmploymentStartDate")).sendKeys("08/01/2010");
		logger.info("EmploymentStartDate Selected");
//		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[@for='ApplicantCurrentEmploymentAndIncomes_0__MainEmployment-yes'][contains(.,'Yes')]")).click();	
		logger.info("Is this the main employment?*");
//		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[@for='ApplicantCurrentEmploymentAndIncomes_0__ProbationaryGroup-no'][contains(.,'No')]")).click();	
		logger.info("Are you on a Zero Hours Contract or Fixed Term Contract?*");
//		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[@for='ApplicantCurrentEmploymentAndIncomes_0__IsIncomeExpectedToReduce-no'][contains(.,'No')]")).click();	
		logger.info("Is the applicant aware of any future changes to their income and expenditure that are likely to affect their ability to meet their mortgage payments?*");
//		Thread.sleep(2000);
		
		Select dropdown2= new Select(driver.findElement(By.id("ApplicantCurrentEmploymentAndIncomes_0__OccupationType")));
		dropdown2.selectByVisibleText("Managerial");	
		logger.info("Managerial Selected");
		Thread.sleep(2000);
		
		Select dropdown3= new Select(driver.findElement(By.id("ApplicantCurrentEmploymentAndIncomes_0__JobTitle")));
		dropdown3.selectByVisibleText("Agent - advertising");	
		logger.info("Agent - advertising Selected");
		Thread.sleep(2000);
		
		driver.findElement(By.id("ApplicantCurrentEmploymentAndIncomes_0__EmployerName")).sendKeys("Capita Softwares");
		logger.info("Phone no Selected");
//		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//label[@for='ApplicantCurrentEmploymentAndIncomes_0__EmployerAddress_Criteria_IsAddressInUkOrChannelIslands-yes'][contains(.,'Yes')]")).click();	
		logger.info("Is the address in the UK or Channel Islands?");
//		Thread.sleep(2000);
		
		driver.findElement(By.id("ApplicantCurrentEmploymentAndIncomes_0__EmployerAddress_Criteria_PostCode")).sendKeys("GL52 2NP");
		logger.info("Phone no Selected");
//		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[contains(@id,'ApplicantCurrentEmploymentAndIncomes_0__EmployerAddress_Criteria_findaddress')]")).click();	
		logger.info("Clicked on search button");
		Thread.sleep(2000);
		
		Select dropdown5= new Select(driver.findElement(By.id("ApplicantCurrentEmploymentAndIncomes_0__EmployerAddress_Criteria__addressLst")));
		dropdown5.selectByIndex(4);
		logger.info("Address Selected");
		Thread.sleep(2000);
		
		Selectdropdown("ApplicantCurrentEmploymentAndIncomes_0__EmployerAddress_AddressDetail_CountryCode", "United Kingdom");
		logger.info("Country Selected");
		
		Selectdropdown("ApplicantCurrentEmploymentAndIncomes_0__NatureOfBusiness", "Mining & Quarrying");
		logger.info("Mining & Quarrying Selected");
		
		driver.findElement(By.id("ApplicantCurrentEmploymentAndIncomes_0__BasicAnnualSalaryGross")).sendKeys("750000");
		logger.info("BasicAnnualSalaryGross Selected");
//		Thread.sleep(2000);
		
		Selectdropdown("ApplicantCurrentEmploymentAndIncomes_0__PaymentFrequency", "Monthly");
		logger.info("Monthly Selected");
		
		Selectdropdown("ApplicantCurrentEmploymentAndIncomes_0__PaymentMethod", "Direct to Bank / BACS");
		logger.info("Monthly Selected");
		
		driver.findElement(By.id("ApplicantCurrentEmploymentAndIncomes_0__Overtime")).sendKeys("2000");
		logger.info("Monthly overtime Selected");
//		Thread.sleep(2000);
		
		driver.findElement(By.id("ApplicantCurrentEmploymentAndIncomes_0__Commission")).sendKeys("10000");
		logger.info("Monthly commission Selected");
//		Thread.sleep(2000);
		
		driver.findElement(By.id("ApplicantCurrentEmploymentAndIncomes_0__Bonuses")).sendKeys("1500");
		logger.info("Monthly bonuses Selected");
//		Thread.sleep(2000);
		
		driver.findElement(By.id("ApplicantCurrentEmploymentAndIncomes_0__TotalNetMonthlyIncomeCurrent")).sendKeys("50000");
		logger.info("Typical net monthly (after tax and deductions Selected");
//		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[@for='HasOtherIncome-no'][contains(.,'No')]")).click();	
		logger.info("Does the applicant have other income that they receive?*");
//		Thread.sleep(2000);
		
		driver.findElement(By.id("RetirementAge")).sendKeys("66");
		logger.info("RetirementAge Selected");
//		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[contains(@id,'employmentDetailsContinueButton')]")).click();	
		logger.info("Clicked on continue on Employment and income details page");
		Thread.sleep(2000);
		validatetitle();
	}

	public void EmploymentAndIncomedetailsResidentialsApplicant2() throws InterruptedException
	{
		EmploymentAndIncomedetailsResidentials();
	}
	public void EmploymentAndIncomedetailsBTL() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Select dropdown1= new Select(driver.findElement(By.id("ApplicantCurrentEmploymentAndIncomes_0__EmploymentType")));
		dropdown1.selectByVisibleText("Employed - full time");	
		logger.info("ApplicantCurrentEmploymentAndIncomes_0__EmploymentType Employed - full time Selected");
		Thread.sleep(2000);
				
		driver.findElement(By.id("ApplicantCurrentEmploymentAndIncomes_0__EmploymentStartDate")).sendKeys("08/01/2010");
		logger.info("EmploymentStartDate Selected");
//		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[@for='ApplicantCurrentEmploymentAndIncomes_0__MainEmployment-yes'][contains(.,'Yes')]")).click();	
		logger.info("Is this the main employment?*");
//		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[@for='ApplicantCurrentEmploymentAndIncomes_0__ProbationaryGroup-no'][contains(.,'No')]")).click();	
		logger.info("Are you on a Zero Hours Contract or Fixed Term Contract?*");
		Thread.sleep(2000);
		
//		driver.findElement(By.xpath("//label[@for='ApplicantCurrentEmploymentAndIncomes_0__IsIncomeExpectedToReduce-no'][contains(.,'No')]")).click();	
//		logger.info("Is the applicant aware of any future changes to their income and expenditure that are likely to affect their ability to meet their mortgage payments?*");
//		Thread.sleep(2000);
		
		Select dropdown2= new Select(driver.findElement(By.id("ApplicantCurrentEmploymentAndIncomes_0__OccupationType")));
		dropdown2.selectByVisibleText("Managerial");	
		logger.info("Managerial Selected");
		Thread.sleep(2000);
		
		Select dropdown3= new Select(driver.findElement(By.id("ApplicantCurrentEmploymentAndIncomes_0__JobTitle")));
		dropdown3.selectByVisibleText("Agent - advertising");	
		logger.info("Agent - advertising Selected");
		Thread.sleep(2000);
		
		driver.findElement(By.id("ApplicantCurrentEmploymentAndIncomes_0__EmployerName")).sendKeys("Capita Softwares");
		logger.info("Employer / business name* Selected");
//		Thread.sleep(2000);
				
		driver.findElement(By.xpath("//label[@for='ApplicantCurrentEmploymentAndIncomes_0__EmployerAddress_Criteria_IsAddressInUkOrChannelIslands-yes'][contains(.,'Yes')]")).click();	
		logger.info("Is the address in the UK or Channel Islands?");
//		Thread.sleep(2000);
		
		driver.findElement(By.id("ApplicantCurrentEmploymentAndIncomes_0__EmployerAddress_Criteria_PostCode")).sendKeys("GL52 2NP");
		logger.info("Post code Selected");
//		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[contains(@id,'ApplicantCurrentEmploymentAndIncomes_0__EmployerAddress_Criteria_findaddress')]")).click();	
		logger.info("Clicked on search button");
		Thread.sleep(2000);
		
		Select dropdown5= new Select(driver.findElement(By.id("ApplicantCurrentEmploymentAndIncomes_0__EmployerAddress_Criteria__addressLst")));
		dropdown5.selectByIndex(4);
		logger.info("Address Selected");
		Thread.sleep(2000);
		
		Selectdropdown("ApplicantCurrentEmploymentAndIncomes_0__EmployerAddress_AddressDetail_CountryCode", "United Kingdom");
		logger.info("Country Selected");
		
		Selectdropdown("ApplicantCurrentEmploymentAndIncomes_0__NatureOfBusiness", "Mining & Quarrying");
		logger.info("Mining & Quarrying Selected");
		
		driver.findElement(By.id("ApplicantCurrentEmploymentAndIncomes_0__BasicAnnualSalaryGross")).sendKeys("150000");
		logger.info("BasicAnnualSalaryGross Selected");
//		Thread.sleep(2000);
		
		Selectdropdown("ApplicantCurrentEmploymentAndIncomes_0__PaymentFrequency", "Monthly");
		logger.info("Monthly Selected");
		
		Selectdropdown("ApplicantCurrentEmploymentAndIncomes_0__PaymentMethod", "Direct to Bank / BACS");
		logger.info("Direct to Bank / BACS Selected");
		
		
		  driver.findElement(By.id("ApplicantCurrentEmploymentAndIncomes_0__Overtime"))
		  .sendKeys("2000"); logger.info("Monthly overtime Selected"); //
		  Thread.sleep(2000);
		  
		  driver.findElement(By.id("ApplicantCurrentEmploymentAndIncomes_0__Commission"
		  )).sendKeys("10000"); logger.info("Monthly commission Selected"); //
		  Thread.sleep(2000);
		  
		  driver.findElement(By.id("ApplicantCurrentEmploymentAndIncomes_0__Bonuses")).
		  sendKeys("1500"); logger.info("Monthly bonuses Selected"); //
		  Thread.sleep(2000);
		  
		  driver.findElement(By.id(
		  "ApplicantCurrentEmploymentAndIncomes_0__TotalNetMonthlyIncomeCurrent")).
		  sendKeys("14000");
		  logger.info("Typical net monthly (after tax and deductions Selected"); //
		  Thread.sleep(2000);
		 		
//		driver.findElement(By.xpath("//label[@for='LowRateTaxPayer-no'][contains(.,'No')]")).click();	
//		logger.info("Are you a low rate tax payer?");
//		Thread.sleep(2000);
		
//		driver.findElement(By.xpath("//label[@for='HasOtherIncome-no'][contains(.,'No')]")).click();	
//		logger.info("Does the applicant have other income that they receive?*");
//		Thread.sleep(2000);
		
		driver.findElement(By.id("RetirementAge")).sendKeys("66");
		logger.info("RetirementAge Selected");
//		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[contains(@id,'employmentDetailsContinueButton')]")).click();	
		logger.info("Clicked on continue on BTL Employment and income details page");
		Thread.sleep(2000);
		validatetitle();
	}
	
	public void EmploymentAndIncomedetailsBTLRemo() throws InterruptedException
	{
		EmploymentAndIncomedetailsBTL();
	}
	
	public void EmploymentAndIncomedetailsLTB() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Select dropdown1= new Select(driver.findElement(By.id("ApplicantCurrentEmploymentAndIncomes_0__EmploymentType")));
		dropdown1.selectByVisibleText("Employed - full time");	
		logger.info("ApplicantCurrentEmploymentAndIncomes_0__EmploymentType Employed - full time Selected");
		Thread.sleep(2000);
				
		driver.findElement(By.id("ApplicantCurrentEmploymentAndIncomes_0__EmploymentStartDate")).sendKeys("08/01/2010");
		logger.info("EmploymentStartDate Selected");
//		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[@for='ApplicantCurrentEmploymentAndIncomes_0__MainEmployment-yes'][contains(.,'Yes')]")).click();	
		logger.info("Is this the main employment?*");
//		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[@for='ApplicantCurrentEmploymentAndIncomes_0__ProbationaryGroup-no'][contains(.,'No')]")).click();	
		logger.info("Are you on a Zero Hours Contract or Fixed Term Contract?*");
//		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[@for='ApplicantCurrentEmploymentAndIncomes_0__IsIncomeExpectedToReduce-no'][contains(.,'No')]")).click();	
		logger.info("Is the applicant aware of any future changes to their income and expenditure that are likely to affect their ability to meet their mortgage payments?*");
//		Thread.sleep(2000);
		
		Select dropdown2= new Select(driver.findElement(By.id("ApplicantCurrentEmploymentAndIncomes_0__OccupationType")));
		dropdown2.selectByVisibleText("Managerial");	
		logger.info("Managerial Selected");
		Thread.sleep(2000);
		
		Select dropdown3= new Select(driver.findElement(By.id("ApplicantCurrentEmploymentAndIncomes_0__JobTitle")));
		dropdown3.selectByVisibleText("Agent - advertising");	
		logger.info("Agent - advertising Selected");
		Thread.sleep(2000);
		
		driver.findElement(By.id("ApplicantCurrentEmploymentAndIncomes_0__EmployerName")).sendKeys("Capita Softwares");
		logger.info("Phone no Selected");
//		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//label[@for='ApplicantCurrentEmploymentAndIncomes_0__EmployerAddress_Criteria_IsAddressInUkOrChannelIslands-yes'][contains(.,'Yes')]")).click();	
		logger.info("Is the address in the UK or Channel Islands?");
//		Thread.sleep(2000);
		
		driver.findElement(By.id("ApplicantCurrentEmploymentAndIncomes_0__EmployerAddress_Criteria_PostCode")).sendKeys("GL52 2NP");
		logger.info("Phone no Selected");
//		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[contains(@id,'ApplicantCurrentEmploymentAndIncomes_0__EmployerAddress_Criteria_findaddress')]")).click();	
		logger.info("Clicked on search button");
		Thread.sleep(2000);
		
		Select dropdown5= new Select(driver.findElement(By.id("ApplicantCurrentEmploymentAndIncomes_0__EmployerAddress_Criteria__addressLst")));
		dropdown5.selectByIndex(4);
		logger.info("Address Selected");
		Thread.sleep(2000);
		
		Selectdropdown("ApplicantCurrentEmploymentAndIncomes_0__EmployerAddress_AddressDetail_CountryCode", "United Kingdom");
		logger.info("Country Selected");
		
		Selectdropdown("ApplicantCurrentEmploymentAndIncomes_0__NatureOfBusiness", "Mining & Quarrying");
		logger.info("Mining & Quarrying Selected");
		
		driver.findElement(By.id("ApplicantCurrentEmploymentAndIncomes_0__BasicAnnualSalaryGross")).sendKeys("150000");
		logger.info("BasicAnnualSalaryGross Selected");
//		Thread.sleep(2000);
		
		Selectdropdown("ApplicantCurrentEmploymentAndIncomes_0__PaymentFrequency", "Monthly");
		logger.info("Monthly Selected");
		
		Selectdropdown("ApplicantCurrentEmploymentAndIncomes_0__PaymentMethod", "Direct to Bank / BACS");
		logger.info("Direct to Bank / BACS Selected");
		
		driver.findElement(By.id("ApplicantCurrentEmploymentAndIncomes_0__Overtime")).sendKeys("2000");
		logger.info("Monthly overtime Selected");
//		Thread.sleep(2000);
		
		driver.findElement(By.id("ApplicantCurrentEmploymentAndIncomes_0__Commission")).sendKeys("10000");
		logger.info("Monthly commission Selected");
//		Thread.sleep(2000);
		
		driver.findElement(By.id("ApplicantCurrentEmploymentAndIncomes_0__Bonuses")).sendKeys("1500");
		logger.info("Monthly bonuses Selected");
//		Thread.sleep(2000);
		
		driver.findElement(By.id("ApplicantCurrentEmploymentAndIncomes_0__TotalNetMonthlyIncomeCurrent")).sendKeys("14000");
		logger.info("Typical net monthly (after tax and deductions Selected");
//		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[@for='HasOtherIncome-no'][contains(.,'No')]")).click();	
		logger.info("Does the applicant have other income that they receive?*");
//		Thread.sleep(2000);
		
		driver.findElement(By.id("RetirementAge")).sendKeys("66");
		logger.info("RetirementAge Selected");
//		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[contains(@id,'employmentDetailsContinueButton')]")).click();	
		logger.info("Clicked on continue on LTB Employment and income details page");
		Thread.sleep(2000);
		validatetitle();
	}
	
}
