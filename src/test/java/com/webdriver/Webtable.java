package com.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Webtable extends Newbaseutill {

	
public static void main(String[] args) {
	
	Webtable w = new Webtable();
	w.Launch("https://practicetestautomation.com/practice-test-table/");
	
	List<WebElement> headers = Driver.findElements(By.xpath("//table/thead/tr/th"));
	
	List<WebElement> rows = Driver.findElements(By.xpath("//table/tbody/tr"));

	
	System.out.println("Headers Size:"+headers.size());
	System.out.println("rows Size:"+rows.size());

	
	for(WebElement x:headers) {
		System.out.println(x.getText());
	}
	
//	for(WebElement y:rows) {
//		System.out.println(y.getText());
//	}
//	
	for(int i=1;i<=rows.size();i++) {
		
		List<WebElement> cells = Driver.findElements(By.xpath("//table/tbody/tr["+i+"]/td"));
		
		for(WebElement cell:cells) {
			
			System.out.print(cell.getText()+"|");
		}
		System.out.println();
	}
	
	
	for(int i=1;i<=rows.size();i++) {
		
		for(int j=1;j<=headers.size();j++) {
			WebElement data = Driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td["+j+"]"));
			
			String input = "Selenium with Java";
			
			String expectedoutput = "64284";
			
			if(data.getText().equals(input)) {
				WebElement enrollment = Driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]"));
				String Actualoutpot = enrollment.getText();
				
				if(Actualoutpot.equals(expectedoutput)) {
					System.out.println("Validation passed:"+Actualoutpot);
				}
			
				
			}
			
		}
	}
}
}
