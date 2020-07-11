package brokerPortal.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import brokerPortal.pageObjects.LoginPage;

public class TC_001_BrokerPortalLogin extends BrokerPortalBaseClass {
	
	@Test
	public void loginTest() throws IOException 
	{
		logger.info("URL is Provided");

		LoginPage lp=new LoginPage(driver);
		lp.setUsername(username);
		logger.info("Username Provided");
		lp.setPassword(password);
		logger.info("Password Provided");
		lp.clksubmitbtn();
		validatetitle();
	}

}
