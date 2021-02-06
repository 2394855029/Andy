package Exercise;

public class finalTest2_2 {

	public static void main(String[] args) {
		int [] listOne = {1,3,5,7,9};
		int [] listTwo = {2,4,6,8,10};
		
		for(int a : merge(listOne,listTwo))
		{
			System.out.print(a+" ");
		}
	}
	
	public static int [] merge(int [] list1, int [] list2)
	{
		int count = 0;
		int I = 0,j = 0;
		int [] list = new int [list1.length + list2.length];
		
		for(int i = 0; I < list1.length && j < list2.length; i++)
		{
			if(list1[I] >= list2[j])
			{
				list[i] = list2[j];
				j++;
				count++;
			}
			else if(list2[j] >= list1[I])
			{
				list[i] = list1[I];
				I++;
				count++;
			}
			
		}
		
		if(list1.length > list2.length)
		{
			for(int i = count; i < list.length && I < list1.length; I++,i++)
			{
				list[i] = list1[I];
			}
		}
		else if(list1.length < list2.length)
		{
			for(int i = count; i < list.length && j < list2.length; i++,j++)
			{
				list[i] = list2[j];
			}
		}
		else 
		{
			list[count] = list2[list2.length-1];
		}
		
		return list;
	}
}
