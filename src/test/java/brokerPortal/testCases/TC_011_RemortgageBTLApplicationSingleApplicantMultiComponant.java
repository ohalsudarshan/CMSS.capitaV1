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

public class TC_011_RemortgageBTLApplicationSingleApplicantMultiComponant extends BrokerPortalBaseClass{
	
	@Test
	public void RemortgageBTLApplicationSingleApplicantMultiComponant() throws InterruptedException
	{
		
		setup("firefox");
		LoginPage lp=new LoginPage(driver);
		lp.setUsername(username);
		lp.setPassword(password);
		lp.clksubmitbtn();
		logger.info("Remortgage BTL Application Single Applicant Strated");
		NewCustomerLink();
		
		
		InitialQuestions p1=new InitialQuestions(driver);
		p1.BTLInitialQuestions();
		logger.info("BTL remortgage initial questions Completed");
		
		MortgageIllustration m1=new MortgageIllustration(driver);
		m1.MortgageIllustrationBTLRemo();
		logger.info("BTL Mortgage Illustration Completed");
		
		DecisionInPrinciple d1=new DecisionInPrinciple(driver);
		d1.DecisionInPrincipleBTLRemo();
		logger.info("DecisionInPrinciple Completed");
		
		PersonalDetails	p2=new PersonalDetails(driver);
		p2.PersonalDetailsResidential();
		logger.info("PersonalDetails and IncomecurrencydetailsCompleted");	
		
		Incomecurrencydetails i1=new Incomecurrencydetails(driver);
		i1.IncomecurrencydetailsBTLRemo();
		logger.info("Incomecurrencydetails Completed");

		EmploymentAndIncomedetails p3=new EmploymentAndIncomedetails(driver);
		p3.EmploymentAndIncomedetailsBTLRemo();
		logger.info("EmploymentAndIncomedetails Completed");
		
		Financialcommitments p4=new Financialcommitments(driver);
		p4.FinancialcommitmentsBTLRemo();
		logger.info("Financialcommitments Completed");
		
		Householdexpenditure p5=new Householdexpenditure(driver);
		p5.HouseholdexpenditureBTLRemo();
		logger.info("Householdexpenditure Completed");
		
		Summaryandnextsteps p6=new Summaryandnextsteps(driver);
		p6.SummaryandnextstepsBTLRemo();
		logger.info("Summaryandnextsteps Completed");
		
		Propertydetails p7=new Propertydetails(driver);
		p7.PropertydetailsBTLRemo();
		logger.info("Propertydetails Completed");
		
		Confirmthemortgage p8=new Confirmthemortgage(driver);
		p8.ConfirmthemortgageBTLRemo();
		logger.info("Confirmthemortgage Completed");
		
		DirectDebitdetails p9=new DirectDebitdetails(driver);
		p9.DirectDebitdetailsBTL();
		logger.info("DirectDebitdetails Completed");
		
		SolicitororConveyancerdetails p12=new SolicitororConveyancerdetails(driver);
		p12.SolicitororConveyancerdetailsBTLRemo();
		logger.info("SolicitororConveyancerdetails Completed");
		
		Applicationsummaryandnextsteps p10=new Applicationsummaryandnextsteps(driver);
		p10.ApplicationsummaryandnextstepsBTL();
		logger.info("Applicationsummaryandnextsteps Completed");
		
		Feepayment p11=new Feepayment(driver);
		p11.FeepaymentMethod();
		logger.info("Feepayment and application submition FMA Completed");
	}

}
