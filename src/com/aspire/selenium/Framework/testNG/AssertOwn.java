package com.aspire.selenium.Framework.testNG;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertOwn 
{  String exp="Aspire Training institute";
   String Act="Aspire";
   String newvalue="Aspire";
   String s= "null";
   boolean a= true;
   boolean b= true;
   boolean c= false;
// AssertEquals  
  @Test
	public void TC()
  {
		if (exp.equals(Act))         // this our normal method to compare string
		{
			Reporter.log("TC case pass",true);
		}
		else
		{
			Reporter.log("TC case fail" ,true);
		}
    }
	// *******************in TestNG we have assertEquals Method****************
  
// ***********************assertEquals method using**************************
    @Test
		public void TC2()
	{
		Assert.assertEquals(exp, Act,"please provide correct value");
			
	}
 // *************************assertNotEquals method using********************		
	
    
    @Test
	public void TC3()
	{
		Assert.assertNotEquals(exp,Act,"please provide diffrent value");
	}
// ******************************assertFalse*************************************		
 @Test
 public void TC4()
 {
	Assert.assertFalse(c, "please provide false value"); 
 }
 //******************************assertTrue*******************************************
  @Test
 public void TC5()
 {
	 Assert.assertTrue(a, "please provide true value");
 }
 //************************ assertNull************************************************ 
@Test
public void TC6()
 {
	Assert.assertNull(s);
 }
//*****************************assertNotNull***************************************
@Test
public void TC7()
 {
	Assert.assertNotNull(exp);
 }
 //**************************Assert fail***********************************************
@Test
public void TC8()
 {
	Assert.fail(Act);
 }

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
