package Exercise;

import java.util.Scanner;

public class Exercise7_32 {

	public static void main(String[] args) {
		int number;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter list size: ");
		number = input.nextInt();
		
		System.out.print("Enter list content: ");
		int [] list = new int [number];
		for(int i = 0; i < list.length; i++)
		{
			list[i] = input.nextInt();
		}
		
		int index = partition(list);//不要重复调用partition方法，list数组在变化，每一次调用结果可能不同
		int temp = list[0];
		
		list[0] = list[index];
		list[index] = temp;
		
		int count = 0;
		for(int i = 0; i < index; i++)
		{
			if(list[i] > temp)
			{
				count++;
				while(true)
				{
					if(list[index + count] > temp)
						count++;
					else
						break;
				}
				
				int temp0 = list[index + count];
				list[index + count] = list[i];
				list[i] = temp0;
			}
		}
		
		System.out.print("After the partition, the list is ");
		for(int b : list)
		{
			System.out.print(b+" ");
		}
		
	}
	
	public static int partition(int [] array)
	{
		int count = 0;
		for(int i = 1; i < array.length; i++)
		{
			if(array[i] <= array[0])
			{
				count++;
			}
		}
		
		return count;
	}
}
