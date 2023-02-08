package com.ds.testBase;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.ds.pageLayer.DashboardPage;
import com.ds.pageLayer.ExchangePage;
import com.ds.pageLayer.LoginPage;
import com.ds.pageLayer.SignUpPage;
import com.ds.pageLayer.TransactionPage;
import com.ds.utilities.ReadConfig;
import com.ds.utilities.UtilClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static WebDriver driver; 
	public static Logger logger;
	
	public LoginPage login_obj;
	public SignUpPage sign_obj;
	public DashboardPage dash_obj;
	public ExchangePage exchnage_obj;
	public TransactionPage transaction_obj;
	public UtilClass util_obj;
	
	@BeforeTest
	public void start()
	{
		 logger = Logger.getLogger("DalalStreet Automation Framework");
		PropertyConfigurator.configure("Log4jfile.properties");
		logger.info("Framework Execution started");
	}
	@AfterTest
	public void end()
	{
		logger.info("Framework execution stopped");
	}
	
	@Parameters("browser")
	@BeforeMethod
	public void setUp(String s)
	{ 
		if(s.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(s.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if(s.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			
		}
		else 
		{
			System.out.println("Please provide correct browser name");
		}	
		
		ReadConfig read_config = new ReadConfig();
		driver.get(read_config.getApplicationUrl());
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		logger.info("Browser launches, url, maximize");
		//----object creation-----
		
		 login_obj=new LoginPage(driver);
		 sign_obj=new SignUpPage(driver);
		 dash_obj=new DashboardPage(driver);
		 exchnage_obj=new ExchangePage(driver);
		 transaction_obj=new TransactionPage(driver);
		 util_obj=new UtilClass();
		 logger.info("Object Creation");
		//---- login steps-----
		 login_obj=new LoginPage(driver);
		 util_obj=new UtilClass();
		login_obj.enterEmail("sanumande999@gmail.com");
		login_obj.enterpassword("Avira@1234");
		login_obj.click();
		logger.info("Login the application");
	}
	
	@AfterMethod
	public void tearDown()
	{
		//driver.quit();
		
	}

}
