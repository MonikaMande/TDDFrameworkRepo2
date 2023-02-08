package com.ds.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement email_textbox;
	@FindBy(xpath="//input[@name='password']")
	private WebElement password_textbox;
	@FindBy(xpath="//button[text()='Log In']")
	private WebElement login_btn;
	
	public void enterEmail(String email)
	{
		email_textbox.sendKeys(email);
	}
	public void enterpassword(String password)
	{
		password_textbox.sendKeys(password);
	}
	public void click()
	{
		login_btn.click();
	}
	

}
