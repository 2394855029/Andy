package Exercise;//提示用户输入一个十六进制数，输出十进制数。

import java.util.Scanner;

public class class_01 {

	public static void main(String[] args) {
		String str;
		int sum = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a Hexadecimal number:");
		str = input.next();//ABCD
		
		for(int index = 0; index < str.length(); index++)
		{
			sum += charToNumber(str.charAt(index))*(int)(Math.pow(16, str.length()-index-1));
		}
		
		System.out.println(sum);
	}
	
	public static int charToNumber(char ch)
	{
		int number = 0;
		if(ch >= '0' && ch <= '9')
			return ch - '0';
		else
			return ch - 'A' + 10;
	}

}
