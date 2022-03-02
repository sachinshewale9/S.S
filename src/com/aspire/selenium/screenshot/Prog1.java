package com.aspire.selenium.screenshot;
//Capture scrren shot in Temp folder with Randome name
import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Prog1
{
 public static void main(String[]  args) throws InterruptedException
 {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Sachin\\eclipse-workspace\\SeleniumOct21\\SoftFiles\\chromedriver.exe" );
	 WebDriver driver = new ChromeDriver(); 
	// float a=10.2f;	//example of typecast
   //		int b=(int) a;
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		TakesScreenshot ts = (TakesScreenshot)driver;// type cast
		File source = ts.getScreenshotAs(OutputType.FILE);  //file stores at a location
		System.out.println(source);
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
 }
 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
