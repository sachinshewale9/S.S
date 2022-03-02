package com.aspire.selenium.pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mock 
{ public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin\\eclipse-workspace\\SeleniumOct21\\SoftFiles\\chromedriver.exe"); 
	 WebDriver driver =new ChromeDriver();
	 driver.manage().window().maximize();
	 Thread.sleep(2000);
	 driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");  
	     WebElement selenium = driver.findElement(By.xpath("//div[@class='widget LinkList']/ul/li[4]"));
	     Actions act = new Actions(driver);
	     act.moveToElement(selenium).perform();
	    
	 
	 
	 
	 
}

	
	
	
	
	
	
	
	
}
