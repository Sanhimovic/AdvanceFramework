package com.automation.generic;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass extends Base_Class implements ITestListener
{
	@Override
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("The passed test case is :"+ result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		System.out.println("The failed test case is :"+ result.getName());
		ScreenShot.getPhoto(Base_Class.driver,result);
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		System.out.println("The skipped test case is :"+ result.getName());
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) 
	{
		System.out.println("The test case is :"+ result.getName());
	}
}