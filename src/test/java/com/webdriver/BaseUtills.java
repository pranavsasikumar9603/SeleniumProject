package com.webdriver;

import java.io.IOException;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseUtills {
	
	public static WebDriver Driver;
	 
 public void Launch(String Url) {
	 
	 

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
	
	 Driver = new ChromeDriver();
		
//	Driver.get(Url);
	Driver.navigate().to(Url);
	Driver.manage().window().maximize();
	
 }
	
	
	public static void main(String[] args) throws InterruptedException {
		BaseUtills b = new BaseUtills();
		b.Launch("https://www.flipkart.com/");
		
	Thread.sleep(5000);
		
		try{
			Driver.findElement(By.xpath("//span[text()='✕']")).click();
			
		}
		
		catch(Exception e){
			e.printStackTrace();
			
		}
		finally {
			System.out.println("Handled");
		}
		
		WebElement searchbutton= Driver.findElement(By.name("q"));
		searchbutton.sendKeys("Iphone", Keys.ENTER);
		
		WebElement iphone15 = Driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Black, 128 GB)']"));
		iphone15.click();
		
		WebElement iphone16 = Driver.findElement(By.xpath("//div[text()='Apple iPhone 16 (Black, 128 GB)']"));
		iphone16.click();
		
//		Driver.findElement(By.xpath("//div[text()='₹59,900']")).click();
		
		String Parentwin = Driver.getWindowHandle();
		System.out.println(Parentwin);
		
		Set<String> allwin = Driver.getWindowHandles();
		
//		int i=1;
//		int j=2;
//		for(String x: allwin ) {
//			System.out.println("Window"+ i+ ":=" + x);
//			i++;
//		}
//		
//		for(String x: allwin ) {
//			if(!Parentwin.equals(x)) {
//				System.out.println(j+ " tab window:" + x);
//				j++;
//			}
//		}
		
		for(String x: allwin) {
			Driver.switchTo().window(x);
			Thread.sleep(5000);
			String title = Driver.getTitle();
			if(title.equals("Apple iPhone 15 (Black, 128 GB)")) {
				break;
			}
		}
		
		WebElement style = Driver.findElement(By.xpath("//div[contains(@style,'background-color: rgba(0, 0, 0, 0.06)')]"));
		style.click();
	
	}
}

