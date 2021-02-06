package Exercise;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		int number;
		
		int factorSum = 0;
		
		
		Scanner input = new Scanner(System.in);
		number = input.nextInt();
		int [] factor = new int [number];
		
		System.out.print(number + "'s factor series:");
		
		for(int i = 0 ; i < factor.length; i++)
		{
			int j = 2;
			while(j <= number)
			{
				if(number % j == 0)
				{
					factor[i] = j;
					System.out.print(factor[i] + ", ");
					number = number / j;
					factorSum += j;
				}
				
				else 
					j++;
			}
		}
		
		System.out.println("\nthe sum of factors is " + factorSum);
	}

}
