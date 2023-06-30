package javaprogram;

public class Child extends Inheritance{
	
	
	public void c1() {
		
		System.out.println("I am child method c1");
		
	}
	public static void main(String[] args) {
		
		Child ch = new Child();
		ch.m1();
		ch.m2();
		ch.c1();
	}
}


