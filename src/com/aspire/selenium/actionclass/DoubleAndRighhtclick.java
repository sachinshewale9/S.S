package com.aspire.selenium.actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleAndRighhtclick
{
 public static void main(String[] args) throws InterruptedException
 {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin\\eclipse-workspace\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    Thread.sleep(2000);
    driver.get("http://demo.guru99.com/test/simple_context_menu.html");
    // ***************program for context or right clicking******************* 
    Actions act = new Actions(driver);
    WebElement el1 = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
   // act.contextClick(el1).perform();// desired elemnt click this method
 act.contextClick().perform();// random clicking method
 //another approach below given.. when two or more action perfome then using build method //  act.moveToElement(el1).contextClick().build().perform();
    
// ***************program for double clicking*******************************	
//	 WebElement el2 = driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
//	 act.moveToElement(el2).doubleClick().build().perform();
//	// another approach as bellow
//	// act.doubleClick(el2).perform();
//    
	
	
	
	 
	
	
	
	
 }
}
