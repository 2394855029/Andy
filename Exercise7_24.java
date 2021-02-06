package Exercise;

public class Exercise7_24 {

	public static void main(String[] args) {
		int [] deck = new int [51];
		String [] suits = {"Spades","Clubs","Hearts","Diamonds"};
		String [] ranks = {"1","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
		
		for(int i = 0; i < deck.length; i++)
		{
			deck[i] = i;
		}
		
		for(int i = 0; i < deck.length; i++)
		{
			int index = (int)(Math.random()*deck.length);
			
			int temp = deck[i];
			deck[i] = deck[index];
			deck[index] = temp;
		}
		
		int [] a = new int [deck.length];
		int [] number = new int [deck.length];
		boolean isAppeared;
		int count = 0;
		int c = 0;
	
		for(int i = 0; count < 4; i++)
		{
			int index = (int)(Math.random()*deck.length);
			a[i] = deck[index] / 13;
			c++;
				
			isAppeared = false;
			for(int j = 0; j < count; j++)
			{
				if(a[j] == a[i])
				{
					isAppeared = true;
					break;
				}
			}
				
			if(isAppeared == false)
			{
				a[count] = a[i];
				number[count] = deck[index] % 13;
				count++;
			}	
		}
		
		for(int i = 0; i < count; i++)
		{
			System.out.println(ranks[number[i]] + " of "+ suits[a[i]]);
		}
		
		System.out.println("Number of picks: "+ c);
		
			
		
	}

}
