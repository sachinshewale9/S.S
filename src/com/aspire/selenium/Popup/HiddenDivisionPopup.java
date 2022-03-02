package com.aspire.selenium.Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopup 
{
 public static void main(String[] args) throws InterruptedException 
 {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin\\eclipse-workspace\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.flipkart.com/");
     Thread.sleep(2000);
	 // UN------>password------->Blue strip text get----->login button click
     driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("sachin.shewale15115@gmail.com");
     driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abc@gmail.com");
     String logotext = driver.findElement(By.xpath("//span[contains(text(),'access ')]")).getText(); 
     System.out.println(logotext);
     driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
     Thread.sleep(2000);
                                                                                                                                                                                                                                                                                                        
	 
	 
	 
	 
	 
	 
 }
	 
 
	
	
	
	
	
	
	
}
