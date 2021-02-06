package Exercise;

import java.util.Scanner;

public class Exercise5_9 {

	public static void main(String[] args) {
		int studentNumbers;
		String studentName,maxName,secondName;
		double score,firstScore,secondScore;
		int i = 0;
		maxName = "None";
		secondName = "None";
		
		firstScore = 0;
		secondScore = -1;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the number of students:");
		studentNumbers = input.nextInt();
		
		while(i < studentNumbers)
		{
			System.out.print("Please enter the student's name:");
			studentName = input.next();
			
			System.out.print("Please enter the scores of students :");
			score = input.nextDouble();
			
			if(score > firstScore)
			{
				secondScore = firstScore;
				firstScore = score;
				
				secondName = maxName;
				maxName = studentName;
				
			}
			else if(score > secondScore)
			{
				secondScore = score;
				secondName = studentName;
			}
			else;
			
			i++;
		}
		System.out.println("The first name is "+maxName);
		System.out.println("The second name is "+secondName);
	}

}
