package Exercise;

import java.util.Scanner;

public class Exercise8_23 {

	public static void main(String[] args) {
		int [][] array = new int [6][6];
		int a = 0,b = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 6-by-6 matrix row by row: ");
		for(int row = 0; row < array.length; row++)
		{
			for(int column = 0; column < array[row].length; column++)
			{
				array[row][column] = input.nextInt();
			}
		}

		for(int row = 0; row < array.length; row++)
		{
			int sum = 0;
			for(int column = 0; column < array[row].length; column++)
			{
				sum += array[row][column];
			}
			if(sum % 2 != 0)
			{
				a = row;
				break;
			}
		}
		
		for(int column = 0; column < array[0].length; column++)
		{
			int sum = 0;
			for(int row = 0; row < array.length; row++)
			{
				sum += array[row][column];
			}
			if(sum % 2 != 0)
			{
				b = column;
				break;
			}
		}
		
		System.out.println("The flipped cell is at ("+a+", "+b+")");
	}

}
