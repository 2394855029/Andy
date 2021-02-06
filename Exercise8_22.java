package Exercise;

public class Exercise8_22 {

	public static void main(String[] args) {
		int [][] array = new int [6][6];
		
		for(int row = 0; row < array.length; row++)
		{
			for(int column = 0; column < array[row].length; column++)
			{
				array[row][column] = (int)(Math.random()*2);
				System.out.print(array[row][column]+" ");
			}
			System.out.println();
		}
		
		for(int row = 0; row < array.length; row++)
		{
			int sum = 0;
			for(int column = 0; column < array[row].length; column++)
			{
				sum += array[row][column];
			}
			if(sum % 2 == 0)
			{
				System.out.println("The "+ row +" row has an even number of 1s");
			}
		}
		
		for(int column = 0; column < array[0].length; column++)
		{
			int sum = 0;
			for(int row = 0; row < array.length; row++)
			{
				sum += array[row][column];
			}
			if(sum % 2 == 0)
			{
				System.out.println("The "+ column +" column has an even number of 1s");
			}
		}
	}

}
