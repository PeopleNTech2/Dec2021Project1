package conditions;

public class IfStatment {

	public static void main(String[] args) {
		
		int a = 2;
		
		//conditional symbols are: ==, !=, <, >, =<, =>, /, +, -, *, &, &&, |, ||, % 
		if (a > 0) {
			System.out.println("this number is positive");
		} else if (a < 0){
			System.out.println("this number is negative");
		} else {
			System.out.println("this number is 0");
		}
		

		//nested if statement 
		if (a > 0) 
		{
			if(a > 10) 
			{
				System.out.println("this number is greater then 10");
			}
			else {
				System.out.println("this number is less then 10");
			}
		}
		else {
			System.out.println("this number is less then 0");
		}
		
		//if 
		//if else
		//if else if... else
		//if else if else if else if else 
	}

}
