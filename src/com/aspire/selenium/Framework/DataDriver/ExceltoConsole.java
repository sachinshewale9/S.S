package com.aspire.selenium.Framework.DataDriver;
// Excel to console print data program as follow
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExceltoConsole
{
public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
{
//	System.setProperty("webdriver.chrome.driver","C:\\Users\\Sachin\\eclipse-workspace\\SeleniumOct21\\SoftFiles\\chromedriver.exe");	
//	WebDriver driver=new ChromeDriver();
//	driver.manage().window().maximize();
//	Thread.sleep(2000);
//	driver.get("https://www.irctc.co.in/nget/profile/user-registration");
//	Thread.sleep(02000);
//	driver.findElement(By.xpath("(//input[@type='text'])[12]")).click();.
// to get pincode
	FileInputStream file = new FileInputStream("C:\\Users\\Sachin\\eclipse-workspace\\SeleniumOct21\\TestData\\Test1.xlsx");
	Workbook wbf = WorkbookFactory.create(file);
	String pincode = wbf.getSheet("Sheet1").getRow(4).getCell(2).getStringCellValue();
	System.out.println(pincode);
//to get flat no
	 String flatno = wbf.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
	 System.out.println(flatno);
// to get Area
	String Area = wbf.getSheet("Sheet1").getRow(3).getCell(2).getStringCellValue();
	System.out.println(Area);
	
}
	
	
	
	
	
	
	
	

}
