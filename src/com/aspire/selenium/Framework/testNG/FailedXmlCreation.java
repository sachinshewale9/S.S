package com.aspire.selenium.Framework.testNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FailedXmlCreation
{
 @Test
 public void m1()
 {
	 Reporter.log("1", true); 
	 Assert.fail();
 }	
@Test
public void m2()
 {
	Reporter.log("2", true);
	Assert.fail();
 }
@Test	
public void m3()
 {
	Reporter.log("3", true);
	Assert.fail();
 }
	
}
