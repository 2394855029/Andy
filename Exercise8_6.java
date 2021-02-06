package Exercise;

import java.util.Scanner;

public class Exercise8_6 {

	public static void main(String[] args) {
		double [][] array1 = new double [3][3];
		double [][] array2 = new double [3][3];
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter matrix1: ");
		for(int row = 0; row < array1.length; row++)
		{
			for(int column = 0; column < array1[row].length; column++)
			{
				array1[row][column] = input.nextDouble();
			}
		}
		
		System.out.print("Enter matrix2: ");
		for(int row = 0; row < array2.length; row++)
		{
			for(int column = 0; column < array2[row].length; column++)
			{
				array2[row][column] = input.nextDouble();
			}
		}
		
		double [][] array = multiplyMatrix(array1,array2);
		System.out.println("The multiplication of the matrices is ");
		
		for(int row = 0; row < array1.length; row++)
		{
			for(int column = 0; column < array1[row].length; column++)
			{
				System.out.printf("%2.0f",array1[row][column]);
				if(column == 2)
				{
					if(row == 1)
					{
						System.out.print("  *  ");
					}
					else 
					{
						System.out.print("     ");
					}
				}
					
			}
			for(int column = 0; column < array2[row].length; column++)
			{
				System.out.printf("%4.1f",array2[row][column]);
				if(column == 2)
				{
					if(row == 1)
					{
						System.out.print("  =  ");
					}
					else 
					{
						System.out.print("     ");
					}
				}
			}
			
			for(int column = 0; column < array.length; column++)
			{
				System.out.printf("%6.1f", array[row][column]);
			}
			
			System.out.println();
		}
	}
	
	public static double[][] multiplyMatrix(double[][] a,double[][] b)
	{
		double [][] array = new double [a.length][a.length];
		
		for(int row = 0; row < array.length; row++)
		{
			for(int column = 0; column < array[row].length; column++)
			{
				for(int i = 0; i < array.length; i++)
				{
					array[row][column] += a[row][i] * b[i][column];
				}
			}
		}
		
		return array;
	}

}
