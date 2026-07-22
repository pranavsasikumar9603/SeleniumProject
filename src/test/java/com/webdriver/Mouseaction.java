package com.webdriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Mouseaction extends Newbaseutill {
	
	public static void main(String[] args) throws AWTException,InterruptedException	{	
		
		
		Mouseaction m = new Mouseaction();
		
//		m.Launch("https://the-internet.herokuapp.com/drag_and_drop");
//		
//		Thread.sleep(3000);
//		
//		Actions A = new Actions (Driver);
//		
//		WebElement Drag = Driver.findElement(By.id("column-a"));
//		
//		WebElement Drop = Driver.findElement(By.id("column-b"));
//		
//		A.dragAndDrop(Drag, Drop).perform();
		
		
		
		
		
		
		
//		m.Launch("https://www.flipkart.com/");
//		
//		Thread.sleep(5000);
//			
//			try{
//				Driver.findElement(By.xpath("//span[text()='✕']")).click();
//				
//			}
//			
//			catch(Exception e){
//				e.printStackTrace();
//				
//			}
//			finally {
//				System.out.println("Handled");
//			}
//			
//			WebElement Login = Driver.findElement(By.xpath("//a[@title='Login']"));
//			
//			Actions action = new Actions (Driver);
//			
//			action.moveToElement(Login).perform();
		
		m.Launch("https://www.facebook.com/");
		
		WebElement username = Driver.findElement(By.name("email"));
		
		username.sendKeys("Pranav");
		
		Thread.sleep(3000);
		
		Actions mouseaction = new Actions (Driver);
		
		mouseaction.doubleClick(username).contextClick().build().perform();
		
		Thread.sleep(3000);

		
		Robot r = new Robot();
		
		for(int i = 1; i<=4; i++) {
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		}
		
		Thread.sleep(3000);

		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(3000);

		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		Thread.sleep(3000);

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		Thread.sleep(3000);

		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		Thread.sleep(3000);

		Driver.findElement(By.xpath("//div[@aria-label='Show password']")).click();
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
			
			

			
			
		
		

		
		
		
		
	}

}
