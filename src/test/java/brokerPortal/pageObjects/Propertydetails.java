package brokerPortal.pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import brokerPortal.testCases.BrokerPortalBaseClass;

public class Propertydetails extends BrokerPortalBaseClass {
	
WebDriver driver;
	
	public Propertydetails(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	public void PropertydetailsResidential() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Radiobutton("//label[@for='IsNewProperty-no'][contains(.,'No')]");
		logger.info("Is the property a new build (less than 2 years old)?*");
		
		Sendkeys("PropertyAddress_Criteria_PostCode", "GL52 2NP");	
		logger.info("Postcode");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[contains(@id,'PropertyAddress_Criteria_findaddress')]")).click();
		logger.info("Clicked on search button");
		Thread.sleep(10000);
		
		Select dropdown9= new Select(driver.findElement(By.id("PropertyAddress_Criteria__addressLst")));
//		dropdown9.selectByVisibleText("I can't see the address ");		
		dropdown9.selectByIndex(4);
		logger.info("Address Selected");
		Thread.sleep(5000);
		
		Selectdropdown("PropertyAddress_AddressDetail_CountryCode", "United Kingdom");
		logger.info("selected Country");
		
		Radiobutton("//label[@for='IsResidentialUseOnly-no'][contains(.,'No')]");
		logger.info("Is this property for residential use only?*");
		
		Radiobutton("//label[@for='IsFirstTimeOccupancy-no'][contains(.,'No')]");
		logger.info("Is the property being occupied for the first time?*");
		
		Radiobutton("//label[@for='HasRecentConversion-no'][contains(.,'No')]");
		logger.info("Has the property been converted within the last 2 years?*");
		
		Selectdropdown("TenureOfProperty", "Freehold");
		logger.info("Tenure* selected");
		
		Radiobutton("//label[@for='OtherResidentsExist-no'][contains(.,'No')]");
		logger.info("Will anyone aged 17 or over, not currently named on the mortgage reside at the property?*");
		
		driver.findElement(By.xpath("//button[contains(@id,'propertyContinueButton')]")).click();
		logger.info("Clicked on Property details continue button button");
		Thread.sleep(5000);
		validatetitle();
	}
	
	public void PropertydetailsBTL() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Radiobutton("//label[@for='IsNewProperty-no'][contains(.,'No')]");
		logger.info("Is the property a new build (less than 2 years old)?*");
		
		Radiobutton("//label[@for='IsPurchasedAtDiscountFromFamily-no'][contains(.,'No')]");
		logger.info("Is the applicant purchasing the property at a discount from a family member, relative or other individual/firm?");
		
		Radiobutton("//label[@for='IsResidentialUseOnly-no'][contains(.,'No')]");
		logger.info("Is this property for residential use only?*");
		
		Radiobutton("//label[@for='IsFirstTimeOccupancy-no'][contains(.,'No')]");
		logger.info("Is the property being occupied for the first time?*");
		
		Radiobutton("//label[@for='HasRecentConversion-no'][contains(.,'No')]");
		logger.info("Has the property been converted within the last 2 years?*");
		
		Selectdropdown("TenureOfProperty", "Freehold");
		logger.info("Tenure* selected");

		driver.findElement(By.xpath("//button[contains(@id,'propertyContinueButton')]")).click();
		logger.info("Clicked on Property details continue button button");
		Thread.sleep(5000);
		validatetitle();
	}
	
	public void PropertydetailsBTLRemo() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Radiobutton("//label[@for='IsNewProperty-no'][contains(.,'No')]");
		logger.info("Is the property a new build (less than 2 years old)?*");
	
		Radiobutton("//label[@for='IsResidentialUseOnly-no'][contains(.,'No')]");
		logger.info("Is this property for residential use only?*");
		
		Radiobutton("//label[@for='IsFirstTimeOccupancy-no'][contains(.,'No')]");
		logger.info("Is the property being occupied for the first time?*");
		
		Radiobutton("//label[@for='HasRecentConversion-no'][contains(.,'No')]");
		logger.info("Has the property been converted within the last 2 years?*");
		
		Selectdropdown("TenureOfProperty", "Freehold");
		logger.info("Tenure* selected");

		driver.findElement(By.xpath("//button[contains(@id,'propertyContinueButton')]")).click();
		logger.info("Clicked on Property details continue button button");
		Thread.sleep(5000);
		validatetitle();
	}

	public void PropertydetailsLTB() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Radiobutton("//label[@for='IsResidentialUseOnly-no'][contains(.,'No')]");
		logger.info("Is this property for residential use only?*");
		
		Radiobutton("//label[@for='IsFirstTimeOccupancy-no'][contains(.,'No')]");
		logger.info("Is the property being occupied for the first time?*");
		
		Radiobutton("//label[@for='HasRecentConversion-no'][contains(.,'No')]");
		logger.info("Has the property been converted within the last 2 years?*");
		
		Selectdropdown("TenureOfProperty", "Freehold");
		logger.info("Tenure* selected");

		driver.findElement(By.xpath("//button[contains(@id,'propertyContinueButton')]")).click();
		logger.info("Clicked on Property details continue button button");
		Thread.sleep(5000);
		validatetitle();
	}
}
