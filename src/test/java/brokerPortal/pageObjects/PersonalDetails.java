package brokerPortal.pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import brokerPortal.testCases.BrokerPortalBaseClass;

public class PersonalDetails extends BrokerPortalBaseClass{

WebDriver driver;
	
	public PersonalDetails(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	public void PersonalDetailsResidential() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("PersonalInfo_DateOfBirth")).sendKeys("08/04/1985");
		logger.info("DOB Selected");
		
		Selectdropdown("PersonalInfo_Gender", "Male");
//		Thread.sleep(2000);
		
		Select dropdown20= new Select(driver.findElement(By.id("PersonalInfo_MaritalStatus")));
		dropdown20.selectByVisibleText("Married/Civil Partnership");	
		logger.info("PersonalInfo_MaritalStatus Married/Civil Partnership Selected");
		Thread.sleep(2000);
		
		driver.findElement(By.id("MobilePhoneNumber_TelNo")).sendKeys("07875757575");
		logger.info("Phone no Selected");
//		Thread.sleep(2000);
		
		driver.findElement(By.id("ConfirmMobilePhoneNumber_TelNo")).sendKeys("07875757575");
		logger.info("Confirming Phone no Selected");
//		Thread.sleep(2000);
		
		Select dropdown4= new Select(driver.findElement(By.id("PreferredTelephoneNumber")));
		dropdown4.selectByVisibleText("Mobile");	
		logger.info("Mobile Selected");
		Thread.sleep(2000);
		
		String emailaddress= randomString()+"@gmail.com";
		
		driver.findElement(By.id("EmailAddress")).sendKeys(emailaddress);
		logger.info("emailaddressSelected");
//		Thread.sleep(2000);
		
		driver.findElement(By.id("ConfirmEmailAddress")).sendKeys(emailaddress);
		logger.info("Confirming emailaddress Selected");
//		Thread.sleep(2000);
		
		String nin="AA"+randomNumber()+"A";
		driver.findElement(By.id("NI_Number")).sendKeys(nin);
		logger.info(nin+" National insurance number Selected");
//		Thread.sleep(2000);
		
		Select dropdown5= new Select(driver.findElement(By.id("Nationality")));
		dropdown5.selectByVisibleText("British");	
		logger.info("British Selected");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[@for='HasDualNationality-no'][contains(.,'No')]")).click();	
		logger.info("Does the applicant hold more than one Nationality/Citizenship?*");
		Thread.sleep(2000);
		
		Select dropdown6= new Select(driver.findElement(By.id("CountryOfBirth")));
		dropdown6.selectByVisibleText("United Kingdom");	
		logger.info("United Kingdom Selected");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[@for='IsUkResident-yes'][contains(.,'Yes')]")).click();	
		logger.info("Is the applicant resident in the UK?*");
//		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='HasIndefiniteRightToRemainInUk-yes'][contains(.,'Yes')]")).click();	
		logger.info("Does the applicant have indefinite right to remain in the UK?*");
//		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='LivedInUkLastNMonths-yes'][contains(.,'Yes')]")).click();	
		logger.info("Has the applicant lived in the UK in the last 12 months?*");
//		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='WillLiveInUkNextNMonths-yes'][contains(.,'Yes')]")).click();	
		logger.info("Will the applicant live in the UK in the next 12 months?*");
//		Thread.sleep(2000);
		
		Select dropdown7= new Select(driver.findElement(By.id("CountryOfPermanentResidency")));
		dropdown7.selectByVisibleText("United Kingdom");	
		logger.info("CountryOfPermanentResidency United Kingdom Selected");
		Thread.sleep(2000);
		
		Select dropdown8= new Select(driver.findElement(By.id("TaxJurisdictionCountriesNonChosen_0__SelectedCountry")));
		dropdown8.selectByVisibleText("United Kingdom");	
		logger.info("TaxJurisdictionCountriesNonChosen_0__SelectedCountry United Kingdom Selected");
		Thread.sleep(2000);
		
		//Residential Address
		
		driver.findElement(By.xpath("//label[@for='CurrentAddressSearch_Criteria_IsAddressInUkOrChannelIslands-yes'][contains(.,'Yes')]")).click();	
		logger.info("is the address in the UK or Channel Islands?*");
//		Thread.sleep(2000);
			
		driver.findElement(By.id("CurrentAddressSearch_Criteria_PostCode")).sendKeys("GL52 2NP");
		logger.info("Postcode provided");
		
		driver.findElement(By.xpath("//button[contains(@id,'CurrentAddressSearch_Criteria_findaddress')]")).click();	
		logger.info("Clicked on search button");
		Thread.sleep(10000);
		
		Select dropdown9= new Select(driver.findElement(By.id("CurrentAddressSearch_Criteria__addressLst")));
//		dropdown9.selectByVisibleText("I can't see the address ");		
		dropdown9.selectByIndex(5);
		logger.info("Address Selected");
		Thread.sleep(5000);
		
		Sendkeys("CurrentAddressSearch_Criteria_HouseNumber", "1");
		logger.info("House Number 1 Provided");
		
		Select dropdown10= new Select(driver.findElement(By.id("CurrentAddressSearch_AddressDetail_CountryCode")));
		dropdown10.selectByVisibleText("United Kingdom");	
		logger.info("Countrycode Selected");
		Thread.sleep(5000);
		
		Select dropdown11= new Select(driver.findElement(By.id("DateMovedIn_Year")));
		dropdown11.selectByVisibleText("2015");	
		logger.info("Date moved year Selected");
		Thread.sleep(5000);
		
		Select dropdown12= new Select(driver.findElement(By.id("DateMovedIn_Month")));
		dropdown12.selectByVisibleText("01");	
		logger.info("Date moved month Selected");
		Thread.sleep(2000);
		
		Select dropdown13= new Select(driver.findElement(By.id("NatureofOccupancy")));
		dropdown13.selectByVisibleText("Owner Occupier");	
		logger.info("Owner Occupier Selected");
		Thread.sleep(2000);
		
//		Sendkeys("EstimatedCurrentValue", "200000");
//		Thread.sleep(2000);
		//Bank/building society history
		
		Select dropdown14= new Select(driver.findElement(By.id("TimeAtBank_Year")));
		dropdown14.selectByVisibleText("1 year");	
		logger.info("Length of time at bank* year Selected");
		Thread.sleep(2000);
		
		Select dropdown15= new Select(driver.findElement(By.id("TimeAtBank_Month")));
		dropdown15.selectByVisibleText("4 months");	
		logger.info("Length of time at bank* month Selected");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[contains(@id,'personalDetailsContinueButton')]")).click();	
		logger.info("Clicked on continue for personal details button");
		Thread.sleep(3000);
		validatetitle();
		
//		driver.findElement(By.xpath("//button[contains(@id,'leavePage')]")).click();	
//		logger.info("Clicked on continue for personal details button to move to Employment and income details page");
//		Thread.sleep(2000);
//		validatetitle();
	}
	
	public void PersonalDetailsResidentialApplicant2() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("PersonalInfo_DateOfBirth")).sendKeys("08/04/1989");
		logger.info("DOB Selected");
//		Thread.sleep(2000);
		
		Select dropdown20= new Select(driver.findElement(By.id("PersonalInfo_MaritalStatus")));
		dropdown20.selectByVisibleText("Married/Civil Partnership");	
		logger.info("PersonalInfo_MaritalStatus Married/Civil Partnership Selected");
		Thread.sleep(2000);
		
		driver.findElement(By.id("MobilePhoneNumber_TelNo")).sendKeys("07875757576");
		logger.info("Phone no Selected");
//		Thread.sleep(2000);
		
		driver.findElement(By.id("ConfirmMobilePhoneNumber_TelNo")).sendKeys("07875757576");
		logger.info("Confirming Phone no Selected");
//		Thread.sleep(2000);
		
		Select dropdown4= new Select(driver.findElement(By.id("PreferredTelephoneNumber")));
		dropdown4.selectByVisibleText("Mobile");	
		logger.info("Mobile Selected");
		Thread.sleep(2000);
		
		String emailaddress= randomString()+"@gmail.com";
		
		driver.findElement(By.id("EmailAddress")).sendKeys(emailaddress);
		logger.info("emailaddressSelected");
//		Thread.sleep(2000);
		
		driver.findElement(By.id("ConfirmEmailAddress")).sendKeys(emailaddress);
		logger.info("Confirming emailaddress Selected");
//		Thread.sleep(2000);
		
		String nin="AA"+randomNumber()+"A";
		driver.findElement(By.id("NI_Number")).sendKeys(nin);
		logger.info(nin+" National insurance number Selected");
//		Thread.sleep(2000);
		
		Select dropdown5= new Select(driver.findElement(By.id("Nationality")));
		dropdown5.selectByVisibleText("British");	
		logger.info("British Selected");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[@for='HasDualNationality-no'][contains(.,'No')]")).click();	
		logger.info("Does the applicant hold more than one Nationality/Citizenship?*");
		Thread.sleep(2000);
		
		Select dropdown6= new Select(driver.findElement(By.id("CountryOfBirth")));
		dropdown6.selectByVisibleText("United Kingdom");	
		logger.info("United Kingdom Selected");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[@for='IsUkResident-yes'][contains(.,'Yes')]")).click();	
		logger.info("Is the applicant resident in the UK?*");
//		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='HasIndefiniteRightToRemainInUk-yes'][contains(.,'Yes')]")).click();	
		logger.info("Does the applicant have indefinite right to remain in the UK?*");
//		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='LivedInUkLastNMonths-yes'][contains(.,'Yes')]")).click();	
		logger.info("Has the applicant lived in the UK in the last 12 months?*");
//		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='WillLiveInUkNextNMonths-yes'][contains(.,'Yes')]")).click();	
		logger.info("Will the applicant live in the UK in the next 12 months?*");
//		Thread.sleep(2000);
		
		Select dropdown7= new Select(driver.findElement(By.id("CountryOfPermanentResidency")));
		dropdown7.selectByVisibleText("United Kingdom");	
		logger.info("CountryOfPermanentResidency United Kingdom Selected");
		Thread.sleep(2000);
		
		Select dropdown8= new Select(driver.findElement(By.id("TaxJurisdictionCountriesNonChosen_0__SelectedCountry")));
		dropdown8.selectByVisibleText("United Kingdom");	
		logger.info("TaxJurisdictionCountriesNonChosen_0__SelectedCountry United Kingdom Selected");
		Thread.sleep(2000);
		
		//Residential Address
		
		driver.findElement(By.xpath("//label[@for='CurrentAddressSearch_Criteria_IsAddressInUkOrChannelIslands-yes'][contains(.,'Yes')]")).click();	
		logger.info("is the address in the UK or Channel Islands?*");
//		Thread.sleep(2000);
			
		driver.findElement(By.id("CurrentAddressSearch_Criteria_PostCode")).sendKeys("GL52 2NP");
		logger.info("Postcode provided");
		
		driver.findElement(By.xpath("//button[contains(@id,'CurrentAddressSearch_Criteria_findaddress')]")).click();	
		logger.info("Clicked on search button");
		Thread.sleep(10000);
		
		Select dropdown9= new Select(driver.findElement(By.id("CurrentAddressSearch_Criteria__addressLst")));
//		dropdown9.selectByVisibleText("I can't see the address ");		
		dropdown9.selectByIndex(4);
		logger.info("Address Selected");
		Thread.sleep(5000);
		
		Select dropdown10= new Select(driver.findElement(By.id("CurrentAddressSearch_AddressDetail_CountryCode")));
		dropdown10.selectByVisibleText("United Kingdom");	
		logger.info("Countrycode Selected");
		Thread.sleep(5000);
		
		Select dropdown11= new Select(driver.findElement(By.id("DateMovedIn_Year")));
		dropdown11.selectByVisibleText("2015");	
		logger.info("Date moved year Selected");
		Thread.sleep(5000);
		
		Select dropdown12= new Select(driver.findElement(By.id("DateMovedIn_Month")));
		dropdown12.selectByVisibleText("01");	
		logger.info("Date moved month Selected");
		Thread.sleep(2000);
		
		Select dropdown13= new Select(driver.findElement(By.id("NatureofOccupancy")));
		dropdown13.selectByVisibleText("Owner Occupier");	
		logger.info("Owner Occupier Selected");
		Thread.sleep(2000);
		
		//Bank/building society history
		
		Select dropdown14= new Select(driver.findElement(By.id("TimeAtBank_Year")));
		dropdown14.selectByVisibleText("1 year");	
		logger.info("Length of time at bank* year Selected");
		Thread.sleep(2000);
		
		Select dropdown15= new Select(driver.findElement(By.id("TimeAtBank_Month")));
		dropdown15.selectByVisibleText("4 months");	
		logger.info("Length of time at bank* month Selected");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[contains(@id,'personalDetailsContinueButton')]")).click();	
		logger.info("Clicked on continue for personal details button");
		Thread.sleep(3000);
		validatetitle();
		
//		driver.findElement(By.xpath("//button[contains(@id,'leavePage')]")).click();	
//		logger.info("Clicked on continue for personal details button to move to Employment and income details page");
//		Thread.sleep(2000);
//		validatetitle();
	}
	
}
