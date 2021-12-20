package oops.polymorphism;

public class Test {
	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		
		cal.add(25, 56);
		cal.add(62, 68, 84);
		
		cal.sub(85, 95);
		cal.sub(98, 96, 25);
		
		ModernCalculator mc = new ModernCalculator();
		mc.add(5, 5);
		mc.add(5, 5, 5);
		
	}
}
