package com.aspire.selenium.MultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllElements
{
 public static void main(String[] args)
 {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Sachin\\eclipse-workspace\\SeleniumOct21\\SoftFiles\\chromedriver.exe" );
	WebDriver driver= new ChromeDriver(); 
	driver.get("https://www.flipkart.com/"); 
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
//	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click(); 
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Samsung"); 
	driver.manage().window().maximize(); 
	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click(); 
	List<WebElement> mobilelist = driver.findElements(By.xpath("(//div[@class='_1YokD2 _3Mn1Gg'])//div[@class='_4rR01T']")); 
	 for(WebElement a:mobilelist)
	 {
		 System.out.println(a.getText());
	 }

	 
	 
	 
	 
 }
	
	
	
	
	
	
	
	
	
	
	
	
}
