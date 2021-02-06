package Exercise;

public class Exercise5_33 {

	public static void main(String[] args) {
		int divisor;
		int sum = 0;
		final int MAX = 10000;
		
		for(int a = 1;a <= 10000;a++)
		{
			sum = 0;
			for(divisor = 1;divisor <= a/2;divisor++)
			{
				if(a % divisor == 0)
				{
					sum += divisor;
				}
			}
			if(a == sum)
				System.out.println(a);
		}

	}

}
