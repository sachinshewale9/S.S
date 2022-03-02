package com.aspire.selenium.select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAll 
{public static void main(String[] args) throws InterruptedException 
{System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin\\eclipse-workspace\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
Thread.sleep(2000);
driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
         WebElement products = driver.findElement(By.xpath("//select[@id='first']"));
       Select s = new Select(products);
       // by index
       s.selectByIndex(3);
       // by value
    WebElement animal = driver.findElement(By.xpath("//select[@id='animals']"));
	Select s1 = new Select(animal);
	s1.selectByValue("babycat");
	
	          WebElement food = driver.findElement(By.xpath("(//select[@class='col-lg-3'])[3]"));
	          Select s2= new Select(food);
	          s2.selectByVisibleText("Bonda");
	          s2.selectByIndex(1);
	// is multiple
	System.out.println(s1.isMultiple());
	
	System.out.println("select options from fodd list");
           List<WebElement> options = s2.getOptions();
           for(WebElement selectedfodd:options)         
           {        	  System.out.println(selectedfodd.getText());  
           }
           System.out.println("selected item");
           s2.selectByIndex(2);
           s2.selectByIndex(0);
           
	        List<WebElement> selected = s2.getAllSelectedOptions();
	        for(WebElement items:selected)
	        {
	        	System.out.println(items.getText());
	        }
	// selected item
	        System.out.println("selected option");
	        s2.selectByValue("Bonda");
	        s.selectByValue("Bonda");
	        for(WebElement fl:selected)
	        {
	        	System.out.println(fl.getText());
	        }
	
	
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	

	
	
	
	
	
	
	
	
	
}
