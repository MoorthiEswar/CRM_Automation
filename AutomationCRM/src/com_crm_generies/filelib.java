package com_crm_generies;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class filelib {
	public String getpropertydata(String key) throws IOException 
		 {
		FileInputStream fis=new FileInputStream("./data/crmcommondat.propertys");
		Properties p=new Properties();
		p.load(fis);
		String data = p.getProperty("url");
		return data;
		
	
		
	}

}
