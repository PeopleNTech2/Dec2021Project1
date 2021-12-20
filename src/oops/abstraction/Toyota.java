package oops.abstraction;

public class Toyota extends ModernCar implements Car, Motor {

	public void start() {
		System.out.println("let's drive a toyota");
	}

	public void stop() {
		System.out.println("stop danger");
	}

	public void carShape() {
		System.out.println("square shape");
	}

	public void hydraulicBrake() {
		System.out.println("Hydraulic brake car");
	}

	public void engine() {
		System.out.println("v8 engine");
	}

	public void fuelType() {
		System.out.println("gas");
	}

}
