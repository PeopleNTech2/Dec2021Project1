package oops.inheritance;

public class Test {

	public static void main(String[] args) {
		
		//Father to Son: single inheritance 
		//GrandFather to Father to Son: multi level inheritance 
		//Animal class to GrandFather class and Animal class to Bird class: hierarchical inheritance 
		
		//Father class is super class to Son class
		//GrandFather class is a super class to Father class
		//java doesn't support multiple inheritance 
		
		Father jack = new Father();
		
		jack.athletic();
		jack.work();
		
		Son sean = new Son();
		
		sean.athletic();
		sean.work();
		sean.rich();
		
		GrandFather matt = new GrandFather();
		
		matt.communicate();
		matt.move();
		matt.rich();
		
		Bird sparrow = new Bird();
		sparrow.communicate();
		sparrow.move();

		Animal camel = new Animal();
		camel.communicate();
		camel.move();
		
	}
}
