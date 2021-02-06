package Exercise;//1975年1月1日星期三。

import java.util.Scanner;
//test
public class Calendar_making {

	public static void main(String[] args) {
		int year,month;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter an year(such as:2020):");
		year = input.nextInt();
		System.out.print("Please enter an month(such as:5):");
		month = input.nextInt();
		
		printCalendar(year,month);
		
	}
	
	public static void printCalendar(int year,int month)
	{
		printCalendarTitle(year, month);
		printCalendarBody(year,month);
	}
	
	public static void printCalendarTitle(int year,int month)
	{
		switch(month)
		{
		case 1:
			System.out.println("	January, "+year);
			break;
		case 2:
			System.out.println("	February, "+year);
			break;
		case 3:
			System.out.println("	March, "+year);
			break;
		case 4:
			System.out.println("	April, "+year);
			break;
		case 5:
			System.out.println("	May, "+year);
			break;
		case 6:
			System.out.println("	June, "+year);
			break;
		case 7:
			System.out.println("	July, "+year);
			break;
		case 8:
			System.out.println("	August, "+year);
			break;
		case 9:
			System.out.println("	September, "+year);
			break;
		case 10:
			System.out.println("	October, "+year);
			break;
		case 11:
			System.out.println("	November, "+year);
			break;
		case 12:
			System.out.println("	December, "+year);
			break;
		default:
			System.out.println("	Wrong month entered!");
		}
		
		System.out.println("----------------------------");
		System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
	}
	
	public static int monthStartDay(int year,int month)
	{
		int startDay1975 = 3;
		int totalDays = 0;
		int monthDays = 0;
		int monthStartDay = 0;
		
		if(year > 1975)
		{
			for(int i = 1975; i < year ; i++)
			{
				if(isLeapYear(i) == true)
				{
					totalDays += 366;
				}
				else
				{
					totalDays += 365;
				}
			}
			for(int i = 1; i <= month - 1;i++)
			{
				monthDays = monthDays(year,i);
				totalDays += monthDays;
			}
			
			monthStartDay = (totalDays + startDay1975) % 7;
			return monthStartDay;
		}
		
		else if(year < 1975)
		{
			for(int i = 1975; i > year + 1; i--)
			{
				if(isLeapYear(i - 1) == true)
				{
					totalDays += 366;
				}
				else
			{
					totalDays += 365;
			}
			}
			for(int i = 12; i >= month; i--)
			{
				monthDays = monthDays(year,i);
				totalDays += monthDays;
			}
			
			monthStartDay =((startDay1975 - totalDays) % 7);
			while(monthStartDay < 0)
			{
				monthStartDay = monthStartDay + 7;
			}
			
		}
		return monthStartDay;
		
	}
	
	public static int monthDays(int year,int month)
	{
		int monthDays = 0;
		if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 )
		{
			monthDays = 31;
		}
		else if(month == 4 || month == 6 || month == 9 || month == 11)
		{
			monthDays = 30;
		}
		else if(month == 2)
		{
			if(isLeapYear(year))
			{
				monthDays = 29;
			}
			else
			{
				monthDays = 28;
			}
		}
		return monthDays;
		
	}
	public static void printCalendarBody(int year,int month)
	{
		int monthDays;
		int monthStartDay;
		monthStartDay = monthStartDay(year, month);
		monthDays = monthDays(year,month);
		
		for(int j = 1; j <= monthStartDay;j++)
		{
			System.out.print("    ");
		}
		for(int i = 1; i <= monthDays; i++)
		{
			System.out.printf("%4d",i);
			if((i + monthStartDay)%7 == 0)
			{
				System.out.println();
			}
		}
		
	}
	
	public static boolean isLeapYear(int year)
	{
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
