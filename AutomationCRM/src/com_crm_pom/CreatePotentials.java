package com_crm_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatePotentials {
	@FindBy(xpath="//input[@name='property(Potential Name)']")
	private WebElement potentialName;
	
	@FindBy(xpath="//img[@title='Account Name Lookup']")
	private WebElement accountNameLookUp;
	
	@FindBy(xpath="//select[@name='property(Type)']")
	private WebElement typeDropDown;
	
	@FindBy(xpath="//input[@name='property(Next Step)']")
	private WebElement nextStepTbx;
	
	@FindBy(xpath="//img[@title='Campaign Name Lookup']")
	private WebElement campaignNameLookUp;
	
	@FindBy(xpath="//input[@name='property(Amount)']")
	private WebElement amountTbx;
	
	@FindBy(xpath="//input[@name='property(Closing Date)']")
	private WebElement closingDateTbx;
	
	@FindBy(xpath="//input[@name='property(Stage)']")
	private WebElement stageDropdown;
	
	@FindBy(xpath="//input[@name='property(Probability)']")
	private WebElement probabilityTbx;
	
	@FindBy(xpath="//select[@name='property(Lead Source)']")
	private WebElement leadsourceDropdown;
	
	@FindBy(xpath="//textarea[@name='property(Description)']")
	private WebElement descTbx;
	
	@FindBy(xpath="//input[@class='button' and @value='Save']")
	private WebElement saveBtn;
	
	@FindBy(xpath="//input[@class='button' and @value='Save & New']")
	private WebElement saveAndNewBtn;
	
	@FindBy(xpath="//input[@class='button' and @value='Cancel']")
	private WebElement cancelBtn;
	
	public CreatePotentials(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement setPotentialName() {
		return potentialName;
	}

	public WebElement setAccountNameLookUp() {
		return accountNameLookUp;
	}

	public WebElement setTypeDropDown() {
		return typeDropDown;
	}

	public WebElement setNextStepTbx() {
		return nextStepTbx;
	}

	public WebElement setCampaignNameLookUp() {
		return campaignNameLookUp;
	}

	public WebElement setAmountTbx() {
		return amountTbx;
	}

	public WebElement setClosingDateTbx() {
		return closingDateTbx;
	}

	public WebElement setStageDropdown() {
		return stageDropdown;
	}

	public WebElement setProbabilityTbx() {
		return probabilityTbx;
	}

	public WebElement setLeadsourceDropdown() {
		return leadsourceDropdown;
	}

	public WebElement setDescTbx() {
		return descTbx;
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
}
