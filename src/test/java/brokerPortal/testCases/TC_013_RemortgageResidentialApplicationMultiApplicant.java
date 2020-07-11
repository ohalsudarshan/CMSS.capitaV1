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

public class TC_013_RemortgageResidentialApplicationMultiApplicant extends BrokerPortalBaseClass{
	
	@Test
	public void RemortgageResidentialApplicationMultiApplicant() throws InterruptedException
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
		m1.MortgageIllustrationResidentialMultiApplicant();
		logger.info("LTB Mortgage Illustration Completed");
		
		
		DecisionInPrinciple d1=new DecisionInPrinciple(driver);
		d1.DecisionInPrincipleResidential();
		logger.info("DecisionInPrinciple LTB Completed");
		
		PersonalDetails	p2=new PersonalDetails(driver);
		p2.PersonalDetailsResidential();
		p2.PersonalDetailsResidentialApplicant2();
		logger.info("PersonalDetails and Incomecurrencydetails LTB Completed");
		
		Incomecurrencydetails i1=new Incomecurrencydetails(driver);
		i1.IncomecurrencydetailsResidential();
		logger.info("Incomecurrencydetails Completed");
		
		EmploymentAndIncomedetails p3=new EmploymentAndIncomedetails(driver);
		p3.EmploymentAndIncomedetailsResidentials();
		p3.EmploymentAndIncomedetailsResidentialsApplicant2();
		logger.info("EmploymentAndIncomedetails LTB Completed");
		
		Financialcommitments p4=new Financialcommitments(driver);
		p4.FinancialcommitmentsResidential();
		logger.info("Financialcommitments LTB Completed");
		
		Householdexpenditure p5=new Householdexpenditure(driver);
		p5.HouseholdexpenditureResidential();
		logger.info("Householdexpenditure LTB Completed");
		
		/*
		 * Summaryandnextsteps p6=new Summaryandnextsteps(driver);
		 * p6.SummaryandnextstepsResidential();
		 * logger.info("Summaryandnextsteps Completed");
		 * 
		 * Propertydetails p7=new Propertydetails(driver);
		 * p7.PropertydetailsResidential();
		 * logger.info("Propertydetails BTL Completed");
		 * 
		 * Confirmthemortgage p8=new Confirmthemortgage(driver);
		 * p8.ConfirmthemortgageLTB(); p8.ConfirmthemortgageResidential();
		 * logger.info("Confirmthemortgage LTB Completed");
		 * 
		 * DirectDebitdetails p9=new DirectDebitdetails(driver);
		 * p9.DirectDebitdetailsResidentialMultiApplicant();
		 * logger.info("DirectDebitdetails LTB Completed");
		 * 
		 * SolicitororConveyancerdetails p12=new SolicitororConveyancerdetails(driver);
		 * p12.SolicitororConveyancerdetailsResidential();
		 * logger.info("SolicitororConveyancerdetails Completed");
		 * 
		 * Applicationsummaryandnextsteps p10=new
		 * Applicationsummaryandnextsteps(driver);
		 * p10.ApplicationsummaryandnextstepsResidentialMultiApplicant();
		 * logger.info("Applicationsummaryandnextsteps Completed");
		 * 
		 * Feepayment p11=new Feepayment(driver); p11.FeepaymentMethod();
		 * logger.info("Feepayment and application submition FMA Completed");
		 */
	}

}
