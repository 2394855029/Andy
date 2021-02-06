package Exercise;

import java.util.Scanner;

public class Exercise8_35$ {

	public static void main(String[] args) {
		int number;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of rows in the matrix: ");
		number = input.nextInt();
		System.out.println("Enter the matrix row by row: ");
		
		int[][] array = new int [number][number];
		for(int row = 0; row < array.length; row++)
		{
			for(int column = 0; column < array[row].length; column++)
			{
				array[row][column] = input.nextInt();
			}
		}
		
		int[] newArray = findLargestBlock(array);
		System.out.println("The maximum square submatrix is at (" + newArray[1] + ", " + newArray[2] + ") with size " + newArray[0]);
	}
	
	public static int[] findLargestBlock(int[][] m)
	{
		int maxn=1,x=0,y=0;
		for(int i=1;i< m.length;i++)
		{
			for(int j=1; j< m[i].length ;j++)
			{
				if(m[i][j]==1)
				{
					int mmin = Math.min(m[i - 1][j], m[i][j - 1]);
	                mmin = Math.min(m[i - 1][j - 1], mmin);//求出上 ，左，上左最小值
	                m[i][j] = mmin + 1;
	                if(maxn < m[i][j])
	                {
	                	maxn = m[i][j];
	                	x=i;y=j;//记录方阵右下位置
					}
	               
				}
			}
		}
		int[] ans = {maxn,x-maxn+1,y-maxn+1};//结果放在数组中
		return ans;
	}
}
