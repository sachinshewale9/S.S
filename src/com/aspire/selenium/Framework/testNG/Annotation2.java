package com.aspire.selenium.Framework.testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation2 
{   @Test 
	public void m1()
	{
		Reporter.log("1", true);
	}
    @Test (invocationCount=2)
	public void m2()
	{
		Reporter.log("2", true);
	}	
	@BeforeMethod
	public void m3()
	{
		Reporter.log("3", true);
	}@AfterMethod                            // lastly run program by using @AfterMethod
	public void m4()
	{
		Reporter.log("4", true);
	}
	
	
	
	
	
	
	
	
	
	
}

