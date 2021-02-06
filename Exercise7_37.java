package Exercise;

import java.util.Scanner;

public class Exercise7_37 {

	public static void main(String[] args) {
		int ballNum,slotNum;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of balls to drop: ");
		ballNum = input.nextInt();
		System.out.print("Enter the number of slots in the bean machine: ");
		slotNum = input.nextInt();
		System.out.println();
		
		int [] slots = new int [slotNum];
		
		for(int i = 1; i <= ballNum; i++)
		{
			int sum = 0;
			for(int j = 1; j <= slotNum - 1; j++)
			{
				int random = (int)(Math.random()*2);
				sum += random;
				if(random == 0)
				{
					System.out.print("L");
				}
				else if(random == 1)
				{
					System.out.print("R");
				}
			}
			System.out.println();
			slots[sum]++;
		}
		
		System.out.println();
		
		int max = slots[0];
		for(int i = 1; i < slots.length; i++)
		{
			if(slots[i] > max)
			{
				max = slots[i];
			}
		}
		
		for(int i = max; i > 0; i--)
		{
			for(int j = 0; j < slots.length; j++)
			{
				if(slots[j] >= i)
				{
					System.out.print("0");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		for(int i = 0; i < slots.length; i++)
		{
			System.out.print((i+1));
		}
		
	}

}
