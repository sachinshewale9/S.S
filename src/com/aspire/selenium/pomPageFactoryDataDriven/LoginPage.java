package com.aspire.selenium.pomPageFactoryDataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	@FindBy(xpath="//input[@type='text']")WebElement UN;
	@FindBy(xpath="//input[@type='password']") WebElement Password;
	@FindBy(xpath="//button[@type='submit']") WebElement loginbuton;
	
	public  LoginPage (WebDriver driver)   // making constructor
	{
		PageFactory.initElements(driver, this);   // initialise
	}
  
	public void EnterUserName(String username)
	{
		UN.sendKeys(username);
	}
	                                //old code  //driver.findElement(By.xpath("//input[@type='text']")).sendKeys("DP6852");
	
	public void EnterPassword(String userpwd)
	{
		 Password.sendKeys(userpwd);
	}
	                                // driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Pramod@2105");

	
	public void CLickloginbutton()
	{
		loginbuton.click();
	}
	                              // driver.findElement(By.xpath("//button[@type='submit']")).click();
	
//	
//	//Entering US Name   
//		 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("DP6852");
//		 
//	// Entering Password	 
//		 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Pramod@2105");
//		 Thread.sleep(2000);
//		 
//	// Click on login button
//		 driver.findElement(By.xpath("//button[@type='submit']")).click();
	
}
