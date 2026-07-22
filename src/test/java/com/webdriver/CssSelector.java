package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;

public class CssSelector extends Newbaseutill{
	
	
	public static void main(String[] args) {
		
		CssSelector c = new CssSelector();
		
		c.Launch("https://www.facebook.com/");
		
		Driver.findElement(By.cssSelector("input[name='email']")).sendKeys("Pranav");
		
		Driver.findElement(By.cssSelector("input#_R_1hmkqsqppb6amH1_")).sendKeys("1234567");

		Driver.findElement(By.cssSelector("span.x1lliihq.x193iq5w.x6ikm8r.x10wlt62.xlyipyv.xuxw1ft")).click();
		
		
		
	}

}
