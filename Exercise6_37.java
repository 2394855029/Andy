package Exercise;

import java.util.Scanner;

public class Exercise6_37 {

	public static void main(String[] args) {
		int number,width;
		
		Scanner input = new Scanner(System.in);
		number = input.nextInt();
		width = input.nextInt();
		
		System.out.println(format(number,width));
	}
	
	public static String format(int number,int width)
	{
		String number1 = "";
		int numberLength = ((number)+"").length();//!!!!!
		
		if(numberLength <= width)
		{
			for(int i = 1; i <= width - numberLength; i++)
			{
				number1 = "0" + number1;
			}
			return number1 + number;
		}
		else
		{
			return ""+number;
		}
		
	}

}
