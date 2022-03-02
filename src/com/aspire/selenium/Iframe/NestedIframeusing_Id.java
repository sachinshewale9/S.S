package com.aspire.selenium.Iframe;
//By Using Id and Name
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIframeusing_Id 
{
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Sachin\\\\eclipse-workspace\\\\SeleniumOct21\\\\SoftFiles\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/nestedframes");
	Thread.sleep(2000);
	//by_id using
	driver.switchTo().frame("frame1");
	String s = driver.findElement(By.xpath("//body[text()='Parent frame']")).getText();
    System.out.println(s);
	
	
	
	
	
	
	
	
	}
}
