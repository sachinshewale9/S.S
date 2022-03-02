package com.aspire.selenium.pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClicking 
{ public static void main(String[] args) throws InterruptedException
{ System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Sachin\\\\eclipse-workspace\\\\SeleniumOct21\\\\SoftFiles\\\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("http://demo.guru99.com/test/simple_context_menu.html");
// random clicking
	WebElement elmt1 = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
	Actions act= new Actions(driver);
	//act.contextClick(elmt1).perform();
	//act.contextClick().perform();
	WebElement elem2 = driver.findElement(By.xpath("//button[contains(text(),'See ')]"));
	act.doubleClick(elem2).perform();
	
	
	
	
}

	
	
	
	
	
	
	
	
	
}
