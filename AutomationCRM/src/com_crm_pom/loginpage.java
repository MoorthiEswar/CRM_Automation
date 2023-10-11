package com_crm_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com_crm_generies.Baseclass;

public class loginpage extends Baseclass {
	@FindBy(xpath = "//input[@name='j_username'and @id='userName']")
	private WebElement unboxbtn;
	@FindBy(xpath = "//input[@name='j_password'and @id='passWord']")
	private WebElement passwordboxbtn;
	@FindBy(xpath = "//input[@title='Sign In'and @alt='Sign In']")
	private WebElement loginbtn;
	
	
	public loginpage(WebDriver driver) {
   PageFactory.initElements(driver, this);		
	}


	public void setlogin(String un,String pw) throws InterruptedException {
		unboxbtn.sendKeys(un);
		Thread.sleep(3000);
		passwordboxbtn.sendKeys(pw);
		Thread.sleep(3000);
		loginbtn.click();
	}
	
}
