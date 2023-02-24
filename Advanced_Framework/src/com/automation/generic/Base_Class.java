package com.automation.generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.automation.pageobject.Login_Page;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Base_Class implements Framework_Constants
{
	public ExtentHtmlReporter reporter;
	public ExtentReports report;
	public ExtentTest test;
	public static WebDriver driver;
	public Login_Page login_page;
	public String url;
	public String username;
	public String password;
	
	@BeforeTest
	public void reports()
	{
		reporter=new ExtentHtmlReporter(ExtentPath);
		report=new ExtentReports();
		report.attachReporter(reporter);
		test = report.createTest("Extent Test");
	}
	
	@BeforeClass
	public void openBrowser()
	{
		System.setProperty(GECKO_KEY, GECKO_VALUE);
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
	}
	
	@BeforeMethod
	public void login() throws IOException
	{
		driver.get(ReadDataFromProperty.getProperty("url"));
		login_page=new Login_Page(driver);
		login_page.loginlink().click();
		login_page.email_add().sendKeys(ReadDataFromProperty.getProperty("username"));
		login_page.password().sendKeys(ReadDataFromProperty.getProperty("password"));
		login_page.rem_check().click();
		login_page.login_button().click();
	}
	
	@AfterMethod
	public void logout()
	{
		login_page.logout_button();
	}
	
	@AfterClass
	public void closeBrowser() 
	{
		driver.quit();
	}
	
	@AfterTest
	public void stopReporting()
	{
		report.flush();
	}
}
