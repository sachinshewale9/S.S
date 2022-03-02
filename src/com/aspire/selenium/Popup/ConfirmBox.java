package com.aspire.selenium.Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmBox 
{
	public static void main(String[] args) throws InterruptedException 
	 {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin\\eclipse-workspace\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");
	     Thread.sleep(2000);
	     driver.findElement(By.id("confirmBox")).click();// by x path insted of id use find the element
         Alert alt = driver.switchTo().alert();
         System.out.println(alt.getText());
         Thread.sleep(2000);
        // alt.accept();
         alt.dismiss();
	
	
	
	
	
	
	
	
	
	
	 }	
}
