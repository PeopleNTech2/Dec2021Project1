package oops.polymorphism;

public class ModernCalculator extends Calculator{
	
	//override: is when 2 methods have the dame name, same number of paramaters and different body
	
	@Override//annotation or method decoration 
	public void add(int a, int b) {
		int total = (a+b)*2;
		System.out.println(total);
	}
	
	
	//accessModifier methodType methodName (arguments){ body }

}
