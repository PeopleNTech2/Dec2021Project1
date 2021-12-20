package statickeyword;

public class TestHuman {

	public static void main(String[] args) {
//
		Human john = new Human();
//		
//		john.smile();
//		john.talk();
//		
//		System.out.println(john.height);
		
		System.out.println(Human.height);
		Human.smile();
		
		Human.measurements();
		
		john.measurements1();

	}

}
