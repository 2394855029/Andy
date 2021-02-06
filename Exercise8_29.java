package Exercise;

import java.util.Scanner;

public class Exercise8_29 {

	public static void main(String[] args) {
		int [][] array0 = new int [3][3];
		int [][] array1 = new int [3][3];
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter list1: ");
		for(int row = 0; row < array0.length; row++)
		{
			for(int column = 0; column < array0[0].length; column++)
			{
				array0[row][column] = input.nextInt();
			}
		}
		
		System.out.print("Enter list2: ");
		for(int row = 0; row < array1.length; row++)
		{
			for(int column = 0; column < array1[0].length; column++)
			{
				array1[row][column] = input.nextInt();
			}
		}
		
		if(equals(array0, array1))
		{
			System.out.println("The two arrays are identical");
		}
		else
		{
			System.out.println("The two arrays are not identical");
		}
	}
	
	public static boolean equals(int [][] m1, int [][] m2)
	{
		int i = 0;
		int j = 0;
		int count = 0;
		int [] array0 = new int [9];
		int [] array1 = new int [9];
		
		for(int row = 0; row < m1.length; row++)
		{
			for(int column = 0; i < array0.length && column < m1[0].length; column++,i++)
			{
				array0[i] = m1[row][column];
			}
		}
		
		for(int row = 0; row < m2.length; row++)
		{
			for(int column = 0; j < array1.length && column < m2[0].length; column++,j++)
			{
				array1[j] = m2[row][column];
			}
		}
		
		java.util.Arrays.sort(array0);
		java.util.Arrays.sort(array1);
		 
		for(int a = 0; a < array0.length; a++)
		{
			if(array0[a] == array1[a])
			{
				count++;
			}
		}
		
		if(count == array0.length)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}

}
