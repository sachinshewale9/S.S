package com.aspire.selenium.browserLaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethod 
{
 public static void main(String[] args) throws InterruptedException
 {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Sachin\\eclipse-workspace\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();   
	 Thread.sleep(2000);
	 driver.manage().window().maximize();
	 driver.get("https://www.esakal.com/");
	 Thread.sleep(2000);
	 driver.navigate().to("https://www.hyundai.com/in/en");
	 Thread.sleep(2000);
     String websitetitle = driver.getTitle();
	 System.out.println(websitetitle);
	 String websiteurl = driver.getCurrentUrl();
	 System.out.println(websiteurl);
	 driver.navigate().back();
	 Thread.sleep(2000);
	 driver.navigate().to("https://www.esakal.com/");
	 driver.quit();
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
 
 
 
 
 
 
 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
