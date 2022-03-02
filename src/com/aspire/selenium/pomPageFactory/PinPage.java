package com.aspire.selenium.pomPageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PinPage 
{
 @FindBy(xpath="//input[@type='password']")WebElement pin;
 @FindBy(xpath="//button[@type='submit']")WebElement continouebutton;	
	
 public PinPage (WebDriver driver)
 {
	 PageFactory.initElements(driver, this);
 }
// pin	
	public void Enterpin()
	{
		pin.sendKeys("976976");
	}
	
//continoue button	
  public void Clickbutton()
  {
	  continouebutton.click();
  }
	
	
	
//	
//	//pin	 
//		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("976976");
//		
//	// continoue button
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//	    Thread.sleep(2000);
//		
	
	
	
	
	
	
	
	
	
	
	
	

			
}
