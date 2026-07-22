package com.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Options {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\welcome\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
//		options.addArguments("--start-maximized");
//		options.addArguments("--guest");
//		options.addArguments("--disable-notifications");
//		options.addArguments("--disable-extensions");
//		options.addArguments("--disable-popup-blocking");
//		options.addArguments("--ignore-certificate-errors");
//		options.addArguments("--kiosk");
//		options.addArguments("--window-size=1920,1080");
//		options.addArguments("profile-directory=Default");
		
		
		options.addArguments(
			    "--incognito",
			    "--start-maximized",
			    "--disable-notifications",
			    "--disable-popup-blocking",
			    "--disable-extensions",
			    "--ignore-certificate-errors",
			    "--headless=new"
			);
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://google.com/");


		

	}
}
