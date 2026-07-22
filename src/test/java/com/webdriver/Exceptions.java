package com.webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Exceptions {

public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
		
//	driver.get("https://demoqa.com/dynamic-properties");
	
	
	
//	WebElement Visible_button = driver.findElement(By.id("visibleAfter")); // NoSuchElementException
	
//	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(2));  // Check 0.5 interval
//	
//	WebElement Visible_button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("visibleAfter")));// TimeoutException

	
	driver.get("https://the-internet.herokuapp.com/dynamic_controls");
	
//	WebElement Hiddentext_box = driver.findElement(By.cssSelector("input[type='text']")); // ElementNotInteractableException
//	
//	Hiddentext_box.sendKeys("Pranav");
	
	
try {
	WebElement Check_box = driver.findElement(By.cssSelector("input[type='checkbox']")); // Check_box assigned with the back end code values, for example = Check_box = ABC123
	driver.navigate().refresh();
	Check_box.click();  // StaleElementReferenceException
}

catch(Exception e) {
	
e.printStackTrace();
}

	WebElement Refreshed_Check_box = driver.findElement(By.cssSelector("input[type='checkbox']")); // New back end code assigned, now Check_box = ABD231
	Refreshed_Check_box.click();
	
	
// Trying to switch a frame, that doesn't exit, Out of the frame elements, it throws NoSuchFrameException
	
	//Another element is covering the target element. Example; Popup after Login button. it throws ElementClickinterceptedException
	
	// Syntax error in Xpath , it throws InvalidSelectorException

	

}
}
