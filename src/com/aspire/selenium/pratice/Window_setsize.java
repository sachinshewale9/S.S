package com.aspire.selenium.pratice;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_setsize 
{
 public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin\\eclipse-workspace\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
	 WebDriver driver= new ChromeDriver();
	 Thread.sleep(2000);
	 System.out.println(driver.manage().window().getSize());
	 driver.get("https://www.mercedes-benz.com/en/");
	 System.out.println(driver.manage().window().getSize());
	  Dimension d1 = new Dimension(100, 050);
     driver.manage().window().setSize(d1);
   
	 
	 
	 
	 
}
}
