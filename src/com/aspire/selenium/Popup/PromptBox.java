package com.aspire.selenium.Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptBox 
{
	public static void main(String[] args) throws InterruptedException 
	 {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin\\eclipse-workspace\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");
	     Thread.sleep(2000);
	     driver.findElement(By.id("promptBox")).click();
	     Alert alt = driver.switchTo().alert();
	     System.out.println(alt.getText());
	     alt.sendKeys("sachin shevale");// not working 
	     
	     
	     
	     
	     
	     
	     
	     
	 }
}
