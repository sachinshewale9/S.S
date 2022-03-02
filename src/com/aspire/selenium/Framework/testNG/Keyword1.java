package com.aspire.selenium.Framework.testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

 public class Keyword1 
{   
  @Test	
  public void login()
    {
	 Reporter.log("Login", false);
    }
  @Test(invocationCount=3)
  public void addTocart()
    {
	 Reporter.log("Item added to cart", true);
    }
   @Test
   public void logout()
   {
	 Reporter.log("log out", true);
   }
	
	
	
}
