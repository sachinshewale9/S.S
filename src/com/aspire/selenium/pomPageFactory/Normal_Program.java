package com.aspire.selenium.pomPageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Normal_Program 
{ public static void main(String[] args) throws InterruptedException 
{
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin\\eclipse-workspace\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
    WebDriver driver =new	ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://kite.zerodha.com/");
    Thread.sleep(2000);
//Entering UN Name   
	 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("DP6852");
	 
// Entering Password	 
	 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Pramod@2105");
	 Thread.sleep(2000);
	 
// Click on login button
	 driver.findElement(By.xpath("//button[@type='submit']")).click();
	 Thread.sleep(2000);
//pin	 
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("976976");
	
// continoue button
	driver.findElement(By.xpath("//button[@type='submit']")).click();
    Thread.sleep(2000);
	
//	logo disply verifying
	boolean explogo = true;
	boolean Actlogo = driver.findElement(By.xpath("//img[@alt='Kite logo']")).isDisplayed();
	if(explogo==Actlogo)
	{
		System.out.println("Logo verification test case pass");
	}
	else
	{
		System.out.println("Logo verification test case fail");
	}
// initial name verify
	String ExpectInitialName="PM";
    String ActualName = driver.findElement(By.xpath("//div[@class='avatar']/span")).getText();
	if( ExpectInitialName.equals(ActualName))
	{
		System.out.println("Initial name verification test case pass");
	}
   else
	{
		System.out.println("Initial name verification test case fail");
	}
	Thread.sleep(1000);
	driver.close();
	
	
		
	}	
	
}

	
	
	

