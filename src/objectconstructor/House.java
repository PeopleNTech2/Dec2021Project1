package objectconstructor;

public class House {
	public int length;
	int width;
	final int b = 85;
	
	//constructor 
	//built constructor
	public House(int myLength, int myWidth) {
		this.length = myLength;
		this.width = myWidth;
		System.out.println("the lenth of the house is "+myLength);
		System.out.println("the width of the house is "+myWidth);
	}
	//default constructor
	public House() {
		
	}
	
	String tvBrand = "sunsung";//global variable
	
	public void kitchen(String microwave) {//String microwave is a local variable
		System.out.println("let's cook");
		System.out.println("my microwave is "+microwave);
	}
	
	public void livingroom(){
		System.out.println("watch tv");
		System.out.println("in my living room I have a "+tvBrand+" tv");
	}
	
	public void bedroom() {
		System.out.println("sleep zzzzzzzzzzzzzzzz");
		System.out.println("in my room I have "+tvBrand+" tv");
	}
	
	public void bathroom() {
		System.out.println("let's have a shower");
		//System.out.println("I have mirowave "+microwave); //not possible because microwave is a local variable
	}
	
	//subclass: nested class - a class in another class 
	public class B{
		
	}

}
