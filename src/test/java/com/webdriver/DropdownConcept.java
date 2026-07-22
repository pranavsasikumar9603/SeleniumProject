package com.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownConcept extends BaseUtills{
	
	public static void main(String[] args) throws InterruptedException {
		
		DropdownConcept D= new DropdownConcept();
		D.Launch(" https://www.rti.org/");
		
		WebElement options = Driver.findElement(By.xpath(" //select[@id='workfilter']"));
		
		
		
		Select s= new Select(options);
		
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		
		Thread.sleep(3000);
		
		s.selectByVisibleText("Focus Areas");
		
		Thread.sleep(3000);

		s.selectByValue("/solutions");

//		List<WebElement> options2 = s.getOptions();
//		
//		for(int i=0; i<options2.size(); i++) {
//			
//			WebElement value = options2.get(i);
//			
//			String text = value.getText();
//			
//			System.out.println(text);
//			
//			
//		}
		
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());
		
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();

		System.out.println(allSelectedOptions.size());
		
		
		
		
		for(int i= 1;i<allSelectedOptions.size();i++) {
			
			WebElement options3 = allSelectedOptions.get(i);
			
			String text2 = options3.getText();
			
			System.out.println(text2);
		}
	}
	
	

}
