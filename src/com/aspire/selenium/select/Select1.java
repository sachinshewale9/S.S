package com.aspire.selenium.select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin\\eclipse-workspace\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@ role='button'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("shrawani");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("shewale");
	// 1. day	
		WebElement daylist = driver.findElement(By.xpath("//select[@id='day']"));
		  Select s = new Select(daylist);
		  s.selectByIndex(14);//index o for 1st elemnt in list
		  Thread.sleep(2000);
		  s.selectByValue("25");
		  Thread.sleep(2000);
		//  s.deselectByIndex(index);
		  s.selectByValue("25");
		// s.selectByVisibleText("7");
		  
//2.month
	// oct---july---dec
	 WebElement monthlist = driver.findElement(By.xpath("//select[@id='month']"));
		Select s2=new Select(monthlist);
		s2.selectByIndex(9);
		Thread.sleep(2000);
		s2.selectByValue("7");
		Thread.sleep(2000);
		s2.selectByVisibleText("Dec");
// All  month print		
		System.out.println("Alll month");
		List<WebElement> allmonth = s2.getOptions();
		for(WebElement listmonth:allmonth)
		{
			System.out.println(listmonth.getText());
		}
		
		Thread.sleep(15000);
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
