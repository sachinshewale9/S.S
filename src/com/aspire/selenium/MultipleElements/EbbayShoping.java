package com.aspire.selenium.MultipleElements;

import java.util.List;
//// to get no of module on web page ...>first find out common x path then go perticulat module x path 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbbayShoping 
{
 public static void main(String[] args) throws InterruptedException 
 {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin\\eclipse-workspace\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
	 WebDriver driver =new ChromeDriver();
	 driver.get("https://www.ebay.com/");
	 driver.manage().window().maximize();
	 Thread.sleep(2000);
	         List<WebElement> moduleslist = driver.findElements(By.xpath("//ul[@class='hl-cat-nav__container']/li"));
	         for(WebElement ebby:moduleslist)
	         {
	        	System.out.println(ebby.getText());
	         }
	 
	 
	 
	 
 }
	
	
	
	
	
	
	
	
	
}
