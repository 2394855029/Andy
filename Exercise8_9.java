package Exercise;

import java.util.Scanner;

public class Exercise8_9 {

	public static void main(String[] args) {
		int count = 1;
		int [][] matrix = new int [3][3];
		int [][] xPo = new int [3][3];
		int [][] oPo = new int [3][3];

		int rowIndexX, columnIndexX, rowIndex0, columnIndex0;

		Scanner input = new Scanner(System.in);

		for(int row = 0; row < matrix.length; row++)
		{
			System.out.print("-------------");
			System.out.println();
			for(int column = 0; column < matrix[row].length; column++)
			{
				System.out.print("|   ");
				if(column == matrix[row].length - 1)
				{
					System.out.print("|");
				}
			}
			System.out.println();
			if(row == matrix.length - 1)
			{
				System.out.println("-------------");
			}
		}
			
		while(true)
		{
			if(count % 2 != 0)
			{
				System.out.print("Enter a row (0, 1, or 2) for player X: ");//创建个数组来读点的坐标，思想和八皇后差不多
				rowIndexX = input.nextInt();
				System.out.print("Enter a column (0, 1, or 2) for player X: ");
				columnIndexX = input.nextInt();

				xPo[rowIndexX][columnIndexX] = 1;
			}
			else 
			{
				System.out.print("Enter a row (0, 1, or 2) for player 0: ");
				rowIndex0 = input.nextInt();
				System.out.print("Enter a column (0, 1, or 2) for player 0: ");
				columnIndex0 = input.nextInt();

				oPo[rowIndex0][columnIndex0] = 1;
			}

			for(int row = 0; row < matrix.length; row++)
			{
				System.out.print("-------------");
				System.out.println();
				for(int column = 0; column < matrix[row].length; column++)
				{
					if(xPo[row][column] == 1)
					{
						System.out.print("| X ");
					}
					else if(oPo[row][column] == 1)
					{
						System.out.print("| 0 ");
					}
					else
					{
						System.out.print("|   ");
					}

					if(column == matrix[row].length - 1)
					{
						System.out.print("|");
					}
				}
				System.out.println();
				if(row == matrix.length - 1)
				{
					System.out.println("-------------");
				}
			}

			count++;
			if(isWon(xPo))
			{
				System.out.println("X player won");
				System.exit(0);
			}
			else if(isWon(oPo))
			{
				System.out.println("0 player won");
				System.exit(0);
			}
			else if(count == 10)
			{
				System.out.println("deuce");
				System.exit(0);
			}

			}
	}
	
	public static boolean isWon(int [][] a)
	{
		//行
		for(int i = 0; i < a.length; i++)
		{
			int sum = 0;
			for(int j = 0; j < a[i].length; j++)
			{
				sum += a[i][j];
			}
			if(sum == 3)
			{
				return true;
			}
		}
		
		//列
		for(int j = 0; j < a[0].length; j++)
		{
			int sum = 0;
			for(int i = 0; i < a.length; i++)
			{
				sum += a[i][j];
			}
			if(sum == 3)
			{
				return true;
			}
		}
		
		//斜
		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < a[i].length; j++)
			{
				if(i+2 < a.length && j+2 <a[i].length)
				{
					if((a[i][j] + a[i+1][j+1] + a[i+2][j+2]) == 3)
					{
						return true;
					}
				}
				
				if(i+2 < a.length && j-2 >= 0)
				{
					if((a[i][j] + a[i+1][j-1] + a[i+2][j-2]) == 3)
					{
						return true;
					}
				}
			}
		}
		return false;
	}
}