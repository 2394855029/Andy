package Exercise;


public class Exercise5_20 {

	public static void main(String[] args) {
		final int MIN = 2,MAX = 1000,SIZE = 8;
		int number,factor;
		int count = 0;
		boolean isPrime;
		
		for(number = MIN;number <= MAX;number++)
		{
			isPrime = true;
			for(factor = 2;factor <= Math.sqrt(number);factor++)
			{
				if(number % factor == 0)
				{
					isPrime = false;
					break;
				}
				
			}
			if(isPrime)
			{
				System.out.print(number+" ");//System.out.printf("%4d",number)//格式化
				count++;
				
				if(count % SIZE == 0)
					System.out.println();
			}
				
		}
		
	}

}
