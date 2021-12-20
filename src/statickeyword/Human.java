package statickeyword;

public class Human {
	
	//static keyword
	
	static int height = 63;
	int weight = 140;
	
	public static void smile() {
		System.out.println("a human can smile");
	}
	
	public void talk() {
		System.out.println("human can talk");
	}
	
	
	//a static method can use static variables only
	public static void measurements() {
		System.out.println("the height is: "+height);
		//System.out.println("the weight is: "+weight);// this is not possible 
	}
	//a non static method can use both static and non static variables 
	public void measurements1() {
		System.out.println("the height is: "+height);
		System.out.println("the weight is: "+weight);
	}
	
	

}
