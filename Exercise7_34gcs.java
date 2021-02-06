package Exercise;

import java.util.Scanner;

public class Exercise7_34gcs {

	public static void main(String[] args) {
		String string;
		Scanner scanner = new Scanner(System.in);
		System.out.print("please input a string:");
		string=scanner.next();
		System.out.println(sort1(string));

	}
	
	public static String sort1(String s) {
		String s1="";
		int[] array=new int[s.length()];
		int position=0;
		int count=0;
		
		while(count<s.length()) {
			char minchar='z';
			for(int i=0;i<s.length();i++)
			{
				if((s.charAt(i)<minchar)&&(isExit(i, array, count)) == false) 
				{
					minchar=s.charAt(i);
					position=i;
				}
			}
			s1=s1+minchar;
			array[count]=position;
			count++;
			
		}
		return s1;
	}
	public static boolean isExit(int n,int[] array,int count) {
		for(int i=0;i<count;i++)
		{
			if(n==array[i])
				return true;
		}
		return false;
	}

}
