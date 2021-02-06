package Exercise;

import java.util.Scanner;

public class Exercise6_3 {

	public static void main(String[] args) {
		int number;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter an integer:");
		number = input.nextInt();
		
		if(isPalindrome(number) == true)
			System.out.println("The number is Palindrome");
		else
			System.out.println("The number is not Palindrome");

	}
	
	public static int reverse(int number)
	{
		int result=0;
		
		while(number > 0)
		{
			result = result*10 + number%10;
			number = number/10;
		}
		
		return result;
		
	}
	
	public static boolean isPalindrome(int number)
	{
		return number == reverse(number);
	}

}
