package Exercise;

import java.util.Scanner;

public class Exercise6_22 {

	public static void main(String[] args) {
		long number;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a number:");
		number = input.nextLong();
		
		System.out.println("result is " + sqrt(number));
	}
	
	public static double sqrt(long n)
	{
		double lastGuess = 1;
		double nextGuess;
		
		while(true)
		{
			nextGuess = (lastGuess + n / lastGuess) / 2;
			if((Math.abs(nextGuess - lastGuess )< 0.0001))
			{
				break;
			}
			else
			{
				lastGuess = nextGuess;
			}
		}
		
		return nextGuess;
	}

}
