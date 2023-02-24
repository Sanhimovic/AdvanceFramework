package com.automation.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page 
{
	@FindBy(xpath="//a[text()='Log in']")
	private WebElement login_link;
	
	@FindBy(id="Email")
	private WebElement email_text;
	
	@FindBy(id="Password")
	private WebElement pass_text;
	
	@FindBy(id="RememberMe")
	private WebElement rem_cbox;
	
	@FindBy(xpath="//input[@value='Log in']")
	private WebElement login_btn;
	
	@FindBy(xpath="//a[text()='Log out']")
	private WebElement logout_btn;
	
	public Login_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement loginlink()
	{
		return login_link;
	}
	
	public WebElement email_add()
	{
		return email_text;
	}
	
	public WebElement password()
	{
		return pass_text;
	}
	
	public WebElement rem_check()
	{
		return rem_cbox;
	}
	
	public WebElement login_button()
	{
		return login_btn;
	}
	
	public WebElement logout_button()
	{
		return logout_btn;
	}
	
}
