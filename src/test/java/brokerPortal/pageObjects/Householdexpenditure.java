package brokerPortal.pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import brokerPortal.testCases.BrokerPortalBaseClass;

public class Householdexpenditure extends BrokerPortalBaseClass{
WebDriver driver;
	
	public Householdexpenditure(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	public void HouseholdexpenditureResidential() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("OutgoingsFields_0__OutgoingsAmount")).sendKeys("300");
		logger.info("Payment to fund repayment strategy for interest only mortgage");
		Thread.sleep(2000);
		
		driver.findElement(By.id("OutgoingsFields_1__OutgoingsAmount")).sendKeys("400");
		logger.info("Ground rent / service charge");
//		Thread.sleep(2000);
		
		driver.findElement(By.id("OutgoingsFields_2__OutgoingsAmount")).sendKeys("500");
		logger.info("Travel costs");
//		Thread.sleep(2000);
		
		driver.findElement(By.id("OutgoingsFields_3__OutgoingsAmount")).sendKeys("600");
		logger.info("Child maintenance");
//		Thread.sleep(2000);
		
		driver.findElement(By.id("OutgoingsFields_4__OutgoingsAmount")).sendKeys("700");
		logger.info("Spouse / partner maintenance");
		Thread.sleep(2000);
		
		driver.findElement(By.id("OutgoingsFields_5__OutgoingsAmount")).sendKeys("800");
		logger.info("Childcare");
//		Thread.sleep(2000);
		
		driver.findElement(By.id("OutgoingsFields_6__OutgoingsAmount")).sendKeys("900");
		logger.info("School / further or higher education fees");
//		Thread.sleep(2000);
		
		driver.findElement(By.id("OtherOutgoings_0__OutgoingsDescription")).sendKeys("Extra");
		logger.info("Other outgoings");
//		Thread.sleep(2000);
		
		driver.findElement(By.id("OtherOutgoings_0__OutgoingsAmount")).sendKeys("100");
		logger.info("Other outgoings amount");
//		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[@for='HasChildDependants-no'][contains(.,'No')]")).click();	
		logger.info("Does the applicant(s) have any child dependants?");
//		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[@for='HasAdultDependants-no'][contains(.,'No')]")).click();	
		logger.info("Does the applicant(s) have any adult dependants?");
//		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[contains(@id,'outgoingsDetailsContinueButton')]")).click();	
		logger.info("Clicked on continue on Household expenditure page");
		Thread.sleep(2000);
		validatetitle();
	}

	
	public void HouseholdexpenditureBTL() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
		driver.findElement(By.xpath("//label[@for='HasChildDependants-no'][contains(.,'No')]")).click();	
		logger.info("Does the applicant(s) have any child dependants?");
//		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[@for='HasAdultDependants-no'][contains(.,'No')]")).click();	
		logger.info("Does the applicant(s) have any adult dependants?");
//		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[contains(@id,'outgoingsDetailsContinueButton')]")).click();	
		logger.info("Clicked on continue BTL Household expenditure page");
		Thread.sleep(2000);
		validatetitle();
	}
	
	public void HouseholdexpenditureBTLRemo() throws InterruptedException
	{
		HouseholdexpenditureBTL();
	}
	
	public void HouseholdexpenditureLTB() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("OutgoingsFields_0__OutgoingsAmount")).sendKeys("300");
		logger.info("Payment to fund repayment strategy for interest only mortgage");
		Thread.sleep(2000);
		
		driver.findElement(By.id("OutgoingsFields_1__OutgoingsAmount")).sendKeys("400");
		logger.info("Ground rent / service charge");
//		Thread.sleep(2000);
		
		driver.findElement(By.id("OutgoingsFields_2__OutgoingsAmount")).sendKeys("500");
		logger.info("Travel costs");
//		Thread.sleep(2000);
		
		driver.findElement(By.id("OutgoingsFields_3__OutgoingsAmount")).sendKeys("600");
		logger.info("Child maintenance");
//		Thread.sleep(2000);
		
		driver.findElement(By.id("OutgoingsFields_4__OutgoingsAmount")).sendKeys("700");
		logger.info("Spouse / partner maintenance");
		Thread.sleep(2000);
		
		driver.findElement(By.id("OutgoingsFields_5__OutgoingsAmount")).sendKeys("800");
		logger.info("Childcare");
//		Thread.sleep(2000);
		
		driver.findElement(By.id("OutgoingsFields_6__OutgoingsAmount")).sendKeys("900");
		logger.info("School / further or higher education fees");
//		Thread.sleep(2000);
		
		driver.findElement(By.id("OtherOutgoings_0__OutgoingsDescription")).sendKeys("Extra");
		logger.info("Other outgoings");
//		Thread.sleep(2000);
		
		driver.findElement(By.id("OtherOutgoings_0__OutgoingsAmount")).sendKeys("100");
		logger.info("Other outgoings amount");
//		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[@for='HasChildDependants-no'][contains(.,'No')]")).click();	
		logger.info("Does the applicant(s) have any child dependants?");
//		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[@for='HasAdultDependants-no'][contains(.,'No')]")).click();	
		logger.info("Does the applicant(s) have any adult dependants?");
//		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[contains(@id,'outgoingsDetailsContinueButton')]")).click();	
		logger.info("Clicked on continue on Household expenditure page");
		Thread.sleep(2000);
		validatetitle();
	}

}
