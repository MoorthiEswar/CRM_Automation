package com_crm_pom;

import org.apache.commons.compress.archivers.sevenz.CLI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com_crm_generies.Baseclass;

public class Homeclass {
	@FindBy(xpath = "//a[contains(text(),'Campaigns')]")
	private WebElement campaigntab;
	
	@FindBy(xpath = "//a[contains(text(),'Leads') and @class='menuOff']")
	private WebElement leadtab;
	
	@FindBy(xpath = "//a[contains(text(),'Accounts') and @class='menuOff']")
	private WebElement accounttab;
	
	@FindBy(xpath = "//a[contains(text(),'Potentials') and @class='menuOff']")
	private WebElement potentailstab;
	
	@FindBy(xpath = "//a[contains(text(),'Price Books') and @class='menuOff']")
	private WebElement pricebooktab;
	
	@FindBy(xpath = "//a[contains(text(),'Sales Orders') and @class='menuOff']")
	private WebElement salesordertab;
	
	@FindBy(xpath = "//a[contains(text(),'Logout [rashmi@dell.com]')]")
	private WebElement logout;
	
	@FindBy(xpath="//a[contains(text(),'Purchase Orders') and @class='menuOff']")
	private WebElement purchaseOrdTab;
	
	@FindBy(id = "Quotestab")
	private WebElement Quotestabbutton;
	
	@FindBy(xpath="//a[@id='Invoicestab']")
	private WebElement invoiceTab;
	
	public  Homeclass(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void setCampaigntab() {
            campaigntab.click();;
	}

	public void setLeadtab() {
		leadtab.click();;
	}

	public void setAccounttab() {
		 accounttab.click();;
	}

	public void setPotentailstab() {
		 potentailstab.click();;
	}

	public void setPricebooktab() {
		 pricebooktab.click();;
	}

	public void setSalesordertab() {
		salesordertab.click();;
	}
	
	public void setpurchaseOrdTab() {
		purchaseOrdTab.click();
	}
	
	public void setQuotestabbutton()
	{
		Quotestabbutton.click();
	}
	
	public void setinvoiceTab() {
		invoiceTab.click();
	}
	
	public void setLogout() {
		logout.click();
	}
	
	
	
	
}
