package Exercise;//'0' to '9'(48 - 57) ; 'A' to 'Z'(65 - 90) ; 'a' to 'z'(97 - 122)

import java.util.Scanner;

public class Exercise6_18 {

	public static void main(String[] args) {
		String password;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a password:");
		password = input.nextLine();
		if(isFit(password))
		{
			System.out.println("Valid Password");
		}
		else
		{
			System.out.println("Invalid Password");
		}
		
	}
	
	public static boolean isFit(String password)
	{
		int count = 0;
		
		if(password.length() < 8)
		{
			return false;
		}
		else
		{
			for(int i = 0 ; i < password.length(); i++)
			{
				boolean condition = ((int)password.charAt(i) >= 48 && (int)password.charAt(i) <= 57) ||
						((int)password.charAt(i) >= 65 && (int)password.charAt(i) <= 90) ||
						((int)password.charAt(i) >= 97 && (int)password.charAt(i) <= 122);
				if(condition == false)
				{
					return false;
				}
				else
				{
					if((int)password.charAt(i) >= 48 && (int)password.charAt(i) <= 57)
					{
						count++;
					}
				}
			}
			if(count < 2)
			{
				return false;
			}
			else
			{
				return true;
			}
				
		}
	}

}

