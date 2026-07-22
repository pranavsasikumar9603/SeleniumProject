package com.webdriver;

	import java.util.Set;


	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Newbaseutill {
	
		
		public static WebDriver Driver;
		 
	 public void Launch(String Url) {
		 
		 

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		
		 Driver = new ChromeDriver();
			
		Driver.get(Url);
		Driver.navigate().to(Url);
		Driver.manage().window().maximize();
		
		
		
	 }

}
