package com_crm_testscriptes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com_crm_generies.Baseclass;
import com_crm_pom.Createcampaign1;
import com_crm_pom.Homeclass;
@Listeners(com_crm_generies.ListenerClass.class)
public class createcampaign extends Baseclass{
	@Test
	public void createcampaign()
	{
		Homeclass h=new Homeclass(driver);
		h.setCampaigntab();
		Createcampaign1 c=new Createcampaign1(driver);
		c.setnewcampaignbutton().click();
		c.setcampaignnametextfield().sendKeys("HP_01");
		c.setstartcampaigndate().sendKeys("10/12/2023");
		c.setcampaignenddate().sendKeys("10/31/2023");
		c.setexpectedrevenuetext().sendKeys("200000");
		c.setBudgetedCosttext().sendKeys("500000");
		c.setActualCosttext().sendKeys("400000");
		c.setExpectedResponsetext().sendKeys("2000");
		c.setNumsenttext().sendKeys("100");
		c.setDescriptiontextfield().sendKeys("abcd");
		WebElement d1 = c.setstatusdropdown();
		Select s=new Select(d1);
        s.selectByVisibleText("Public Relations");
		s.selectByValue("Webinar");
		WebElement ele = c.settypedropdown();
		Select s1=new Select(ele);
		s1.selectByValue("Planning");
		c.setcampaignsavebtn();
		
	}

}
