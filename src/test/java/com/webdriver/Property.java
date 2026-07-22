package com.webdriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Property extends Newbaseutill{
	
	public static WebDriver Driver;
		 
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		
		Driver = new ChromeDriver();
		
		File f = new File("C:\\Users\\welcome\\eclipse-workspace\\SeleniumProject\\target\\file.properties");
			
		FileInputStream fin = new FileInputStream(f);
		
		Properties prop = new Properties();
		
		prop.load(fin);
		
		Object object = prop.get("Url");
		
		String URL = (String)object;
		
		Driver.get(URL);
		Driver.manage().window().maximize();
		
		Object object2 = prop.get("username");
		
		String name = (String)object2;
		
		Object object3 = prop.get("password");
				
		String password = (String)object3;
		
		System.out.println(password);
		
		Thread.sleep(3000);

		prop.setProperty("password", "goodday");
		
		Thread.sleep(3000);
		
		System.out.println(name);
				
		System.out.println(password);
		
		WebElement email = Driver.findElement(By.name("email"));
		
		email.sendKeys(name);
		
		WebElement key = Driver.findElement(By.name("pass"));

		key.sendKeys(password);
		
		Thread.sleep(3000);
		
		prop.setProperty("dob", "9/6/03");
		
		FileOutputStream fos = new FileOutputStream(f);
		
		prop.store(fos, "updated new file");
		
		fos.close();
		fin.close();
		
		Driver.quit();

		
		
		
		
		
		
		
		
		
	}

}
