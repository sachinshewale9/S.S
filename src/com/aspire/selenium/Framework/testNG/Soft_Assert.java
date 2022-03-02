package com.aspire.selenium.Framework.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert
{

	 String Exp="Aspire Trainig institute";
	 String act="Aspire";
	 String newValue="Aspire";
	 String s=null;
	 boolean a=true;
	 boolean b=true;
	 boolean c=false;
 
  @Test
    public void Hard_Assert()
 {
	Assert.assertEquals(Exp, act);
	Assert.assertNotEquals(Exp, act);
	Assert.assertNull(s);
	Assert.assertNotNull(Exp);
	Assert.assertTrue(a);  //if any method fail in Hard Assert then after fail test bcase remaing test case not exexuting
	
 }
//     @Test
//	public void Soft_assert()
//	{
//    	
//    	  SoftAssert soft = new SoftAssert();
//    	  soft.assertEquals(Exp, act);
//    	  soft.assertNotEquals(act, newValue);
//    	  soft.assertNull(act);
//    	  soft.assertTrue(a);
//	}
//	
	
		
	}
	 
	 

	
	
	
	
	
	
	
	
	

