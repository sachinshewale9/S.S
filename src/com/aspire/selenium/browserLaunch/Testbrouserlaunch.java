package com.aspire.selenium.browserLaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testbrouserlaunch 
{
 public static void main(String[] args) throws InterruptedException
 {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Sachin\\eclipse-workspace\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();   
	   Thread.sleep(2000);
	   driver.manage().window().maximize();
	   driver.get("https://www.facebook.com/");
	   String website = driver.getTitle();
	   System.out.println(website);
	   driver.navigate().back();
	   driver.navigate().forward();
	   driver.navigate().to("https://www.google.com/aclk?sa=L&ai=DChcSEwi95Y6Sh7v1AhXCDnIKHX8XAqMYABAAGgJzZg&ae=2&ei=iZHmYcjXOeLA5OUP5PW68Ac&sig=AOD64_0UqK_f3dLyfZBN24gU_4I7ZpfKDg&q&sqi=2&adurl&ved=2ahUKEwiIwPyRh7v1AhViILkGHeS6Dn4Q0Qx6BAgCEAE");
	 
	  
	
	 
	 
	 
	 
}
 
 
 
 
 
 
 
	
	
	
	
	
	
	
	
	
	
	
}
