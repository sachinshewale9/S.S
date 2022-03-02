package com.aspire.selenium.pomPageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	 @FindBy(xpath="//img[@src='/static/images/kite-logo.svg']")WebElement Actlogo;
	 @FindBy(xpath="//div[@class='avatar']/span")WebElement ActualName;	
	
	public HomePage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void logoverfy()
{  
		boolean explogo = true; 
		boolean act = Actlogo.isDisplayed();
		      

	if(explogo==act)
	{
		System.out.println("Logo verification Test case is pass");
    }	
	else
	{
		System.out.println("Logo verification Test case is fail");
	}
	
}	
	
  public void Intialname()
{
	 String ExpectInitialName ="PM";
	 String actname = ActualName.getText();
	 
 if(actname.equals(ExpectInitialName))	
 {
	 System.out.println("Initial name verification test case pass");
 }
 else
 {
	 System.out.println("Initial name verification test case fail");
 }
	 
	 
}
	
	

	
	
}
	
	
	
	
//	logo disply verifying
//	boolean explogo = true;
//	boolean Actlogo = driver.findElement(By.xpath("//img[@alt='Kite logo']")).isDisplayed();
//	if(explogo==Actlogo)
//	{
//		System.out.println("Logo verification test case pass");
//	}
//	else
//	{
//		System.out.println("Logo verification test case fail");
//	}
//// initial name verify
//	String ExpectInitialName="PM";
//	   String ActualName = driver.findElement(By.xpath("//div[@class='avatar']/span")).getText();
//	if( ExpectInitialName.equals(ActualName))
//	{
//		System.out.println("Initial name verification test case pass");
//	}
//   else
//	{
//		System.out.println("Initial name verification test case fail");
//	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

