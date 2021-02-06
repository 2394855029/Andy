package Exercise;

import java.util.Scanner;

public class Exercise8_21 {

	public static void main(String[] args) {
		int n;
		
		Scanner input =  new Scanner(System.in);
		System.out.print("Enter the number of cities: ");
		n = input.nextInt();
		
		double [][] points = new double [n][2];
		System.out.println("Enter the coordinates of the cities: ");
		for(int row = 0; row < points.length; row++)
		{
			for(int column = 0; column < points[row].length; column++)
			{
				points[row][column] = input.nextDouble();
			}
		}
		double [] sum = new double [points.length];
		for(int i = 0; i < points.length; i++)
		{
			for(int j = 0; j < points.length; j++)
			{
				sum[i] += distance(points[i][0], points[i][1], points[j][0], points[j][1]);
			}
		}
		
		int temp = 0;
		double shortestdistance = sum[0];
		for(int i = 1; i < sum.length; i++)
		{
			if(sum[i] < shortestdistance)
			{
				shortestdistance = sum[i];
				temp = i;
			}
		}
		
		System.out.println("The central city is at ("+ points[temp][0]+", "+points[temp][1]+")");
		System.out.print("The total distance to all other cities is ");
		System.out.printf("%.2f", shortestdistance);
	}
	
	public static double distance(double x1,double y1,double x2,double y2)
	{
		double distance0 = Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
		return distance0;
	}
}
