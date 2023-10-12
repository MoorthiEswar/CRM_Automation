package com_crm_pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
}
