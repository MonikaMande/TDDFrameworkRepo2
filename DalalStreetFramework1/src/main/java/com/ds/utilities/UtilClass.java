package com.ds.utilities;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ds.testBase.TestBase;

public class UtilClass extends TestBase {
	public UtilClass()
	{
		PageFactory.initElements(driver, this);
		
	}
	public String getWebPageUrl()
	{
		
		String url=driver.getCurrentUrl();
		return url;
	}
	
	public static void takeSS(String filename) 
	{
		String path="C:\\Users\\monik\\eclipse-workspace\\DalalStreetFramework1\\screenshots\\";
		
		
		try 
		{	 
			TakesScreenshot ts=(TakesScreenshot)driver;
		    File src=ts.getScreenshotAs(OutputType.FILE);
		
		    File des=new File(path+filename+" .png");
			FileHandler.copy(src, des);
		} 
		catch (IOException e) 
		{
			
			e.printStackTrace();
		}

	
	
	}

		
}
