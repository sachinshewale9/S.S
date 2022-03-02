package com.aspire.selenium.Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pract
{
 public static void main(String[] args) throws InterruptedException 
 {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin\\eclipse-workspace\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://demoqa.com/nestedframes");
	 Thread.sleep(2000);
	 WebElement parentframe = driver.findElement(By.xpath("//iframe[@src='/sampleiframe']"));
	 driver.switchTo().frame(parentframe);
	 String s = driver.findElement(By.xpath("//body[text()='Parent frame']")).getText();
	 System.out.println(s); 
	  
	 
	 
	 
	 
	 
	 
	 
	 
 }
	
	
	
	
	
	
	
	
	
	
	
	
	
}
