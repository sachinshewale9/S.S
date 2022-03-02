package com.aspire.selenium.Framework.testNG;



import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethod 
{
@Test 
  public void login() throws InterruptedException
  {
	  Reporter.log("login pass", true);

  }
@Test 
    (dependsOnMethods = {"login"})
  public void logout()
  {
	  Reporter.log("logout pass", true);
  }
	
	
}

