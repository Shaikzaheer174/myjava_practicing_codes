package basics;

import java.util.Scanner;

public class reading_input_from_keyboard {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		/*int FirstNumber;
		int SecondNumber;
		int Result;

		System.out.println("enter first number");
		FirstNumber = read.nextInt();
		
		System.out.println("enter second number");
		SecondNumber = read.nextInt();
		
		Result = FirstNumber + SecondNumber;
		
		System.out.println("the result is " + Result);
		*/
		
		
//		useRadix to get the particular number  of binary number
		read.useRadix(2); // 2 means binary number
		int x = read.nextInt();
		System.out.println(x);
		
		
	}

}