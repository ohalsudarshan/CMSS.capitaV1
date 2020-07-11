package brokerPortal.pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import brokerPortal.testCases.BrokerPortalBaseClass;

public class Applicationsummaryandnextsteps extends BrokerPortalBaseClass{
	
WebDriver driver;
	
	public Applicationsummaryandnextsteps(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	public void ApplicationsummaryandnextstepsResidential() throws InterruptedException
	{		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//label[contains(@for,'MarketingPreferences_ApplicantsMarketingPreferences_0__MarketingInfoRequested')]")).click();
		logger.info("Please tick here if the applicant/applicants wish to receive offers and information from HSBC");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//label[contains(.,'Post')]")).click();
		logger.info("Please choose how the applicant would like to receive this information (select all that apply)");
		Thread.sleep(3000);
		
		Select dropdown3= new Select(driver.findElement(By.xpath("//select[contains(@id,'SpecialRequirement')]")));
		dropdown3.selectByVisibleText("None");
		logger.info("Does the applicant have special requirements for documentation?* None Selected");
		
//		Selectdropdown("//select[contains(@id,'SpecialRequirement')]", "None");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[contains(@id,'fmaSummaryContinue')]")).click();
		logger.info("Clicked on Application summary and next steps continue button");
		Thread.sleep(5000);
		validatetitle();
	}
	
	public void ApplicationsummaryandnextstepsResidentialMultiApplicant() throws InterruptedException
	{		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//label[contains(@for,'MarketingPreferences_ApplicantsMarketingPreferences_0__MarketingInfoRequested')]")).click();
		logger.info("Please tick here if the applicant/applicants wish to receive offers and information from HSBC");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//label[contains(.,'Post')]")).click();
		logger.info("Please choose how the applicant would like to receive this information (select all that apply)");
		Thread.sleep(3000);
		
		Select dropdown3= new Select(driver.findElement(By.xpath("(//select[contains(@id,'SpecialRequirement')])[1]")));
		dropdown3.selectByVisibleText("None");
		logger.info("Does the applicant have special requirements for documentation?* None Selected");
		
		Select dropdown4= new Select(driver.findElement(By.xpath("(//select[contains(@id,'SpecialRequirement')])[2]")));
		dropdown4.selectByVisibleText("None");
		logger.info("Does the applicant have special requirements for documentation?* None Selected");
		
//		Selectdropdown("//select[contains(@id,'SpecialRequirement')]", "None");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[contains(@id,'fmaSummaryContinue')]")).click();
		logger.info("Clicked on Application summary and next steps continue button");
		Thread.sleep(5000);
		validatetitle();
	}
	
	public void ApplicationsummaryandnextstepsBTL() throws InterruptedException
	{
		ApplicationsummaryandnextstepsResidential();
	}
	
	public void ApplicationsummaryandnextstepsLTB() throws InterruptedException
	{
		ApplicationsummaryandnextstepsResidential();
	}

}
