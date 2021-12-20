package tempconverter;

import java.util.Scanner;

public class TempConverter {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----------------------welcome to temp converter----------------------------");
		System.out.println("C to F & F to C");
		
		String answer;
		int tempToConvert;
		int convertedTemp;
		
		do {
			System.out.println("choose coversion mode");
			System.out.println("1- C to F");
			System.out.println("2- F to C");
			answer = sc.next();
			
			while(!(answer.equals("1")) && !(answer.equals("2")) ) {
				System.out.println("please choose 1 or 2");
				answer = sc.next();
				if(answer == "1" || answer == "2") {
					break;
				}
				
			}
			
			if(answer.equals("1")) {
				System.out.println("temp to convert");
				tempToConvert = sc.nextInt();
				while(tempToConvert != (int)tempToConvert ) {
					System.out.println("please enter number");
					tempToConvert = sc.nextInt();
					if(tempToConvert == (int)tempToConvert) {
						break;
					}
				}
				convertedTemp = (tempToConvert*9/5)+32;
				System.out.println(convertedTemp);
			}else if (answer.equals("2")){
				System.out.println("temp to convert");
				tempToConvert = sc.nextInt();
				convertedTemp = (tempToConvert-32)*5/9;
				System.out.println(convertedTemp);
			}
			
			System.out.println("do you want to convert another temp?");
			
			System.out.println("1- yes");
			System.out.println("2- no");
			
			answer = sc.nextLine();
			
			while(!(answer.equals("1")) && !(answer.equals("2")) ) {
				System.out.println("please choose 1 or 2");
				answer = sc.next();
				if(answer == "1" || answer == "2") {
					break;
				}
				
			}
			
		}while(answer.equals("1"));
		
		System.out.println("good bye, see you soon");
	}

}
