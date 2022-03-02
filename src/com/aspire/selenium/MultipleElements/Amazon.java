package com.aspire.selenium.MultipleElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin\\eclipse-workspace\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
		 WebDriver driver =new ChromeDriver();
		 driver.get("https://www.ebay.com/");
		 Thread.sleep(2000);
		 driver.manage().window().maximize();
	     driver.findElement(By.xpath("//input[@type='text']")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mobiles");
	     driver.findElement(By.xpath("//input[@type='submit']")).click();
	     
	     
	     
	     
	     
	         
		
		
		
		
		
		
		
		
		
		
	}

	
	
	
}
