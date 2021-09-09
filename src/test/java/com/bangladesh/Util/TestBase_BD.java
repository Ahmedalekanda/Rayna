package com.bangladesh.Util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase_BD {
	public static Properties prop; 	
	public static WebDriver driver;
	
	public TestBase_BD() {
		
	try {
		FileInputStream fls = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\com\\bangladesh\\config\\configBD.properties");
		prop = new  Properties();
		prop.load(fls);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	
		
	}
	
    public void initz() {
    	
    String Browsername = prop.getProperty("browser1");
    if(Browsername.equals("chrome")){
    	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
    	driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(utilll.implicitlyWait_wait,TimeUnit.SECONDS);		
		driver.manage().timeouts().pageLoadTimeout(utilll.pageLoadTimeout_wait,TimeUnit.SECONDS);	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
    
    
    }
    
    else if(Browsername.equals("FF"));
    	
    	System.out.println("browser are not found");
     
    }
     
    public static void launchApplication(String URL) {
		driver.get(prop.getProperty("url_QA"));
}
    
}

