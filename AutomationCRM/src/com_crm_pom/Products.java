package com_crm_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Products {
	@FindBy(xpath="//input[@value='New Product']")
	private WebElement newproductbtn;
	@FindBy(name="property(Product Code)")
	private WebElement prdcode;
	@FindBy(name="property(Product Category)")
	private WebElement prdcategeory;
	@FindBy(xpath="//input[@name='property(Sales End Date)']")
	private WebElement salesenddata;
	@FindBy(xpath="//input[@name= 'property(Support Expiry Date)']")
	private WebElement supportexpiry;
	@FindBy(xpath="//input[@name='property(Product Name)']")
	private WebElement prodname;
	@FindBy(xpath = "//input[@name='property(Vendor Name)']")
	private WebElement vendorname;
	@FindBy(name = "property(Manufacturer)")
	private WebElement Manufacturer;
	@FindBy(xpath = "//input[@name='property(Sales Start Date)']")
	private WebElement salesstartdate;
	@FindBy(xpath = "//input[@name='property(Support Start Date)']")
	private WebElement supportdate;
	@FindBy(xpath = "//input[@name='property(Unit Price)']")
	private WebElement unitprice;
	@FindBy(xpath = "//input[@name='property(Commission Rate)']")
	private WebElement commissionrate;
	@FindBy(xpath = "//input[@name='property(Qty in Stock)']")
	private WebElement Qtystock;
	@FindBy(xpath = "//input[@name='property(Qty/Unit)']")
	private WebElement QtyUnit;
	@FindBy(xpath = "//input[@name='property(Reorder Level)']")
	private WebElement ReorderLevel;
	@FindBy(xpath = "//input[@name='property(Qty in Demand)']")
	private WebElement QtyDemand;
	@FindBy(name = "property(Description)")
	private WebElement Description;
	@FindBy(xpath = "(//input[@name='Button'and@value='Save'])[2]")
	private WebElement save;

	public Products(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public WebElement setnewproductbutton() 
	{
		return newproductbtn;
	}
	public WebElement setproductcode() 
	{
		return prdcode;
	}
	public WebElement setProductCategory() 
	{
		return prdcategeory;
	}
	public WebElement setSalesEndDate() 
	{
		return salesenddata;
	}
	public WebElement setSupportExpiryDate() 
	{
		return supportexpiry;
	}
	public WebElement setProductName() 
	{
		return prodname;
	}
	public WebElement setVendorName() 
	{
		return vendorname;
	}
	public WebElement setManufacturer() 
	{
		return Manufacturer;
	}
	public WebElement setSalesStartDate() 
	{
		return salesstartdate;
	}
	public WebElement setSupportStartDate() 
	{
		return supportdate;
	}
	public WebElement setUnitPrice() 
	{
		return unitprice;
	}
	public WebElement setCommissionRate() 
	{
	   return commissionrate;
	}
	public WebElement setQtyinStock() 
	{
		return Qtystock;
	}
	public WebElement setQtyUnit() 
	{
		return QtyUnit;
	}
	public WebElement setReorderLevel() 
	{
	   return ReorderLevel;	
	}
	public WebElement setQtyinDemand() 
	{
		return QtyDemand;
	}
	public WebElement setDescription() 
	{
	    return Description;
	}
	public WebElement setSavebutton() 
	{
		return save;
	}
}















