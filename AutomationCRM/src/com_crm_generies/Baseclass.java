package com_crm_generies;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;



import com_crm_pom.Homeclass;
import com_crm_pom.loginpage;

public class Baseclass {
	public static WebDriver driver;
	public static filelib  f=new filelib();
	@BeforeTest
	public void openthebrowser()
	{
		Reporter.log("browser is open",true);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	@BeforeMethod
	public void Login() throws  InterruptedException, IOException
	{
		String url = f.getpropertydata("url");
		driver.get(url);
		loginpage l=new loginpage(driver);
		l.setlogin("rashmi@dell.com", "123456");
		Reporter.log("successfull application page logined",true);
	}
	@AfterMethod
	public void Logout()
	{
		Homeclass h=new Homeclass(driver);
		h.setLogout();
		Reporter.log("successfull application page logouted",true);
		
	}
	@AfterTest
	public void closethebrowser()
	{
		driver.close();
		Reporter.log("successfull application page logined",true);
	}
	
}
