package oops.abstraction;

public class Test {

	public static void main(String[] args) {
		
		Toyota camry = new Toyota();
		
		camry.autoLock();
		camry.carShape();
		camry.engine();
		camry.fuelType();
		camry.start();
		camry.stop();
		camry.hydraulicBrake();
		
		BMW d220 = new BMW();
		d220.carShape();
		d220.engine();
		d220.fuelType();
		d220.start();
		d220.stop();
		
		Car preius = new Toyota();
		//preius.autoLock();
		preius.carShape();
		//preius.engine();
		//preius.fuelType();
		preius.start();
		preius.stop();
		//preius.hydraulicBrake();
		
		Motor rav4 = new Toyota();
		//rav4.autoLock();
		//rav4.carShape();
		rav4.engine();
		rav4.fuelType();
		//rav4.start();
		//rav4.stop();
		//rav4.hydraulicBrake();
		

	}

}
