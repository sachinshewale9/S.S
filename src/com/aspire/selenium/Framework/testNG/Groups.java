package com.aspire.selenium.Framework.testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Groups 
{
@Test(groups="signin")
public void m1()
 {
	Reporter.log("1",true);
 }
@Test(groups="payment")
public void m2()
 {
	Reporter.log("2",true);
 }
@Test(groups="signin")
public void m3()
 { 
	Reporter.log("3",true);
 }
@Test(groups="order")
public void m4()
 { 
	Reporter.log("4",true);
 }@Test(groups="order")
public void m5()
 {
	Reporter.log("5",true);
 }
	
	
	
	
	
	
	
	
	
}
