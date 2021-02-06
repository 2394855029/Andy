package Exercise;

import java.util.Scanner;

public class Exercise5_17 {

	public static void main(String[] args) {
		int linenumber,row,column;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter an integer:");
		linenumber = input.nextInt();
		
		for(row = 1;row <= linenumber;row++)
		{
			for(column = 1;column <= linenumber - row;column++)
			{
				System.out.print("    ");
			}
			for(column = row; column >= 1;column--)
			{
				System.out.printf("%4d",column);
			}
			for(column = 2;column <= row; column++)
			{
				System.out.printf("%4d", column);
			}
			System.out.println();
		}
	}

}
