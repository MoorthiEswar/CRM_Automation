package com_crm_pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
   
   
}
