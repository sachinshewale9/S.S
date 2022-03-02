package com.aspire.selenium.actionclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PractisSIngleclicking 
{
 public static void main(String[] args) throws InterruptedException
 { System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin\\eclipse-workspace\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("https://www.flipkart.com/");
	// progrm for clicking on module
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
//   List<WebElement> flipele = driver.findElements(By.xpath("//div[@class='_37M3Pb']/div"));
   Actions act= new Actions(driver);
//   for(WebElement modules:flipele)
//   {
//	   act.moveToElement(modules).perform();
//	   Thread.sleep(2000);
//   }
 // program for double clicking on module

	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
