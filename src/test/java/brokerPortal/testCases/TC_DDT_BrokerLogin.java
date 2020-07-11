package brokerPortal.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import brokerPortal.pageObjects.LoginPage;
import brokerPortal.utilities.XLUtils;

public class TC_DDT_BrokerLogin extends BrokerPortalBaseClass{
	
	@Test(dataProvider="LoginData")
	public void loginDDT(String user, String pwd) throws Exception
	{
		setup("firefox");
		LoginPage lp=new LoginPage(driver);
		lp.setUsername(user);
		logger.info("Username Provided");
		lp.setPassword(pwd);
		logger.info("Password Provided");
		lp.clksubmitbtn();
		
		Thread.sleep(3000);
		
//		String actualURL= "https://hsbuat04web01.cmssdo.local:8110/case/dashboard";
//		String ExpectedURL=driver.getCurrentUrl();
		
		if(driver.getCurrentUrl().endsWith("dashboard"))
		{

			logger.info("Login Passed");
			Thread.sleep(2000);	
			lp.clkLogoutbtn();		
			Thread.sleep(2000);	
			logger.info("Clicked on Logout");
		}
		else
		{
			logger.info("Login Failed");

		}
		
		
		/*
		 * if(actualURL.equalsIgnoreCase(ExpectedURL)) {
		 * 
		 * logger.info("Login Passed"); Thread.sleep(2000); lp.clkLogoutbtn();
		 * Thread.sleep(2000); logger.info("Clicked on Logout"); } else {
		 * logger.info("Login Failed");
		 * 
		 * }
		 */
				
	}	
	
	@DataProvider(name="LoginData")
	String[] [] getData() throws IOException
	{
//		String path= System.getProperty("user.dir")+"/src/test/java/com/brokerPortal/testData/LoginData.xlsx";
		
		String path= "C://Sudarshan//Automation//MavenProject//CMSS.capitaV1//src//test//java//brokerPortal//testData//LoginData.xlsx";
	
		int rownum=XLUtils.getRowCount(path, "sheet1");
		int colcount=XLUtils.getCellCount(path, "sheet1", 1);
		
		String logindata[][]=new String[rownum][colcount];
		
		for(int i=1; i<=rownum; i++)
		{
			for (int j=0; j<colcount; j++)
			{
				logindata[i-1][j]=XLUtils.getCellData(path, "Sheet1", i, j); //1 ,0
			}
		}
	return logindata;
	}
}
