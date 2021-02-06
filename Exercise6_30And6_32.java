package Exercise;

public class Exercise6_30And6_32 {

	public static void main(String[] args) {
		int a,b,c,d;
		int sum,sum1;
		int count = 0;
		int winNumber = 0;
		
		while(count <= 10000)
		{
			a = (int)(1 + Math.random()*7);
			b = (int)(1 + Math.random()*7);
			sum = a + b;
			
			//System.out.println("You rolled "+ a + " + " + b + " = "+ sum);
			
			if(sum == 2 || sum == 3 || sum == 12)
			{
				//System.out.println("You lose");
			}
			else if(sum == 7 || sum == 11)
			{
				//System.out.println("You win");
				winNumber++;
			}
			
			else 
			{	
				//System.out.println("point is "+ sum);
				
				int number = 0;
				while(number == 0)
				{
					c = (int)(1 + Math.random()*7);
					d = (int)(1 + Math.random()*7);
					sum1 = c + d;
					//System.out.println("You rolled "+ c + " + " + d + " = "+ sum1);
					//System.out.println("point is "+ sum1);
					if(sum1 == 7)
						{
						//System.out.println("You lose");
						number++;
						}
						
					else if(sum1 == sum)
					{
						//System.out.println("You win");
						winNumber++;
						number++;
					}
						
				}
				
			}
			count++;
		}
		
		
		System.out.println(winNumber);
		
		
	
	}
	
}
