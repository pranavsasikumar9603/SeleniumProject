package com.webdriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLink {
	
	
	public static void ValidLinkorNot() {
		
		WebDriverManager.chromedriver().setup();
		 
		WebDriver Driver = new ChromeDriver();
			
		Driver.get("https://www.flipkart.com/");
		
		Driver.manage().window().maximize();
		
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		List<WebElement> Links = Driver.findElements(By.tagName("a"));
		Iterator<WebElement> iterator = Links.iterator();
		
	while(iterator.hasNext()) {
		WebElement Link = iterator.next();
		@Nullable
		String Href = Link.getDomProperty("href");
		if(Href == null || Href.isEmpty()) {
			System.out.println("Given String is empty or null");
		}
		else
		{ try {
			HttpURLConnection http = (HttpURLConnection) (new URL(Href).openConnection());
			http.setRequestMethod("HEAD");
			http.connect();
			int responseCode = http.getResponseCode();
			
			if(responseCode >=200 || responseCode <=300) {
				System.out.println("Not a Broken Link"+Href);
			}
			else if(responseCode >=300 || responseCode <=400) {
				System.out.println("Redirected"+Href);
			}
			else if(responseCode >=400 || responseCode <=500) {
				System.out.println("Clientside error"+Href);
			}
			else if(responseCode >=500 || responseCode <=600) {
				System.out.println("Serverside error"+Href);
			}
		}
		
		catch(MalformedURLException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		}
	}
	}
	
	public static void main(String[] args) {
		
		ValidLinkorNot();
	
	
	}
	

}
