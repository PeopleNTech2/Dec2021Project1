package oops.polymorphism;

public class Calculator {
	
	//2 types of polymorphism
	//overload
	//override 
	
	
	
	//overload: when 2 methods have the same but different number of parameters
	public void add(int a, int b) {
		int total = a+b;
		System.out.println(total);
	}
	
	public void add(int a, int b, int c) {
		int total = a+b+c;
		System.out.println(total);
	}
	
	public void sub(int a, int b) {
		int total = a-b;
		System.out.println(total);
	}
	
	public void sub(int a, int b, int c) {
		int total = a-b-c;
		System.out.println(total);
	}

}
