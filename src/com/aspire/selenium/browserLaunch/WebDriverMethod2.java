package com.aspire.selenium.browserLaunch;





import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethod2 
{
 public static void main(String[] args) throws InterruptedException 
 {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin\\eclipse-workspace\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
	 WebDriver driver= new ChromeDriver();
	 Thread.sleep(2000);
	 driver.manage().window().getSize();
	 System.out.println(driver.manage().window().getSize());
	 driver.get("https://www.mercedes-benz.com/en/");
	 System.out.println(driver.manage().window().getSize());
	 Thread.sleep(2000);
	 Dimension d1= new Dimension(300,300);            
	 driver.manage().window().setSize(d1);
	 Dimension d2= new Dimension(800, 500);
	 driver.manage().window().setSize(d2);
	 Thread.sleep(2000);
	 Dimension d3= new Dimension(900, 700);
	 driver.manage().window().setSize(d3);
	 Dimension d4 = new Dimension(20, 20);
	 driver.manage().window().setSize(d4);
	 Thread.sleep(2000);
	 Point p = new Point (700,100);
	 driver.manage().window().setPosition(p);
	 System.out.println(driver.manage().window().getPosition());
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
