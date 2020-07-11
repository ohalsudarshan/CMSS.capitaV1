package brokerPortal.testCases;

import org.testng.annotations.Test;

import brokerPortal.pageObjects.InitialQuestions;
import brokerPortal.pageObjects.LoginPage;
import brokerPortal.pageObjects.MortgageIllustration;

public class TC_004_MortgageIllustrationPage extends BrokerPortalBaseClass
{
	@Test
	public void MortgageIllustrationInfo() throws InterruptedException
		{
			setup("firefox");
			LoginPage lp=new LoginPage(driver);
			lp.setUsername(username);
			lp.setPassword(password);
			lp.clksubmitbtn();
			NewCustomerLink();
			
			InitialQuestions p1=new InitialQuestions(driver);
//			p1.ResidentialInitialQuestions();	
//			p1.BTLInitialQuestions();
			p1.LTBInitialQuestions();
			logger.info("Residential initial questions Completed");
			
			MortgageIllustration m1=new MortgageIllustration(driver);
//			m1.MortgageIllustrationResidential();
//			m1.MortgageIllustrationResidentialMultiApplicant();
//			m1.MortgageIllustrationBTLMultiApplicant();
			m1.MortgageIllustrationLTBMultiApplicant();
			logger.info("Residential Mortgage Illustration Completed");
			
		}
	

}
