package Exercise;

import java.util.Scanner;

public class Exercise5_41 {

	public static void main(String[] args) {
		int max = 0;
		int count = 1;
		int numbers;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter numbers:");
		numbers = input.nextInt();
		
		while(true)
		{
			if(numbers > max)
			{
				max = numbers;
				count = 1;
			}
			
			else if(numbers == max)
			{
				count++;
			}
			else;
			if(numbers == 0)
			{
				break;
			}
				
			numbers = input.nextInt();
		}
		System.out.println("The largest number is "+ max);
		System.out.println("The occurrence count of the largest number is "+count);
	}

}
