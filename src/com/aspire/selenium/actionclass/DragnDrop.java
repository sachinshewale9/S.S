package com.aspire.selenium.actionclass;
// to get excell data on console
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragnDrop
{
 public static void main(String[] args) throws InterruptedException
 { System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin\\eclipse-workspace\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
   WebDriver driver = new ChromeDriver();
   driver.manage().window().maximize();
   Thread.sleep(2000);
   driver.get("https://demoqa.com/droppable/");
   WebElement sourcelem = driver.findElement(By.xpath("//div[@id='draggable']"));
   WebElement target = driver.findElement(By.xpath("(//div[@id='droppable'][1])")); 
   Thread.sleep(2000);
   Actions act = new Actions(driver);
// 1.first approch
      //  act.moveToElement(sourcelem).clickAndHold().moveToElement(target).release().build().perform();
// 2.second approach 
	  //  act.moveToElement(sourcelem).clickAndHold().release(target).build().perform();
// 3.third approach
	  //   act.clickAndHold(sourcelem).release(target).build().perform();
// 4.fourth approach	 
	 act.dragAndDrop(sourcelem, target).perform();
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
 }	
	
}
