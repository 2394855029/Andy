package Exercise;

import java.util.Scanner;

import com.sun.net.httpserver.Authenticator.Result;

public class Exercise5_38 {

	public static void main(String[] args) {
		int number;
		int result = 0;
		int n = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter an integer:");
		number = input.nextInt();
		
		while(number > 0)
		{
			result += (number % 8)*Math.pow(10, n) ;//个位
			number = number / 8;
			n++;	
		}
		System.out.println(result);
	}

}
