package com_crm_pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class createcampaign {
     
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
   
		Createcampaign1 c=new Createcampaign1(driver);
    //WebElement ele = c.getPropertyTypeTexfield();
    //WebElement ele1=c.getPropertyStatusTexfield();
   // Select s=new Select(ele);
   // s.selectByValue("Public Relations");
    //Select s1=new Select(ele1);
   //  s1.selectByValue("Planning");
     driver.findElement(By.xpath("(//input[@name='Button' and @class='button'])[3]")).click();
     Thread.sleep(4000);
    WebElement ele3 = driver.findElement(By.xpath("//select[@name='property(saltName)'and@class='select']"));
    Select s2=new Select(ele3);
    s2.selectByValue("Mr.");
    
	//campaign source//driver.findElement(By.xpath("//img[@title='Campaign Name Lookup'and @align='absmiddle']")).click();
    driver.switchTo().window(null);
    driver.findElement(By.xpath("(//td[@class='tableData'])[1]")).click();
    WebElement ele4 = driver.findElement(By.xpath("//select[@name='property(Lead Source)'and @class='textField']"));
	Select s3=new Select(ele4);
	s3.selectByValue("Webinar");
	WebElement ele5 = driver.findElement(By.xpath("//select[@name='property(Industry)'and @class='textField']"));
	Select s4=new Select(ele5);
	s4.selectByValue("ERP");
	WebElement ele6 = driver.findElement(By.xpath("//select[@name='property(Lead Status)'and @class='textField']"));
	Select s5=new Select(ele6);
	s5.selectByValue("Contacted");
	driver.findElement(By.xpath("//input[@name='property(No of Employees)'and @class='textField']")).sendKeys("25");
	WebElement ele7 = driver.findElement(By.xpath("//select[@name='property(Rating)'and @class='textField']"));
	Select s6=new Select(ele7);
	s6.selectByValue("Active");
	
	
	
	}

}
