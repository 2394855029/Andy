package Exercise;

import java.util.Scanner;

public class Exercise8_ {

	public static void main(String[] args) {
		int number;
		String[] list = new String [512];
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number between 0 and 511: ");
		number = input.nextInt();
		
		
		
		
		
		
		print(list[number]);
		
	}
	
	public static void print(String a)
	{
		int b = 0;
		String[][] array = new String [3][3];
		
		for(int row = 0; row < array.length; row++)
		{
			for(int column = 0; column < array[row].length; column++)
			{
				if(a.charAt(b) == '0')
				{
					array[row][column] = "H";
				}
				else
				{
					array[row][column] = "T";
				}
				b++;
			}
		}
		
		for(int row = 0; row < array.length; row++)
		{
			for(int column = 0; column < array[row].length; column++)
			{
				System.out.print(array[row][column] + " ");
			}
			System.out.println();
		}
	}

}
