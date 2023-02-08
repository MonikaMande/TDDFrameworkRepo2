package com.ds.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	public DashboardPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@class='form-control']")
	private WebElement search_textbox;
	
	@FindBy(xpath="(//div[@class='m-4 card'])[2]")
	private WebElement select_option;
	
	@FindBy(xpath="//button[@id='page-header-user-dropdown']")
	private WebElement dropdown;
	
	@FindBy(xpath="//span[text()='Power Off']")
	private WebElement poweroff_option;
	
	@FindBy(xpath="//a[text()='Transactions']")
	private WebElement transaction_link;
	
	
	public void enterCompanyName(String companyname)
	{
		search_textbox.sendKeys(companyname);
	}
	public void clickSelectOption()
	{
		select_option.click();
	}

	public void clickDropdown()
	{
		dropdown.click();
	}
	public void clickPowerOff()
	{
		poweroff_option.click();
	}

	public void clickTransactionLink()
	{
		transaction_link.click();
	}



}
