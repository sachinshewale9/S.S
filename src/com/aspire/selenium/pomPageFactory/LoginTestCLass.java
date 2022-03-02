package com.aspire.selenium.pomPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestCLass 
{ public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin\\eclipse-workspace\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
    WebDriver driver =new	ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://kite.zerodha.com/");
    Thread.sleep(2000);
	
    LoginPage lp = new LoginPage (driver);
    lp.EnterUserName();
    lp.EnterPassword();
    lp.CLickloginbutton();
    Thread.sleep(4000);
    
    PinPage pg= new PinPage(driver);
    pg.Enterpin();
    pg.Clickbutton();
    Thread.sleep(4000) ;  
            
    HomePage hm= new  HomePage (driver);
    hm.logoverfy();
    hm.Intialname();
    
    
    Thread.sleep(10000) ;
    driver.close();
    
    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

	
	
	
	
	
	
	
	
	
	
	
}
