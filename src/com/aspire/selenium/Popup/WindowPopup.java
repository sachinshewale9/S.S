package com.aspire.selenium.Popup;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopup 
{
public static void main(String[] args) throws InterruptedException 
 {
 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin\\eclipse-workspace\\SeleniumOct21\\SoftFiles\\chromedriver.exe");	
 WebDriver driver =new ChromeDriver();
 driver.get("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");
 driver.manage().window().maximize();
 Thread.sleep(2000);
 String id = driver .getWindowHandle();
 System.out.println(id);
 driver.findElement(By.xpath("//button[@id='win1']")).click();
 Set<String> ids = driver.getWindowHandles();     
 for(String id1:ids)	// it is used to ids print
 {
	 System.out.println(id1);
 }
 ArrayList<String> al = new ArrayList<String>(ids);// to get ids print so we use arraylist
 driver.switchTo().window(al.get(1));
	driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("samsung");
	Thread.sleep(2000);
	driver.switchTo().window(al.get(0));
	Thread.sleep(2000);
	driver.switchTo().window(al.get(0));
	//driver.switchTo().window(id);
	String parentwindowtext = driver.findElement(By.xpath("//label[contains(text(),'Drag and')]")).getText();
	System.out.println(parentwindowtext);
	
//	driver.close();
	driver.quit();
 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
