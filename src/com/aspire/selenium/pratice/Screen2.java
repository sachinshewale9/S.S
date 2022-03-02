package com.aspire.selenium.pratice;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

// program for ssin destination folder
public class Screen2
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sachin\\eclipse-workspace\\SeleniumOct21\\SoftFiles\\chromedriver.exe" );
		  WebDriver driver = new ChromeDriver(); 
			
		   driver.get("https://www.facebook.com/");
		   driver.manage().window().maximize();
		   Thread.sleep(2000);
		TakesScreenshot ts = (TakesScreenshot)driver;
		 File source = ts.getScreenshotAs(OutputType.FILE);
		  System.out.println(source);
		 File destination = new File("C:\\Users\\Sachin\\eclipse-workspace\\SeleniumOct21\\ScreenShots\\sachinshotsscreen");
	       FileHandler.copy(source, destination);
	    
	}

}
