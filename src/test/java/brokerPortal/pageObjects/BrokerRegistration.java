package brokerPortal.pageObjects;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import brokerPortal.testCases.BrokerPortalBaseClass;

public class BrokerRegistration extends BrokerPortalBaseClass{
	
	WebDriver driver;
	public BrokerRegistration(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	public void brokerregistration() throws InterruptedException
	{	
//		setup("firefox");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='/register'][contains(.,'register here')]")).click();		// Click on Register here
		logger.info("Clicked on Register here");
		driver.findElement(By.xpath("//label[@for='CompanyFindCriteria_IsAppointedRepresentative-true'][contains(.,'Appointed Representative')]")).click();		//Clicked on appointed respresentative
		logger.info("Clicked on Appointed Representative");
		driver.findElement(By.id("CompanyFindCriteria_FcaReferenceNumber")).sendKeys("444444");
		driver.findElement(By.id("CompanyFindCriteria_verifyFcaRefNum")).click();
		logger.info("Clicked on search button");
		
		ScrollByPixel();
		Thread.sleep(2000);
		
		Select dropdown= new Select(driver.findElement(By.id("CompanyFindCriteria_TradingName")));
				dropdown.selectByVisibleText("ABC Mortgages AR Firm");	
		logger.info("Trading Firm name selected");
		//Personal details
		ScrollByPixel();
		Thread.sleep(2000);
		
//		Select dropdown1= new Select(driver.findElement(By.id("AboutYouDetails_Title")));
//		dropdown1.selectByVisibleText("Mr");
		
		setTitle("Miss");
		logger.info("Title Selected");
		Thread.sleep(2000);
		String firstname=randomString();
		String lastname=randomString();
		String nin="AA"+randomNumber()+"A";
		
		driver.findElement(By.id("AboutYouDetails_FirstName")).sendKeys(firstname);//Firstname
		logger.info(firstname);
		Thread.sleep(2000);
		driver.findElement(By.id("AboutYouDetails_Surname")).sendKeys(lastname);			//Lastname
		logger.info(lastname);
		Thread.sleep(2000);
		driver.findElement(By.id("AboutYouDetails_DateOfBirth")).sendKeys("01/06/1985");
		ScrollByPixel();
		driver.findElement(By.id("AboutYouDetails_NationalInsuranceNumber")).sendKeys(nin);
		logger.info(nin);
		Thread.sleep(2000);
		
		//Office address and contact numbers
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@for='OfficeAddressDiffersFromRegisteredAddress-no'][contains(.,'No')]")).click();		//
		logger.info("Do you work from a different address than your firm's registered address?*");
		Thread.sleep(2000);
		
		driver.findElement(By.id("MobilePhoneNumber_TelNo")).sendKeys("07785296322");
		Thread.sleep(2000);
		
		//Notification preferences
		
		driver.findElement(By.xpath("//label[@for='NotificationDetails_NotificationType-Email'][contains(.,'Email')]")).click();		//
		logger.info("Primary method of contact for case notification*");
	
		Thread.sleep(10000);
		ScrollByPixel();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@for='NotificationDetails_SecondaryContactRequired-no'][contains(.,'No')]")).click();
		logger.info("Would you like to have notifications sent to a secondary email address or mobile number?*");
		
		//Login details
		
		String loginemail= "ARbroker"+randomString()+"@gmail.com";

		logger.info(loginemail);
		driver.findElement(By.id("SecurityDetails_EmailAddress")).sendKeys(loginemail);
		driver.findElement(By.id("SecurityDetails_ConfirmEmailAddress")).sendKeys(loginemail);
		
		driver.findElement(By.id("SecurityDetails_Password")).sendKeys("Sudd@123");
		driver.findElement(By.id("SecurityDetails_ConfirmPassword")).sendKeys("Sudd@123");
		
		//Security questions
		ScrollByPixel();
		Thread.sleep(3000);
		Select dropdown3= new Select(driver.findElement(By.id("SecurityDetails_SecurityQuestionsAndAnswers_0__SecurityQuestion")));
		dropdown3.selectByVisibleText("What was your first job?");
		logger.info("First Job Answer selected");
		
//		driver.findElement(By.id("SecurityDetails_SecurityQuestionsAndAnswers_0__SecurityQuestion")).click();
//		driver.findElement(By.linkText("What was your first job?")).click();
		
		driver.findElement(By.id("SecurityDetails_SecurityQuestionsAndAnswers_0__SecurityAnswer")).sendKeys("Capita");
		driver.findElement(By.id("SecurityDetails_SecurityQuestionsAndAnswers_0__ConfirmSecurityAnswer")).sendKeys("Capita");
		
		//Deputy/Administrator access
		ScrollByPixel();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@for='SupportStaffAccess_SupportStaffMemberAccessRequired-no'][contains(.,'No')]")).click();
		logger.info("Do you want to add a deputy or administrator?*");
		
		driver.findElement(By.xpath("//label[contains(@class,'checkbox')]")).click();
		driver.findElement(By.id("registerCompanyAndPersonDetailsSubmitButton")).click();
		
		logger.info("Clicked on register*");
		
		validatetitle();
	}

	
}
