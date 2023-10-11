package com_crm_pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Products {
@FindBy(xpath="//input[@value='New Product']")
private WebElement newproductbtn;
@FindBy(name="property(Product Code)")
private WebElement prdcode;
@FindBy(name="property(Product Category)")
private WebElement prdcategeory;
@FindBy(xpath="//input[@name='property(Sales End Date)']")
private WebElement salesenddata;
@FindBy(xpath="//input[@name= 'property(Support Expiry Date)']")
private WebElement supportexpiry;
@FindBy(xpath="//input[@name='property(Product Name)']")
private WebElement prodname;
@FindBy(xpath = "//input[@name='property(Vendor Name)']")
private WebElement vendorname;

}
