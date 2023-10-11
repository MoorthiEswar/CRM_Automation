package com_crm_testscriptes;

import org.testng.annotations.Test;

import com_crm_generies.Baseclass;
import com_crm_pom.Createlead;
import com_crm_pom.Homeclass;

public class Createnewlead extends Baseclass {
	@Test
	public void createleads()
	{
		Homeclass h=new Homeclass(driver);
		h.setLeadtab();
		Createlead c=new Createlead(driver);
		c.setnewleadsbutton();
		
	}

}
