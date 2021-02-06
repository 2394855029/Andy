package Exercise;

import java.util.Scanner;

public class Exercise8_15 {

	public static void main(String[] args) {
		double [][] points = new double [5][2];
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter five points: ");
		for(int row = 0; row < points.length; row++)
		{
			for(int column = 0; column < points[row].length; column++)
			{
				points[row][column] = input.nextDouble();
			}
		}
		
		if(sameLine(points))
		{
			System.out.println("The five points are on the same line");
		}
		else
		{
			System.out.println("The five points are not on the same line");
		}
	}
	
	public static boolean sameLine(double[][] points)
	{
		int count = 0;
		double k =(points[1][1] - points[0][1]) /(points[1][0] - points[0][0]);
		
		for(int j = 1; j < points.length; j++)
		{
			if(Math.abs(k - (points[j][1] - points[0][1]) /(points[j][0] - points[0][0])) < 0.001)
			{
				count++;
			}
		}
		
		if(count == points.length - 1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
