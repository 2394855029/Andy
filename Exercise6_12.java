package Exercise;

public class Exercise6_12 {

	public static void main(String[] args) {
		char ch1 = '1';
		char ch2 = 'Z';
		int numberPerLine = 10;
		
		printChars(ch1, ch2, numberPerLine);
	}
	
	public static void printChars(char ch1,char ch2,int numberPerLine)
	{
		
		for(int i = 0 ; ch1 <= ch2; ch1++)
		{
			System.out.printf("%-2c",ch1);//c格式：输出一个字符。 
//			System.out.print(ch1+" ");
			i++;
			if(i % numberPerLine == 0)
			{
				System.out.println();
			}
		}
	}

}
