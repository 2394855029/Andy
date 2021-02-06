package Exercise;

import java.util.Scanner;

public class Exercise8_8 {

	public static void main(String[] args) {
		int number;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of points: ");
		number = input.nextInt();
		
		double[][] array = new double [number][2];
		
		System.out.print("Enter "+number+" points: ");
		for(int row = 0; row < array.length; row++)
		{
			for(int column = 0; column < array[row].length; column++)
			{
				array[row][column] = input.nextDouble();
			}
		}
		
		double shortestdistance = distance(array[0][0], array[0][1], array[1][0], array[1][1]);
		
		for(int i = 0; i < array.length; i++)
		{
			for(int j = i + 1; j < array.length; j++)
			{
				double distance0 = distance(array[i][0], array[i][1], array[j][0] , array[j][1]);
				 if(distance0 <= shortestdistance)
				 {
					 shortestdistance = distance0; 
				 }
			}
		}
		
		for(int i = 0; i < array.length; i++)
		{
			for(int j = i + 1; j < array.length; j++)
			{
				if(distance(array[i][0], array[i][1], array[j][0] , array[j][1]) == shortestdistance)
				{
					System.out.println("The closest two points are ("+array[i][0]+", "+array[i][1]+") and ("+array[j][0]+", "+array[j][1]+")");
				}
			}
		}
		
		System.out.println("Their distance is "+ shortestdistance);

	}
	
	public static double distance(double x1,double y1,double x2,double y2)
	{
		double distance = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
		return distance;
	}

}
