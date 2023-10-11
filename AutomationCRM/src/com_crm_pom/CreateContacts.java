package com_crm_pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateContacts {
@FindBy(xpath = "//input[@value='New Contact']")
private WebElement newcontactsbutton;
}
