package com.webdriver;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class JavascriptexecutorConcept extends BaseUtills{
	
	public static void main(String[] args) throws InterruptedException {
		
		JavascriptexecutorConcept j = new JavascriptexecutorConcept();
		
		j.Launch("https://www.flipkart.com/");
		
		Thread.sleep(3000);
		
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
//		searchbutton.sendKeys("Iphone");
		
		JavascriptExecutor js = (JavascriptExecutor)Driver;
		
		js.executeScript("arguments[0].setAttribute('value','Iphone');",searchbutton);
		
		Object inputvalue = js.executeScript("return arguments[0].getAttribute('value');",searchbutton);

		System.out.println(inputvalue);
		
		WebElement stories = Driver.findElement(By.xpath("//a[text()='Flipkart Stories']"));
		
		Thread.sleep(3000);
		
		js.executeScript("arguments[0].scrollIntoView(true);", stories);
		
		Thread.sleep(3000);
		
		WebElement mobile = Driver.findElement(By.xpath("//div[text()='Mobiles']"));
		
		Thread.sleep(3000);

		js.executeScript("arguments[0].scrollIntoView(false);", mobile);
		
		js.executeScript("arguments[0].click();", mobile);
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
