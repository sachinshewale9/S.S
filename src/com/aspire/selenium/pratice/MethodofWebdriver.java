package com.aspire.selenium.pratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodofWebdriver
{
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin\\eclipse-workspace\\SeleniumOct21\\SoftFiles\\chromedriver.exe");	
WebDriver driver=new ChromeDriver();
Thread.sleep(2000);
driver.manage().window().maximize();
driver.get("https://www.flipkart.com/");
System.out.println(driver.getCurrentUrl());
System.out.println(driver.getTitle());
driver.navigate().back();
Thread.sleep(1000);
driver.navigate().forward();
	
	
	
	
	
}
	
}
