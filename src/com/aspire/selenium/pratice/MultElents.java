package com.aspire.selenium.pratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultElents
{public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Sachin\\eclipse-workspace\\SeleniumOct21\\SoftFiles\\chromedriver.exe" );
	WebDriver driver= new ChromeDriver(); 
	driver.get("https://www.flipkart.com/"); 
	
//	List<WebElement> links = driver.findElements(By.xpath("//a"));
//for(WebElement link:links)
// {
//	System.out.println(link.getText());
// }
	
	
	
	
	
	
}
}