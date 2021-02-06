package Exercise;

import java.util.Scanner;

public class Exercise8_CheckSudokuSolution {

	public static void main(String[] args) {
		int [][] array = new int [9][9];
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Sudoku puzzle solution: ");
		for(int row = 0; row < array.length; row++)
		{
			for(int column = 0; column < array[row].length; column++)
			{
				array[row][column] = input.nextInt();
			}
		}
		
		boolean condition = false;
		for(int i = 0; i < array.length; i++)
		{
			for(int j = 0; j < array[i].length; j++)
			{
				if(array[i][j] < 1 || array[i][j] > 9 || !valid(i,j,array))
					condition = false;
			}
			condition = true;
		}
		
		if(condition == true)
			System.out.println("Valid solution");
		else
			System.out.println("Invalid solution");
		
		
	}
	
	public static boolean valid(int i,int j,int [][] array)
	{
		for(int column = 0; column < array[i].length; column++)
		{
			if(column != j && array[i][j] == array[i][column])
				return false;
		}
		
		for(int row = 0; row < array.length; row++)
		{
			if(row != i && array[i][j] == array[row][j])
				return false;
		}
		
		for(int row = (i / 3)* 3; row < (i / 3)* 3 + 3; row++)
		{
			for(int column = (j / 3)* 3; column < (j / 3)* 3 + 3; column++)
			{
				if(!(row == i && column == j) && array[row][column] == array[i][j])
					return false;
			}
		}
		
		return true;
	}
}
 