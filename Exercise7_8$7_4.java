package Exercise;

public class Exercise7_8$7_4 {

	public static void main(String[] args) {
		char [] chars = creatArray();
		
		System.out.println("The lowercase letters are:");
		
		int count = 0;
		
		for(char a : chars)
		{
			System.out.print(a+" ");
			count++;
			if(count % 20 == 0)
				System.out.println();
		}
		
		int [] count1 = countLetters(chars);
		
		System.out.println();
		System.out.println("The occurences of each letters are:");
		displayCounts(count1);
		
	}
	
	public static char [] creatArray()
	{
		char [] chars = new char [100];
		
		for(int i = 0; i < chars.length; i++)
		{
			chars[i] = RandomCharacter.getRandomLowerCaseLetter();
		}
		
		return chars;
	}
	
	public static int [] countLetters(char [] chars)
	{
		int [] count = new int [26];
		
		for(int i = 0; i < chars.length; i++)
		{
			count[chars[i] - 'a']++;//!!!!!!!!!!!!
		}
		
		return count;
	}
	
	public static void displayCounts(int [] count)
	{
		for(int i = 0; i < count.length; i++)
		{
			if((i + 1) % 10 == 0)
			{
				System.out.println(count[i] + " " + (char)('a'+i));
			}
			else
			{
				System.out.print(count[i] + " " + (char)('a'+i) + " ");
			}
		}
	}
	
}
