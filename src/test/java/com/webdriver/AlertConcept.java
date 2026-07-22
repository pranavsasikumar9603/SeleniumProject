package com.webdriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertConcept extends Newbaseutill{
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		AlertConcept a = new AlertConcept();
		
		a.Launch("https://demoqa.com/alerts");
		
		WebElement Simplealert = Driver.findElement(By.id("alertButton"));
		
		Simplealert.click();
		
		Thread.sleep(3000);
		
	  Alert alert = Driver.switchTo().alert();
		
	  alert.accept();
		
		
		
//		WebElement Confirmalert = Driver.findElement(By.id("confirmButton"));
//		
//		Confirmalert.click();
//		
//		Thread.sleep(3000);
//		
//	  Alert alert = Driver.switchTo().alert();
//		
//	  alert.dismiss();
	  
	  
//	  
//	  WebElement Promptalert = Driver.findElement(By.id("promtButton"));
//		
//	  Promptalert.click();
//		
//		Thread.sleep(3000);
//		
//	  Alert alert = Driver.switchTo().alert();
//	  
//	  alert.sendKeys("Pranav");
//	  
//	  String text = alert.getText();
//	  
//	  System.out.println("Prompt aleart:"+text);
//	  
//	  alert.accept();
	  
		
		
		
		
		
	}

}
