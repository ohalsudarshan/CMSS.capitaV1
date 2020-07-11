package brokerPortal.testCases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.internal.MouseAction.Button;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import brokerPortal.utilities.ReadConfig;


public class BrokerPortalBaseClass{
	
	ReadConfig rc=new ReadConfig();
	
	public String baseURL=rc.getApplicationURL();
	public String username=rc.getUsername();
	public String password=rc.getPassword();
	public static WebDriver driver;
	
	public static Logger logger;
	
	@Parameters("browser")
//	@BeforeClass
	public void setup(String br)
	{
//		System.setProperty("webdriver.gecko.driver","C://Sudarshan//Automation//MavenProject//twentySevenTecV1//Drivers//geckodriver.exe");
		logger=Logger.getLogger("Broker Portal CMSS");
		PropertyConfigurator.configure("log4j.properties");
		
		if(br.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",rc.getChromePath());
			driver= new ChromeDriver();
		}
		else if(br.equals("firefox"))
		{
			
			System.setProperty("webdriver.gecko.driver",rc.getFirefoxpath());
			driver= new FirefoxDriver();
		}
		else if(br.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver",rc.getIEPath());
			driver= new InternetExplorerDriver();
		}
				
		driver.get(baseURL);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	
	@AfterClass
	public void tearDown()
	{
//		driver.close();
	}
	
	public void captureScreen(WebDriver driver) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File target=new File(System.getProperty("user.dir")+"/Screenshot/"+randomString()+".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot Taken");
	}	
	
	public void ClickonStartButton()
	{
		driver.findElement(By.id("startBtn")).click();
	}
	public String randomString()
	{
		String generatedstring=RandomStringUtils.randomAlphabetic(8);
		return (generatedstring);
	}
	
	public String randomNumber()
	{
		String generatedstring2=RandomStringUtils.randomNumeric(6);
		return (generatedstring2);
	}
	
	public boolean isAlertPresent()	//user defined method to check alert is present on not
	{	try
		{
		driver.switchTo().alert();
		return true;
		}
		catch(NoAlertPresentException e)
		{
			return false;
		}
	}
	
	public void SearchMortgageBtn()
	{
		driver.findElement(By.xpath("//button[@onclick='SearchMortgageProducts()']")).click();

	}
	
	public void SelApplicationTypeFMA() throws Exception
	{
		driver.findElement(By.xpath("/html/body/div[3]/section/section[1]/div/article/div/div/div[2]/button[2]")).click();		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		Boolean apptype= driver.getPageSource().contains("Full Mortgage Application");
		
		if(apptype==true)
			
		{
			logger.info("Full Mortgage Application Selected");
		}
		captureScreen(driver);
	}
	public void SelApplicationTypeDIP() throws IOException
	{
		driver.findElement(By.xpath("/html/body/div[3]/section/section[1]/div/article/div/div/div[2]/button[1]")).click();		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		Boolean apptype= driver.getPageSource().contains("Decision In Principle");
		
		if(apptype==true)
			
		{
			logger.info("Decision In Principle Application Selected");
		}
		captureScreen(driver);
	}
	
	public void ClickonApplyandStartButton() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(@id,'btn-apply-for-mortgage-available')]")).click();		// Click on Apply Button
		driver.findElement(By.xpath("//button[contains(@id,'bot2-Msg1')]")).click();		//Click on start Application
		Thread.sleep(3000);
	}
	
	public void ClickOnEditApplication() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//i[contains(@class,'fa fa-edit fa-2x')]")).click();			//Edit Application
		logger.info("Clicked on Edit Application");
	}
	
	public void getAddress() throws InterruptedException, IOException
	{
		logger.info("on address details page");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[contains(.,'Manually Set Address')]")).click();
			captureScreen(driver);
			System.out.println("Moved to address details page");
			Thread.sleep(2000);
			driver.findElement(By.id("FlatNumber")).sendKeys("1");
			driver.findElement(By.id("BuildingName")).sendKeys("1 Warwick Apartments");
			driver.findElement(By.id("BuildingNumber")).sendKeys("1");
			driver.findElement(By.id("StreetName")).sendKeys("Warwick Place");
			driver.findElement(By.id("Town")).sendKeys("Cheltenham");
			driver.findElement(By.id("County")).sendKeys("Gloucestershire");
			driver.findElement(By.id("PostCode")).sendKeys("GL52 2NP");
			driver.findElement(By.id("CountryId_button")).click();
			driver.findElement(By.linkText("United Kingdom")).click();
//			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[contains(.,'Update Address')]")).click();
			logger.info("Address Details updated successfully");
			Thread.sleep(2000);
	}
	
	public void getBrokerFees() throws InterruptedException
	{
		logger.info("Click on Broker Fees");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@id,'Y8WfL71Wa06RMJhOgZUbHw_button')]")).click();
		
		
		driver.findElement(By.linkText("Not Refundable")).click();
		
		logger.info("On Edit Broker Fees page");
		
		driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[62]")).click();
		driver.findElement(By.xpath("//button[@type='button'][contains(.,'Update Broker Fee')]")).click();
	}
	
	public void ScrollByPixel() 
	{
     
		 JavascriptExecutor js = (JavascriptExecutor) driver;

	        // This  will scroll down the page by  1000 pixel vertical		
	        js.executeScript("window.scrollBy(0,500)");

    }
	
	public void explicitlywait(String xpath)
	{
		WebDriverWait expwait=new WebDriverWait(driver, 50);
	 	WebElement e1=expwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
	 	e1.click();
	 	logger.info("waited and moved ahead");
	}
	
	public void NewCustomerLink()
	{
		driver.findElement(By.xpath("//a[@href='/Case/CreateApplication']")).click();
	}
	
	public void validatetitle()
	{
		String title=(driver.getTitle());
		System.out.println(title);

			if(driver.getTitle().equals(title))
			{
				Assert.assertTrue(true);
				logger.info("Test case passed");
			}
			else
			{
				Assert.assertTrue(false);
				logger.info("Test case failed");
			}
	}
	
	public String Selectdropdown(String id, String text) throws InterruptedException
	{
		Select dropdown= new Select(driver.findElement(By.id(id)));
		dropdown.selectByVisibleText(text);
		Thread.sleep(2000);
		return text;		
	}
	
	public String SelectdropdownIndex(String id, String index) throws InterruptedException
	{
		Select dropdown= new Select(driver.findElement(By.id(id)));
		dropdown.selectByIndex(Integer.parseInt(index));
		Thread.sleep(2000);
		return index;		
	}
	
	public String Radiobutton(String xpath)
	{
		driver.findElement(By.xpath(xpath)).click();
		return xpath;
	}
	
	public String Sendkeys(String id, String value)
	{
		driver.findElement(By.id(id)).sendKeys(value);
		return value;
	}
	
	public void ProductSelectionMultiComponant() throws InterruptedException
	{
		//Product details
		
				driver.findElement(By.xpath("//label[@for='IsMultiComponent-yes'][contains(.,'Yes')]")).click();	
				logger.info("Is the mortgage a multi-part loan?*");
//				Thread.sleep(2000);
				
				logger.info("Loan part 1");
				
				Select dropdown10= new Select(driver.findElement(By.id("LoanComponents_0__RepaymentType")));
				dropdown10.selectByVisibleText("Capital repayment");	
				logger.info("Capital repayment Selected");
//				Thread.sleep(2000);
				
				Select dropdown11= new Select(driver.findElement(By.id("LoanComponents_0__ProductType")));
				dropdown11.selectByVisibleText("Fixed");	
				logger.info("Fixed Selected");
//				Thread.sleep(2000);
				
				Select dropdown12= new Select(driver.findElement(By.id("LoanComponents_0__Term_Years")));
				dropdown12.selectByVisibleText("15");	
				logger.info("Loan term selected");
//				Thread.sleep(2000);
				
				Select dropdown13= new Select(driver.findElement(By.id("LoanComponents_0__Term_Months")));
				dropdown13.selectByVisibleText("1");	
				logger.info("Loan month selected");
				Thread.sleep(2000);
				
				Sendkeys("LoanComponents_0__CapitalAndInterestAmount", "40000");
				logger.info("Multi-part amount");
				Thread.sleep(2000);
				
				Selectdropdown("LoanComponents_0__PurposeOfLoan", "Remortgage - Existing Balance");
				logger.info("Purpose of loan* selected");
				
				driver.findElement(By.xpath("//button[@type='button'][contains(.,'Find products')]")).click();	
				logger.info("Clicked on find products");
				Thread.sleep(5000);
				
				driver.findElement(By.xpath("(//span[@class='productSelectButton'])[3]")).click();	
				logger.info("Test1 -  2 Year fixed with cash back product Selected");
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//a[contains(@class,'add-another-component addAnother')]")).click();	
				logger.info("Clicked on Add another product");
				Thread.sleep(2000);
				
				
				Selectdropdown("LoanComponents_1__RepaymentType", "Capital repayment");
				logger.info("Capital repayment Selected");
				
				Selectdropdown("LoanComponents_1__ProductType", "Term Tracker");
				logger.info("ProductType Selected");
				
				Selectdropdown("LoanComponents_1__Term_Years", "20");
				logger.info("Year Selected");
				
				Selectdropdown("LoanComponents_1__Term_Months", "1");
				logger.info("Month Selected");
				
				Sendkeys("LoanComponents_1__CapitalAndInterestAmount", "30000");
				logger.info("Multi-part amount");
				Thread.sleep(2000);
				
				Selectdropdown("LoanComponents_1__PurposeOfLoan", "Remortgage - Existing Balance");
				logger.info("Purpose of loan* selected");
				
				driver.findElement(By.xpath("//button[@type='button'][contains(.,'Find products')]")).click();	
				logger.info("Clicked on find products");
				Thread.sleep(5000);
				
				driver.findElement(By.xpath("(//span[contains(@class,'icon icon-chevron-right red')])[35]")).click();
				logger.info("5 Year fixed rate ESIS P1 product Selected");
				Thread.sleep(5000);
		}
	
	public void setTitle(String value) throws InterruptedException
	{
		if(value.equals("Mr"))
		{
			Selectdropdown("Applicants_0__Title", "Mr");
		}
		else if(value.equals("Mrs"))
		{
			Selectdropdown("Applicants_0__Title", "Mrs");
		}
		else if(value.equals("Miss"))
		{
			Selectdropdown("Applicants_0__Title", "Miss");
		}
		else if(value.equals("Ms"))
		{
			Selectdropdown("Applicants_0__Title", "Ms");
		}
		else if(value.equals("Dr"))
		{
			Selectdropdown("Applicants_0__Title", "Dr");
		}
		else if(value.equals("Rev"))
		{
			Selectdropdown("Applicants_0__Title", "Rev");
		}
		else if(value.equals("Sir"))
		{
			Selectdropdown("Applicants_0__Title", "Sir");
		}
		else if(value.equals("Lord"))
		{
			Selectdropdown("Applicants_0__Title", "Lord");
		}
		else if(value.equals("Lady"))
		{
			Selectdropdown("Applicants_0__Title", "Lady");
		}
		else if(value.equals("Sgt"))
		{
			Selectdropdown("Applicants_0__Title", "Sgt");
		}
		else if(value.equals("Dame"))
		{
			Selectdropdown("Applicants_0__Title", "Dame");
		}
		else if(value.equals("Prof"))
		{
			Selectdropdown("Applicants_0__Title", "Prof");
		}
		else if(value.equals("Capt"))
		{
			Selectdropdown("Applicants_0__Title", "Capt");
		}
		else if(value.equals("Duke"))
		{
			Selectdropdown("Applicants_0__Title", "Duke");
		}
		else if(value.equals("HRH"))
		{
			Selectdropdown("Applicants_0__Title", "HRH");
		}
		else if(value.equals("Other"))
		{
			Selectdropdown("Applicants_0__Title", "Other");
		}
	}
}
