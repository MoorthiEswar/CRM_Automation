package com_crm_pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Pricebookpage {
	@FindBy(xpath = "//input[@type='button'and @value='New Price Book']")
	private WebElement newpricebookbutton;
	@FindBy(xpath = "//input[@name='property(Price Book Name)']")
	private WebElement pricebooknametext;
	@FindBy(xpath = "//textarea[@name='property(Description)']")
	private WebElement pricebookdescription;
	@FindBy(xpath = "(//input[@name='Button'])[3]")
    private WebElement savebuttonofpricebook;
	
}
