package com.ds.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ds.pageLayer.DashboardPage;
import com.ds.pageLayer.ExchangePage;
import com.ds.pageLayer.LoginPage;
import com.ds.testBase.TestBase;
import com.ds.utilities.UtilClass;

public class SellFunctionality extends TestBase{
	@Test
	public void verifySellFunctionalityWithLongtermMarket() throws InterruptedException
	{   String expected="Order Created successfully";
		
		
		dash_obj.enterCompanyName("wipro");
		dash_obj.clickSelectOption();
		
		
		Thread.sleep(3000);
		exchnage_obj.clickSellButton1();
		Thread.sleep(5000);
		exchnage_obj.enterQuantity1("2");
		exchnage_obj.clickSellButton2();
		Thread.sleep(3000);
		String actual=exchnage_obj.getPopupMsg1();
		System.out.println(actual);
		Assert.assertEquals(actual, expected);

}
	@Test
	public void verifySellFunctionalityWithIntradayMarket() throws InterruptedException
	{   String expected="Order Created Successfully";
		
		dash_obj.enterCompanyName("wipro");
		dash_obj.clickSelectOption();
		
		
		Thread.sleep(3000);
		exchnage_obj.clickSellButton1();
		//Thread.sleep(3000);
		exchnage_obj.clickIntradayButton();
		exchnage_obj.enterQuantity1("2");
		exchnage_obj.clickSellButton2();
		Thread.sleep(3000);
		String actual=exchnage_obj.getPopupMsg();
		System.out.println(actual);
		Assert.assertEquals(actual, expected);

}
	@Test
	public void verifySellFunctionalityWithIntradayWithLimitOrder() throws InterruptedException
	{   String expected="Limit Order Created successfully";
		
		
		
		dash_obj.enterCompanyName("wipro");
		dash_obj.clickSelectOption();
		
		
		Thread.sleep(3000);
		exchnage_obj.clickSellButton1();
		Thread.sleep(3000);
		exchnage_obj.clickIntradayButton();
		exchnage_obj.clickCustomButton();
		exchnage_obj.enterQuantity1("2");
		exchnage_obj.clickSellButton2();
		Thread.sleep(3000);
		String actual=exchnage_obj.getPopupMsg2();
		System.out.println(actual);
		Assert.assertEquals(actual, expected);

}
	@Test
	public void verifySellFunctionalityWithLongTermLimitOrder() throws InterruptedException
	{   String expected="Limit Order Created successfully";
		
		
		
		dash_obj.enterCompanyName("wipro");
		dash_obj.clickSelectOption();
		
		
		Thread.sleep(6000);
		exchnage_obj.clickSellButton1();
		Thread.sleep(3000);
		exchnage_obj.clickLongTermButton();
		exchnage_obj.enterQuantity1("2");
		exchnage_obj.clickSellButton2();
		Thread.sleep(3000);
		String actual=exchnage_obj.getPopupMsg2();
		System.out.println(actual);
		Assert.assertEquals(actual, expected);

}
}