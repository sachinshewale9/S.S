package com.aspire.selenium.actionclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverforMultpleElemnt 
{
 public static void main(String[]args ) throws InterruptedException 
 {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin\\eclipse-workspace\\SeleniumOct21\\SoftFiles\\chromedriver.exe"); 
		 WebDriver driver =new ChromeDriver();
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 driver.get("http://demo.guru99.com/test/newtours/");
		 List<WebElement> allcells = driver.findElements(By.xpath("(//tr[@class='mouseOut']/td[1])"));
		     Actions all = new Actions(driver);
		 for( WebElement cell:allcells)
		 {
	           all.moveToElement(cell).perform();
	           Thread.sleep(2000);
		 }
}
}