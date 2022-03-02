  package com.aspire.selenium.rfegistartionwebpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test 
{
 public static void main(String[] args) throws InterruptedException 
 {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin\\eclipse-workspace\\SeleniumOct21\\SoftFiles\\chromedriver.exe") ;
	WebDriver driver = new ChromeDriver();
	 Thread.sleep(2000);
	 driver.get("file:///D:/Desktop/Registraion%20form.html");
	 Thread.sleep(2000);
// 1.id
	// driver.findElement(By.id("123")).sendKeys("Aspire traing institute");
// 2.tagname	 
	 driver.findElement(By.tagName("input")).sendKeys("pune");
// 3.Class name
	 driver.findElement(By.className("Sample")).sendKeys("Aspire Traing");
// 4.name
	 driver.findElement(By.name("id=123")).sendKeys("Institute");
	 
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
