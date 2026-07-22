package com.webdriver;

public class SimpletonClass {
	
	public static SimpletonClass sc = null;
	
	private SimpletonClass() {};
	
	public static SimpletonClass getobject() {
		if(sc==null) sc = new SimpletonClass();
		return sc;
	}
	
	public void fire() {
		
		System.out.println("Charizad");
		
	}
	
	public void water() {
		
		System.out.println("Blastoise");
		
	}
	
	public void grass() {
		
		System.out.println("Venusaur");
		
	}
	
	public static void main(String[] args) {
		SimpletonClass sc = new SimpletonClass();
		SimpletonClass sc1 = new SimpletonClass();
		SimpletonClass sc2= new SimpletonClass();
		SimpletonClass sc3 = new SimpletonClass();
		
		System.out.println("Created Multiple Oject reference and checking memeory allocation");
		
		System.out.println(System.identityHashCode(sc));
		System.out.println(System.identityHashCode(sc1));
		System.out.println(System.identityHashCode(sc2));
		System.out.println(System.identityHashCode(sc3));
		
		SimpletonClass s = getobject();
		SimpletonClass s1 = getobject();
		SimpletonClass s2 = getobject();
		SimpletonClass s3 = getobject();

		System.out.println("Assigning same method to different reference variable without creating objet and checking memeory allocation");
		
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		
		
		


		
		
		
	
		
	}

}
