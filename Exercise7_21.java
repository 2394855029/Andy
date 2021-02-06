package Exercise;

import java.util.Scanner;

public class Exercise7_21 {

	public static void main(String[] args) {
		String number;
		int sum = 0;
		
		Scanner input = new Scanner(System.in);
		number = input.nextLine();
		
		String [] number1 = number.split(" ");
		
		//System.out.println(number1.length);
		
		for(int i = 0; i < number1.length ; i++)
		{
			sum += Integer.parseInt(number1[i]);
		}
		
		System.out.print(sum);
		
		
		
	}

}
