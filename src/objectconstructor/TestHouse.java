package objectconstructor;

public class TestHouse {

	public static void main(String[] args) {
		//the constructor is setting the rules of how to create your object
		//create object 
		House house1 = new House(25, 35);
		house1.kitchen("sharp");
		house1.livingroom();
		house1.bedroom();
		house1.bathroom();
		House house2 = new House();
		house2.kitchen("sharp");
		house2.livingroom();
		house2.bedroom();
		house2.bathroom();
		House house3 = new House();
		house3.kitchen("sharp");
		house3.livingroom();
		house3.bedroom();
		house3.bathroom();

	}

}
