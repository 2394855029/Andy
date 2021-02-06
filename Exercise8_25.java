package Exercise;

import java.util.Scanner;

public class Exercise8_25 {

	public static void main(String[] args) {
		double [][] array = new double [3][3];
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 3-by-3 matrix row by row: ");
		for(int row = 0; row < array.length; row++)
		{
			for(int column = 0; column < array[row].length; column++)
			{
				array[row][column] = input.nextDouble();
			}
		}
		
		if(isMarkovMatrix(array))
		{
			System.out.println("It is a Markov matrix");
		}
		else
		{
			System.out.println("It is not a Markov matrix");
		}
	}
	
	public static boolean isMarkovMatrix(double [][] m)
	{
		for(int row = 0; row < m.length; row++)
		{
			for(int column = 0; column < m[0].length; column++)
			{
				if(m[row][column] < 0)
				{
					return false;
				}
			}
		}
		
		for(int column = 0; column < m[0].length; column++)
		{
			double sum = 0;
			for(int row = 0; row < m.length; row++)
			{
				sum += m[row][column];
			}
			if(sum != 1)
			{
				return false;
			}
		}
		
		return true;
	}

}
