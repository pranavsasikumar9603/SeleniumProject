package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Xpath extends BaseUtills{
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		Xpath x = new Xpath();
		x.Launch("https://www.flipkart.com/");
		
		Thread.sleep(5000);
		
		
		try{
			Driver.findElement(By.xpath("//span[text()='✕']")).click();
			
		}
		
		catch(Exception e){
			e.printStackTrace();
			
		}
		finally {
			System.out.println("Handled");
		}
		
		WebElement basic = Driver.findElement(By.xpath("//div[@dir='auto']"));
		
		System.out.println(basic.getText());
		
		WebElement contains = Driver.findElement(By.xpath("//div[contains(@dir,'au')]"));
		
		System.out.println(contains.getText());
		
		WebElement startsWith = Driver.findElement(By.xpath("//div[starts-with(@dir,'au')]"));
		
		System.out.println(startsWith.getText());
		

		WebElement text = Driver.findElement(By.xpath("//div[text()='Mobiles']"));
		
		System.out.println(text.getText());
		
		WebElement containstext = Driver.findElement(By.xpath("//div[contains(text(),'Mobi')]"));
		
		System.out.println(containstext.getText());
		
		WebElement multipleAttributes = Driver.findElement(By.xpath("//input[@type='text'and@name='q']"));
		
		System.out.println(multipleAttributes.getText());
		
		WebElement parenttoChild = Driver.findElement(By.xpath("//div[@class='H5bs2Y']/div"));
		
		System.out.println(parenttoChild.getText());
		
		WebElement childtoParent = Driver.findElement(By.xpath("//div[@class='CXZSEo']/parent::div"));
		
		System.out.println(childtoParent.getText());
		
		WebElement following = Driver.findElement(By.xpath("//div[@class='CXZSEo']/following::div"));
		
		System.out.println(following.getText());
		
		WebElement followingSibling = Driver.findElement(By.xpath("//img[@alt='Cart']/following-sibling::span"));
		
		System.out.println(followingSibling.getText());
		
		WebElement indexing = Driver.findElement(By.xpath("(//input[@name='q'])[2]"));
		
		System.out.println(indexing.getText());
		
		WebElement wildcardmatch = Driver.findElement(By.xpath("//*[@name='q']"));
		
		System.out.println(wildcardmatch.getText());
		
		WebElement normalizeSpace = Driver.findElement(By.xpath("//p[normalize-space(text())='Clove Embassy Tech Village,']"));
		
		System.out.println(normalizeSpace.getText());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
