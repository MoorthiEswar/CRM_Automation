package com_crm_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Createcampaign1 {
	  @FindBy(xpath = "//input[@class='button' and @value='New Campaign']")
	   private WebElement newcampaignbtn;
	   @FindBy(xpath = "//input[@name='property(Campaign Name)' and @type='text']")
	   private WebElement campaignnametextbtn;
	   @FindBy(xpath = "//input[@name='property(Start Date)' and @type='text']")
	   private WebElement  campaignstarttextbtn;
	   @FindBy(xpath = "//input[@name='property(End Date)' and @type='text']")
	   private WebElement campaignendtextbtn;
	   @FindBy(xpath = "//input[@name='property(Expected Revenue)' and @type='text']")
	   private WebElement expectedrevenuetext;
	   @FindBy(xpath = "//input[@name='property(Budgeted Cost)' and @type='text']")
	   private WebElement budgetedcosttext;
	   @FindBy(xpath = "//input[@name='property(Actual Cost)' and @type='text']")
	   private WebElement actualcostbtn;
	   @FindBy(xpath = "//input[@name='property(Expected Response)' and @type='text']")
	   private WebElement expectedresponsetext;
	   @FindBy(xpath = "//input[@name='property(Num sent)' and @type='text']")
	   private WebElement numbersettext;
	   @FindBy(xpath = "//textarea[@name='property(Description)' and @class='textField']")
	   private WebElement descriptiontext;
	   @FindBy(xpath = "(//input[@name='Button' and @class='button'])[3]")
	   private WebElement campaignsavebtn;
	   
	   @FindBy(xpath="//select[@name='property(Type)' and @class='textField']")
	   private WebElement propertyTypeDropdown;
	   
	   @FindBy(xpath="//select[@name='property(Status)' and @class='textField']")
	   private WebElement propertyStatusdropdown;
	
	
	public Createcampaign1(WebDriver driver) {
     PageFactory.initElements(driver, this);		   
    }
	public WebElement setnewcampaignbutton()
	{
		return newcampaignbtn;
	}
	public WebElement setcampaignnametextfield()
	{
		return campaignnametextbtn;
	}
	public WebElement setstartcampaigndate()
	{
		return campaignstarttextbtn;
	}
	public WebElement setcampaignenddate()
	{
		return campaignendtextbtn;
	}
	public WebElement setexpectedrevenuetext()
	{
		return expectedresponsetext;
	}
	public WebElement setBudgetedCosttext()
	{
		return budgetedcosttext;
	}
	public WebElement setActualCosttext()
	{
		return actualcostbtn;
	}
	public WebElement setExpectedResponsetext() 
	{
		return expectedresponsetext;
	}
	public WebElement setNumsenttext() 
	{
		return numbersettext;
	}
	public WebElement setDescriptiontextfield()
	{
		return descriptiontext;
	}
	public WebElement setcampaignsavebtn()
	{
		return campaignsavebtn;
	}
	public WebElement settypedropdown()
	{
		return propertyTypeDropdown;
	}
	public WebElement setstatusdropdown()
	{
		return propertyStatusdropdown;
	}
}
