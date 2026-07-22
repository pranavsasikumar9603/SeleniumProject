package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FrameConcept extends BaseUtills{
	
	public static void main(String[] args) {
		
		FrameConcept f = new FrameConcept();

//		f.Launch("https://demo.guru99.com/test/guru99home/");
//		
//		Driver.switchTo().frame(0);
//		
//		Driver.findElement(By.xpath(" //c3-icon[@class='ytmCuedOverlayPlayButtonIcon']")).click();
//		
//		Driver.switchTo().defaultContent();
//		
//		Driver.switchTo().frame(1);
//		
//		Driver.findElement(By.xpath(" //img[@src='Jmeter720.png']")).click();
		
		f.Launch("https://the-internet.herokuapp.com/nested_frames ");
		
		Driver.switchTo().frame("frame-top");
		
		Driver.switchTo().frame("frame-right");
		
		WebElement Rightframe = Driver.findElement(By.tagName("body"));
		
		String Rightframetext = Rightframe.getText();
		
		System.out.println(Rightframetext);
		
		Driver.switchTo().parentFrame();
		
		Driver.switchTo().frame("frame-left");
		
        WebElement Leftframe = Driver.findElement(By.tagName("body"));
		
		String Leftframetext = Leftframe.getText();
		
		System.out.println(Leftframetext);
		
		Driver.switchTo().defaultContent();
		
		Driver.switchTo().frame("frame-bottom");
		
		WebElement bottomframe = Driver.findElement(By.tagName("body"));
		
		String bottomframetext = bottomframe.getText();
		
		System.out.println(bottomframetext);
		
		
		
		
		
		

		
		
		
	
		
	}
	
	
	
	
	

}
