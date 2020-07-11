package brokerPortal.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import brokerPortal.testCases.BrokerPortalBaseClass;

public class DecisionInPrinciple extends BrokerPortalBaseClass{
WebDriver driver;
	
	public DecisionInPrinciple(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	public void DecisionInPrincipleResidential() throws InterruptedException
	{
		
		//Property details
		
		Select dropdown2= new Select(driver.findElement(By.id("PropertyDescription")));
		dropdown2.selectByVisibleText("Detached House");	
		logger.info("Detached House Selected");
		Thread.sleep(2000);
		
		Select dropdown14= new Select(driver.findElement(By.id("NumberOfBedrooms")));
		dropdown14.selectByVisibleText("3");	
		logger.info("NumberOfBedrooms Selected");
		Thread.sleep(2000);
		
		Select dropdown3= new Select(driver.findElement(By.id("BuildingConstruction")));
		dropdown3.selectByVisibleText("Brick/Stone (Conventional)");	
		logger.info("Brick/Stone (Conventional) Selected");
		Thread.sleep(2000);
		
		Select dropdown4= new Select(driver.findElement(By.id("RoofConstruction")));
		dropdown4.selectByVisibleText("Tile/Slate (Conventional)");	
		logger.info("Tile/Slate (Conventional) Selected");
		Thread.sleep(2000);
		
		driver.findElement(By.id("YearBuilt")).sendKeys("2016");
		
	
		
		driver.findElement(By.xpath("//button[contains(@id,'beginApplicationProceed')]")).click();	
		logger.info("Clicked on DIP page continue for Personal Details page");
		Thread.sleep(2000);
		validatetitle();
		
	}
	
	public void DecisionInPrincipleBTL() throws InterruptedException
	{
		
		//Buy to Let details
		
		Sendkeys("BuyToLetDetails_MonthlyRentalIncome", "800");
		logger.info("Proposed monthly rental income*");
		
		Radiobutton("//label[@for='PropertyInMind-yes'][contains(.,'Yes')]");
		logger.info("Has the applicant chosen a property?*");
		
		Radiobutton("//label[@for='IsNewProperty-no'][contains(.,'No')]");
		logger.info("Is the property a new build (less than 2 years old)?*");
		
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
		
		
		Select dropdown2= new Select(driver.findElement(By.id("PropertyDescription")));
		dropdown2.selectByVisibleText("Detached House");	
		logger.info("Detached House Selected");
		Thread.sleep(2000);
		
		Select dropdown14= new Select(driver.findElement(By.id("NumberOfBedrooms")));
		dropdown14.selectByVisibleText("3");	
		logger.info("NumberOfBedrooms Selected");
		Thread.sleep(2000);
		
		Select dropdown3= new Select(driver.findElement(By.id("BuildingConstruction")));
		dropdown3.selectByVisibleText("Brick/Stone (Conventional)");	
		logger.info("Brick/Stone (Conventional) Selected");
		Thread.sleep(2000);
		
		Select dropdown4= new Select(driver.findElement(By.id("RoofConstruction")));
		dropdown4.selectByVisibleText("Tile/Slate (Conventional)");	
		logger.info("Tile/Slate (Conventional) Selected");
		Thread.sleep(2000);
		
		driver.findElement(By.id("YearBuilt")).sendKeys("2016");
		
		driver.findElement(By.xpath("//button[contains(@id,'beginApplicationProceed')]")).click();	
		logger.info("Clicked on BTL DIP page continue for Personal Details page");
		Thread.sleep(2000);
		validatetitle();
	}
	
	public void DecisionInPrincipleBTLRemo() throws InterruptedException
	{
		
		//Buy to Let details
		
		Sendkeys("BuyToLetDetails_MonthlyRentalIncome", "800");
		logger.info("Proposed monthly rental income*");
		
//		Radiobutton("//label[@for='PropertyInMind-yes'][contains(.,'Yes')]");
//		logger.info("Has the applicant chosen a property?*");
		
		Radiobutton("//label[@for='IsNewProperty-no'][contains(.,'No')]");
		logger.info("Is the property a new build (less than 2 years old)?*");
		
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
		
		
		Select dropdown2= new Select(driver.findElement(By.id("PropertyDescription")));
		dropdown2.selectByVisibleText("Detached House");	
		logger.info("Detached House Selected");
		Thread.sleep(2000);
		
		Select dropdown14= new Select(driver.findElement(By.id("NumberOfBedrooms")));
		dropdown14.selectByVisibleText("3");	
		logger.info("NumberOfBedrooms Selected");
		Thread.sleep(2000);
		
		Select dropdown3= new Select(driver.findElement(By.id("BuildingConstruction")));
		dropdown3.selectByVisibleText("Brick/Stone (Conventional)");	
		logger.info("Brick/Stone (Conventional) Selected");
		Thread.sleep(2000);
		
		Select dropdown4= new Select(driver.findElement(By.id("RoofConstruction")));
		dropdown4.selectByVisibleText("Tile/Slate (Conventional)");	
		logger.info("Tile/Slate (Conventional) Selected");
		Thread.sleep(2000);
		
		driver.findElement(By.id("YearBuilt")).sendKeys("2016");
		
		driver.findElement(By.xpath("//button[contains(@id,'beginApplicationProceed')]")).click();	
		logger.info("Clicked on BTL DIP page continue for Personal Details page");
		Thread.sleep(2000);
		validatetitle();
	}
	
	public void DecisionInPrincipleLTB() throws InterruptedException
	{
		
		//Let to Buy details
		
		Sendkeys("BuyToLetDetails_MonthlyRentalIncome", "800");
		logger.info("Proposed monthly rental income*");
		
		/*
		 * Radiobutton("//label[@for='PropertyInMind-yes'][contains(.,'Yes')]");
		 * logger.info("Has the applicant chosen a property?*");
		 * 
		 * Radiobutton("//label[@for='IsNewProperty-no'][contains(.,'No')]");
		 * logger.info("Is the property a new build (less than 2 years old)?*");
		 * 
		 * driver.findElement(By.id("CurrentAddressSearch_Criteria_PostCode")).
		 * sendKeys("GL52 2NP"); logger.info("Postcode provided");
		 * 
		 * driver.findElement(By.xpath(
		 * "//button[contains(@id,'CurrentAddressSearch_Criteria_findaddress')]")).click
		 * (); logger.info("Clicked on search button"); Thread.sleep(10000);
		 * 
		 * Select dropdown9= new
		 * Select(driver.findElement(By.id("CurrentAddressSearch_Criteria__addressLst"))
		 * ); // dropdown9.selectByVisibleText("I can't see the address ");
		 * dropdown9.selectByIndex(4); logger.info("Address Selected");
		 * Thread.sleep(5000);
		 * 
		 * Select dropdown10= new Select(driver.findElement(By.id(
		 * "CurrentAddressSearch_AddressDetail_CountryCode")));
		 * dropdown10.selectByVisibleText("United Kingdom");
		 * logger.info("Countrycode Selected"); Thread.sleep(5000);
		 */
		
		
		Select dropdown2= new Select(driver.findElement(By.id("PropertyDescription")));
		dropdown2.selectByVisibleText("Detached House");	
		logger.info("Detached House Selected");
		Thread.sleep(2000);
		
		Select dropdown14= new Select(driver.findElement(By.id("NumberOfBedrooms")));
		dropdown14.selectByVisibleText("3");	
		logger.info("NumberOfBedrooms Selected");
		Thread.sleep(2000);
		
		Select dropdown3= new Select(driver.findElement(By.id("BuildingConstruction")));
		dropdown3.selectByVisibleText("Brick/Stone (Conventional)");	
		logger.info("Brick/Stone (Conventional) Selected");
		Thread.sleep(2000);
		
		Select dropdown4= new Select(driver.findElement(By.id("RoofConstruction")));
		dropdown4.selectByVisibleText("Tile/Slate (Conventional)");	
		logger.info("Tile/Slate (Conventional) Selected");
		Thread.sleep(2000);
		
		driver.findElement(By.id("YearBuilt")).sendKeys("2016");
		
		driver.findElement(By.xpath("//button[contains(@id,'beginApplicationProceed')]")).click();	
		logger.info("Clicked on LTB DIP page continue for Personal Details page");
		Thread.sleep(2000);
		validatetitle();
	}
}
