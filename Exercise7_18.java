package Exercise;//冒泡排序

import java.util.Scanner;

public class Exercise7_18 {

	public static void main(String[] args) {
		double [] number = new double [10];
		
		Scanner input = new Scanner(System.in);
		
		for(int i = 0 ; i < number.length ; i++)
		{
			number[i] = input.nextDouble();
		}
		
		bubbleSort1(number);
		
		for(double a: number)
			{
				System.out.print(a+" ");
			}
		
//		for(double a:bubbleSort(number))
//		{
//			System.out.print(a+" ");
//		}
	}
	
	public static double [] bubbleSort(double [] array)
	{
		for(int i = 0; i < array.length - 1; i++)
		{
			for(int j = 0; j < array.length - i - 1; j++)//后面i个已经排好，每次遍历一次排好一个最大值
			{
				if(array[j] > array[j+1])
				{
					double temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		
		return array;
	}
	
	public static void bubbleSort1(double [] list)//teacher method
	{
		double temp;
		
		for(int maxPos = list.length - 1; maxPos >= 1; maxPos--)
		{
			for(int index = 0; index < list.length - 1; index++)
			{
				if(list[index] > list[index + 1])
				{
					temp = list[index];
					list[index] = list[index + 1];
					list[index + 1] = temp;		
				}
			}
		}
	}

}
