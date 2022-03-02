package com.aspire.selenium.MultiBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Chrome 
{      static WebDriver driver;
       static String s="firefox";

public static void main(String[] args) throws InterruptedException 
{
	
	// 1.Chromedriver.....>Chrome Browser
	if(s.equals("chrome"))
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Sachin\\eclipse-workspace\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
    driver = new ChromeDriver ();
	}
	 //2. geckodriver.....>Firefox Driver
	else if (s.equals("firefox"))
	{
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sachin\\eclipse-workspace\\SeleniumOct21\\SoftFiles\\geckodriver.exe");
	 driver =new FirefoxDriver ();
	}
	
	// 3.Microsoftedge
	else if(s.equals("edge"))
	{
	System.setProperty("webdriver.edge.driver", "C:\\Users\\Sachin\\eclipse-workspace\\SeleniumOct21\\SoftFiles\\msedgedriver.exe");
	 driver = new EdgeDriver();
	 driver.quit();
	}
	 
	 driver.get("https://www.facebook.com/");
    Thread.sleep(2000);
	 
	 
	 
	 
	 
	
}	 

	
	
	
	
	
	
	
}
