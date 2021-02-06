package Exercise;

import java.util.Scanner;

public class Exercise7_3 {

	public static void main(String[] args) {
		int [] number = new int [100];
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the integers between 1 and 100:");
		
		for(int i = 0; i < number.length; i++)
		{
			int a = input.nextInt();
			if(a == 0)
			{
				break;
			}
			else 
			{
				number[a]++;
			}
		}
		
		for(int i = 0; i < number.length ; i++)
		{
			if(number[i] != 0 )
			{
				if(number[i] > 1)
					System.out.println(i + " occurs "+ number[i] +" times");
				else
					System.out.println(i + " occurs "+ number[i] +" time");
				
			}
		}
	}
		
}

