package com.aspire.selenium.Framework.testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class After_BeforAnotation 
{   @BeforeClass
	//@BeforeMethod
	// @AfterMethod
	public void sachin()
	{
		Reporter.log("my name is sachin", true);
	}
 @Test
 public void karuna()
 {
	 Reporter.log("my first love is karuna",true);
 }@Test
 public void shruti()
 {
	 Reporter.log("my baby name is shruti", true);
 }
	
	
	
	
	
	
}
