package com.aspire.selenium.rfegistartionwebpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrattionPage
{
	public static void main(String[] args) throws InterruptedException 
	{    
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sachin\\eclipse-workspace\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 Thread.sleep(2000);
		 driver.get("file:///D:/Desktop/Registraion%20form.html");
		 Thread.sleep(2000);
// 1.ID
		driver.findElement(By.id("123")).sendKeys("Avinash");
		Thread.sleep(2000);
// 2.Name
		driver.findElement(By.name("sample")).sendKeys("Gawas");
// 3.Classname
		driver.findElement(By.className("number")).sendKeys("7745883293");
		
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
