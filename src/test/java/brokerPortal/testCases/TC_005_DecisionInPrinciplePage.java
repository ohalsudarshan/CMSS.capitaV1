package brokerPortal.testCases;

import org.testng.annotations.Test;

import brokerPortal.pageObjects.InitialQuestions;
import brokerPortal.pageObjects.LoginPage;
import brokerPortal.pageObjects.MortgageIllustration;
import brokerPortal.pageObjects.DecisionInPrinciple;

public class TC_005_DecisionInPrinciplePage extends BrokerPortalBaseClass{
	
	@Test
	public void DecisionInPrincipleInfo() throws InterruptedException
		{
			setup("firefox");
			LoginPage lp=new LoginPage(driver);
			lp.setUsername(username);
			lp.setPassword(password);
			lp.clksubmitbtn();
			NewCustomerLink();
			
			InitialQuestions p1=new InitialQuestions(driver);
			p1.ResidentialInitialQuestions();	
			logger.info("Residential initial questions Completed");
			
			MortgageIllustration m1=new MortgageIllustration(driver);
			m1.MortgageIllustrationResidential();
			logger.info("Residential Mortgage Illustration Completed");
			
			DecisionInPrinciple d1=new DecisionInPrinciple(driver);
			d1.DecisionInPrincipleResidential();
			logger.info("DecisionInPrinciple Completed");
			
			
			
		}
	

}
