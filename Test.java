package Exercise;

public class Test  
{  
	public static void main(String[] args) {
        int[] array = {9,9,9,9,9};
        int[] array0 = plusOne(array);

        for(int a: array0)
        {
            System.out.print(a + " ");
        }

    }
    public static int[] plusOne(int[] digits) {
        int index = digits.length;
        int i;
        int[] newArr;
        if(digits[index - 1] + 1 < 10)
        {
        	digits[index - 1] = digits[index - 1] + 1;
        	return digits;
        }
        else
        {
        	digits[index - 1] = 0;
			for(i = index - 2; i >= 0; i--)
			{
				if(digits[i] + 1 == 10)
				{
					digits[i] = 0;
				}
				else
				{
					digits[i] = digits[i] + 1;
					break;
				}
			}
			
			if(i == -1)
			{
				newArr = new int [index + 1];
				newArr[0] = 1;
				for(int j = 1; j < newArr.length; j++)
				{
					newArr[j] = digits[j - 1];
				}
				
				return newArr;
			}
			else
			{
				return digits;
			}
		}
    }
}

class DArray{
	private long[] array;
	private int nElem;
	
	public DArray(int length)
	{
		array = new long [length];
		nElem = 0;
	}
	
	public void insert(long a)
	{
		array[nElem++] = a;
	}
	
	public void display()
	{
		for(int i = 0; i < nElem; i++)
		{
			System.out.print(array[i] + " ");
		}
		
		System.out.println();
	}
	
	public void mergeSort()
	{
		long[] workplace = new long [nElem];
		recMergeSort(workplace, 0, nElem - 1);
	}
	
	private void recMergeSort(long[] workplace, int lowerBound, int upperBound)
	{
		if(lowerBound == upperBound)
		{
			return;
		}
		else 	
		{
			int mid = (lowerBound + upperBound) / 2;

			recMergeSort(workplace, lowerBound, mid);

			recMergeSort(workplace, mid + 1, upperBound);

			merge(workplace, lowerBound, mid + 1, upperBound);
		}
	}
	
	private void merge(long[] workplace, int low, int high, int upper)
	{
		int i = 0;
		int lowBound = low;
		int mid = high - 1;
		int n = upper - lowBound + 1;
		
		while(low <= mid && high <= upper)
		{
			if(array[low] < array[high])
			{
				workplace[i++] = array[low++];
			}
			else
			{
				workplace[i++] = array[high++];
			}
		}
		
		while(low <= mid)
		{
			workplace[i++] = array[low++];
		}
		
		while(high <= upper)
		{
			workplace[i++] = array[high++];
		}
		
		for(i = 0; i < n; i++)
		{
			array[lowBound + i] = workplace[i];
		}
	}
}
