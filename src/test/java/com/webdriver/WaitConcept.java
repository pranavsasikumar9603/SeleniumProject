package com.webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitConcept {
	
	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
			
		driver.get("https://demoqa.com/dynamic-properties");
		driver.manage().window().maximize();
		
		String expectedoutput = "Visible After 5 Seconds";
		
//		Thread.sleep(5000);   // Static wait
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));    // implicitly wait, Stops the whole driver wait time
		
//		WebElement Visible_button = driver.findElement(By.id("visibleAfter")); 
		
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//		
//		WebElement Visible_button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("visibleAfter")));//Explicitly wait
		
		FluentWait<WebDriver> f = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(4));
		
		WebElement Visible_button = f.until(ExpectedConditions.visibilityOfElementLocated(By.id("visibleAfter")));
		String autual_output = Visible_button.getText();
		
		if(autual_output.equals(expectedoutput)) {
			
			System.out.println("Validation passed"+autual_output);
		}
		
		else {
			System.out.println("Validation Failed");

		}
		
		driver.quit();
		
	}
	
	

}
