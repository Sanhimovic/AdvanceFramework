package com.automation.generic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utility_Methods 
{
	public static Select select_dropdown(WebElement dropdown)
	{
		Select sel=new Select(dropdown);
		return sel;
	}
	
	public static JavascriptExecutor JavaScript_Scroll(WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		return js;
	}
	
	public static double conversionToDouble(String data)
	{
		double convertedData = Double.parseDouble(data);
		return convertedData;
	}
}
