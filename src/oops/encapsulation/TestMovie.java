package oops.encapsulation;

public class TestMovie {

	public static void main(String[] args) {
		
		Movie titanic = new Movie();
		titanic.setDuration(2);
		
		System.out.println(titanic.getDuration());
		
		titanic.setRating("DCSDLKCMKSD");
		System.out.println(titanic.getRating());

	}

}
