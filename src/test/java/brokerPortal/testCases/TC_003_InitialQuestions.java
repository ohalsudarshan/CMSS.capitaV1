package brokerPortal.testCases;

import org.testng.annotations.Test;

import brokerPortal.pageObjects.LoginPage;
import brokerPortal.pageObjects.InitialQuestions;

public class TC_003_InitialQuestions extends BrokerPortalBaseClass{
	
	@Test(priority=0)
	public void PurchaseResidentialApplication() throws InterruptedException
	{
		setup("firefox");
		LoginPage lp=new LoginPage(driver);
		lp.setUsername(username);
		lp.setPassword(password);
		lp.clksubmitbtn();
		NewCustomerLink();
		InitialQuestions p1=new brokerPortal.pageObjects.InitialQuestions(driver);
		p1.ResidentialInitialQuestions();		
		System.out.println("Residential Completed");
	}
	
	@Test(priority=1)
	public void PurchaseBTLApplication() throws InterruptedException
	{
		setup("firefox");
		LoginPage lp=new LoginPage(driver);
		lp.setUsername(username);
		lp.setPassword(password);
		lp.clksubmitbtn();
		NewCustomerLink();
		InitialQuestions p1=new brokerPortal.pageObjects.InitialQuestions(driver);
		p1.BTLInitialQuestions();	
		System.out.println("BTL Completed");

	}
	
	@Test(priority=2)
	public void PurchaseLTBApplication() throws InterruptedException
	{
		setup("firefox");
		LoginPage lp=new LoginPage(driver);
		lp.setUsername(username);
		lp.setPassword(password);
		lp.clksubmitbtn();
		NewCustomerLink();
		InitialQuestions p1=new brokerPortal.pageObjects.InitialQuestions(driver);
		p1.LTBInitialQuestions();	
		System.out.println("LTB Completed");

	}
	

}
