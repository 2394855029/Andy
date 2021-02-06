package Exercise;

import java.util.Scanner;

public class Exercise7_35xt {

	public static void main(String[] args) {
		String [] word = {"write", "that", "program"};
		char letter;
		char answer;
		
		while(true) 
		{
			Scanner input = new Scanner(System.in);
			int count1 = 0;
			int index = (int)(Math.random()* word.length);//随机产生一个单词
			char [] str = new char [word[index].length()];//存*号，以及之后的改变
		
			System.out.print("(Guess) Enter a letter in word ");
			for(int i = 0; i < str.length; i++)
			{
				str[i] = '*';
			}
			for(char a: str)
			{
				System.out.print(a);
			}
			System.out.print(" > ");
		
			char [] number = new char [word[index].length()];//存不同的letter值
			int x = 0;
			boolean isAppeared = false;
			
			while(true)
			{
				letter = input.next().charAt(0);//读入的字母
				for(int i = 0; i < x; i++)
				{
					if(letter == number[i])
					{
						isAppeared = true;
						System.out.println(letter+" is already in the word");
						break;
					}
					else
					{
						isAppeared = false;
					}
				}
			
				int count = 0;
				for(int i = 0; i < word[index].length(); i++)
				{
					if(letter == word[index].charAt(i))
					{
						str[i] = letter;
					}
					else
					{
						count++;
					}
				}
				
				if(count == word[index].length())
				{
					System.out.println(letter+ " is not in the word");
					count1++;//猜错了多少次
				}
				
				if(isAppeared == false && count != word[index].length())
				{
					number[x] = letter;
					x++;
				}
			
				int count0 = 0;
				for(int i = 0; i < str.length; i++)
				{
					if(str[i] == word[index].charAt(i))
					{
						count0++;
					}	
				}
				if(count0 == str.length)
				{
					break;
				}
			
				System.out.print("(Guess) Enter a letter in word ");
			
				for(char d: str)
				{
					System.out.print(d);
				}
			
				System.out.print(" > ");
				
			}
			
			if(count1 <= 1)
				System.out.println("The word is " + word[index] + ". You missed "+ count1 + " time");
			else
				System.out.println("The word is " + word[index] + ". You missed "+ count1 + " times");
			
			System.out.println("Do you want to guess another word? Enter y or n>");
			
			answer = input.next().charAt(0);
			if(answer == 'n')
			{
				System.out.print("Thank you!");
				break;
			}
			else if(answer == 'y')
				;
		}
	}
}
