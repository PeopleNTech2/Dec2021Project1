package loops;

public class ForEachLoop {

	public static void main(String[] args) {
		
		int[] list = {3, 4, 0, 1, 6};
		
//		for(int i =0; i<list.length; i++) {
//			System.out.println(list[i]);
//		}
		
		for(int a : list) {
			System.out.println(a);
		}

	}

}
