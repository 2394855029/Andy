package Exercise;

import java.util.Scanner;

public class Exercise7_35zzy {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        String[] words = {"write", "that", "program"};
        First:
        while (true) {
            int k = (int) (Math.random() * words.length);
            String x = words[k];
            String a = "";
            for (int i = 0; i < x.length(); i++) {
                a = a + "*";
            }
            String b = a;
            int count = 0;
            int miss = 0;
            Main:
            while (true) {
                System.out.print("(Guess) Enter a letter in word " + b + " > ");
                a = "";
                String letter = in.nextLine();
                char ch = letter.charAt(0);
                for (int i = 0; i < x.length(); i++) {
                    if (ch == b.charAt(i)) {
                        System.out.println(ch + " is already in the word");
                        continue Main;
                    }
                }
                int n = x.indexOf(ch);
                if (n == -1) {
                    System.out.println(ch + " is not in the word");
                    miss++;
                    continue Main;
                } else {
                    for (int i = 0; i < x.length(); i++) {
                        if (x.charAt(i) != ch) {
                            a = a + b.charAt(i);
                        } else {
                            count++;
                            a = a + ch;
                        }
                    }
                }
                b = a;
                if (count == x.length())
                    break Main;
            }
            System.out.print("The word is " + b + ". ");
            System.out.println("You missed " + miss + " times");
            System.out.println("Do you want to guess another word? Enter y or no");
            String h = in.nextLine();
            if(h.equals("no") )
                break First;
            else
                continue First;
        }

        }

}