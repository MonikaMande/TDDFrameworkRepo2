package com.ds.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExchangePage {
	
	public ExchangePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Buy']")
	private WebElement buy_button1;
	
	@FindBy(xpath="//input[@name='input-Qunatity']")
	private WebElement quantity_textbox;
	
	@FindBy(xpath="//button[text()='Buy']")
	private WebElement buy_button2;
	
	@FindBy(xpath="//div[contains(text(),'Order Created')]")
	private WebElement popup_message;
	
	@FindBy(xpath="//a[text()='Sell']")
	private WebElement sell_button1;
	
	@FindBy(xpath="//input[@id='quantity']")
	private WebElement quantity_textbox1;
	
	@FindBy(xpath="//button[text()='Sell']")
	private WebElement sell_button2;
	
	@FindBy(xpath="//div[text()='Order Created successfully']")
	private WebElement popup_message1;
	
	@FindBy(xpath="//div[text()='Limit Order Created Successfully']")
	private WebElement popup_message2;
	
	@FindBy(xpath="//label[text()='Intraday']")
	private WebElement intraday_button;
	
	@FindBy(xpath="//label[text()='Custom Limit']")
	private WebElement custom_button;
	
	@FindBy(xpath="//label[text()='Long-term']")
	private WebElement longterm_button;
	
	public void clickBuyButton1()
	{
		buy_button1.click();
	}
	public void enterQuantity(String count)
	{quantity_textbox.click();
		quantity_textbox.sendKeys(count);
	}
	public void clickBuyButton2()
	{
		buy_button2.click();
	}
	
	public String getPopupMsg()
	{
		String msg=popup_message.getText();
		return msg;
	}
	
	
	public void clickSellButton1()
	{
		sell_button1.click();
	}
	public void enterQuantity1(String count)
	{quantity_textbox1.click();
		quantity_textbox1.sendKeys(count);
	}
	public void clickSellButton2()
	{
		sell_button2.click();
	}
	public String getPopupMsg1()
	{
		String msg1=popup_message1.getText();
		return msg1;
	}
	public void clickIntradayButton() {
		
		intraday_button.click();
	}
	public void clickCustomButton() {
		
		custom_button.click();
	}
	public String getPopupMsg2()
	{
		String msg=popup_message2.getText();
		return msg;
	}
	public void clickLongTermButton() {
		
		longterm_button.click();
	}
	

}
