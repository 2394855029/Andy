package Exercise;

public class Exercise9_6 {

	public static void main(String[] args) {
		StopWatch time = new StopWatch();
		
		int [] array = new int [10000];
		for(int i = 0; i < array.length; i++)
		{
			array[i] = (int)(Math.random()*10000);
		}
		
		time.start();
		for(int i = 0; i < array.length - 1; i++)
		{
			int minNum = array[i];
			int minIndex = i;
			for(int j = i + 1; j < array.length; j++)
			{
				if(array[j] < minNum)
				{
					minNum = array[j];
					minIndex = j;
				}
			}
			
			if(minIndex != i)
			{
				array[minIndex] = array[i];
				array[i] = minNum;
			}
		}
		
		time.stop();
		
		System.out.println(time.getElapsedTime());
	}
}

class StopWatch{
	private double startTime,endTime;
	
	StopWatch()
	{
		startTime = System.currentTimeMillis();
	}
	
	double start()
	{
		return (startTime = System.currentTimeMillis());
	}
	
	double stop()
	{
		return (endTime = System.currentTimeMillis());
	}
	
	double getElapsedTime()
	{
		return (endTime - startTime);
	}
	
}