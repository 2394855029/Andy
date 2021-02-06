package Exercise;

import java.util.Scanner;

public class Exercise6_5 {

	public static void main(String[] args) {
		double num1,num2,num3;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter three numbers:");
		num1 = input.nextDouble();
		num2 = input.nextDouble();
		num3 = input.nextDouble();
		
		displaySortedNumbers(num1,num2,num3);

	}
	
	public static void displaySortedNumbers(double a,double b,double c)
	{
//		double min,mid,max;
		double temp;
		
		if(a > b)
		{
			temp = b;
			b = a;
			a = temp;
		}
		if(a > c)
		{
			temp = c;
			c = a;
			a = temp;
		}
		if(b > c)
		{
			temp = c;
			c = b;
			b = temp;
		}
		
//		if(a > b)
//		{
//			max = a > c ? a : c;
//			mid = b > c ? b : c;
//			min = b > c ? c : b;
//		}
//		else
//		{
//			max = b > c ? b : c;
//			mid = b > c ? c : b;
//			min = a > c ? c : a;
//		}
		System.out.println(a+" "+b+" "+c);
	}

}
