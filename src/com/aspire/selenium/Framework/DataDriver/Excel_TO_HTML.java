package com.aspire.selenium.Framework.DataDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.WorkbookUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel_TO_HTML 
{
   public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException
   {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin\\eclipse-workspace\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
    WebDriver driver= new  ChromeDriver();  
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("https://www.irctc.co.in/nget/profile/user-registration");
	driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//span[@class='ui-tabview-title ng-star-inserted'])[3]")).click();
	
	 FileInputStream file = new FileInputStream("C:\\Users\\Sachin\\eclipse-workspace\\SeleniumOct21\\TestData\\Test1.xlsx");  // giving the path of excele file
     Workbook wbk = WorkbookFactory.create(file);
     
// for sending flat no--->100
     String flatno = wbk.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
     driver.findElement(By.xpath("//input[@id='resAddress1']")).sendKeys(flatno);
    
// for sending  strret no---->
      String streetno = wbk.getSheet("Sheet1").getRow(2).getCell(2).getStringCellValue();
      driver.findElement(By.xpath("(//input[@type='text'])[13]")).sendKeys(streetno);
	   
	   
	   
	   
	   
	   
   }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
