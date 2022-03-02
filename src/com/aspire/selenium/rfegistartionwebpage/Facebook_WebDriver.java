package com.aspire.selenium.rfegistartionwebpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_WebDriver 
{
 public static void main(String[] args) throws InterruptedException 
{// Browser Launching
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Sachin\\eclipse-workspace\\SeleniumOct21\\SoftFiles\\chromedriver.exe" );
	 WebDriver driver = new ChromeDriver();
	 
// website laod in browser
	 driver.get("https://www.facebook.com/");
	 Thread.sleep(2000);
//isDiplyed	  
     boolean logoDisplayresult = driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]")).isDisplayed();
	 System.out.println("logoDisplayresult="+logoDisplayresult);// true or false
// another method to check isdisplayed by if else 
	 if(logoDisplayresult=true)
		 System.out.println("Facbook logo Displyed  ");
	 else 
	 {
		 System.out.println("Facbook logo not  Displyed");
	 }
	 Thread.sleep(2000);
//isEnabled
	 boolean emailTextbox =driver.findElement(By.xpath("//input[@type=\"text\"]")).isEnabled();
	   System.out.println("emailTextbox="+emailTextbox);
	 // another method 
	   if( emailTextbox)
	   {
		   System.out.println("emailTextbox="+true);
	   }
	   else
	   {
		   System.out.println("emailTextbox="+false);
	   }
//isSelected
	   driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Rutuja");
	 Thread.sleep(2000); 
	 driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Kulkarni");
	 Thread.sleep(2000);
	 
     driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("7745883293");
     driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("shrawani@2314");
     driver.findElement(By.xpath("(//label[@class='_58mt'])[1]")).click();
     boolean FemailSelection = driver.findElement(By.xpath("(//input[@type='radio'][1])")).isSelected();
     boolean MaleSelection = driver.findElement(By.xpath("(//input[@type='radio'])[2]")).isSelected();
     System.out.println("Radio buton of Femailselected="+ FemailSelection);
     System.out.println("Radio button of MaleSelected="+ MaleSelection);
     
     
     
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
 }
 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
