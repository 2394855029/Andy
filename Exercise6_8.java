package Exercise;//两个循环放一起。

import java.util.Scanner;

public class Exercise6_8{

	public static void main(String[] args) {
		System.out.println("摄氏度            华氏度			华氏度            摄氏度");
		System.out.println("——————————————————————————————————————————————————————————");

			for(double celsius = 40,fahrenheit = 120; celsius >= 31 && fahrenheit >= 30; celsius--,fahrenheit = fahrenheit -10)
			{
				System.out.print(celsius+"        ");
				System.out.printf("%.1f",celToFah(celsius));
				System.out.print("			");
				System.out.print(fahrenheit+"        ");
				System.out.printf("%.2f",fahToCel(fahrenheit));
				System.out.println();
			}
			
		}
	
	public static double celToFah(double celsius)
	{
		double fah = 0;
		
		fah = (9.0 / 5)*celsius + 32;
		
		return fah;
	}
	
	public static double fahToCel(double fahrenheit)
	{
		double cel = 0;
		
		cel = (5.0 / 9)*(fahrenheit - 32);
		
		return cel;
	}

}
