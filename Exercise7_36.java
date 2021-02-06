package Exercise;

public class Exercise7_36 {

	public static void main(String[] args) {
		int[] array = new int [8];
		
		Main:
		while(true)
		{
			int number = -1;
			int number0 = 0;//计运行了多少次
			for(int i = 0; i < 8; i++)
			{
				array[i] = -1;
			}

			for(int i = 0; i < 8; i++)
			{
				if(number0 > 500)
				{
					break;
				}
				
				if(i > 0)
				{
					Main0:
					while(true)
					{
						int count = 0;
						number = (int)(Math.random()* 8);

						for(int k = i - 1; k >= 0; k--)
						{
							if(array[k] != number)
							{
								count++;
							}
						}//同一列里不能有相同的

						int count1 = 0;
						int count0 = 1;
						boolean condition;

						while(i - count0 >= 0)
						{
							condition = (number != (array[i - count0] + count0) && number != (array[i - count0] - count0));
							count0++;
							if(condition == true)
							{
								count1++;
							}
						}//y = +-x 不能有相同的


						if(count == i && count1 == i)
						{
							array[i] = number;
							if(i == 7)
							{
								break Main;
							}
							else 
							{
								break Main0;
							}
							
						}
						else
						{
							number0++;
						}
						
						if(number0 > 500)
						{
							break;
						}
					}
				}
				else
				{
					number = (int)(Math.random()* 8);
					array[0] = number;
				}
			}
			
		}
		
		for(int i = 0; i < 8; i++)
		{
			for(int j = 0; j < 8; j++)
			{
				if(array[i] == j)
				{
					System.out.print("|Q");
				}
				else
				{
					System.out.print("| ");
				}

				if(j == 7)
				{
					System.out.print("|");
				}

			}
			System.out.println();
		}
	}	
}
