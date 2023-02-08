package com.ds.testLayer;

import org.testng.annotations.Test;

import com.ds.pageLayer.DashboardPage;
import com.ds.pageLayer.LoginPage;
import com.ds.pageLayer.TransactionPage;
import com.ds.testBase.TestBase;

public class GetTransactionData extends TestBase {
	
	@Test
	public void getDataFromTransactionPage() throws InterruptedException
	{
		LoginPage login_obj=new LoginPage(driver);
		DashboardPage dash_obj=new DashboardPage(driver);
		TransactionPage transaction_obj=new TransactionPage(driver);
		login_obj.enterEmail("sanumande999@gmail.com");
		login_obj.enterpassword("Avira@1234");
		login_obj.click();
		Thread.sleep(3000);
		dash_obj.clickTransactionLink();
		Thread.sleep(3000);
		transaction_obj.getData();
		transaction_obj.getAllData();
		
		

}
	

}
