package com_crm_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateQuotepage {
   @FindBy(xpath = "//input[@class='button'and @value='New Quote']")
   private WebElement newquotesbutton;
   @FindBy(xpath = "//input[@name='property(Potential Name)']")
   private WebElement quotepagepotentialnametext;
   @FindBy(xpath = "//input[@name='property(Subject)']")
   private WebElement quotepagesubjectnametext;
   @FindBy(xpath = "//input[@name='property(Valid Till)']")
   private WebElement quotepagevalidtilltext;
   @FindBy(xpath = "//select[@name='property(Quote Stage)']")
   private WebElement quotepageQuoteStagetext;
   @FindBy(xpath = "//input[@name='property(Team)']")
   private WebElement quotepageteamtext;
   @FindBy(xpath = "//input[@name='property(Contact Name)']")
   private WebElement quotepagecontactnametext;
   @FindBy(xpath = "//input[@name='property(Account Name)']")
   private WebElement quotepageaccountnametext;
   @FindBy(xpath = "//select[@name='property(Carrier)']")
   private WebElement quotepagecarriertext;
   @FindBy(xpath = "//input[@id='copyAddress']")
   private WebElement quotepagecopyaddressbutton;
   @FindBy(xpath = "//input[@name='property(Billing Street)']")
   private WebElement aibillingstreettext;
   @FindBy(xpath = "//input[@name='property(Billing City)']")
   private WebElement aibillingcitytext;
   @FindBy(xpath = "//input[@name='property(Billing State)']")
   private WebElement  aiquotepagebillingstatetext;
   @FindBy(xpath = "//input[@name='property(Billing Code)']")
   private WebElement  aiquotepagebillingcodetext;
   @FindBy(xpath = "//input[@name='property(Billing Country)']")
   private WebElement  aiquotepagebillingcountrytext;
   @FindBy(xpath = "//input[@name='property(Shipping Street)']")
   private WebElement  caquotepageshippingstreettext;
   @FindBy(xpath = "//input[@name='property(Shipping City)']")
   private WebElement  caquotepageshipingcitytext;
   @FindBy(xpath = "//input[@name='property(Shipping State)']")
   private WebElement  caquotepageshippingstatetext;
   @FindBy(xpath = "//input[@name='property(Shipping Code)']")
   private WebElement  caquoteshippingcodetext;
   @FindBy(xpath = "//input[@name='property(Shipping Country)']")
   private WebElement caquoteshippingcountrytext;
   @FindBy(xpath = "//img[@title='Product Name Lookup']")
   private WebElement pdquotepageProductNametext;
   @FindBy(xpath = "//input[@id='hdnProductCode1']")
   private WebElement pdquotepageProductCodetext;
   @FindBy(id = "hdnQtyStock1")
   private WebElement pdquotepageQtyinStocktext;
   @FindBy(name = "property(txtQty1)")
   private WebElement pdquotepageQtytext;
   @FindBy(id = "hdnUnitPrice1")
   private WebElement pdquotepageUnitPricetext;
   @FindBy(xpath = "//input[@id='txtListPrice1'and @name]")
   private WebElement pdquotepageListPricetext;
   @FindBy(xpath = "//input[@class='button'and @value='Add Product']")
   private WebElement pricebookaddproductbutton;
   @FindBy(name = "property(Terms and Conditions)")
   private WebElement pdquotepageTermsandConditionstextbox;
   @FindBy(name  = "property(Description)")
   private WebElement pdquotepageDescriptionbox;
   @FindBy(xpath = "(//input[@class='button'and @value='Save'])[2]")
   private WebElement pdquotepagesavebutton;
   
   
   public CreateQuotepage(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }


public WebElement setNewquotesbutton() {
	return newquotesbutton ;
}


public WebElement setQuotepagepotentialnametext() {
	return quotepagepotentialnametext ;
}


public WebElement setQuotepagesubjectnametext() {
	return quotepagesubjectnametext ;
}


public WebElement setQuotepagevalidtilltext() {
	return quotepagevalidtilltext;
}


public WebElement setQuotepageQuoteStagetext(WebElement quotepageQuoteStagetext) {
	return quotepageQuoteStagetext;
}


public WebElement setQuotepageteamtext() {
	return quotepageteamtext;
}


public WebElement setQuotepagecontactnametext() {
	return quotepagecontactnametext;
}


public WebElement setQuotepageaccountnametext() {
	return quotepageaccountnametext;
}


public WebElement setQuotepagecarriertext() {
	return quotepagecarriertext ;
}


public WebElement setQuotepagecopyaddressbutton() {
	return quotepagecopyaddressbutton;
}


public WebElement setAibillingstreettext() {
	return aibillingstreettext;
}


public WebElement setAibillingcitytext() {
	return aibillingcitytext;
}


public WebElement setAiquotepagebillingstatetext() {
	return aiquotepagebillingstatetext;
}


public WebElement setAiquotepagebillingcodetext() {
	return aiquotepagebillingcodetext;
}


public WebElement setAiquotepagebillingcountrytext() {
	return aiquotepagebillingcountrytext;
}


public WebElement setCaquotepageshippingstreettext() {
	return caquotepageshippingstreettext;
}


public WebElement setCaquotepageshipingcitytext() {
	return caquotepageshipingcitytext;
}


public WebElement setCaquotepageshippingstatetext() {
	return caquotepageshippingstatetext;
}


public WebElement setCaquoteshippingcodetext() {
	return caquoteshippingcodetext;
}


public WebElement setCaquoteshippingcountrytext() {
	return caquoteshippingcountrytext;
}


public WebElement setPdquotepageProductNametext() {
	return pdquotepageProductNametext;
}


public WebElement setPdquotepageProductCodetext() {
	return pdquotepageProductCodetext;
}


public WebElement setPdquotepageQtyinStocktext() {
	return pdquotepageQtyinStocktext;
}


public WebElement setPdquotepageQtytext() {
	return pdquotepageQtytext;
}


public WebElement setPdquotepageUnitPricetext() {
	return pdquotepageUnitPricetext;
}


public WebElement setPdquotepageListPricetext() {
	return pdquotepageListPricetext;
}


public WebElement setPricebookaddproductbutton() {
	return pricebookaddproductbutton;
}


public WebElement setPdquotepageTermsandConditionstextbox() {
	return pdquotepageTermsandConditionstextbox;
}


public WebElement setPdquotepageDescriptionbox() {
	return pdquotepageDescriptionbox;
}


public WebElement setPdquotepagesavebutton() {
	return pdquotepagesavebutton ;
}
   
   
}
