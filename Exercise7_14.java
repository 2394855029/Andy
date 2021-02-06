package Exercise;

import java.util.Scanner;

public class Exercise7_14 {

	public static void main(String[] args) {
		int [] number = new int [5];
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 5 integers:");
		
		for(int i = 0 ; i < number.length ; i++)
		{
			number[i] = input.nextInt();
		}
		
		System.out.print(gcd(number));
		
	}
	
	public static int gcd(int...numbers)
	{
		int greatCommonDivisor = 1;
		int count = 0;
		int min = min(numbers);
		
		while(min >= 1)
		{
			for(int i = 0 ; i < numbers.length ; i++)
			{
				if(numbers[i] % min == 0)
				{
					count++;
				}
			}
			
			if(count == numbers.length)
			{
				greatCommonDivisor = min(numbers);
			}
			
			min--;
			
		}
		
		return greatCommonDivisor;
	}
	
	public static int min(int [] numbers)
	{
		int min = numbers[0];
		for(int i = 1 ; i < numbers.length ; i++)
		{
			if(numbers[i] < min)
			{
				min = numbers[i];
			} 
		}
		
		return min;
	}
}

