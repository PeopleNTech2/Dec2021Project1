package objectconstructor;

public class Car {
	
	int doors;
	int seats;
	
	public Car(int myDoors, int mySeats, String transmission) {
		this.doors = myDoors;
		this.seats = mySeats;
		System.out.println("number of doors is: "+myDoors+" number of seats is: "+mySeats);
		System.out.println("transmission: "+transmission);
	}
	public Car(int myDoors, int mySeats) {
		this.doors = myDoors;
		this.seats = mySeats;
		System.out.println("number of doors is: "+myDoors+" number of seats is: "+mySeats);
	}
	public Car() {
		
	}
	
	public void color(String color) {
		System.out.println("the is "+color);//soft code
	}
	
	public void color2() {
		System.out.println("the is blue");//hard code
	}
	
	public String make(String make) {
		return make;
	}
	
	

}
