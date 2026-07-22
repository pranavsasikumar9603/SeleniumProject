package com.webdriver;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multipledropdown {

	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		
		WebDriver Driver = new ChromeDriver();
			
		Driver.get(" https://demoqa.com/select-menu");
		Driver.manage().window().maximize();
		
		
		WebElement multipledrowndown = Driver.findElement(By.xpath("//select[@id='cars']"));
		Select s = new Select(multipledrowndown);
		
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		
		s.selectByVisibleText("Volvo");
		
		Thread.sleep(5000);
		s.selectByVisibleText("Audi");
		s.selectByVisibleText("Opel");
		
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		String text = firstSelectedOption.getText();
		System.out.println(text);
		
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for(int i=0; i<allSelectedOptions.size(); i++ ) {
			WebElement selected = allSelectedOptions.get(i);
			String text2 = selected.getText();
			System.out.println(text2);
			
		}
		s.deselectAll();
		
		TakesScreenshot TS = (TakesScreenshot)Driver;
		File source = TS.getScreenshotAs(OutputType.FILE);
		File target = new File("C:\\Users\\welcome\\eclipse-workspace\\SeleniumProject\\target\\MultipleDrowdown.png");
		FileUtils.copyFile(source, target);
		
		
		
		
	
		

		
	}
}
