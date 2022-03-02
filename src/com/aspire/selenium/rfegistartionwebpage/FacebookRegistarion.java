package com.aspire.selenium.rfegistartionwebpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookRegistarion
{ public static void main(String[] args) throws InterruptedException
{  
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Sachin\\\\eclipse-workspace\\\\SeleniumOct21\\\\SoftFiles\\\\chromedriver.exe");
	 WebDriver driver  = new ChromeDriver();
	 driver.get("https://www.facebook.com/");
//New account creation button click
	 driver.findElement(By.xpath("//a[@ rel= 'async']")).click();
	 Thread.sleep(2000);
//First name enter
	 driver.findElement(By.xpath("//input[@ name= 'firstname']")).sendKeys("Ashwini");
	 Thread.sleep(2000);
//Last name enter
	 driver.findElement(By.xpath("//input[@ name='lastname']")).sendKeys("Patil");
	 Thread.sleep(2000);
//Mobile Number	 
	 driver.findElement(By.xpath("(//input[@data-type='text'])[3]")).sendKeys("7745883293");
	 Thread.sleep(2000);
//Password 
	 driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("sachin");
	 Thread.sleep(2000);
// Gender selection	 
	 driver.findElement(By.xpath("(//input[@class='_8esa'])[1]")).click();
	 Thread.sleep(2000);
// submite	 
	 driver.findElement(By.xpath("(//button[@ type='submit'])[2]")).click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
