package com.aspire.selenium.MultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllEle 
{
 public static void main(String[] args) throws InterruptedException 
 {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Sachin\\\\eclipse-workspace\\\\SeleniumOct21\\\\SoftFiles\\\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.flipkart.com/");
	 driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	 driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("samsung");
	 Thread.sleep(2000);
     driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
     Thread.sleep(2000);
     driver.findElements(By.xpath("/div[2]/div/div/div/a/div[2]/div[1]/div[1]"));
     
	   
	 
	 
	 
	 
	 
	 
 }
	
	
	
	
	
	
	
	
	
}
