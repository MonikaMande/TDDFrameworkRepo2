package com.ds.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ds.pageLayer.DashboardPage;
import com.ds.pageLayer.LoginPage;
import com.ds.testBase.TestBase;
import com.ds.utilities.UtilClass;

public class LogoutFunctionality extends TestBase {
	
	@Test
	public void verifyLogoutFunctionality() throws InterruptedException
	{String expectedurl="https://apps.dalalstreet.ai/logout";
		
		dash_obj.clickDropdown();
		dash_obj.clickPowerOff();
		
	System.out.println(	util_obj.getWebPageUrl());
		
	String actualurl=util_obj.getWebPageUrl();
	Assert.assertEquals(actualurl, expectedurl);
		
		
		
	}

}
