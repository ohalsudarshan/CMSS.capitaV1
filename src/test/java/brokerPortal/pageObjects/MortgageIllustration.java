package brokerPortal.pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.server.handler.GetTitle;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import brokerPortal.testCases.BrokerPortalBaseClass;

public class MortgageIllustration extends BrokerPortalBaseClass{
	
WebDriver driver;
	
	public MortgageIllustration(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	public void MortgageIllustrationResidential() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//label[@for='IsJointApplication-no'][contains(.,'No')]")).click();	
		System.out.println("Is this a joint application?*");
		Thread.sleep(2000);
		
		setTitle("Dr");
		logger.info("Title Selected");
//		Thread.sleep(3000);
		
		String firstname=randomString();
		String midname=randomString();
		String lastname=randomString();
		
		driver.findElement(By.id("Applicants_0__FirstName")).sendKeys(firstname);
		driver.findElement(By.id("Applicants_0__MiddleName")).sendKeys(midname);
		driver.findElement(By.id("Applicants_0__Surname")).sendKeys(lastname);
		
		driver.findElement(By.xpath("//label[@for='Applicants_0__IsCurrentAccountHolder-no'][contains(.,'No')]")).click();	
		System.out.println("Does the applicant have an existing relationship with HSBC?*");
		Thread.sleep(2000);
//		ScrollByPixel();
		
		Thread.sleep(2000);
		
		SelectApplicationType("Purchase");
		/*
		 * Select dropdown2= new Select(driver.findElement(By.id("ApplicationType")));
		 * dropdown2.selectByVisibleText("Purchase");
		 * logger.info("Application Type Purchase Selected"); // Thread.sleep(3000);
		 */		
		ScrollByPixel();
		Select dropdown14= new Select(driver.findElement(By.id("BuyerType")));
		dropdown14.selectByVisibleText("First Time Buyer");	
		logger.info("BuyerType First Time Buyer Selected");
		
//		Select dropdown14= new Select(driver.findElement(By.id("BuyerType")));
//		dropdown14.selectByVisibleText("Homemover/Buy new property");	
//		logger.info("BuyerType First Time Buyer Selected");
		
//		Thread.sleep(2000);
		
//		Select dropdown3= new Select(driver.findElement(By.id("ApplicationType")));
//		dropdown3.selectByVisibleText("Remortgage");	
//		logger.info("Application Type Remortgage Selected");
//		Thread.sleep(3000);
		
		Select dropdown4= new Select(driver.findElement(By.id("ResidenceType")));
		dropdown4.selectByVisibleText("Primary Residence");	
		logger.info("ResidenceType Primary Residence Selected");
//		Thread.sleep(2000);
		
//		Select dropdown5= new Select(driver.findElement(By.id("ResidenceType")));
//		dropdown5.selectByVisibleText("Secondary Residence)");	
//		logger.info("ResidenceType Secondary Residence Selected");
//		Thread.sleep(2000);
		
		driver.findElement(By.id("LoanAmount")).sendKeys("70000");
		driver.findElement(By.id("PurchasePrice")).sendKeys("100000");
		
		driver.findElement(By.xpath("//label[@for='HasPropertyInMind-yes'][contains(.,'Yes')]")).click();	
		logger.info("Has the applicant chosen a property?*");
//		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[@for='IsNewBuild-no'][contains(.,'No')]")).click();	
		logger.info("Is the property a new build (less than 2 years old)?*");
//		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//label[@for='IsPurchasedAtDiscountFromFamily-no'][contains(.,'No')]")).click();	
		logger.info("Is the applicant purchasing the property at a discount from a family member, relative or other individual/firm?*");
//		Thread.sleep(2000);
		
		
		Select dropdown5= new Select(driver.findElement(By.id("PropertyLocation")));
		dropdown5.selectByVisibleText("England and Wales");	
		logger.info("England and Wales Selected");
//		Thread.sleep(2000);
		
//		Select dropdown6= new Select(driver.findElement(By.id("PropertyLocation")));
//		dropdown6.selectByVisibleText("Scotland");	
//		logger.info("Scotland Selected");
//		Thread.sleep(2000);
		
//		Select dropdown7= new Select(driver.findElement(By.id("PropertyLocation")));
//		dropdown7.selectByVisibleText("N Ireland");	
//		logger.info("N Ireland Selected");
//		Thread.sleep(2000);
		
		Select dropdown8= new Select(driver.findElement(By.id("PropertyRegion")));
		dropdown8.selectByVisibleText("London");	
		logger.info("London Selected");
//		Thread.sleep(2000);
		
		Select dropdown9= new Select(driver.findElement(By.id("PropertyType")));
		dropdown9.selectByVisibleText("House");	
		logger.info("PropertyType House Selected");
//		Thread.sleep(2000);
		
		
		//Product details
		
		driver.findElement(By.xpath("//label[@for='IsMultiComponent-no'][contains(.,'No')]")).click();	
		logger.info("Is the mortgage a multi-part loan?*");
//		Thread.sleep(2000);
		
		Select dropdown10= new Select(driver.findElement(By.id("LoanComponents_0__RepaymentType")));
		dropdown10.selectByVisibleText("Capital repayment");	
		logger.info("Capital repayment Selected");
//		Thread.sleep(2000);
		
		Select dropdown11= new Select(driver.findElement(By.id("LoanComponents_0__ProductType")));
		dropdown11.selectByVisibleText("Fixed");	
		logger.info("Fixed Selected");
//		Thread.sleep(2000);
		
		Select dropdown12= new Select(driver.findElement(By.id("LoanComponents_0__Term_Years")));
		dropdown12.selectByVisibleText("15");	
		logger.info("Loan term selected");
//		Thread.sleep(2000);
		
		Select dropdown13= new Select(driver.findElement(By.id("LoanComponents_0__Term_Months")));
		dropdown13.selectByVisibleText("1");	
		logger.info("Loan month selected");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@type='button'][contains(.,'Find products')]")).click();	
		logger.info("Clicked on find products");
		Thread.sleep(5000);
		
//		driver.findElement(By.xpath("(//strong[contains(.,'Test1 -  2 Year fixed with cash back')])[1]")).click();	
//		logger.info("Test1 -  2 Year fixed with cash back product Selected");
//		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//span[@class='productSelectButton'][contains(.,'Select')])[1]")).click();	
		logger.info("Test1 -  2 Year fixed with cash back product Selected");
		Thread.sleep(2000);
		
		
		
		driver.findElement(By.xpath("//label[@for='Fees_ProductFees_0__AddToLoan-false'][contains(.,'Pay on application')]")).click();	
		logger.info("Pay on application Selected");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@name='submittedButton'][contains(.,'Continue')]")).click();	
		logger.info("Clicked on continue");
		Thread.sleep(3000);
		validatetitle();
		
		driver.findElement(By.xpath("//button[@name='submittedButton'][contains(.,'Continue')]")).click();	
		logger.info("Clicked on Mortgage Illustration summary continue");
		Thread.sleep(2000);
		validatetitle();
		
	}
	
	public void MortgageIllustrationResidentialMultiApplicant() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//label[@for='IsJointApplication-yes'][contains(.,'Yes')]")).click();	
		System.out.println("Is this a joint application?*");
		Thread.sleep(2000);
		
		logger.info("First applicant details");
		
		Select dropdown1= new Select(driver.findElement(By.id("Applicants_0__Title")));
		dropdown1.selectByVisibleText("Mr");	
		logger.info("Title Selected");
//		Thread.sleep(3000);
		
		String firstname=randomString();
		String midname=randomString();
		String lastname=randomString();
		
		driver.findElement(By.id("Applicants_0__FirstName")).sendKeys(firstname);
		driver.findElement(By.id("Applicants_0__MiddleName")).sendKeys(midname);
		driver.findElement(By.id("Applicants_0__Surname")).sendKeys(lastname);
		
		driver.findElement(By.xpath("//label[@for='Applicants_0__IsCurrentAccountHolder-no'][contains(.,'No')]")).click();	
		System.out.println("Does the applicant have an existing relationship with HSBC?*");
		Thread.sleep(2000);
//		ScrollByPixel();
		
		logger.info("First applicant details updated");
		logger.info("second applicant details");
		
		Selectdropdown("Applicants_1__Title", "Mr");	
		logger.info("Title applicant 2 Selected");
//		Thread.sleep(3000);
		
		String firstname2=randomString();
		String midname2=randomString();
		String lastname2=randomString();
		
		driver.findElement(By.id("Applicants_1__FirstName")).sendKeys(firstname2);
		driver.findElement(By.id("Applicants_1__MiddleName")).sendKeys(midname2);
		driver.findElement(By.id("Applicants_1__Surname")).sendKeys(lastname2);
		
		driver.findElement(By.xpath("//label[@for='Applicants_1__IsCurrentAccountHolder-no'][contains(.,'No')]")).click();	
		System.out.println("Does the applicant 2 have an existing relationship with HSBC?*");
		Thread.sleep(2000);
		
		logger.info("Second applicant details updated");

		Select dropdown2= new Select(driver.findElement(By.id("ApplicationType")));
		dropdown2.selectByVisibleText("Purchase");	
		logger.info("Application Type Purchase Selected");
//		Thread.sleep(3000);
		
		Select dropdown14= new Select(driver.findElement(By.id("BuyerType")));
		dropdown14.selectByVisibleText("First Time Buyer");	
		logger.info("BuyerType First Time Buyer Selected");
//		Thread.sleep(2000);
		
//		Select dropdown3= new Select(driver.findElement(By.id("ApplicationType")));
//		dropdown3.selectByVisibleText("Remortgage");	
//		logger.info("Application Type Remortgage Selected");
//		Thread.sleep(3000);
		
		Select dropdown4= new Select(driver.findElement(By.id("ResidenceType")));
		dropdown4.selectByVisibleText("Primary Residence");	
		logger.info("ResidenceType Primary Residence Selected");
//		Thread.sleep(2000);
		
//		Select dropdown5= new Select(driver.findElement(By.id("ResidenceType")));
//		dropdown5.selectByVisibleText("Secondary Residence)");	
//		logger.info("ResidenceType Secondary Residence Selected");
//		Thread.sleep(2000);
		
		driver.findElement(By.id("LoanAmount")).sendKeys("70000");
		driver.findElement(By.id("PurchasePrice")).sendKeys("100000");
		
		driver.findElement(By.xpath("//label[@for='HasPropertyInMind-yes'][contains(.,'Yes')]")).click();	
		logger.info("Has the applicant chosen a property?*");
//		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[@for='IsNewBuild-no'][contains(.,'No')]")).click();	
		logger.info("Is the property a new build (less than 2 years old)?*");
//		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//label[@for='IsPurchasedAtDiscountFromFamily-no'][contains(.,'No')]")).click();	
		logger.info("Is the applicant purchasing the property at a discount from a family member, relative or other individual/firm?*");
//		Thread.sleep(2000);
		
		
		Select dropdown5= new Select(driver.findElement(By.id("PropertyLocation")));
		dropdown5.selectByVisibleText("England and Wales");	
		logger.info("England and Wales Selected");
//		Thread.sleep(2000);
		
//		Select dropdown6= new Select(driver.findElement(By.id("PropertyLocation")));
//		dropdown6.selectByVisibleText("Scotland");	
//		logger.info("Scotland Selected");
//		Thread.sleep(2000);
		
//		Select dropdown7= new Select(driver.findElement(By.id("PropertyLocation")));
//		dropdown7.selectByVisibleText("N Ireland");	
//		logger.info("N Ireland Selected");
//		Thread.sleep(2000);
		
		Select dropdown8= new Select(driver.findElement(By.id("PropertyRegion")));
		dropdown8.selectByVisibleText("London");	
		logger.info("London Selected");
//		Thread.sleep(2000);
		
		Select dropdown9= new Select(driver.findElement(By.id("PropertyType")));
		dropdown9.selectByVisibleText("House");	
		logger.info("PropertyType House Selected");
//		Thread.sleep(2000);
		
		
		//Product details
		
		driver.findElement(By.xpath("//label[@for='IsMultiComponent-no'][contains(.,'No')]")).click();	
		logger.info("Is the mortgage a multi-part loan?*");
//		Thread.sleep(2000);
		
		Select dropdown10= new Select(driver.findElement(By.id("LoanComponents_0__RepaymentType")));
		dropdown10.selectByVisibleText("Capital repayment");	
		logger.info("Capital repayment Selected");
//		Thread.sleep(2000);
		
		Select dropdown11= new Select(driver.findElement(By.id("LoanComponents_0__ProductType")));
		dropdown11.selectByVisibleText("Fixed");	
		logger.info("Fixed Selected");
//		Thread.sleep(2000);
		
		Select dropdown12= new Select(driver.findElement(By.id("LoanComponents_0__Term_Years")));
		dropdown12.selectByVisibleText("15");	
		logger.info("Loan term selected");
//		Thread.sleep(2000);
		
		Select dropdown13= new Select(driver.findElement(By.id("LoanComponents_0__Term_Months")));
		dropdown13.selectByVisibleText("1");	
		logger.info("Loan month selected");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@type='button'][contains(.,'Find products')]")).click();	
		logger.info("Clicked on find products");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//strong[contains(.,'Test1 -  2 Year fixed with cash back')])[1]")).click();	
		logger.info("Test1 -  2 Year fixed with cash back product Selected");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[@for='Fees_ProductFees_0__AddToLoan-false'][contains(.,'Pay on application')]")).click();	
		logger.info("Pay on application Selected");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@name='submittedButton'][contains(.,'Continue')]")).click();	
		logger.info("Clicked on continue");
		Thread.sleep(3000);
		validatetitle();
		
		driver.findElement(By.xpath("//button[@name='submittedButton'][contains(.,'Continue')]")).click();	
		logger.info("Clicked on Mortgage Illustration summary continue");
		Thread.sleep(2000);
		validatetitle();
		
	}
	
	public void MortgageIllustrationBTL() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//label[@for='IsJointApplication-no'][contains(.,'No')]")).click();	
		System.out.println("Is this a joint application?*");
		Thread.sleep(2000);
		
		Select dropdown1= new Select(driver.findElement(By.id("Applicants_0__Title")));
		dropdown1.selectByVisibleText("Mr");	
		logger.info("Title Selected");
//		Thread.sleep(3000);
		
		String firstname=randomString();
		String midname=randomString();
		String lastname=randomString();
		
		driver.findElement(By.id("Applicants_0__FirstName")).sendKeys(firstname);
		driver.findElement(By.id("Applicants_0__MiddleName")).sendKeys(midname);
		driver.findElement(By.id("Applicants_0__Surname")).sendKeys(lastname);
		
		driver.findElement(By.xpath("//label[@for='Applicants_0__IsCurrentAccountHolder-no'][contains(.,'No')]")).click();	
		System.out.println("Does the applicant have an existing relationship with HSBC?*");
		Thread.sleep(2000);
		ScrollByPixel();
		
		Thread.sleep(2000);
		
		Select dropdown2= new Select(driver.findElement(By.id("ApplicationType")));
		dropdown2.selectByVisibleText("Purchase");	
		logger.info("Application Type Purchase Selected");
		Thread.sleep(2000);
		
//		Select dropdown14= new Select(driver.findElement(By.id("BuyerType")));
//		dropdown14.selectByVisibleText("First Time Buyer");	
//		logger.info("BuyerType First Time Buyer Selected");
//		Thread.sleep(2000);
		
//		Select dropdown3= new Select(driver.findElement(By.id("ApplicationType")));
//		dropdown3.selectByVisibleText("Remortgage");	
//		logger.info("Application Type Remortgage Selected");
//		Thread.sleep(3000);
		
//		Select dropdown4= new Select(driver.findElement(By.id("ResidenceType")));
//		dropdown4.selectByVisibleText("Primary Residence");	
//		logger.info("ResidenceType Primary Residence Selected");
//		Thread.sleep(2000);
		
//		Select dropdown5= new Select(driver.findElement(By.id("ResidenceType")));
//		dropdown5.selectByVisibleText("Secondary Residence)");	
//		logger.info("ResidenceType Secondary Residence Selected");
//		Thread.sleep(2000);
		
		driver.findElement(By.id("LoanAmount")).sendKeys("70000");
		driver.findElement(By.id("PurchasePrice")).sendKeys("100000");
		
		driver.findElement(By.xpath("//label[@for='HasPropertyInMind-yes'][contains(.,'Yes')]")).click();	
		logger.info("Has the applicant chosen a property?*");
//		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[@for='IsNewBuild-no'][contains(.,'No')]")).click();	
		logger.info("Is the property a new build (less than 2 years old)?*");
//		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//label[@for='IsPurchasedAtDiscountFromFamily-no'][contains(.,'No')]")).click();	
		logger.info("Is the applicant purchasing the property at a discount from a family member, relative or other individual/firm?*");
//		Thread.sleep(2000);
		
		
		Select dropdown5= new Select(driver.findElement(By.id("PropertyLocation")));
		dropdown5.selectByVisibleText("England and Wales");	
		logger.info("England and Wales Selected");
//		Thread.sleep(2000);
		
//		Select dropdown6= new Select(driver.findElement(By.id("PropertyLocation")));
//		dropdown6.selectByVisibleText("Scotland");	
//		logger.info("Scotland Selected");
//		Thread.sleep(2000);
		
//		Select dropdown7= new Select(driver.findElement(By.id("PropertyLocation")));
//		dropdown7.selectByVisibleText("N Ireland");	
//		logger.info("N Ireland Selected");
//		Thread.sleep(2000);
		
		Select dropdown8= new Select(driver.findElement(By.id("PropertyRegion")));
		dropdown8.selectByVisibleText("London");	
		logger.info("London Selected");
//		Thread.sleep(2000);
		
		Select dropdown9= new Select(driver.findElement(By.id("PropertyType")));
		dropdown9.selectByVisibleText("House");	
		logger.info("PropertyType House Selected");
//		Thread.sleep(2000);
		
		
		//Product details
		
		
//		ProductSelectionMultiComponant();
		
		
		  driver.findElement(By.xpath(
		  "//label[@for='IsMultiComponent-no'][contains(.,'No')]")).click();
		  logger.info("Is the mortgage a multi-part loan?*"); // Thread.sleep(2000);
		  
		  Select dropdown10= new
		  Select(driver.findElement(By.id("LoanComponents_0__RepaymentType")));
		  dropdown10.selectByVisibleText("Capital repayment");
		  logger.info("Capital repayment Selected"); // Thread.sleep(2000);
		  
		  Select dropdown11= new
		  Select(driver.findElement(By.id("LoanComponents_0__ProductType")));
		  dropdown11.selectByVisibleText("Fixed"); logger.info("Fixed Selected"); //
		  Thread.sleep(2000);
		  
		  Select dropdown12= new
		  Select(driver.findElement(By.id("LoanComponents_0__Term_Years")));
		  dropdown12.selectByVisibleText("15"); logger.info("Loan term selected"); //
		  Thread.sleep(2000);
		  
		  Select dropdown13= new
		  Select(driver.findElement(By.id("LoanComponents_0__Term_Months")));
		  dropdown13.selectByVisibleText("1"); logger.info("Loan month selected");
		  Thread.sleep(2000);
		  
		  driver.findElement(By.
		  xpath("//button[@type='button'][contains(.,'Find products')]")).click();
		  logger.info("Clicked on find products"); Thread.sleep(5000);
		  
		  driver.findElement(By.
		  xpath("(//strong[contains(.,'Test1 -  2 Year fixed with cash back')])[1]")).
		  click();
		  logger.info("Test1 -  2 Year fixed with cash back product Selected");
		  Thread.sleep(2000);
		 
		
		driver.findElement(By.xpath("//label[@for='Fees_ProductFees_0__AddToLoan-false'][contains(.,'Pay on application')]")).click();	
		logger.info("Pay on application Selected");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@name='submittedButton'][contains(.,'Continue')]")).click();	
		logger.info("Clicked on continue");
		Thread.sleep(3000);
		validatetitle();
		
		driver.findElement(By.xpath("//button[@name='submittedButton'][contains(.,'Continue')]")).click();	
		logger.info("Clicked on Mortgage Illustration summary continue");
		Thread.sleep(2000);
		validatetitle();	
	}
	
	public void MortgageIllustrationBTLRemo() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//label[@for='IsJointApplication-no'][contains(.,'No')]")).click();	
		System.out.println("Is this a joint application?*");
		Thread.sleep(2000);
		
		Select dropdown1= new Select(driver.findElement(By.id("Applicants_0__Title")));
		dropdown1.selectByVisibleText("Mr");	
		logger.info("Title Selected");
//		Thread.sleep(3000);
		
		String firstname=randomString();
		String midname=randomString();
		String lastname=randomString();
		
		driver.findElement(By.id("Applicants_0__FirstName")).sendKeys(firstname);
		driver.findElement(By.id("Applicants_0__MiddleName")).sendKeys(midname);
		driver.findElement(By.id("Applicants_0__Surname")).sendKeys(lastname);
		
		driver.findElement(By.xpath("//label[@for='Applicants_0__IsCurrentAccountHolder-no'][contains(.,'No')]")).click();	
		System.out.println("Does the applicant have an existing relationship with HSBC?*");
		Thread.sleep(2000);
		ScrollByPixel();
		
		Thread.sleep(2000);
		
		Select dropdown2= new Select(driver.findElement(By.id("ApplicationType")));
		dropdown2.selectByVisibleText("Remortgage");	
		logger.info("Application Type Remortgage Selected");
		Thread.sleep(2000);
		
		Selectdropdown("RemortgageReason", "Remortgage my existing mortgage");
		logger.info("Remortgage my existing mortgage Remortgage Selected");
		
//		Select dropdown14= new Select(driver.findElement(By.id("BuyerType")));
//		dropdown14.selectByVisibleText("First Time Buyer");	
//		logger.info("BuyerType First Time Buyer Selected");
//		Thread.sleep(2000);
		
//		Select dropdown3= new Select(driver.findElement(By.id("ApplicationType")));
//		dropdown3.selectByVisibleText("Remortgage");	
//		logger.info("Application Type Remortgage Selected");
//		Thread.sleep(3000);
		
//		Select dropdown4= new Select(driver.findElement(By.id("ResidenceType")));
//		dropdown4.selectByVisibleText("Primary Residence");	
//		logger.info("ResidenceType Primary Residence Selected");
//		Thread.sleep(2000);
		
//		Select dropdown5= new Select(driver.findElement(By.id("ResidenceType")));
//		dropdown5.selectByVisibleText("Secondary Residence)");	
//		logger.info("ResidenceType Secondary Residence Selected");
//		Thread.sleep(2000);
		
		driver.findElement(By.id("LoanAmount")).sendKeys("70000");
		driver.findElement(By.id("PurchasePrice")).sendKeys("100000");
		
//		driver.findElement(By.xpath("//label[@for='HasPropertyInMind-yes'][contains(.,'Yes')]")).click();	
//		logger.info("Has the applicant chosen a property?*");
//		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[@for='IsNewBuild-no'][contains(.,'No')]")).click();	
		logger.info("Is the property a new build (less than 2 years old)?*");
//		Thread.sleep(2000);
		
		
//		driver.findElement(By.xpath("//label[@for='IsPurchasedAtDiscountFromFamily-no'][contains(.,'No')]")).click();	
//		logger.info("Is the applicant purchasing the property at a discount from a family member, relative or other individual/firm?*");
//		Thread.sleep(2000);
		
		
		Select dropdown5= new Select(driver.findElement(By.id("PropertyLocation")));
		dropdown5.selectByVisibleText("England and Wales");	
		logger.info("England and Wales Selected");
//		Thread.sleep(2000);
		
//		Select dropdown6= new Select(driver.findElement(By.id("PropertyLocation")));
//		dropdown6.selectByVisibleText("Scotland");	
//		logger.info("Scotland Selected");
//		Thread.sleep(2000);
		
//		Select dropdown7= new Select(driver.findElement(By.id("PropertyLocation")));
//		dropdown7.selectByVisibleText("N Ireland");	
//		logger.info("N Ireland Selected");
//		Thread.sleep(2000);
		
		Select dropdown8= new Select(driver.findElement(By.id("PropertyRegion")));
		dropdown8.selectByVisibleText("London");	
		logger.info("London Selected");
//		Thread.sleep(2000);
		
		Select dropdown9= new Select(driver.findElement(By.id("PropertyType")));
		dropdown9.selectByVisibleText("House");	
		logger.info("PropertyType House Selected");
//		Thread.sleep(2000);
		
		
		//Product details
		
//		ProductSelectionMultiComponant();
		
		
		  driver.findElement(By.xpath(
		  "//label[@for='IsMultiComponent-no'][contains(.,'No')]")).click();
		  logger.info("Is the mortgage a multi-part loan?*"); // Thread.sleep(2000);
		  
		  Select dropdown10= new
		  Select(driver.findElement(By.id("LoanComponents_0__RepaymentType")));
		  dropdown10.selectByVisibleText("Capital repayment");
		  logger.info("Capital repayment Selected"); // Thread.sleep(2000);
		  
		  Select dropdown11= new
		  Select(driver.findElement(By.id("LoanComponents_0__ProductType")));
		  dropdown11.selectByVisibleText("Fixed"); logger.info("Fixed Selected"); //
		  Thread.sleep(2000);
		  
		  Select dropdown12= new
		  Select(driver.findElement(By.id("LoanComponents_0__Term_Years")));
		  dropdown12.selectByVisibleText("15"); logger.info("Loan term selected"); //
		  Thread.sleep(2000);
		  
		  Select dropdown13= new
		  Select(driver.findElement(By.id("LoanComponents_0__Term_Months")));
		  dropdown13.selectByVisibleText("1"); logger.info("Loan month selected");
		  Thread.sleep(2000);
		  
		  driver.findElement(By.
		  xpath("//button[@type='button'][contains(.,'Find products')]")).click();
		  logger.info("Clicked on find products"); Thread.sleep(5000);
		  
		  driver.findElement(By.xpath(
		  "(//span[contains(@class,'productSelectButton')])[1]")).click();
		  logger.info("5 Years Fixed rate ISIS P1 Product selected");
		  Thread.sleep(2000);
		 
		
		driver.findElement(By.xpath("//label[@for='Fees_ProductFees_0__AddToLoan-false'][contains(.,'Pay on application')]")).click();	
		logger.info("Pay on application Selected");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@name='submittedButton'][contains(.,'Continue')]")).click();	
		logger.info("Clicked on continue");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[contains(@id,'warningLeavePage')]")).click();	
		logger.info("Mortgage Illustration Warning continue");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@name='submittedButton'][contains(.,'Continue')]")).click();	
		logger.info("Clicked on Mortgage Illustration summary continue");
		Thread.sleep(2000);
		validatetitle();	
	}
	
	
	public void MortgageIllustrationBTLMultiApplicant() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//label[@for='IsJointApplication-yes'][contains(.,'Yes')]")).click();	
		System.out.println("Is this a joint application?*");
		Thread.sleep(2000);
		
		logger.info("First applicant details");
		
		Select dropdown1= new Select(driver.findElement(By.id("Applicants_0__Title")));
		dropdown1.selectByVisibleText("Mr");	
		logger.info("Title Selected");
//		Thread.sleep(3000);
		
		String firstname=randomString();
		String midname=randomString();
		String lastname=randomString();
		
		driver.findElement(By.id("Applicants_0__FirstName")).sendKeys(firstname);
		driver.findElement(By.id("Applicants_0__MiddleName")).sendKeys(midname);
		driver.findElement(By.id("Applicants_0__Surname")).sendKeys(lastname);
		
		driver.findElement(By.xpath("//label[@for='Applicants_0__IsCurrentAccountHolder-no'][contains(.,'No')]")).click();	
		System.out.println("Does the applicant have an existing relationship with HSBC?*");
		Thread.sleep(2000);
//		ScrollByPixel();
		
		logger.info("First applicant details updated");
		logger.info("second applicant details");
		
		Selectdropdown("Applicants_1__Title", "Mr");	
		logger.info("Title applicant 2 Selected");
//		Thread.sleep(3000);
		
		String firstname2=randomString();
		String midname2=randomString();
		String lastname2=randomString();
		
		driver.findElement(By.id("Applicants_1__FirstName")).sendKeys(firstname2);
		driver.findElement(By.id("Applicants_1__MiddleName")).sendKeys(midname2);
		driver.findElement(By.id("Applicants_1__Surname")).sendKeys(lastname2);
		
		driver.findElement(By.xpath("//label[@for='Applicants_1__IsCurrentAccountHolder-no'][contains(.,'No')]")).click();	
		System.out.println("Does the applicant 2 have an existing relationship with HSBC?*");
		Thread.sleep(2000);
		
		logger.info("Second applicant details updated");
		
		Thread.sleep(2000);
		
		Select dropdown2= new Select(driver.findElement(By.id("ApplicationType")));
		dropdown2.selectByVisibleText("Purchase");	
		logger.info("Application Type Purchase Selected");
		Thread.sleep(2000);
		
		Select dropdown14= new Select(driver.findElement(By.id("BuyerType")));
		dropdown14.selectByVisibleText("First Time Buyer");	
		logger.info("BuyerType First Time Buyer Selected");
		Thread.sleep(2000);
		
//		Select dropdown3= new Select(driver.findElement(By.id("ApplicationType")));
//		dropdown3.selectByVisibleText("Remortgage");	
//		logger.info("Application Type Remortgage Selected");
//		Thread.sleep(3000);
		
//		Select dropdown4= new Select(driver.findElement(By.id("ResidenceType")));
//		dropdown4.selectByVisibleText("Primary Residence");	
//		logger.info("ResidenceType Primary Residence Selected");
//		Thread.sleep(2000);
		
//		Select dropdown5= new Select(driver.findElement(By.id("ResidenceType")));
//		dropdown5.selectByVisibleText("Secondary Residence)");	
//		logger.info("ResidenceType Secondary Residence Selected");
//		Thread.sleep(2000);
		
		driver.findElement(By.id("LoanAmount")).sendKeys("70000");
		driver.findElement(By.id("PurchasePrice")).sendKeys("100000");
		
		driver.findElement(By.xpath("//label[@for='HasPropertyInMind-yes'][contains(.,'Yes')]")).click();	
		logger.info("Has the applicant chosen a property?*");
//		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[@for='IsNewBuild-no'][contains(.,'No')]")).click();	
		logger.info("Is the property a new build (less than 2 years old)?*");
//		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//label[@for='IsPurchasedAtDiscountFromFamily-no'][contains(.,'No')]")).click();	
		logger.info("Is the applicant purchasing the property at a discount from a family member, relative or other individual/firm?*");
//		Thread.sleep(2000);
		
		
		Select dropdown5= new Select(driver.findElement(By.id("PropertyLocation")));
		dropdown5.selectByVisibleText("England and Wales");	
		logger.info("England and Wales Selected");
//		Thread.sleep(2000);
		
//		Select dropdown6= new Select(driver.findElement(By.id("PropertyLocation")));
//		dropdown6.selectByVisibleText("Scotland");	
//		logger.info("Scotland Selected");
//		Thread.sleep(2000);
		
//		Select dropdown7= new Select(driver.findElement(By.id("PropertyLocation")));
//		dropdown7.selectByVisibleText("N Ireland");	
//		logger.info("N Ireland Selected");
//		Thread.sleep(2000);
		
		Select dropdown8= new Select(driver.findElement(By.id("PropertyRegion")));
		dropdown8.selectByVisibleText("London");	
		logger.info("London Selected");
//		Thread.sleep(2000);
		
		Select dropdown9= new Select(driver.findElement(By.id("PropertyType")));
		dropdown9.selectByVisibleText("House");	
		logger.info("PropertyType House Selected");
//		Thread.sleep(2000);
		
		
		//Product details
		
		driver.findElement(By.xpath("//label[@for='IsMultiComponent-no'][contains(.,'No')]")).click();	
		logger.info("Is the mortgage a multi-part loan?*");
//		Thread.sleep(2000);
		
		Select dropdown10= new Select(driver.findElement(By.id("LoanComponents_0__RepaymentType")));
		dropdown10.selectByVisibleText("Capital repayment");	
		logger.info("Capital repayment Selected");
//		Thread.sleep(2000);
		
		Select dropdown11= new Select(driver.findElement(By.id("LoanComponents_0__ProductType")));
		dropdown11.selectByVisibleText("Fixed");	
		logger.info("Fixed Selected");
//		Thread.sleep(2000);
		
		Select dropdown12= new Select(driver.findElement(By.id("LoanComponents_0__Term_Years")));
		dropdown12.selectByVisibleText("15");	
		logger.info("Loan term selected");
//		Thread.sleep(2000);
		
		Select dropdown13= new Select(driver.findElement(By.id("LoanComponents_0__Term_Months")));
		dropdown13.selectByVisibleText("1");	
		logger.info("Loan month selected");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@type='button'][contains(.,'Find products')]")).click();	
		logger.info("Clicked on find products");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//strong[contains(.,'Test1 -  2 Year fixed with cash back')])[1]")).click();	
		logger.info("Test1 -  2 Year fixed with cash back product Selected");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[@for='Fees_ProductFees_0__AddToLoan-false'][contains(.,'Pay on application')]")).click();	
		logger.info("Pay on application Selected");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@name='submittedButton'][contains(.,'Continue')]")).click();	
		logger.info("Clicked on continue");
		Thread.sleep(3000);
		validatetitle();
		
		driver.findElement(By.xpath("//button[@name='submittedButton'][contains(.,'Continue')]")).click();	
		logger.info("Clicked on Mortgage Illustration summary continue");
		Thread.sleep(2000);
		validatetitle();	
	}
	
	public void MortgageIllustrationLTB() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//label[@for='IsJointApplication-no'][contains(.,'No')]")).click();	
		System.out.println("Is this a joint application?*");
		Thread.sleep(2000);
		
		Select dropdown1= new Select(driver.findElement(By.id("Applicants_0__Title")));
		dropdown1.selectByVisibleText("Mr");	
		logger.info("Title Selected");
//		Thread.sleep(3000);
		
		String firstname=randomString();
		String midname=randomString();
		String lastname=randomString();
		
		driver.findElement(By.id("Applicants_0__FirstName")).sendKeys(firstname);
		driver.findElement(By.id("Applicants_0__MiddleName")).sendKeys(midname);
		driver.findElement(By.id("Applicants_0__Surname")).sendKeys(lastname);
		
		driver.findElement(By.xpath("//label[@for='Applicants_0__IsCurrentAccountHolder-no'][contains(.,'No')]")).click();	
		System.out.println("Does the applicant have an existing relationship with HSBC?*");
		Thread.sleep(2000);
		ScrollByPixel();
		
		Thread.sleep(2000);
		
		/*
		 * Select dropdown2= new Select(driver.findElement(By.id("ApplicationType")));
		 * dropdown2.selectByVisibleText("Purchase");
		 * logger.info("Application Type Purchase Selected"); Thread.sleep(2000);
		 * 
		 * Select dropdown14= new Select(driver.findElement(By.id("BuyerType")));
		 * dropdown14.selectByVisibleText("First Time Buyer");
		 * logger.info("BuyerType First Time Buyer Selected"); Thread.sleep(2000);
		 */
		
//		Select dropdown3= new Select(driver.findElement(By.id("ApplicationType")));
//		dropdown3.selectByVisibleText("Remortgage");	
//		logger.info("Application Type Remortgage Selected");
//		Thread.sleep(3000);
		
//		Select dropdown4= new Select(driver.findElement(By.id("ResidenceType")));
//		dropdown4.selectByVisibleText("Primary Residence");	
//		logger.info("ResidenceType Primary Residence Selected");
//		Thread.sleep(2000);
		
//		Select dropdown5= new Select(driver.findElement(By.id("ResidenceType")));
//		dropdown5.selectByVisibleText("Secondary Residence)");	
//		logger.info("ResidenceType Secondary Residence Selected");
//		Thread.sleep(2000);
		
		driver.findElement(By.id("LoanAmount")).sendKeys("70000");
		driver.findElement(By.id("PurchasePrice")).sendKeys("100000");
		
//		driver.findElement(By.xpath("//label[@for='HasPropertyInMind-yes'][contains(.,'Yes')]")).click();	
//		logger.info("Has the applicant chosen a property?*");
//		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[@for='IsNewBuild-no'][contains(.,'No')]")).click();	
		logger.info("Is the property a new build (less than 2 years old)?*");
//		Thread.sleep(2000);
		
		
//		driver.findElement(By.xpath("//label[@for='IsPurchasedAtDiscountFromFamily-no'][contains(.,'No')]")).click();	
//		logger.info("Is the applicant purchasing the property at a discount from a family member, relative or other individual/firm?*");
//		Thread.sleep(2000);
		
		
		Select dropdown5= new Select(driver.findElement(By.id("PropertyLocation")));
		dropdown5.selectByVisibleText("England and Wales");	
		logger.info("England and Wales Selected");
//		Thread.sleep(2000);
		
//		Select dropdown6= new Select(driver.findElement(By.id("PropertyLocation")));
//		dropdown6.selectByVisibleText("Scotland");	
//		logger.info("Scotland Selected");
//		Thread.sleep(2000);
		
//		Select dropdown7= new Select(driver.findElement(By.id("PropertyLocation")));
//		dropdown7.selectByVisibleText("N Ireland");	
//		logger.info("N Ireland Selected");
//		Thread.sleep(2000);
		
		Select dropdown8= new Select(driver.findElement(By.id("PropertyRegion")));
		dropdown8.selectByVisibleText("London");	
		logger.info("London Selected");
//		Thread.sleep(2000);
		
		Select dropdown9= new Select(driver.findElement(By.id("PropertyType")));
		dropdown9.selectByVisibleText("House");	
		logger.info("PropertyType House Selected");
//		Thread.sleep(2000);
		
		
		//Product details
		
		driver.findElement(By.xpath("//label[@for='IsMultiComponent-no'][contains(.,'No')]")).click();	
		logger.info("Is the mortgage a multi-part loan?*");
//		Thread.sleep(2000);
		
		Select dropdown10= new Select(driver.findElement(By.id("LoanComponents_0__RepaymentType")));
		dropdown10.selectByVisibleText("Capital repayment");	
		logger.info("Capital repayment Selected");
//		Thread.sleep(2000);
		
		Select dropdown11= new Select(driver.findElement(By.id("LoanComponents_0__ProductType")));
		dropdown11.selectByVisibleText("Fixed");	
		logger.info("Fixed Selected");
//		Thread.sleep(2000);
		
		Select dropdown12= new Select(driver.findElement(By.id("LoanComponents_0__Term_Years")));
		dropdown12.selectByVisibleText("15");	
		logger.info("Loan term selected");
//		Thread.sleep(2000);
		
		Select dropdown13= new Select(driver.findElement(By.id("LoanComponents_0__Term_Months")));
		dropdown13.selectByVisibleText("1");	
		logger.info("Loan month selected");
		Thread.sleep(2000);
		
		Selectdropdown("LoanComponents_0__PurposeOfLoan", "Remortgage - Existing Balance");
		logger.info("Purpose of loan Remortgage - Existing Balance selected");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@type='button'][contains(.,'Find products')]")).click();	
		logger.info("Clicked on find products");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//span[@class='productSelectButton'][contains(.,'Select')])[3]")).click();	
		logger.info("0012 - Test Automation Product selected");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[@for='Fees_ProductFees_0__AddToLoan-false'][contains(.,'Pay on application')]")).click();	
		logger.info("Pay on application Selected");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@name='submittedButton'][contains(.,'Continue')]")).click();	
		logger.info("Clicked on continue");
		Thread.sleep(3000);
		validatetitle();
		
		driver.findElement(By.xpath("//button[contains(@id,'warningLeavePage')]")).click();	
		logger.info("Clicked on continue on warningLeavePage");
		Thread.sleep(3000);
		validatetitle();
		
		driver.findElement(By.xpath("//button[@name='submittedButton'][contains(.,'Continue')]")).click();	
		logger.info("Clicked on Mortgage Illustration summary continue");
		Thread.sleep(2000);
		validatetitle();	
	}
	
	public void MortgageIllustrationLTBMultiApplicant() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//label[@for='IsJointApplication-yes'][contains(.,'Yes')]")).click();	
		System.out.println("Is this a joint application?*");
		Thread.sleep(2000);
		
		logger.info("First applicant details");
		
		Select dropdown1= new Select(driver.findElement(By.id("Applicants_0__Title")));
		dropdown1.selectByVisibleText("Mr");	
		logger.info("Title Selected");
//		Thread.sleep(3000);
		
		String firstname=randomString();
		String midname=randomString();
		String lastname=randomString();
		
		driver.findElement(By.id("Applicants_0__FirstName")).sendKeys(firstname);
		driver.findElement(By.id("Applicants_0__MiddleName")).sendKeys(midname);
		driver.findElement(By.id("Applicants_0__Surname")).sendKeys(lastname);
		
		driver.findElement(By.xpath("//label[@for='Applicants_0__IsCurrentAccountHolder-no'][contains(.,'No')]")).click();	
		System.out.println("Does the applicant have an existing relationship with HSBC?*");
		Thread.sleep(2000);
//		ScrollByPixel();
		
		logger.info("First applicant details updated");
		logger.info("second applicant details");
		
		Selectdropdown("Applicants_1__Title", "Mr");	
		logger.info("Title applicant 2 Selected");
//		Thread.sleep(3000);
		
		String firstname2=randomString();
		String midname2=randomString();
		String lastname2=randomString();
		
		driver.findElement(By.id("Applicants_1__FirstName")).sendKeys(firstname2);
		driver.findElement(By.id("Applicants_1__MiddleName")).sendKeys(midname2);
		driver.findElement(By.id("Applicants_1__Surname")).sendKeys(lastname2);
		
		driver.findElement(By.xpath("//label[@for='Applicants_1__IsCurrentAccountHolder-no'][contains(.,'No')]")).click();	
		System.out.println("Does the applicant 2 have an existing relationship with HSBC?*");
		Thread.sleep(2000);
		
		logger.info("Second applicant details updated");
		
		Thread.sleep(2000);		
		/*
		 * Select dropdown2= new Select(driver.findElement(By.id("ApplicationType")));
		 * dropdown2.selectByVisibleText("Purchase");
		 * logger.info("Application Type Purchase Selected"); Thread.sleep(2000);
		 * 
		 * Select dropdown14= new Select(driver.findElement(By.id("BuyerType")));
		 * dropdown14.selectByVisibleText("First Time Buyer");
		 * logger.info("BuyerType First Time Buyer Selected"); Thread.sleep(2000);
		 */
		
//		Select dropdown3= new Select(driver.findElement(By.id("ApplicationType")));
//		dropdown3.selectByVisibleText("Remortgage");	
//		logger.info("Application Type Remortgage Selected");
//		Thread.sleep(3000);
		
//		Select dropdown4= new Select(driver.findElement(By.id("ResidenceType")));
//		dropdown4.selectByVisibleText("Primary Residence");	
//		logger.info("ResidenceType Primary Residence Selected");
//		Thread.sleep(2000);
		
//		Select dropdown5= new Select(driver.findElement(By.id("ResidenceType")));
//		dropdown5.selectByVisibleText("Secondary Residence)");	
//		logger.info("ResidenceType Secondary Residence Selected");
//		Thread.sleep(2000);
		
		driver.findElement(By.id("LoanAmount")).sendKeys("70000");
		driver.findElement(By.id("PurchasePrice")).sendKeys("100000");
		
//		driver.findElement(By.xpath("//label[@for='HasPropertyInMind-yes'][contains(.,'Yes')]")).click();	
//		logger.info("Has the applicant chosen a property?*");
//		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[@for='IsNewBuild-no'][contains(.,'No')]")).click();	
		logger.info("Is the property a new build (less than 2 years old)?*");
//		Thread.sleep(2000);
		
		
//		driver.findElement(By.xpath("//label[@for='IsPurchasedAtDiscountFromFamily-no'][contains(.,'No')]")).click();	
//		logger.info("Is the applicant purchasing the property at a discount from a family member, relative or other individual/firm?*");
//		Thread.sleep(2000);
		
		
		Select dropdown5= new Select(driver.findElement(By.id("PropertyLocation")));
		dropdown5.selectByVisibleText("England and Wales");	
		logger.info("England and Wales Selected");
//		Thread.sleep(2000);
		
//		Select dropdown6= new Select(driver.findElement(By.id("PropertyLocation")));
//		dropdown6.selectByVisibleText("Scotland");	
//		logger.info("Scotland Selected");
//		Thread.sleep(2000);
		
//		Select dropdown7= new Select(driver.findElement(By.id("PropertyLocation")));
//		dropdown7.selectByVisibleText("N Ireland");	
//		logger.info("N Ireland Selected");
//		Thread.sleep(2000);
		
		Select dropdown8= new Select(driver.findElement(By.id("PropertyRegion")));
		dropdown8.selectByVisibleText("London");	
		logger.info("London Selected");
//		Thread.sleep(2000);
		
		Select dropdown9= new Select(driver.findElement(By.id("PropertyType")));
		dropdown9.selectByVisibleText("House");	
		logger.info("PropertyType House Selected");
//		Thread.sleep(2000);
		
		
		//Product details
		
		driver.findElement(By.xpath("//label[@for='IsMultiComponent-no'][contains(.,'No')]")).click();	
		logger.info("Is the mortgage a multi-part loan?*");
//		Thread.sleep(2000);
		
		Select dropdown10= new Select(driver.findElement(By.id("LoanComponents_0__RepaymentType")));
		dropdown10.selectByVisibleText("Capital repayment");	
		logger.info("Capital repayment Selected");
//		Thread.sleep(2000);
		
		Select dropdown11= new Select(driver.findElement(By.id("LoanComponents_0__ProductType")));
		dropdown11.selectByVisibleText("Fixed");	
		logger.info("Fixed Selected");
//		Thread.sleep(2000);
		
		Select dropdown12= new Select(driver.findElement(By.id("LoanComponents_0__Term_Years")));
		dropdown12.selectByVisibleText("15");	
		logger.info("Loan term selected");
//		Thread.sleep(2000);
		
		Select dropdown13= new Select(driver.findElement(By.id("LoanComponents_0__Term_Months")));
		dropdown13.selectByVisibleText("1");	
		logger.info("Loan month selected");
		Thread.sleep(2000);
		
		Selectdropdown("LoanComponents_0__PurposeOfLoan", "Remortgage - Existing Balance");
		logger.info("Purpose of loan Remortgage - Existing Balance selected");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@type='button'][contains(.,'Find products')]")).click();	
		logger.info("Clicked on find products");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//span[@class='productSelectButton'][contains(.,'Select')])[3]")).click();	
		logger.info("0012 - Test Automation Product selected");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[@for='Fees_ProductFees_0__AddToLoan-false'][contains(.,'Pay on application')]")).click();	
		logger.info("Pay on application Selected");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@name='submittedButton'][contains(.,'Continue')]")).click();	
		logger.info("Clicked on continue");
		Thread.sleep(3000);
		validatetitle();
		
		driver.findElement(By.xpath("//button[contains(@id,'warningLeavePage')]")).click();	
		logger.info("Clicked on continue on warningLeavePage");
		Thread.sleep(3000);
		validatetitle();
		
		driver.findElement(By.xpath("//button[@name='submittedButton'][contains(.,'Continue')]")).click();	
		logger.info("Clicked on Mortgage Illustration summary continue");
		Thread.sleep(2000);
		validatetitle();	
	}
	
	public void MortgageIllustrationResidentialRemo() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//label[@for='IsJointApplication-no'][contains(.,'No')]")).click();	
		System.out.println("Is this a joint application?*");
		Thread.sleep(2000);
		
		Select dropdown1= new Select(driver.findElement(By.id("Applicants_0__Title")));
		dropdown1.selectByVisibleText("Mr");	
		logger.info("Title Selected");
//		Thread.sleep(3000);
		
		String firstname=randomString();
		String midname=randomString();
		String lastname=randomString();
		
		driver.findElement(By.id("Applicants_0__FirstName")).sendKeys(firstname);
		driver.findElement(By.id("Applicants_0__MiddleName")).sendKeys(midname);
		driver.findElement(By.id("Applicants_0__Surname")).sendKeys(lastname);
		
		driver.findElement(By.xpath("//label[@for='Applicants_0__IsCurrentAccountHolder-no'][contains(.,'No')]")).click();	
		System.out.println("Does the applicant have an existing relationship with HSBC?*");
		Thread.sleep(2000);
		ScrollByPixel();
		
		Thread.sleep(2000);
		
		Select dropdown2= new Select(driver.findElement(By.id("ApplicationType")));
		dropdown2.selectByVisibleText("Remortgage");	
		logger.info("Application Type Remortgage Selected");
		Thread.sleep(2000);
		
		Selectdropdown("RemortgageReason", "Remortgage my existing mortgage");
		logger.info("Remortgage my existing mortgage Remortgage Selected");
		
//		Select dropdown14= new Select(driver.findElement(By.id("BuyerType")));
//		dropdown14.selectByVisibleText("First Time Buyer");	
//		logger.info("BuyerType First Time Buyer Selected");
//		Thread.sleep(2000);
		
//		Select dropdown3= new Select(driver.findElement(By.id("ApplicationType")));
//		dropdown3.selectByVisibleText("Remortgage");	
//		logger.info("Application Type Remortgage Selected");
//		Thread.sleep(3000);
		
//		Select dropdown4= new Select(driver.findElement(By.id("ResidenceType")));
//		dropdown4.selectByVisibleText("Primary Residence");	
//		logger.info("ResidenceType Primary Residence Selected");
//		Thread.sleep(2000);
		
//		Select dropdown5= new Select(driver.findElement(By.id("ResidenceType")));
//		dropdown5.selectByVisibleText("Secondary Residence)");	
//		logger.info("ResidenceType Secondary Residence Selected");
//		Thread.sleep(2000);
		
		driver.findElement(By.id("LoanAmount")).sendKeys("70000");
		driver.findElement(By.id("PurchasePrice")).sendKeys("100000");
		
//		driver.findElement(By.xpath("//label[@for='HasPropertyInMind-yes'][contains(.,'Yes')]")).click();	
//		logger.info("Has the applicant chosen a property?*");
//		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[@for='IsNewBuild-no'][contains(.,'No')]")).click();	
		logger.info("Is the property a new build (less than 2 years old)?*");
//		Thread.sleep(2000);
		
		
//		driver.findElement(By.xpath("//label[@for='IsPurchasedAtDiscountFromFamily-no'][contains(.,'No')]")).click();	
//		logger.info("Is the applicant purchasing the property at a discount from a family member, relative or other individual/firm?*");
//		Thread.sleep(2000);
		
		
		Select dropdown5= new Select(driver.findElement(By.id("PropertyLocation")));
		dropdown5.selectByVisibleText("England and Wales");	
		logger.info("England and Wales Selected");
//		Thread.sleep(2000);
		
//		Select dropdown6= new Select(driver.findElement(By.id("PropertyLocation")));
//		dropdown6.selectByVisibleText("Scotland");	
//		logger.info("Scotland Selected");
//		Thread.sleep(2000);
		
//		Select dropdown7= new Select(driver.findElement(By.id("PropertyLocation")));
//		dropdown7.selectByVisibleText("N Ireland");	
//		logger.info("N Ireland Selected");
//		Thread.sleep(2000);
		
		Select dropdown8= new Select(driver.findElement(By.id("PropertyRegion")));
		dropdown8.selectByVisibleText("London");	
		logger.info("London Selected");
//		Thread.sleep(2000);
		
		Select dropdown9= new Select(driver.findElement(By.id("PropertyType")));
		dropdown9.selectByVisibleText("House");	
		logger.info("PropertyType House Selected");
//		Thread.sleep(2000);
		
		
		//Product details
		
//		ProductSelectionMultiComponant();
		
		
		  driver.findElement(By.xpath(
		  "//label[@for='IsMultiComponent-no'][contains(.,'No')]")).click();
		  logger.info("Is the mortgage a multi-part loan?*"); // Thread.sleep(2000);
		  
		  Select dropdown10= new
		  Select(driver.findElement(By.id("LoanComponents_0__RepaymentType")));
		  dropdown10.selectByVisibleText("Capital repayment");
		  logger.info("Capital repayment Selected"); // Thread.sleep(2000);
		  
		  Select dropdown11= new
		  Select(driver.findElement(By.id("LoanComponents_0__ProductType")));
		  dropdown11.selectByVisibleText("Fixed"); logger.info("Fixed Selected"); //
		  Thread.sleep(2000);
		  
		  Select dropdown12= new
		  Select(driver.findElement(By.id("LoanComponents_0__Term_Years")));
		  dropdown12.selectByVisibleText("15"); logger.info("Loan term selected"); //
		  Thread.sleep(2000);
		  
		  Select dropdown13= new
		  Select(driver.findElement(By.id("LoanComponents_0__Term_Months")));
		  dropdown13.selectByVisibleText("1"); logger.info("Loan month selected");
		  Thread.sleep(2000);
		  
		  driver.findElement(By.
		  xpath("//button[@type='button'][contains(.,'Find products')]")).click();
		  logger.info("Clicked on find products"); Thread.sleep(5000);
		  
		  driver.findElement(By.xpath(
		  "(//span[contains(@class,'productSelectButton')])[1]")).click();
		  logger.info("5 Years Fixed rate ISIS P1 Product selected");
		  Thread.sleep(2000);
		 
		
		driver.findElement(By.xpath("//label[@for='Fees_ProductFees_0__AddToLoan-false'][contains(.,'Pay on application')]")).click();	
		logger.info("Pay on application Selected");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@name='submittedButton'][contains(.,'Continue')]")).click();	
		logger.info("Clicked on continue");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[contains(@id,'warningLeavePage')]")).click();	
		logger.info("Mortgage Illustration Warning continue");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@name='submittedButton'][contains(.,'Continue')]")).click();	
		logger.info("Clicked on Mortgage Illustration summary continue");
		Thread.sleep(2000);
		validatetitle();	
	}
	
	public void SelectApplicationType(String AppType) throws InterruptedException
	{
		if(AppType.equals("Purchase"))
		{
			Selectdropdown("ApplicationType", "Purchase");
			logger.info("Purchase Selected");
		}
		else if(AppType.equals("Remortgage"))
		{
			Selectdropdown("ApplicationType", "Remortgage");
			logger.info("Application Type Remortgage Selected");
		}
	}
}
