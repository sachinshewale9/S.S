package com.aspire.selenium.Framework.testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority_Keyword 
{
@Test (priority=1)
public void TC1()
 {
	Reporter.log("TC1 pass", true);
	
 }  @Test(priority=0)
public void TC2()
 {
	Reporter.log("TC2 pass", true);
 }
  @Test(priority=2)
public void TC3()
{
	Reporter.log("TC3 pass", true);
}	
	@Test(priority=3)
public void TC4()
{
	Reporter.log("TC4 pass", true);
}	
// for test case skip	
	@Test(enabled=false)
public void TC5()
 {
		Reporter.log("TC5 pass", true);
 }
	
	
	
	
	
}
