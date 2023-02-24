package com.automation.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Scenario_demowebshop 
{
	@FindBy(xpath="//div[@class='header-menu']/ul[1]/li[4]")
	private WebElement apparel;
	
	@FindBy(xpath="//select[@id='products-orderby']")
	private WebElement sort_by;
	
	@FindBy(xpath="//select[@id='products-pagesize']")
	private WebElement display;
	
	@FindBy(xpath="//select[@id='products-viewmode']")
	private WebElement view;
	
	@FindBy(xpath="//h1[text()='Apparel & Shoes']/../following-sibling::div/div[3]/div[3]/div[1]/div[2]/div[3]/div[2]/input")
	private WebElement jeans_btn;
	
	@FindBy(xpath="//h1[text()='Apparel & Shoes']/../following-sibling::div/div[3]/div[4]/div[1]/div[2]/div[3]/div[2]/input")
	private WebElement belt_btn;
	
	@FindBy(xpath="//span[text()='Shopping cart']")
	private WebElement cart_btn;
	
	@FindBy(xpath="//tr[@class='cart-header-row']/../following-sibling::tbody/tr[2]/td[6]/span[2]")
	private WebElement jeans_price;
	
	@FindBy(xpath="//tr[@class='cart-header-row']/../following-sibling::tbody/tr[1]/td[6]/span[2]")
	private WebElement belt_price;
	
	@FindBy(xpath="//input[@name='updatecart']")
	private WebElement update_cart;
	
	@FindBy(xpath="//table[@class='cart']/tbody/tr[1]/td[1]/input")
	private WebElement jeans_cbox;
	
	@FindBy(xpath="//table[@class='cart']/tbody/tr[2]/td[1]/input")
	private WebElement belt_cbox;
	
	public Scenario_demowebshop(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement apparel_tab()
	{
		return apparel;
	}
	
	public WebElement sortby_drop()
	{
		return sort_by;
	}
	
	public WebElement display_drop()
	{
		return display;
	}
	
	public WebElement view_drop()
	{
		return view;
	}
	
	public WebElement jeans_addcart()
	{
		return jeans_btn;
	}
	
	public WebElement belt_addcart()
	{
		return belt_btn;
	}
	
	public WebElement shopping_cart()
	{
		return cart_btn;
	}
	
	public WebElement jeans_cost()
	{
		return jeans_price;
	}
	
	public WebElement belt_cost()
	{
		return belt_price;
	}
	
	public WebElement updateCart_btn()
	{
		return update_cart;
	}
	
	public WebElement j_cbox()
	{
		return jeans_cbox;
	}
	
	public WebElement b_cbox()
	{
		return belt_cbox;
	}
	
}
