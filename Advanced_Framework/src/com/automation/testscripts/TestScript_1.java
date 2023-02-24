package com.automation.testscripts;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.automation.generic.Base_Class;
import com.automation.generic.Utility_Methods;
import com.automation.pageobject.Scenario_demowebshop;
import com.aventstack.extentreports.Status;

@Listeners(com.automation.generic.ListenerClass.class)

public class TestScript_1 extends Base_Class
{
	@Test
	public void script() throws InterruptedException
	{
		Scenario_demowebshop sdw=new Scenario_demowebshop(driver);
		sdw.apparel_tab().click();
		Utility_Methods.select_dropdown(sdw.sortby_drop()).selectByVisibleText("Name: A to Z");
		Utility_Methods.select_dropdown(sdw.display_drop()).selectByVisibleText("12");
		Utility_Methods.select_dropdown(sdw.view_drop()).selectByVisibleText("List");
		Utility_Methods.JavaScript_Scroll(driver)
		                 .executeScript("window.scrollBy(0,400)");
		Thread.sleep(1500);
		sdw.jeans_addcart().click();
		Thread.sleep(1500);
		sdw.belt_addcart().click();
		sdw.shopping_cart().click();
		String j_cost = sdw.jeans_cost().getText();
		double convertedJeansCost = Utility_Methods.conversionToDouble(j_cost);
		String b_cost = sdw.belt_cost().getText();
		double convertedBeltCost = Utility_Methods.conversionToDouble(b_cost);
		
		if(convertedJeansCost == convertedBeltCost)
		{
			test.log(Status.INFO, "Both the prices are same");
		}
		else if(convertedJeansCost > convertedBeltCost)
		{
			sdw.j_cbox().click();
			sdw.updateCart_btn().click();
			test.log(Status.INFO, "Jeans is costlier");
		}
		else
		{
			sdw.b_cbox().click();
			sdw.updateCart_btn().click();
			test.log(Status.INFO, "Belt is costlier");
		}
		
	}
}