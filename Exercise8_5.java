package Exercise;

import java.util.Scanner;

public class Exercise8_5 {

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
		
		double [][] array = addMatrix(array1,array2);
		System.out.println("The matrices are added as follows ");
		
		for(int row = 0; row < array1.length; row++)
		{
			for(int column = 0; column < array1[row].length; column++)
			{
				System.out.printf("%4.1f",array1[row][column]);
				if(column == 2)
				{
					if(row == 1)
					{
						System.out.print("  +  ");
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
	
	public static double[][] addMatrix(double[][] a,double[][] b)
	{
		double [][] array = new double[a.length][a.length];
		
		for(int row = 0; row < array.length; row++)
		{
			for(int column = 0; column < array.length; column++)
			{
				array[row][column] = (a[row][column] + b[row][column]);
			}
		}
		
		return array;
	}

}
