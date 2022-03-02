package com.aspire.selenium.actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CustomisedListBox2 
{public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin\\eclipse-workspace\\SeleniumOct21\\SoftFiles\\chromedriver.exe");	
	 WebDriver driver=new ChromeDriver ();
	 driver.manage().window().maximize();
	 Thread.sleep(2000);
	 driver.get("https://en-gb.facebook.com/");
	 driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	 Thread.sleep(2000);
	 WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	 Actions act=new Actions(driver);
	 act.click(month).perform();
	 for(int i=1;i<=12;i++) // //Moving to extreme option (First or last)
	 {
		 act.sendKeys(Keys.ARROW_DOWN).perform();
		 Thread.sleep(2000);
	 }
	 for(int i=1;i<=7;i++)
	 {
		 act.sendKeys(Keys.ARROW_UP).perform();
		 Thread.sleep(2000);
		 act.sendKeys(Keys.ENTER);
	 }
	
	
	
	
	
	
	
	
	
	
	
}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
