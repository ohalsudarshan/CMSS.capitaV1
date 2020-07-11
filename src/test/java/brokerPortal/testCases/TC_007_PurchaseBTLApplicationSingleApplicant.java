package brokerPortal.testCases;

import org.testng.annotations.Test;

import brokerPortal.pageObjects.Applicationsummaryandnextsteps;
import brokerPortal.pageObjects.Confirmthemortgage;
import brokerPortal.pageObjects.DecisionInPrinciple;
import brokerPortal.pageObjects.DirectDebitdetails;
import brokerPortal.pageObjects.EmploymentAndIncomedetails;
import brokerPortal.pageObjects.Feepayment;
import brokerPortal.pageObjects.Financialcommitments;
import brokerPortal.pageObjects.Householdexpenditure;
import brokerPortal.pageObjects.Incomecurrencydetails;
import brokerPortal.pageObjects.InitialQuestions;
import brokerPortal.pageObjects.LoginPage;
import brokerPortal.pageObjects.MortgageIllustration;
import brokerPortal.pageObjects.PersonalDetails;
import brokerPortal.pageObjects.Propertydetails;
import brokerPortal.pageObjects.SolicitororConveyancerdetails;
import brokerPortal.pageObjects.Summaryandnextsteps;

public class TC_007_PurchaseBTLApplicationSingleApplicant extends BrokerPortalBaseClass
{
	@Test
	public void PurchaseBTLApplicationSingleApplicant() throws InterruptedException
	{
		setup("firefox");
		LoginPage lp=new LoginPage(driver);
		lp.setUsername(username);
		lp.setPassword(password);
		lp.clksubmitbtn();
		NewCustomerLink();
		
		InitialQuestions p1=new InitialQuestions(driver);
		p1.BTLInitialQuestions();	
//		p1.ResidentialInitialQuestions();
		logger.info("Residential initial questions Completed");
		
		MortgageIllustration m1=new MortgageIllustration(driver);
		m1.MortgageIllustrationBTL();
		logger.info("BTL Mortgage Illustration Completed");
		
		
		DecisionInPrinciple d1=new DecisionInPrinciple(driver);
		d1.DecisionInPrincipleBTL();
		logger.info("DecisionInPrinciple BTL Completed");
		
		PersonalDetails	p2=new PersonalDetails(driver);
		p2.PersonalDetailsResidential();
		
		Incomecurrencydetails i1=new Incomecurrencydetails(driver);
		i1.IncomecurrencydetailsBTL();
		logger.info("Incomecurrencydetails Completed");
		
		EmploymentAndIncomedetails p3=new EmploymentAndIncomedetails(driver);
		p3.EmploymentAndIncomedetailsBTL();
		logger.info("EmploymentAndIncomedetails BTL Completed");
		
		Financialcommitments p4=new Financialcommitments(driver);
		p4.FinancialcommitmentsBTL();
		logger.info("Financialcommitments BTL Completed");
		
		Householdexpenditure p5=new Householdexpenditure(driver);
		p5.HouseholdexpenditureBTL();
		logger.info("Householdexpenditure BTL Completed");
		
		Summaryandnextsteps p6=new Summaryandnextsteps(driver);
		p6.SummaryandnextstepsBTL();
		logger.info("Summaryandnextsteps Completed");
		
		Propertydetails p7=new Propertydetails(driver);
		p7.PropertydetailsBTL();
		logger.info("Propertydetails BTL Completed");
		
		Confirmthemortgage p8=new Confirmthemortgage(driver);
		p8.ConfirmthemortgageBTL();
		logger.info("Confirmthemortgage BTL Completed");
		
		DirectDebitdetails p9=new DirectDebitdetails(driver);
		p9.DirectDebitdetailsBTL();
		logger.info("DirectDebitdetails BTL Completed");
		
		SolicitororConveyancerdetails p12=new SolicitororConveyancerdetails(driver);
		p12.SolicitororConveyancerdetailsBTL();
		logger.info("SolicitororConveyancerdetails Completed");
		
		Applicationsummaryandnextsteps p10=new Applicationsummaryandnextsteps(driver);
		p10.ApplicationsummaryandnextstepsBTL();
		logger.info("Applicationsummaryandnextsteps Completed");
		
		Feepayment p11=new Feepayment(driver);
		p11.FeepaymentMethod();
		logger.info("Feepayment and application submition FMA Completed");
		
	}
	
	

}
