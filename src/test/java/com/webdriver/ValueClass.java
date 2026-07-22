package com.webdriver;

public class ValueClass {
	
	public static void main(String[] args) {
		
		SimpletonClass sc = SimpletonClass.getobject();
		
		sc.fire();
		sc.water();
		sc.grass();
		
	}

}
