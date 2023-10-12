package com_crm_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pricebookpage {
	@FindBy(xpath = "//input[@type='button'and @value='New Price Book']")
	private WebElement newpricebookbutton;
	@FindBy(xpath = "//input[@name='property(Price Book Name)']")
	private WebElement pricebooknametext;
	@FindBy(xpath = "//textarea[@name='property(Description)']")
	private WebElement pricebookdescription;
	@FindBy(xpath = "(//input[@name='Button'])[3]")
    private WebElement savebuttonofpricebook;
	
	public Pricebookpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement setNewpricebookbutton() {
		return newpricebookbutton;
	}

	public WebElement setPricebooknametext() {
		return pricebooknametext ;
	}

	public WebElement setPricebookdescription() {
		return pricebookdescription;
	}

	public WebElement setSavebuttonofpricebook() {
		return savebuttonofpricebook ;
	}
	
}
