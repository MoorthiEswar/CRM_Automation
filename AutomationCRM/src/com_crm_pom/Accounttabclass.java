package com_crm_pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import graphql.org.antlr.v4.runtime.tree.xpath.XPath;

public class Accounttabclass {
	@FindBy(xpath = "//input[@value='New Account'and@class='button']")
	private WebElement newaccountbutton;
	@FindBy(xpath = "//input[@name='property(Account Name)']")
    private WebElement accountnametext;
	@FindBy(xpath = "//input[@name='property(Phone)']")
	private WebElement accountpagephonetext;
	@FindBy(xpath = "//input[@name='property(Parent Account)']")
	private WebElement parentaccounttext;
	@FindBy(xpath = "//input[@name='property(Account Number)']")
	private WebElement accountnumbertext;
	@FindBy(xpath = "//input[@name='property(Fax)']")
	private WebElement accountpagefaxtext;
	@FindBy(xpath = "//input[@name='property(Website)']")
	private WebElement accountpagewebsidetext;
	@FindBy(xpath = "//input[@name='property(Ticker Symbol)']")
	private WebElement accountpageTickerSymboltext;
	@FindBy(xpath = "//input[@name='property(Annual Revenue)']")
	private WebElement  accountpageAnnualRevenuetext;
	@FindBy(xpath = "//input[@name='property(Employees)']")
	private WebElement accountpageemployeestext;
	@FindBy(xpath = "//input[@name='property(SIC Code)']")
	private WebElement accountpagesicCodetext;
	@FindBy(xpath = "//input[@name='property(Billing Street)']")
	private WebElement accountpagebillingaddresstext;
	@FindBy(xpath = "//input[@name='property(Billing City)']")
	private WebElement accountpagebillingcitytext;
	@FindBy(xpath = "//input[@name='property(Billing State)']")
	private WebElement accountpagebillingstate;
	@FindBy(xpath = "//input[@name='property(Billing Code)']")
	private WebElement accountpagebillingcode;
	@FindBy(xpath="//input[@name='property(Billing Country)']")
	private WebElement accountpagebillingcountrytext;
	@FindBy(xpath="//input[@name='property(Shipping Street)']")
	private WebElement accountpageshippingstreet;
	@FindBy(xpath="//input[@name='property(Shipping City)']")
	private WebElement accountpageshippingcity;
	@FindBy(xpath="//input[@name='property(Shipping State)']")
	private WebElement accountpageshippingstatetext;
	@FindBy(xpath="//input[@name='property(Shipping Code)']")
	private WebElement accountpageshippingcodetext;
	@FindBy(xpath="//input[@name='c']")
	private WebElement accountpageshippingcountrytext;
	@FindBy(xpath = "//textarea[@name='property(Description)']")
	private WebElement accountpageDescriptiontextarea;
	@FindBy(xpath = "(//input[@name='Button'])[3]")
	private WebElement accountpagesavebutton;
	@FindBy(xpath = "(//td[@class='tableData']/../td)[1]")
	private WebElement selelcts;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
