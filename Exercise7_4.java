package Exercise;

import java.util.Scanner;

public class Exercise7_4 {

	public static void main(String[] args) {
		double [] scores = new double [101];
		
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i < scores.length ; i++)
		{
			int a;
			a = input.nextInt();
			
			if(a >= 0)
			{
				scores[a]++;
			}
			else
			{
				break;
			}
		}
		
		int total = 0;
		int totalNum = 0;
		for(int i = 0; i < scores.length ; i++)
		{
			if(scores[i] != 0)
			{
				total += i * scores[i];
				totalNum += scores[i];
			}
		}
		
		double average = (double)total /(double) totalNum;
		
		
		int countHighEqual = 0;
		int countLess = 0;
		for(int i = 0 ; i < scores.length ; i++)
		{
			if(scores[i] != 0)
			{
				if(i >= average)
				{
					countHighEqual += scores[i];
				}
				else
				{
					countLess += scores[i];
				}
			}
		}
		
		System.out.println("There are "+countHighEqual+" numbers greater than or equal to the average score");
		System.out.println("There are "+countLess+" numbers less than the average score");
	}

}
