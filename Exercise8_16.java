package Exercise;

import java.util.Scanner;

public class Exercise8_16 {

	public static void main(String[] args) {
		int [][] array = {
				{4,2},
				{1,7},
				{4,5},
				{1,2},
				{1,1},
				{4,1}};
		
		sort(array);
		
		for(int row = 0; row < array.length; row++)
		{
			for(int column = 0; column < array[row].length; column++)
			{
				System.out.print(array[row][column]+" ");
			}
			System.out.println();
		}

	}	
			
	public static void sort(int [][] m)
	{
		for(int i = 0; i < m.length - 1; i++)
		{
			for(int j = 0; j < m.length - i - 1; j++)
			{
				if(m[j][0] > m[j+1][0])
				{
					int temp = m[j][0];
					int temp0 = m[j][1];
					
					m[j][0] = m[j+1][0];
					m[j][1] = m[j+1][1];
					
					m[j+1][0] = temp;	
					m[j+1][1] = temp0;
				}
			}
		}
		
		for(int i = 0; i < m.length - 1; i++)
		{
			for(int j = 0; j < m.length - 1 - i; j++)
			{
				if(m[j][1] > m[j+1][1] && m[j][0] == m[j + 1][0])
				{
					int temp = m[j][1];
					m[j][1] = m[j+1][1];
					m[j+1][1] = temp;		
				}
			}
		}
	}

}
