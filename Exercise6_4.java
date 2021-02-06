package Exercise;

import java.util.Scanner;

public class Exercise6_4 {

	public static void main(String[] args) {
		int number,a;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter an integer:");
		number = input.nextInt();
		
		reverse(number);

	}
	
	public static void reverse(int number)
	{
		int result = 0;
		
		while(number > 0)
		{
			result = result*10 + number%10;
			number = number/10;
		}
		
		System.out.println(result);//在这个子方法里输出。。
	}

}
