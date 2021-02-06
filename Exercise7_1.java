package Exercise;

import java.util.Scanner;

public class Exercise7_1 {

	public static void main(String[] args) {
		int studentNumber;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of students:");
		studentNumber = input.nextInt();
		System.out.print("Enter " + studentNumber + " scores:");
		
		double [] scores = new double [studentNumber];
		for(int i = 0 ; i < scores.length; i++)
		{
			scores[i] = input.nextDouble();
		}
		
		double max = scores[0];
		for(int i = 1; i < scores.length; i++)
		{
			if(scores[i] > max)
			{
				max = scores[i];
			}
		}
		String [] level = new String [scores.length];
		for(int i1 = 0; i1 < scores.length ; i1++)
		{
			if(scores[i1] >= max - 10)
				level[i1] = "A";
			else if(scores[i1] >= max - 20)
				level[i1] = "B";
			else if(scores[i1] >= max - 30)
				level[i1] = "C";
			else if(scores[i1] >= max - 40)
				level[i1] = "D";
			else
				level[i1] = "F";
		}
		for(int i1 = 0; i1 < scores.length; i1++)
		{
			System.out.println("Student "+ i1 + " score is "+ scores[i1] + " and grade is "+ level[i1]);
		}
		
	}
	
	
}

