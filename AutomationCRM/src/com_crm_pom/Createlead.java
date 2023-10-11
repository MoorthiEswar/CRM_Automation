package com_crm_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Createlead {
	@FindBy(xpath = "//input[@type='button'and @value='New Lead']")
	private WebElement newleadbutton;
	@FindBy(xpath = "//input[@name='property(First Name)'and@class='textField']")
	private WebElement  firstnametext;
	@FindBy(xpath = "//input[@name='property(Last Name)'and@class='textField']")
	private WebElement lastnametext;
	@FindBy(xpath = "//input[@name='property(Company)'and@class='textField']")
	private WebElement companynametext;
	@FindBy(xpath = "//input[@name='property(Designation)'and@class='textField']")
	private WebElement Designationtext;
	@FindBy(xpath = "//input[@name='property(Email)'and @type='text']")
	private WebElement emailtextfield;
	@FindBy(xpath = "//input[@name='property(Phone)'and @type='text']")
	private WebElement phonetext;
	@FindBy(xpath = "//input[@name='property(Fax)'and @type='text']")
	private WebElement faxtext;
	@FindBy(xpath = "//input[@name='property(Website)'and @type='text']")
	private WebElement Websitetext;
	@FindBy(xpath = "//input[@name='property(No of Employees)']")
	private WebElement NoofEmployees;
	@FindBy(xpath = "//input[@name='property(Annual Revenue)'and@type='text']")
	private WebElement AnnualRevenuetext;
	@FindBy(xpath = "//img[@title='Campaign Name Lookup']")
	private WebElement CampaignSourceimg;
	@FindBy(xpath ="//input[@name='property(Street)'and @class='textField']")
	private WebElement streettext;
	@FindBy(xpath = "//input[@name='property(City)'and @class='textField']")
	private WebElement citytext;
	@FindBy(xpath = "//input[@name='property(State)'and @class='textField']")
	private WebElement statetext;
	@FindBy(xpath = "//input[@name='property(Zip Code)'and @class='textField']")
	private WebElement zipcodeytext;
	@FindBy(xpath = "//input[@name='property(Country)'and @class='textField']")
	private WebElement countrytext;
	@FindBy(xpath = "//textarea[@name='property(Description)'and @class='textField']")
	private WebElement leadsdescriptiontext;
	@FindBy(xpath = "(//input[@name='Button'and @class='button'])[3]")
	private WebElement leadsavebtn;
	
	
	public Createlead(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement setnewleadsbutton()
	{
		return newleadbutton;
	}
	public WebElement setFirstNametext()
	{
		return firstnametext;
	}
	public WebElement setLastnametext()
	{
		return lastnametext;
	}
	public WebElement setcompanytext()
	{
		return companynametext;
	}
	public WebElement setDesignationtext()
	{
		return Designationtext;
	}
	public WebElement setEmailtext()
	{
		return emailtextfield;
	}
	public WebElement setphonetext()
	{
		return phonetext;
	}
	public WebElement setfaxtext()
	{
		return faxtext;
	}
	public WebElement setwebsitetext()
	{
		return Websitetext;
	}
	public WebElement setAnnualRevenue()
	{
		return AnnualRevenuetext;
	}
	public WebElement setNoofEmployeestext()
	{
		return NoofEmployees;
	}
	public WebElement setstreettext()
	{
		return streettext;
	}
	public WebElement setcitytext()
	{
		return citytext;
	}
	public WebElement setstatetext()
	{
		return statetext;
	}
	public WebElement setzipcodetext()
	{
		return zipcodeytext;
	}
	public WebElement setcountrytext()
	{
		return countrytext;
	}
	public WebElement setleaddescriptiontext()
	{
		return leadsdescriptiontext;
	}
	public WebElement setleadssavebutton()
	{
		return leadsavebtn;
	}
	
}
