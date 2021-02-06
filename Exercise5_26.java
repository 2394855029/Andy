package Exercise;

import java.util.Scanner;

public class Exercise5_26 {

	public static void main(String[] args) {
		int i,integer;
		double result = 1;
		double item = 1;
		
		Scanner input = new Scanner(System.in);
		integer = input.nextInt();
		
		for(i = 1;i <= integer;i++)
		{
			item = item*(1.0/i);
			result += item;
			
		}
		System.out.println(result);
	}

}
