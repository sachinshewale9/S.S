package com.aspire.selenium.Popup;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Filpkartmodule 
{ public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin\\eclipse-workspace\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("samsung");
	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	//Now we have to click on every mobile one by one so we take Elements 
	Thread.sleep(2000);
    List<WebElement> items = driver.findElements(By.xpath("//div[@class='_4rR01T']"));// due to elements it gives list
   // for clicking on every model we use the for each loop i.e on 24 model
   for(WebElement item:items)
   {
	   System.out.println(item.getText());// to get mobile printing on console
	 item.click();// for clicking on mobile
   }
              Set<String> ids = driver.getWindowHandles();// to swith on window 1st we use get windows handles and
              ArrayList<String> al = new ArrayList<String>(ids);// using Arraylist to get ids print
              //o index for home page, 1 index for last,2 index for second last windpow
              driver.switchTo().window(al.get(1));
	driver.quit();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
