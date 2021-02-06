package Exercise;

import java.util.Scanner;

public class Exercise8_19 {

	public static void main(String[] args) {
		int row0,column0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the number of rows: ");
		row0 = input.nextInt();
		System.out.print("Please enter the number of columns: ");
		column0 = input.nextInt();

		int [][] array = new int [row0][column0];
		
		for(int row = 0; row < array.length; row++)
		{
			for(int column = 0; column < array[row].length; column++)
			{
				array[row][column] = input.nextInt();
			}
		}
		
		if(isConsecutiveFour(array))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("False");
		}
	}
	
	public static boolean isConsecutiveFour(int [][] values)
	{
		if(values.length < 4 && values[0].length < 4)
		{
			return false;
		}
		
		for(int row = 0; row < values.length; row++)
		{
			int sameNum = values[row][0];
			int count = 1;
			for(int column = 1; column < values[row].length; column++)
			{
				if(sameNum == values[row][column])
				{
					count++;
				}
				else
				{
					sameNum = values[row][column];
					count = 1;
				}
			}
			if(count >= 4)
			{
				return true;
			}
		}
		
		for(int column = 0; column < values[0].length; column++)
		{
			int sameNum = values[0][column];
			int count = 1;
			for(int row = 1; row < values.length; row++)
			{
				if(sameNum == values[row][column])
				{
					count++;
				}
				else
				{
					sameNum = values[row][column];
					count = 1;
				}
			}
			if(count >= 4)
			{
				return true;
			}
		}
		
		for(int row = 0; row < values.length; row++)
		{
			for(int column = 0; column < values[row].length; column++)
			{
				int sameNum = values[row][column];
				int count = 0;
				for(int i = row, j = column; i < values.length && j < values[0].length; i++,j++)
				{
					if(values[row][column] == values[i][j])
					{
						count++;
					}
					else
					{
						sameNum = values[i][j];
						count = 1;
					}
				}
				if(count >= 4)
				{
					return true;
				}
			}
		}
		
		for(int row = 0; row < values.length; row++)
		{
			for(int column = 0; column < values[0].length; column++)
			{
				int sameNum = values[row][column];
				int count = 0;
				for(int i = row,j = column; i < values.length && j >= 0; i++,j--)
				{
					if(sameNum == values[i][j])
					{
						count++;
					}
					else
					{
						sameNum = values[i][j];
						count = 1;
					}
				}
				if(count >= 4)
				{
					return true;
				}
			}
		}
		
		return false;
	}

}
