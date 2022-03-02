package com.aspire.selenium.Framework.testNG;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation1 
{  
	@BeforeClass       // Befor class will execute only one time
	public void browserLaunch()
	{
		Reporter.log("Browser lounch sucessfull", true);
	}
	
	@BeforeMethod
	public void EnterUserName()
	{
		Reporter.log("Enter user name", true);
	}
	@Test
	public void EnterPassword()
	{
		Reporter.log("Enter thr password", true);
	}
	@Test
	public void clickbutton()
	{
		Reporter.log("Click on login button", true);
	}
	
	
}
