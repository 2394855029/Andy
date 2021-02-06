package Exercise;

import java.util.Scanner;

public class Exercise5_34 {

	public static void main(String[] args) {
		int number;
		int count = 0;
		int countCom = 0;
		
		Scanner input = new Scanner(System.in);
		
		while(true)
		{
			System.out.print("scissor(0), rock(1), paper(2): ");
			number = input.nextInt();
			
			int numberCom = (int)(Math.random()*3);
			if(numberCom == number)
			{
				if(numberCom == 0)
				{
					System.out.println("The computer is scissor. You are scissor too. It is a draw.");
					System.out.println("Please once again.");
				}
				else if(numberCom == 1)
				{
					System.out.println("The computer is rock. You are rock too. It is a draw");
					System.out.println("Please once again.");
				}
				else
				{
					System.out.println("The computer is paper. You are paper too. It is a draw");
					System.out.println("Please once again.");
				}
			}
			
			else
			{
				if(number == 0 && numberCom == 1)
				{
					System.out.println("The computer is rock. You are scissor. You lose.");
					countCom++;
				}
				else if(number == 0 && numberCom == 2)
				{
					System.out.println("The computer is paper. You are scissor. You win.");
					count++;
				}
				else if(number == 1 && numberCom == 0)
				{
					System.out.println("The computer is scissor. You are rock. You win.");
					count++;
				}
				else if(number == 1 && numberCom == 2)
				{
					System.out.println("The computer is paper. You are rock. You lose.");
					countCom++;
				}
				else if(number == 2 && numberCom == 1)
				{
					System.out.println("The computer is rock. You are paper. You win.");
					count++;
				}
				else if(number == 2 && numberCom == 0)
				{
					System.out.println("The computer is scissor. You are paper. You lose.");
					countCom++;
				}
			}
			if(count > 2 || countCom > 2)
			{
				break;
			}
		}
		
		System.out.println("The game is over.");
		if(count > countCom)
		{
			System.out.println("You defeat the computer! You win !" );
		}
		else
		{
			System.out.println("It is a pity ! You lose!" );
		}
	}

}
