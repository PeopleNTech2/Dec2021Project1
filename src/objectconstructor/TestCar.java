package objectconstructor;

public class TestCar {

	public static void main(String[] args) {
		
		Car car1 = new Car(4, 5);
		System.out.println(car1.make("Toyota"));
		car1.color("black");
		System.out.println("----------------------------------------------");
		Car car2 = new Car();
		System.out.println(car2.make("Honda"));
		car2.color("blue");
		System.out.println("----------------------------------------------");
		Car car3 = new Car(4, 7, "auto");
		System.out.println(car3.make("Kia"));
		car3.color("white");
		
		

	}

}
