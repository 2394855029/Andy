package Exercise;

import java.util.Scanner;

public class Exercise8_13 {

	public static void main(String[] args) {
		int a,b;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of rows and columns of the array: ");
		a = input.nextInt();
		b = input.nextInt();
		
		double[][] array = new double[a][b];
		
		System.out.println("Enter the array: ");
		for(int row = 0; row < array.length; row++)
		{
			for(int column = 0; column < array[row].length; column++)
			{
				array[row][column] = input.nextDouble();
			}
		}
		
		int [] location = locateLargest(array);
		
		System.out.println("The location of the largest element is at ("+location[0]+", "+location[1]+")");
	}
	
	public static int[] locateLargest(double[][] a)
	{
		double max = a[0][0];
		int [] location = new int [2];
		
		for(int row = 0; row < a.length; row++)
		{
			for(int column = 0; column < a[row].length; column++)
			{
				if(a[row][column] > max)
				{
					max = a[row][column];
					location[0] = row;
					location[1] = column;
				}
			}
		}
		
		return location;
	}

}
