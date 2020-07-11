package brokerPortal.pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import brokerPortal.testCases.BrokerPortalBaseClass;

public class Feepayment extends BrokerPortalBaseClass{

WebDriver driver;
	
	public Feepayment(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	public void FeepaymentMethod() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[contains(@id,'startpayment')]")).click();
		logger.info("Clicked on submit payment");
		Thread.sleep(10000);
		
		Sendkeys("pas_ccnum", "4263970000005262");
		logger.info("4263970000005262 card no provided");
		WebElement e1=driver.findElement(By.id("pas_expiry"));
		e1.sendKeys("1103");
		logger.info("Pass expiry provided");
//		e1.sendKeys("30");
		
		Sendkeys("pas_cccvc", "120");
		Sendkeys("pas_ccname", "Sudarshan Ohal");
		
		driver.findElement(By.xpath("//button[contains(@id,'rxp-primary-btn')]")).click();
		logger.info("Clicked on Pay Now button");
		Thread.sleep(15000);
		validatetitle();
		
		driver.findElement(By.xpath("//a[contains(@id,'caseSummary')]")).click();
		logger.info("Clicked on Application submission Next Button");
		Thread.sleep(15000);
		validatetitle();
		
		String CaseID=driver.findElement(By.id("skipHeader")).getText();
		System.out.println("Application Nunber: "+CaseID);
		
	}
}
