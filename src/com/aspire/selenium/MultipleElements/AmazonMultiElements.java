package com.aspire.selenium.MultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
// to get no of module on web page ...>first find out common x path then go perticulat module x path 
public class AmazonMultiElements 
{
 public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin\\eclipse-workspace\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	         List<WebElement> modules = driver.findElements(By.xpath("//div[@id='nav-xshop-container']//a"));
	         System.out.println("no of modules present on web page");
	         
	for( WebElement listmodel:modules)
	{
		System.out.println(listmodel.getText());
	}
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
	
	
	
	
	
	
	
	
	
}
