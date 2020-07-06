package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBaseClass {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBaseClass()  {
		try {
		prop = new Properties();		
		FileInputStream io = new FileInputStream("C:/Users/user/Desktop/Training/POMCucumber/src/main/java/com/crm/qa/config/config.properties");
		prop.load(io);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

	public static void initialization() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\Selenium\\chromedriver.exe" );
		driver = new ChromeDriver();
		String url = prop.getProperty("url");
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);		
	}

}
