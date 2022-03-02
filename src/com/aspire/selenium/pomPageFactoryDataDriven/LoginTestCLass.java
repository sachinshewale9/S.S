package com.aspire.selenium.pomPageFactoryDataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestCLass 
{ public static void main(String[] args) throws InterruptedException, IOException
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin\\eclipse-workspace\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
    WebDriver driver =new	ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://kite.zerodha.com/");
   Thread.sleep(2000);
//	String UNvalue="DP6852";
//	String pwdVALUE="Pramod@2105";
//	String pinValue="976976";
    String filepath =("C:\\Users\\Sachin\\eclipse-workspace\\SeleniumOct21\\TestData\\ProjectData.xlsx");
    FileInputStream file = new FileInputStream(filepath);
    Workbook wbf = WorkbookFactory.create(file);
    String UNvalue = wbf.getSheet("Sheet1").getRow(10).getCell(1).getStringCellValue();
    LoginPage lp = new LoginPage (driver);
    lp.EnterUserName(UNvalue);
    String pwdVALUE = wbf.getSheet("Sheet1").getRow(10).getCell(2).getStringCellValue();
    lp.EnterPassword(pwdVALUE);
   
    lp.CLickloginbutton();
    Thread.sleep(2000);
    
    PinPage pg= new PinPage(driver);
    String pinValue= wbf.getSheet("Sheet1").getRow(10).getCell(3).getStringCellValue();
    pg.Enterpin(pinValue);
    pg.Clickbutton();
    Thread.sleep(2000);
   
            
    HomePage hm= new  HomePage (driver);
    hm.logoverfy();
    boolean explogo = wbf.getSheet("Sheet1").getRow(10).getCell(6).getBooleanCellValue();
    
    hm.Intialname();
    String ActualName = wbf.getSheet("Sheet1").getRow(10).getCell(4).getStringCellValue();
    Thread.sleep(10000) ;
    driver.close();
    
    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


	
	
	
	
	
	
	
	
	
}	
	
}
