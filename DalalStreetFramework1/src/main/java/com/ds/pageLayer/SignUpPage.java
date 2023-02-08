package com.ds.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
	public SignUpPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//a[@class='fw-medium text-primary']")
	private WebElement signup_page_link;
	
	@FindBy(xpath="//input[@name='firstName']")
	private WebElement first_name_textbox;
	@FindBy(xpath="//input[@name='lastName']")
	private WebElement last_name_textbox;
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement email_id_textbox;
	@FindBy(xpath="//input[@name='password']")
	private WebElement password_textbox;
	
	@FindBy(xpath="//input[@name='agreement']")
	private WebElement agree_checkbox;
	
	
	@FindBy(xpath="//button[contains(text(),'Get your journey started')]")
	private WebElement start_btn;
	
	public void clickOnSignUp()
	{
		signup_page_link.click();
	}
	
	public void enterFirstName(String firstname)
	{
		first_name_textbox.sendKeys(firstname);
	}
	public void enterLastName(String lastname)
	{
		last_name_textbox.sendKeys(lastname);
	}
	public void emailId(String email)
	{
		email_id_textbox.sendKeys(email);
	}
	public void enterPassword(String password)
	{
		password_textbox.sendKeys(password);
	}
	public void clickCheckbox()
	{
		agree_checkbox.click();
	}
	public void clickStartBtn()
	{
		start_btn.click();
	}
	

}
