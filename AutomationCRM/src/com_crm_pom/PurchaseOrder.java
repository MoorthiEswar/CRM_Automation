package com_crm_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PurchaseOrder {
	@FindBy(xpath="//input[@class='button' and @value='New Purchase Order']")
	private WebElement newPurchaseOrd;
	
	@FindBy(xpath="//input[@name='property(Subject)']")
	private WebElement subjectPO;
	
	@FindBy(xpath="//input[@name='property(Requisition No)']")
	private WebElement requiNo;
	
	@FindBy(xpath="//input[@name='property(Contact Name)']")
	private WebElement contactName;
	
	@FindBy(xpath="//input[@name='property(Due Date)']")
	private WebElement dueDate;
	
	@FindBy(xpath="//input[@name='property(Excise Duty)']")
	private WebElement exciseDuty;
	
	@FindBy(xpath="//select[@name='property(Status)']")
	private WebElement status;
	
	@FindBy(xpath="//input[@name='property(PO Number)']")
	private WebElement poNumber;
	
	@FindBy(xpath="//img[@title='Vendor Name Lookup']")
	private WebElement vendorName;
	
	@FindBy(xpath="//input[@name='property(Tracking Number)']")
	private WebElement trackingNum;
	
	@FindBy(xpath="//input[@name='property(PO Date)']")
	private WebElement poDate;
	
	@FindBy(xpath="//select[@name='property(Carrier)']")
	private WebElement carrier;
	
	@FindBy(xpath="//input[@name='property(Sales Commission)']")
	private WebElement salesComm;
	
	@FindBy(xpath="//input[@name='property(Billing Street)']")
	private WebElement billingStreet;
	
	@FindBy(xpath="//input[@name='property(Billing City)']")
	private WebElement billingCity;
	
	@FindBy(xpath="//input[@name='property(Billing State)']")
	private WebElement billingState;
	
	@FindBy(xpath="//input[@name='property(Billing Code)']")
	private WebElement billingCode;
	
	@FindBy(xpath="//input[@name='property(Billing Country)']")
	private WebElement billingCountry;
	
	@FindBy(xpath="//input[@name='property(Shipping Street)']")
	private WebElement shippingStreet;
	
	@FindBy(xpath="//input[@name='property(Shipping City)']")
	private WebElement shippingCity;
	
	@FindBy(xpath="property(Shipping State)")
	private WebElement shippingState;
	
	@FindBy(xpath="//input[@name='property(Shipping Code)']")
	private WebElement shippingCode;
	
	@FindBy(xpath="//input[@name='property(Shipping Country)']")
	private WebElement shippingCountry;
	
	@FindBy(xpath="//input[@id='copyAddress']")
	private WebElement copyAdress;
	
	@FindBy(xpath="//img[@title='Product Name Lookup']")
	private WebElement productName;
	
	@FindBy(xpath="//input[@id='hdnProductCode1']")
	private WebElement productCode;
	
	@FindBy(xpath="//input[@id='hdnQtyStock1']")
	private WebElement qtyStock;
	
	@FindBy(xpath="//input[@id='txtQty1']")
	private WebElement quantity;
	
	@FindBy(xpath="//input[@id='hdnUnitPrice1']")
	private WebElement unitPrice;
	
	@FindBy(xpath="//img[@title='PriceBook Name Lookup']")
	private WebElement listPrice;
	
	@FindBy(xpath="//input[@class='button' and @value='Add Product']")
	private WebElement addProdBtn;
	
	@FindBy(xpath="//textarea[@name='property(Terms and Conditions)']")
	private WebElement termsAndCond;
	
	@FindBy(xpath="//textarea[@name='property(Description)']")
	private WebElement desc;
	
	@FindBy(xpath="//input[@class='button' and @value='Save']")
	private WebElement saveBtn;
	
	@FindBy(xpath="//input[@class='button' and @value='Save & New']")
	private WebElement saveAndNewBtn;
	
	@FindBy(xpath="//input[@class='button' and @value='Cancel']")
	private WebElement cancelBtn;
	
	public PurchaseOrder(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement setNewPurchaseOrd() {
		return newPurchaseOrd;
	}

	public WebElement setSubjectPO() {
		return subjectPO;
	}

	public WebElement setRequiNo() {
		return requiNo;
	}

	public WebElement setContactName() {
		return contactName;
	}

	public WebElement setDueDate() {
		return dueDate;
	}

	public WebElement setExciseDuty() {
		return exciseDuty;
	}

	public WebElement setStatus() {
		return status;
	}

	public WebElement setPoNumber() {
		return poNumber;
	}

	public WebElement setVendorName() {
		return vendorName;
	}

	public WebElement setTrackingNum() {
		return trackingNum;
	}

	public WebElement setPoDate() {
		return poDate;
	}

	public WebElement setCarrier() {
		return carrier;
	}

	public WebElement setSalesComm() {
		return salesComm;
	}

	public WebElement setBillingStreet() {
		return billingStreet;
	}

	public WebElement setBillingCity() {
		return billingCity;
	}

	public WebElement setBillingState() {
		return billingState;
	}

	public WebElement setBillingCode() {
		return billingCode;
	}

	public WebElement setBillingCountry() {
		return billingCountry;
	}

	public WebElement setShippingStreet() {
		return shippingStreet;
	}

	public WebElement setShippingCity() {
		return shippingCity;
	}

	public WebElement setShippingState() {
		return shippingState;
	}

	public WebElement setShippingCode() {
		return shippingCode;
	}

	public WebElement setShippingCountry() {
		return shippingCountry;
	}

	public WebElement setCopyAdress() {
		return copyAdress;
	}

	public WebElement setProductName() {
		return productName;
	}

	public WebElement setProductCode() {
		return productCode;
	}

	public WebElement setQtyStock() {
		return qtyStock;
	}

	public WebElement setQuantity() {
		return quantity;
	}

	public WebElement setUnitPrice() {
		return unitPrice;
	}

	public WebElement setListPrice() {
		return listPrice;
	}

	public WebElement setAddProdBtn() {
		return addProdBtn;
	}

	public WebElement setTermsAndCond() {
		return termsAndCond;
	}

	public WebElement setDesc() {
		return desc;
	}

	public WebElement setSaveBtn() {
		return saveBtn;
	}

	public WebElement setSaveAndNewBtn() {
		return saveAndNewBtn;
	}

	public WebElement setCancelBtn() {
		return cancelBtn;
	}

	
	
	public void setnewPurchaseOrd() {
		newPurchaseOrd.click();
	}
}
	
	
	
	

