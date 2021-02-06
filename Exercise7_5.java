package Exercise;

import java.util.Scanner;

public class Exercise7_5 {

	public static void main(String[] args) {
		double [] number = new double [10];
		boolean isAppeared;
		double currentNum;
		int count = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 10 numbers:");
		
		for(int i = 0; i < number.length ; i++)
		{
			currentNum = input.nextDouble();
			
			isAppeared = false;
			for(int j = 0; j < count; j++)
			{
				if(currentNum == number[j])
				{
					isAppeared = true;
					break;
				}
			}
			
			if(!isAppeared)
			{
				number[count] = currentNum;
				count++;
			}
		}
		
		System.out.println("The number of distinct numbers is "+count);
		
		
		System.out.print("The distinct numbers are:");
		for(int i = 0 ; i < number.length ; i++)
		{
			if(number[i] != 0)
				System.out.print((int)number[i]+" ");
		}

		
		
	}
}
