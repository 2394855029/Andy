package Exercise;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		int year,month,day;
		int sumOfDays = 0;
		int monthOfDays = 0;
		int totalMonthDays = 0;
		int totalOfDays = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("please input date(eg:2020 04 23):");
		year = input.nextInt();
		month = input.nextInt();
		day = input.nextInt();
		
		for(int i = 1; i <= month; i++)
		{
			
		switch(i)
		{
		case 1:
			monthOfDays = 0;
			break;
		case 2:
			monthOfDays = 31;
			break;
		case 3:
			if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
			{
				monthOfDays = 29;
			}
			else
			{
				monthOfDays = 28;
			}
			break;
		case 4:
			monthOfDays = 31;
			break;
		case 5:
			monthOfDays = 30;
			break;
		case 6:
			monthOfDays = 31;
			break;
		case 7:
			monthOfDays = 30;
			break;
		case 8:
			monthOfDays = 31;
			break;
		case 9:
			monthOfDays = 31;
			break;
		case 10:
			monthOfDays = 30;
			break;
		case 11:
			monthOfDays = 31;
			break;
		case 12:
			monthOfDays = 30;
			break;
		default:
			System.out.print("Input month error");
		}
		
		totalMonthDays += monthOfDays;
		
	}
		
		totalOfDays = totalMonthDays + day;
		
		System.out.println("\nthe sum days of "+year+"-"+month+"-"+day+" is "+totalOfDays);
		
	}

}
