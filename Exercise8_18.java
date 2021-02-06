package Exercise;

public class Exercise8_18 {

	public static void main(String[] args) {
		int [][] m = 
		{
			{1,2},
			{3,4},
			{5,6},
			{7,8},
			{9,10}};
		
		shuffle(m);
		
		for(int row = 0; row < m.length; row++)
		{
			for(int column = 0; column < m[row].length; column++)
			{
				System.out.print(m[row][column]+" ");
			}
			System.out.println();
		}
	}
	
	public static void shuffle(int [][] m)
	{
		int number;
		for(int row = 0; row < m.length; row++)
		{
			number = (int)(Math.random()* m.length);
			for(int column = 0; column < m[row].length; column++)
			{
				int temp = m[row][column];
				m[row][column] = m[number][column];
				m[number][column] = temp;
			}
		}
	}

}
