package statickeyword;

public class TestGarageSize {

	public static void main(String[] args) {
		
		GarageSize myGarage = new GarageSize();
		
		myGarage.setSize(12);
		
		System.out.println("my garage size is: "+myGarage.getSize());
		
		GarageSize neighborGarage = new GarageSize();
		
		neighborGarage.setSize(14);
		
		System.out.println("my neighbor garage size is: "+neighborGarage.getSize());
		
		System.out.println("my garage size is: "+myGarage.getSize());

	}

}
