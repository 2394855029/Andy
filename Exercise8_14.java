package Exercise;

import java.util.Scanner;

public class Exercise8_14 {

	public static void main(String[] args) {
		int number;
		int count = 0;
		int count0 = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size for the matrix: ");
		number = input.nextInt();
		
		int [][] array = new int [number][number];
		for(int row = 0; row < array.length; row++)
		{
			for(int column = 0; column < array[row].length; column++)
			{
				array[row][column] = (int)(Math.random()*2);
				System.out.print(array[row][column]);
			}
			System.out.println();
		}
		
		for(int row = 0; row < array.length; row++)
		{
			int sum = 0;
			for(int column = 0; column < array[row].length; column++)
			{
				sum += array[row][column];
			}
			if(sum == 0)
			{
				System.out.println("All 0s on row "+ row);
				count++;
			}
			else if(sum == 4)
			{
				System.out.println("All 1s on row "+ row);
				count++;
			}
			else if(count == 0 && row == array.length - 1)
			{
				System.out.println("No same numbers on a row");
			}
		}
		
		for(int column = 0; column < array.length; column++)
		{
			int sum = 0;
			for(int row = 0; row < array.length; row++)
			{
				sum += array[row][column];
			}
			if(sum == 0)
			{
				System.out.println("All 0s on column "+ column);
				count0++;
			}
			else if(sum == 4)
			{
				System.out.println("All 1s on column "+ column);
				count0++;
			}
			else if(count0 == 0 && column == array.length - 1)
			{
				System.out.println("No same numbers on a column");
			}
		}
		
		int sum0 = 0;
		for(int row = 0; row < array.length; row++)
		{
			sum0 += array[row][row];
		}
		if(sum0 == 0)
		{
			System.out.println("All 0s on the major diagonal");
		}
		else if(sum0 == 4)
		{
			System.out.println("All 1s on the major diagonal");
		}
		else 
		{
			System.out.println("No same numbers on the major diagonal");
		}
		
		
		int sum1 = 0;
		for(int row = array.length - 1; row >= 0; row--)
		{
			sum1 += array[row][row];
		}
		if(sum1 == 0)
		{
			System.out.println("All 0s on the sub-diagonal");
		}
		else if(sum1 == 4)
		{
			System.out.println("All 1s on the sub-diagonal");
		}
		else 
		{
			System.out.println("No same numbers on the sub-diagonal");
		}

	}

}
