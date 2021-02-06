package Exercise;

import java.util.Scanner;

public class Exercise5_14 {

	public static void main(String[] args) {
		int d,n1,n2;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter two integers:");
		n1 = input.nextInt();
		n2 = input.nextInt();
		
		d = (n1 <= n2 ? n1:n2);//真即执行n1，否则执行n2
		
		while(true)//永真循环
		{
			if(n1 % d == 0 && n2 % d ==0)
				break;
			else
				d--;
			
		}
		
		System.out.println("The greatest common divisor is "+d);
	}

}
