package datatype;

public class NonPrimitiveVariables {

	public static void main(String[] args) {

		//String
		String name = "John Snow";
		System.out.println(name.startsWith("Sn"));
		
		//array
		int[] list = {3, 4, 0, 1, 6};	
		
		System.out.println(list[0]);
		
		int limit = 5;
		int a;
		int[] list2 = new int[3];
		list2[0] = 5;
		list2[1] = 25;
		list2[2] = 9;
		list2[3] = 10;
		list2[4] = 10;
		
		System.out.println(list2[1]);
		int i = 0;
		while (i < list2.length) {
			System.out.println(list2[i]);
			i++;
		}

		
		
	}

}
