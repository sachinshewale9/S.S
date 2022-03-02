package com.aspire.selenium.select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select2 
{
 public static void main(String[] args) throws InterruptedException 
 {System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin\\eclipse-workspace\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
 WebDriver driver = new ChromeDriver();
	Thread.sleep(2000);
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("shruti");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Shewale");
	//day
	
	 WebElement dayslist = driver.findElement(By.xpath("//select[@id='day']"));
	 Select s = new Select (dayslist);
	 s.selectByIndex(13);
	 Thread.sleep(2000);
	 s.selectByValue("25");
	 Thread.sleep(2000);
	 s.selectByVisibleText("13");
	// month.
	  WebElement month = driver .findElement(By.xpath("//select[@id='month']"));
	// Select s1 = new Select (month);)
	 
	  Select s1 = new Select (month);
	 s1.selectByIndex(2);
	 Thread.sleep(2000);
	 //select by value
	 s1.selectByValue("12");
	 Thread.sleep(2000);
	 s1.selectByVisibleText("Dec");
	 
	 
	 
	 
	 
	 
	 
                                                                                                                                                                                                                                                                                                                                                                               
 
	
	
	
 }
	
	
	
	
	
	
	
	
}
