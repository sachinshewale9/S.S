package com.aspire.selenium.Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NesFrramePract 
{
 public static void main(String[] args) throws InterruptedException 
 {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin\\eclipse-workspace\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://demoqa.com/nestedframes");
	 Thread.sleep(2000);
    //By webElements method//
	  WebElement parentframe = driver.findElement(By.xpath("//iframe[@src='/sampleiframe']"));// ----->web page path
	  driver.switchTo().frame(parentframe);
//	  String s = driver.findElement(By.xpath("//body[text()='Parent frame']")).getText();
//	  System.out.println(s);
          //**** By index method******//
//	  driver.switchTo().frame(3);
//	  String s1 = driver.findElement(By.xpath("//body[text()='Parent frame']")).getText();
//	  System.out.println(s1);
//	  driver.quit();
          // ****By name and id both are in same way******//
//	 driver.switchTo().frame("frame1");
//	String s2 = driver.findElement(By.xpath("//body[text()='Parent frame']")).getText();
//	System.out.println(s2);
//	driver.quit();
	  //********now to child frame by webelemnt method*******//
	WebElement childframe = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
	driver.switchTo().frame(childframe);
	String childtext = driver.findElement(By.xpath("//p[text()='Child Iframe']")).getText()	;// to getting text of child frame
	System.out.println(childtext);
	driver.quit();
// child to parent
	driver.switchTo().parentFrame();
//child to home page
	driver.switchTo().defaultContent();
	String homepagetext = driver.findElement(By.xpath("(//div[@id='framesWrapper']/div)[1]")).getText();
	System.out.println(homepagetext);	 
	 
	 
	 
	 
	 
	 
	 
 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
