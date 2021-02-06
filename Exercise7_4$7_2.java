package Exercise;//一副牌，一开始牌的顺序为黑桃，红桃，方块，梅花。

import java.util.Scanner;

public class Exercise7_4$7_2{

	public static void main(String[] args) {
		int index,temp;
		int [] deck = new int [52];
		String [] suits = {"Spades","Hearts","Diamonds","Clubs"};//黑桃，红桃，方块，梅花。
		String [] ranks = {"Ace","1","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
		
		for(int i = 0; i < deck.length; i++)
		{
			deck[i] = i;
		}
		
		for(int i = 0; i < deck.length; i++)
		{
			index = (int)(Math.random()*(deck.length));
			
			temp = deck[i];
			deck[i] = deck[index];
			deck[index] = temp;
		}//将整套牌打乱
		
		for(int i = 0; i < 4; i++)
		{
			String suit = suits [deck[i] / 13];
			String rank = ranks [deck[i] % 13];
			
			System.out.println("Card number "+ deck[i] + ":" + rank + " of " + suit);
		}//抽取前四张牌看
		
	 }
	 
}
