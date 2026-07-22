package com.interview;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CountryChange {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//		
//		WebElement Language = wait.until(ExpectedConditions.elementToBeClickable(By.id("icp-nav-flyout")));
//				
//		Language.click();
//				
//		
//		WebElement Espanol = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'español')]")));
//		
//		Espanol.click();
//		
//		driver.findElement(By.xpath("//input[@aria-labelledby='icp-save-button-announce']")).click();
		
		Actions actions = new Actions(driver);
		
		WebElement lang = wait.until(ExpectedConditions.elementToBeClickable(By.id("icp-nav-flyout")));
		
		actions.moveToElement(lang).perform();
		
		WebElement Espanol = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'español')]")));
		
		Espanol.click();
		
		
	
		
	}

}
