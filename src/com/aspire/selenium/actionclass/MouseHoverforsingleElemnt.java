package com.aspire.selenium.actionclass;
//program for 
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverforsingleElemnt
{
 public static void main(String[]args ) throws InterruptedException 
 {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin\\eclipse-workspace\\SeleniumOct21\\SoftFiles\\chromedriver.exe"); 
	 WebDriver driver =new ChromeDriver();
	 driver.manage().window().maximize();
	 Thread.sleep(2000);
	 driver.get("http://demo.guru99.com/test/newtours/");
	 // *******For single click element program or code*****
	 WebElement firstcell = driver.findElement(By.xpath("(//tr[@class='mouseOut'][1]/td[1])"));
	 Actions act = new Actions(driver);
	 act.moveToElement(firstcell).perform();
	
	 
	 
 }
	
}
