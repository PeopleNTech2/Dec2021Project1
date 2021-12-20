package oops.abstraction;

public class BMW implements Car, Motor{

	public void start() {
		System.out.println("let's drive a BMW");
	}

	public void stop() {
		System.out.println("Stop");
	}
	
	public void carShape() {
		System.out.println("rectangle shape");
	}

	public void engine() {
		System.out.println("v10");
	}

	public void fuelType() {
		System.out.println("electric");
	}

}
