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
	
	@FindBy(xpath="//input[@name='property(Vendor Name)']")
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
	
	
	public PurchaseOrder(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setnewPurchaseOrd() {
		newPurchaseOrd.click();
	}
}
