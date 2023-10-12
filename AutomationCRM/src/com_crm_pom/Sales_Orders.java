package com_crm_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sales_Orders {
	@FindBy(xpath = "//input[@value='New Sales Order']")
	private WebElement newsalesbtn;
	@FindBy(xpath = "//input[@name='property(Subject)']")
	private WebElement subject;
	@FindBy(xpath = "//input[@name='property(Customer No)']")
	private WebElement CustomerNo;
	@FindBy(xpath = "//input[@name='property(Quote Name)']")
	private WebElement QuoteName;
	@FindBy(xpath = "//input[@name='property(Pending)']")
	private WebElement pending;
	@FindBy(xpath = "//input[@name='property(Sales Commission)']")
	private WebElement SalesCommission;
	@FindBy(xpath = "//input[@name='property(Account Name)']")
	private WebElement AcountName;
	@FindBy(xpath = "property(Potential Name)")
	private WebElement PotentialName;
	@FindBy(xpath = "//input[@name='property(Purchase Order)']")
	private WebElement PurchaseOrder;
	@FindBy(xpath = "//input[@name='property(Due Date)']")
	private WebElement DueDate;
	@FindBy(xpath = "//input[@name='property(Conpropertytact Name)']")
	private WebElement ContactName;
	@FindBy(xpath = "//input[@name='property(Excise Duty)']")
	private WebElement ExciseDuty;
	@FindBy(xpath = "//input[@name='property(Billing Street)']")
	private WebElement billingstreet;
	@FindBy(xpath = "//input[@name='property(Billing City)']")
	private WebElement billingcity;
	@FindBy(xpath = "//input[@name='property(Billing State)']")
	private WebElement billingstate;
	@FindBy(xpath = "//input[@name='property(Billing Code)']")
	private WebElement billingcode;
	@FindBy(xpath = "//input[@name='property(Billing Country)']")
	private WebElement billingcountry;
	@FindBy(xpath = "//input[@name='property(Shipping Street)']")
	private WebElement shippnigstreet;
	@FindBy(xpath = "//input[@name='property(Shipping City)']")
	private WebElement shippingcity;
	@FindBy(xpath = "//input[@name='property(Shipping State)']")
	private WebElement shippingstate;
	@FindBy(xpath = "//input[@name='property(Shipping Code)']")
	private WebElement shippingcode;
	@FindBy(xpath = "//input[@name='property(Shipping Country)']")
	private WebElement shippingcountry;
	@FindBy(xpath = "//input[@id='txtProduct1']")
	private WebElement prdtname;
	@FindBy(id = "hdnProductCode1")
	private WebElement prdtcode;
	@FindBy(id = "hdnQtyStock1")
	private WebElement QtyInStock;
	@FindBy(id = "txtQty1")
	private WebElement Qty;
	@FindBy(id = "hdnUnitPrice1")
	private WebElement unitprice;
	@FindBy(xpath = "//input[@id='txtListPrice1']")
	private WebElement Listprice;
	@FindBy(xpath = "//div[@id='subTotal']")
	private WebElement subtotal;
	@FindBy(xpath = "//input[@id='txtTax']")
	private WebElement tax;
	@FindBy(xpath = "//input[@id='txtAdjustment']")
	private WebElement adjustment;
	@FindBy(xpath = "//div[@id='grandTotal']")
	private WebElement grandtotal;
	@FindBy(name = "property(Terms and Conditions)")
	private WebElement termandconditions;
	@FindBy(name = "property(Description)")
	private WebElement description;
	@FindBy(xpath = "(//input[@class='button'and@value='Save'])[2]")
	private WebElement save;

	public Sales_Orders(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement setNewsalesbtn() {
		return newsalesbtn ;
	}

	public WebElement setSubject() {
		return subject;
	}

	public WebElement setCustomerNo() {
	return CustomerNo;
	}

	public WebElement setQuoteName() {
		return QuoteName ;
	}

	public WebElement setPending() {
		return pending;
	}

	public WebElement setSalesCommission() {
		return SalesCommission;
	}

	public WebElement setAcountName() {
		return AcountName;
	}

	public WebElement setPotentialName() {
		return PotentialName ;
	}

	public WebElement setPurchaseOrder() {
		return PurchaseOrder;
	}

	public WebElement setDueDate() {
		return DueDate;
	}

	public WebElement setContactName() {
		return ContactName;
	}

	public WebElement setExciseDuty() {
		return ExciseDuty;
	}

	public WebElement setBillingstreet() {
		return billingstreet ;
	}

	public WebElement setBillingcity() {
		 return billingcity ;
	}

	public WebElement setBillingstate() {
		 return billingstate;
	}

	public WebElement setBillingcode() {
		return billingcode;
	}

	public WebElement setBillingcountry() {
		return billingcountry;
	}

	public WebElement setShippnigstreet() {
		return shippnigstreet;
	}

	public WebElement setShippingcity() {
		return shippingcity;
	}

	public WebElement setShippingstate() {
		return shippingstate ;
	}

	public WebElement setShippingcode() {
		return shippingcode;
	}

	public WebElement setShippingcountry() {
		return shippingcountry;
	}

	public WebElement setPrdtname() {
	 return	prdtname;
	}

	public WebElement setPrdtcode() {
	return	prdtcode ;
	}

	public WebElement setQtyInStock() {
	return	QtyInStock ;
	}

	public WebElement setQty() {
	return	Qty;
	}

	public WebElement setUnitprice() {
	return unitprice;
	}

	public WebElement setListprice() {
	return	Listprice;
	}

	public WebElement setSubtotal() {
	return	subtotal;
	}

	public WebElement setTax() {
	return	tax;
	}

	public WebElement setAdjustment() {
	return	adjustment ;
	}

	public WebElement setGrandtotal() {
	return	grandtotal;
	}

	public WebElement setTermandconditions() {
return	termandconditions ;
	}

	public WebElement setDescription() {
	return	description;
	}

	public WebElement setSave() {
	return	save;
	}












}
