package Exercise;

public class Exercise8_10 {

	public static void main(String[] args) {
		int [][] array = new int [4][4];
		int [][] sum = new int [4][2];
		
		for(int row = 0; row < array.length; row++)
		{
			for(int column = 0; column < array[row].length; column++)
			{
				array[row][column] = (int)(Math.random()*2);
				System.out.print(array[row][column]);
			}
			System.out.println();
		}
		
		for(int column = 0; column < array[0].length; column++)
		{
			for(int row = 0; row < array.length; row++)
			{
				 sum[column][0] += array[row][column];
			}
		}
		
		for(int row = 0; row < array.length; row++)
		{
			for(int column = 0; column < array[row].length; column++)
			{
				sum[row][1] += array[row][column];
			}
		}
		
		int largestColumn = sum[0][0];
		int columnIndex = 0;
		for(int i = 0; i < sum.length; i++)
		{
			if(sum[i][0] > largestColumn)
			{
				largestColumn = sum[i][0];
				columnIndex = i;
			}
		}
		
		int largestRow = sum[0][1];
		int rowIndex = 0;
		for(int i = 0; i < sum.length; i++)
		{
			if(sum[i][1] > largestRow)
			{
				largestRow = sum[i][1];
				rowIndex = i;
			}
		}
		
		System.out.println("The largest row index: "+ rowIndex);
		System.out.println("The largest column index: "+columnIndex);
		
	}

}
