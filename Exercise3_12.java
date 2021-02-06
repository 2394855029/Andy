package Exercise;

import java.util.Scanner;

public class Exercise3_12 {

	public static void main(String[] args) {
		int number,numberCopy;
		int reversedNum;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter an integer(such as:121):");
		number = input.nextInt();
		numberCopy = number;
		reversedNum = 0;
		while(numberCopy > 0)
		{
			reversedNum = reversedNum*10 + (numberCopy%10);
			numberCopy = numberCopy/10;
		}
		
		if(number == reversedNum)
			System.out.println("The input number "+number+" is a palindrome.");
		else
			System.out.println("The input number "+number+" is not a palindrome.");
			

	}

}
