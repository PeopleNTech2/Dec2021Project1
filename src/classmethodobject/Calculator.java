package classmethodobject;

public class Calculator {
	
	//class: class is a blueprint - class name always starts with capital letter 
	
	int a;
	int b;
	int c = 4;
	int d = 10;
	
	//method: is a set of code referred to by name and can be used later 
	//non return method type
	public void add1() {
		int total = c+d;
		System.out.println(total);
	}
	//non return method with arguments 
	public void add3(int x, int z) {
		int total = x+z;
		System.out.println(total);
	}
	
	public void mul() {
		int total = c*d;
		//System.out.println(total);
	}
	
	public void sub() {
		int total = d-c;
		//System.out.println(total);
	}
	
	//return method type
	public int add2() {
		int total = c+d;
		return total;
	}


}
