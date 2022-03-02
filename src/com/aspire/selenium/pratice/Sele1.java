package com.aspire.selenium.pratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sele1
{
 public static void main(String[] args) throws InterruptedException 
 {System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin\\eclipse-workspace\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
 WebDriver driver = new ChromeDriver();
	Thread.sleep(2000);
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	driver.findElement(By.xpath("(//a[@ role='button'])[2]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("shrawani");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("shewale");
    WebElement daylist = driver.findElement(By.xpath("//select[@id='day']"));
	 Select s= new Select(daylist);
	 // select by index
	 s.selectByIndex(2);
	 //select by id
	 s.selectByValue("4");
// All moth
	 WebElement mothlist = driver.findElement(By.xpath("//select[@id='month']"));
	 Select s1 = new Select(mothlist);
	     List<WebElement> month = s1.getOptions();
	for(WebElement allmoth:month) 
	{
	System.out.println(allmoth.getText());	
	}
 }
	
	
	
}
