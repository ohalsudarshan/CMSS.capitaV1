package brokerPortal.testCases;

import org.testng.annotations.Test;

import brokerPortal.pageObjects.LoginPage;
import brokerPortal.pageObjects.BrokerRegistration;

public class TC_002_BrokerRegistrationPage extends BrokerPortalBaseClass{
	
	@Test
	public void BrokerRegistration() throws InterruptedException
	{	
		BrokerRegistration b1=new BrokerRegistration(driver);
		b1.brokerregistration();
		
	}

}

