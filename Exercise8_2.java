package Exercise;

import java.util.Scanner;

public class Exercise8_2 {

	public static void main(String[] args) {
		double [][] array = new double [4][4];
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 4-by-4 matrix row by row: ");
		
		for(int row = 0; row < array.length; row++)
		{
			for(int column = 0; column < array[row].length; column++)
			{
				array[row][column] = input.nextDouble();
			}
		}
		
		System.out.println("Sum of the elements in the major diagonal is "+ sumMajorDiagonal(array));
		
	}
	
	public static double sumMajorDiagonal(double [][] m)
	{
		double sum = 0;
		for(int i = 0; i < m.length; i++)
		{
			sum += m[i][i];
		}
		return sum;
	}

}
