package Exercise;

public class Test02 {

	public static void main(String[] args) {
		double y = 1;
		double x =2;
		double temp;
		int count = 0;
		double sum = 0;
		
		while(count < 20)
		{
			System.out.print(x+"/"+y+"\t");
			sum = sum + (double)(x)/(double)(y);
			temp = x;
			x = y + x;
			y = temp;
			
			count++;
		}
		System.out.printf("\nthe sum is %5.2f",sum);

		

	}

}
