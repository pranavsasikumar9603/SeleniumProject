package com.webdriver;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		
		WebDriver Driver = new ChromeDriver();
		
		String Url = "https://www.instagram.com/";
		
		String Title = "Instagram";
		
		Driver.get(Url);
		
		Driver.manage().window().maximize();
		
		String currentUrl = Driver.getCurrentUrl();
		
		boolean Urlvalidation = Url.equals(currentUrl);
		
		if(Urlvalidation) {
			
			System.out.println("URLvalidation passed");
		}
		else {
			System.out.println("URLvalidation Failed");

		}
		
		String title2 = Driver.getTitle();
		
		System.out.println(title2);
		
		boolean Titlevalidation = Title.equals(title2);
		
		if(Titlevalidation) {
		
		System.out.println("TITLEvalidation passed");
		
	}
		else {
			System.out.println("TITLEvalidation Failed");

		}
		
		WebElement Email = Driver.findElement(By.name("email"));
		Email.sendKeys("sasipranav96@gmail.com");
		
		WebElement Password = Driver.findElement(By.name("pass"));
		Password.sendKeys("SasiPranav96");
		
//		WebElement ForgotPassword = Driver.findElement(By.linkText("Forgot password?"));
//		ForgotPassword.click();
		
		Driver.findElement(By.partialLinkText("Create")).click();;
		
		
//		Xpath To locate attributetype, --- //tagname[@attributename='attributevalue']
		//tagname[contains(@attname,'attvalue')]
// To locate text --  //tagname[text()='textvalue']
		   //tagname[contains(text(),'textvalue')]
		
		
		
		
		
		
	}
}