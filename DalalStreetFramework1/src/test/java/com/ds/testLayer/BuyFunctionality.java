package com.ds.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ds.pageLayer.DashboardPage;
import com.ds.pageLayer.ExchangePage;
import com.ds.pageLayer.LoginPage;
import com.ds.testBase.TestBase;
import com.ds.utilities.UtilClass;

public class BuyFunctionality extends TestBase{
	@Test
	public void verifyBuyFunctionalityLongTermWithMarket() throws InterruptedException
	{  String expected="Order Created successfully";
		
		
		
		dash_obj.enterCompanyName("wipro");
		dash_obj.clickSelectOption();
		logger.info("exchnage ");
		Thread.sleep(3000);
		exchnage_obj.clickBuyButton1();
		exchnage_obj.enterQuantity("2");
		
		exchnage_obj.clickBuyButton2();
		Thread.sleep(3000);
		logger.info("Order created successfully");
		String actual=exchnage_obj.getPopupMsg();
		System.out.println(actual);
		Assert.assertEquals(actual, expected);
	}	
		
		@Test
		public void verifyBuyFunctionalityIndtradayWithMarket() throws InterruptedException
		{  String expected="Order Created Successfully";
			LoginPage login_obj=new LoginPage(driver);
			//UtilClass util_obj=new UtilClass();
			DashboardPage dash_obj=new DashboardPage(driver);
			
			ExchangePage exchnage_obj=new ExchangePage(driver);
			login_obj.enterEmail("sanumande999@gmail.com");
			login_obj.enterpassword("Avira@1234");
			login_obj.click();
			Thread.sleep(3000);
			
			
			dash_obj.enterCompanyName("wipro");
			dash_obj.clickSelectOption();
			
			Thread.sleep(3000);
			exchnage_obj.clickBuyButton1();
			exchnage_obj.clickIntradayButton();
			exchnage_obj.enterQuantity("2");
			
			exchnage_obj.clickBuyButton2();
			Thread.sleep(3000);
			String actual=exchnage_obj.getPopupMsg();
			System.out.println(actual);
			Assert.assertEquals(actual, expected);
			
		

	}
		
		@Test
		public void verifyBuyFunctionalityIndtradayWithLimitOrder() throws InterruptedException
		{  String expected="Limit Order Created Successfully";
			LoginPage login_obj=new LoginPage(driver);
			//UtilClass util_obj=new UtilClass();
			DashboardPage dash_obj=new DashboardPage(driver);
			
			ExchangePage exchnage_obj=new ExchangePage(driver);
			login_obj.enterEmail("sanumande999@gmail.com");
			login_obj.enterpassword("Avira@1234");
			login_obj.click();
			Thread.sleep(3000);
			
			
			dash_obj.enterCompanyName("wipro");
			dash_obj.clickSelectOption();
			
			Thread.sleep(3000);
			exchnage_obj.clickBuyButton1();
			exchnage_obj.clickIntradayButton();
			exchnage_obj.clickCustomButton();
			exchnage_obj.enterQuantity("2");
			
			exchnage_obj.clickBuyButton2();
			Thread.sleep(3000);
			String actual=exchnage_obj.getPopupMsg2();
			System.out.println(actual);
			Assert.assertEquals(actual, expected);
			
		

	}
		@Test
		public void verifyBuyFunctionalityLogTermWithLimitOrder() throws InterruptedException
		{  String expected="Limit Order Created Successfully";
			LoginPage login_obj=new LoginPage(driver);
			//UtilClass util_obj=new UtilClass();
			DashboardPage dash_obj=new DashboardPage(driver);
			
			ExchangePage exchnage_obj=new ExchangePage(driver);
			login_obj.enterEmail("sanumande999@gmail.com");
			login_obj.enterpassword("Avira@1234");
			login_obj.click();
			Thread.sleep(3000);
			
			
			dash_obj.enterCompanyName("wipro");
			dash_obj.clickSelectOption();
			
			Thread.sleep(3000);
			exchnage_obj.clickBuyButton1();
			exchnage_obj.clickLongTermButton();
			exchnage_obj.clickCustomButton();
			exchnage_obj.enterQuantity("2");
			
			exchnage_obj.clickBuyButton2();
			Thread.sleep(3000);
			String actual=exchnage_obj.getPopupMsg2();
			System.out.println(actual);
			Assert.assertEquals(actual, expected);
			
		

	}


}
