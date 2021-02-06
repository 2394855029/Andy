package Exercise;

import java.util.Scanner;

public class Exercise7_17 {

	public static void main(String[] args) {
		int number;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the number of students:");
		number = input.nextInt();
		
		double [] scores = new double [number];
		String [] name = new String [number];
		
		for(int i = 0 ; i < scores.length ; i++)
		{
			System.out.print("Please enter the students' name:");
			name[i] = input.next();
			System.out.print("Please enter the students' scores:");
			scores[i] = input.nextDouble();
		}
		
		for(int i = 0 ; i < scores.length ; i++)
		{
			for(int j = i + 1 ; j < scores.length ; j++)
			{
				if(scores[j] > scores[i])
				{
					double temp = scores[i];
					scores[i] = scores[j];
					scores[j] = temp;
					
					String temp1 = name[i];
					name[i] = name[j];
					name[j] = temp1;
				}
			}
		}
		
		for(String a: name)
		{
			System.out.print(a+" ");
		}
		
	}

}
