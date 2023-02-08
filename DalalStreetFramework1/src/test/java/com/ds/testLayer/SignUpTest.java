package com.ds.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ds.pageLayer.SignUpPage;
import com.ds.testBase.TestBase;
import com.ds.utilities.UtilClass;

public class SignUpTest extends TestBase{
	@Test
	public void verifySignUpWithCorrectCred() throws InterruptedException
	{String expectedurl="https://apps.dalalstreet.ai/dashboard";
		
		sign_obj.clickOnSignUp();
		Thread.sleep(5000);
		sign_obj.enterFirstName("Monika");
		Thread.sleep(5000);
		sign_obj.enterLastName("Mande");
		sign_obj.emailId("shreejamande@gmail.com");
		sign_obj.enterPassword("Avira@123");
		sign_obj.clickCheckbox();
		sign_obj.clickStartBtn();
		
		Thread.sleep(3000);
		String actual=util_obj.getWebPageUrl();
		
		Assert.assertEquals(actual, expectedurl);
	}
	

}
