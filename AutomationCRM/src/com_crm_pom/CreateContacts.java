package com_crm_pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateContacts {
@FindBy(xpath = "//input[@value='New Contact']")
private WebElement newcontactsbutton;
@FindBy(xpath = "//input[@name='property(First Name)']")
private WebElement cconfirstnametext;
@FindBy(xpath="//input[@name='property(Last Name)']")
private WebElement cconlastnametext;
@FindBy(xpath="//input[@name='property(Account Name)']")
private WebElement cconaccountnametext;
@FindBy(xpath = "//input[@name='property(Vendor Name)']")
private WebElement cconvendornametext;
@FindBy (xpath="//input[@name='property(Email)']")
private WebElement cconemailtext;
@FindBy (xpath="//input[@name='property(Title)']")
private WebElement ccontitletext;
@FindBy (xpath = "//input[@name='property(Department)']")
private WebElement cconDepartmenttext;
@FindBy (xpath ="//input[@name='property(Phone)']")
private WebElement cconPhonetext;
@FindBy (xpath="//input[@name='property(Home Phone)']")
private WebElement cconHomePhonetext;
@FindBy (xpath="//input[@name='property(Other Phone)']")
private WebElement cconOtherphonetext;
@FindBy (xpath ="//input[@name='property(Fax)']")
private WebElement cconFaxtext;
@FindBy (xpath ="//input[@name='property(Mobile)']")
private WebElement cconMobiletext;
@FindBy (xpath ="//input[@name='property(Date of Birth)']")
private WebElement cconDateofbirthtext;
@FindBy (xpath="//input[@name='property(Assistant)']")
private WebElement cconAssitanttext;
@FindBy (xpath="//input[@name='property(Asst Phone)']")
private WebElement cconAsstPhonetext;
@FindBy (xpath="//input[@name='property(Reports To)']")
private WebElement cconReportsTotext;
}
