package com.aspire.selenium.Framework.DataDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExceltoHtmlFacebook
{ public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin\\eclipse-workspace\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("https://www.facebook.com/");
	
FileInputStream file = new FileInputStream("C:\\Users\\Sachin\\eclipse-workspace\\SeleniumOct21\\TestData\\Test1.xlsx");
	     Workbook wbk = WorkbookFactory.create(file);
// for sending name     
	    String name = wbk.getSheet("Sheet2").getRow(2).getCell(2).getStringCellValue();
	   driver.findElement(By.xpath("//input[@type='text']")).sendKeys(name);
// for sending password
	  String password = wbk.getSheet("Sheet2").getRow(3).getCell(2).getStringCellValue();
  driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
	
	
	
	
	
	
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
