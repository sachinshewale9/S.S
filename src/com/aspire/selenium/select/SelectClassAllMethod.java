package com.aspire.selenium.select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassAllMethod 
{
 public static void main(String[] args) throws InterruptedException 
 {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin\\eclipse-workspace\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 Thread.sleep(2000);
	 driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
	 WebElement product = driver.findElement(By.xpath("//select[@id='first']"));
	 Select s= new Select(product);
// select by index
	  s.selectByIndex(2);
	   Thread.sleep(2000);
 // select by value
	  WebElement Animal = driver.findElement(By.xpath("//select[@id='animals']"));
	   Select s2  = new Select(Animal);
	   s2.selectByValue("babycat");
	   Thread.sleep(2000);
 // select visibale text
	   WebElement food = driver.findElement(By.xpath("//select[@id='second']"));
	   Select s3 = new Select(food);
	   s3.selectByVisibleText("Burger");
	   Thread.sleep(2000);
	   s3.deselectByIndex(2);
	 
 //isMultiple
	   System.out.println( s3.isMultiple());
	   System.out.println(s2.isMultiple());
	   s3.selectByIndex(1);
	   s3.selectByIndex(3);
	   System.out.println("All option fron food list boxt");
	   List<WebElement> alloption = s3.getOptions();
	     for(WebElement option:alloption)
	               {
	            	  System.out.println(option.getText()); 
	               }
	   System.out.println("selected option from food list box");
	           List<WebElement> foodselected = s3.getAllSelectedOptions();
	           for(WebElement item:foodselected)
	           {
	        	   System.out.println(item.getText());
	           }
	           Thread.sleep(15000);
	   		driver.close();
	 
	 
	 
	 
	 
	 
	 
	 
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
