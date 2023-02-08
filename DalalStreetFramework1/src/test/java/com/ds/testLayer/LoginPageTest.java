package com.ds.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ds.pageLayer.LoginPage;
import com.ds.testBase.TestBase;
import com.ds.utilities.UtilClass;

public class LoginPageTest extends TestBase {
	
	@Test
	public void verifyLoginWithCorrectCred() throws InterruptedException
	{  String expectedurl="https://apps.dalalstreet.ai/dashboard";

		
	String actualurl=util_obj.getWebPageUrl();
	Assert.assertEquals(actualurl, expectedurl);
		
		
		
	}

}
