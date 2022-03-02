package com.aspire.selenium.browserLaunch;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web2 
{
 public static void main(String[] args) throws InterruptedException 
 {   System.setProperty("webdriver.chrome.driver","C:\\Users\\Sachin\\eclipse-workspace\\SeleniumOct21\\SoftFiles\\chromedriver.exe" );          
	 WebDriver driver = new ChromeDriver();
	 Thread.sleep(2000);
	 driver.manage().window().getSize();
	 System.out.println( driver.manage().window().getSize());
	 driver.get("https://www.mercedes-benz.com/en/");
     driver.manage().window().getSize();
     System.out.println(driver.manage().window().getSize());
     Dimension d1=new Dimension(400, 500);
     driver.manage().window().setSize(d1); 
     Point d2 = new Point(500, 500);
     driver.manage().window().setPosition(d2);
     driver.manage().window().getPosition();
                          
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
