package com.aspire.selenium.Webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable1
{
 public static void main(String[] args) throws InterruptedException 
 {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin\\eclipse-workspace\\SeleniumOct21\\SoftFiles\\chromedriver.exe");	
	 WebDriver driver =new ChromeDriver();
	 driver.get("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");
	 driver.manage().window().maximize();
	 Thread.sleep(2000);
// to get cell value	 
	String bodyCellvalue = driver.findElement(By.xpath("//td[text()='Angels & Demons']")) .getText();
	System.out.println(bodyCellvalue);
// to get row
	      List<WebElement> rowEle = driver.findElements(By.xpath("//table[@id='BooksAuthorsTable']//th"));
	    System.out.println(  rowEle.size());
	      for(WebElement ele:rowEle)
	      {
	    	 System.out.println( ele.getText());
	      }
	 driver.quit();
	 
 }
	
	
	
	
	
	
	
	
	
	
	
}
