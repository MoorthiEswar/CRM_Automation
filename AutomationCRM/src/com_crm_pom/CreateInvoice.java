package com_crm_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateInvoice {
	@FindBy(xpath="//input[@class='button' and @value='New Invoice']")
	private WebElement newInvoiceBtn;
	
	@FindBy(xpath="//input[@name='property(Subject)']")
	private WebElement subjectText;
	
	@FindBy(xpath="//input[@name='property(Invoice Date)']")
	private WebElement invoiceDate;
	
	@FindBy(xpath="//input[@name='property(Due Date)']")
	private WebElement dueDate;
	
	@FindBy(xpath="//input[@name='property(Sales Commission)']")
	private WebElement salesCommission;
	
	@FindBy(xpath="//img[@title='Account Name Lookup']")
	private WebElement accountNameLookUpIcon;
	
	@FindBy(xpath="//img[@title='SalesOrder Lookup']")
	private WebElement salesOrderLookUpIcon;
	
	@FindBy(xpath="//input[@name='property(Purchase Order)']")
	private WebElement purchaseOrder;
	
	@FindBy(xpath="//input[@name='property(Excise Duty)']")
	private WebElement exciseDuty;
	
	@FindBy(xpath="//select[@name='property(Status)']")
	private WebElement invoiceStatus;
	
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
	
	@FindBy(xpath="//input[@name='property(Shipping State)']")
	private WebElement shippingState;
	
	@FindBy(xpath="//input[@name='property(Shipping Code)']")
	private WebElement shippingCode;
	
	@FindBy(xpath="//input[@name='property(Shipping Country)']")
	private WebElement shippingCountry;
	
	@FindBy(xpath="//input[@id='copyAddress']")
	private WebElement copyAddressBtn;
	
	@FindBy(xpath="//img[@title='Product Name Lookup']")
	private WebElement productNameLookUpIcon;
	
	@FindBy(xpath="//input[@id='hdnProductCode1']")
	private WebElement productCode;
	
	@FindBy(xpath="//input[@id='hdnQtyStock1']")
	private WebElement qtyStock;
	
	@FindBy(xpath="//input[@id='txtQty1']")
	private WebElement qtyTbx;
	
	@FindBy(xpath="//input[@id='hdnUnitPrice1']")
	private WebElement unitPrice;
	
	@FindBy(xpath="//img[@title='PriceBook Name Lookup']")
	private WebElement listPriceLookUp;
	
	@FindBy(xpath="//input[@class='button' and @value='Add Product']")
	private WebElement addProductBtn;
	
	@FindBy(xpath="//textarea[@name='property(Terms and Conditions)']")
	private WebElement termsAndCond;
	
	@FindBy(xpath="//textarea[@name='property(Description)']")
	private WebElement descTbx;
	
	@FindBy(xpath="//input[@class='button' and @value='Save']")
	private WebElement saveBtn;
	
	@FindBy(xpath="//input[@class='button' and @value='Save & New']")
	private WebElement saveAndNewBtn;
	
	@FindBy(xpath="//input[@class='button' and @value='Cancel']")
	private WebElement cancelBtn;
	
	public CreateInvoice(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement setNewInvoiceBtn() {
		return newInvoiceBtn;
	}

	public WebElement setSubjectText() {
		return subjectText;
	}

	public WebElement setInvoiceDate() {
		return invoiceDate;
	}

	public WebElement setDueDate() {
		return dueDate;
	}

	public WebElement setSalesCommission() {
		return salesCommission;
	}

	public WebElement setAccountNameLookUpIcon() {
		return accountNameLookUpIcon;
	}

	public WebElement setSalesOrderLookUpIcon() {
		return salesOrderLookUpIcon;
	}

	public WebElement setPurchaseOrder() {
		return purchaseOrder;
	}

	public WebElement setExciseDuty() {
		return exciseDuty;
	}

	public WebElement setInvoiceStatus() {
		return invoiceStatus;
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

	public WebElement setCopyAddressBtn() {
		return copyAddressBtn;
	}

	public WebElement setProductNameLookUpIcon() {
		return productNameLookUpIcon;
	}

	public WebElement setProductCode() {
		return productCode;
	}

	public WebElement setQtyStock() {
		return qtyStock;
	}

	public WebElement setQtyTbx() {
		return qtyTbx;
	}

	public WebElement setUnitPrice() {
		return unitPrice;
	}

	public WebElement setListPriceLookUp() {
		return listPriceLookUp;
	}

	public WebElement setAddProductBtn() {
		return addProductBtn;
	}

	public WebElement setTermsAndCond() {
		return termsAndCond;
	}

	public WebElement setDescTbx() {
		return descTbx;
	}

	public void setSaveBtn(WebElement saveBtn) {
		this.saveBtn = saveBtn;
	}

	public WebElement setSaveAndNewBtn() {
		return saveAndNewBtn;
	}

	public WebElement setCancelBtn() {
		return cancelBtn;
	}

	
	
}
