package com.aspire.selenium.MultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox
{
public static void main(String[] args) throws InterruptedException
{System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Sachin\\\\eclipse-workspace\\\\SeleniumOct21\\\\SoftFiles\\\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://demo.guru99.com/test/radio.html");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	        List<WebElement> option = driver.findElements(By.xpath("//div[@style='margin-left:20px;']//input"));
	        
	        System.out.println("***by for loop****");	   
	        for(int i= 0;i<=option.size();i++)
	        {
	        	Thread.sleep(2000);
	        	option.get(i).click();
	        }
	        
	        System.out.println("****by for each loop****");
//	        for(WebElement options:option)
//	        {
//
//	        	Thread.sleep(2000);
//	        	options.click();
//	        }
	
	
	
	
	
	
	
	
	
 }
	
	
	
	
	
	
	
	
	
	
	
}
