package com.aspire.selenium.screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Prog4 
{
public static void main(String[] args) throws InterruptedException, IOException 
{
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Sachin\\\\eclipse-workspace\\\\SeleniumOct21\\\\SoftFiles\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	        TakesScreenshot ts = (TakesScreenshot)driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	System.out.println(source);
	 
	String randomName =net.bytebuddy.utility.RandomString.make(5);
	File destination = new File("C:\\Users\\Sachin\\eclipse-workspace\\SeleniumOct21\\ScreenShots\\"+randomName+".jpg");
	FileHandler.copy(source, destination);
	driver.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

private static void RandomString() {
	// TODO Auto-generated method stub
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
