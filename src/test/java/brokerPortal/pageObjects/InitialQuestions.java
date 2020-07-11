package brokerPortal.pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import brokerPortal.testCases.BrokerPortalBaseClass;

public class InitialQuestions extends BrokerPortalBaseClass{

	WebDriver driver;
	
	public InitialQuestions(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	public void ResidentialInitialQuestions() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//label[@class='small'][contains(.,'Residential')]")).click();	
		System.out.println("Clicked on Residential Nature of loan");
//		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[@for='AcceptMortgageCriteria-yes'][contains(.,'Yes')]")).click();	
		System.out.println("Do the applicant(s) meet this criteria?*");
//		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[contains(@name,'submittedButton')]")).click();	
		System.out.println("Clicked on Conitinue");
		Thread.sleep(2000);
		validatetitle();
	}
	
	public void BTLInitialQuestions() throws InterruptedException
	{
		driver.findElement(By.xpath("//label[@class='small'][contains(.,'Buy to Let')]")).click();	
		logger.info("Clicked on BTL  Nature of loan");
//		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[@for='AcceptMortgageCriteria-yes'][contains(.,'Yes')]")).click();	
		logger.info("Do the applicant(s) meet this criteria?*");
//		Thread.sleep(2000);
		
//		Select dropdown1= new Select(driver.findElement(By.id("BuyToLetType")));
//		dropdown1.selectByVisibleText("Buy to Let (Investment)");	
//		logger.info("Buy to Let (Investment) selected");
//		Thread.sleep(2000);
		
		Select dropdown2= new Select(driver.findElement(By.id("BuyToLetType")));
		dropdown2.selectByVisibleText("Buy to Let (Consumer)");
		logger.info("Buy to Let (Consumer) selected");
		Thread.sleep(3000);
		
//		Select dropdown3= new Select(driver.findElement(By.id("ResidenceType")));
//		dropdown3.selectByVisibleText("Rental Funded");	
//		logger.info("Rental Funded selected");
//		Thread.sleep(2000);
		
		Select dropdown4= new Select(driver.findElement(By.id("ResidenceType")));
		dropdown4.selectByVisibleText("Top Slicing");	
		logger.info("Top Slicing selected");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//label[@for='LetPropertyToFamilyMember-yes'][contains(.,'Yes')]")).click();	
		logger.info("Does the applicant or a related person intend to occupy the property at any time in the future?*");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[@for='AcceptBuyToLetCriteria-yes'][contains(.,'Yes')]")).click();	
		System.out.println("Do the applicant(s) meet this criteria?*");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[contains(@name,'submittedButton')]")).click();	
		System.out.println("Clicked on Conitinue");
		Thread.sleep(2000);
		validatetitle();
	}
	
	public void LTBInitialQuestions() throws InterruptedException
	{
		driver.findElement(By.xpath("//label[@class='small'][contains(.,'Let to Buy')]")).click();	
		System.out.println("Clicked on LTB Nature of loan");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[@for='AcceptMortgageCriteria-yes'][contains(.,'Yes')]")).click();	
		System.out.println("Do the applicant(s) meet this criteria?*");
//		Thread.sleep(2000);
		
//		Select dropdown1= new Select(driver.findElement(By.id("BuyToLetType")));
//		dropdown1.selectByVisibleText("Buy to Let (Investment)");	
//		logger.info("Buy to Let (Investment) selected");
//		Thread.sleep(3000);
		
		Select dropdown2= new Select(driver.findElement(By.id("BuyToLetType")));
		dropdown2.selectByVisibleText("Buy to Let (Consumer)");
		logger.info("Buy to Let (Consumer) selected");
//		Thread.sleep(2000);
		
//		Select dropdown3= new Select(driver.findElement(By.id("ResidenceType")));
//		dropdown3.selectByVisibleText("Rental Funded");	
//		logger.info("Rental Funded selected");
//		Thread.sleep(3000);
		
		Select dropdown4= new Select(driver.findElement(By.id("ResidenceType")));
		dropdown4.selectByVisibleText("Top Slicing");	
		logger.info("Top Slicing selected");
//		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//label[@for='LetPropertyToFamilyMember-yes'][contains(.,'Yes')]")).click();	
		logger.info("Does the applicant or a related person intend to occupy the property at any time in the future?*");
//		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[@for='AcceptBuyToLetCriteria-yes'][contains(.,'Yes')]")).click();	
		System.out.println("Do the applicant(s) meet this criteria?*");
//		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[contains(@name,'submittedButton')]")).click();	
		System.out.println("Clicked on Conitinue");
		Thread.sleep(2000);
		validatetitle();
	}
	
}
