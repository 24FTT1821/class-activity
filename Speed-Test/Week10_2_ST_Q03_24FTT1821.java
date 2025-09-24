import java.util.Random;
import java.util.Scanner;

public class Week10_2_ST_Q03_24FTT1821 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a word: ");
            String word = input.nextLine();

            if (word.length() == 0) {
                System.out.println("You must enter at least one word!");
                continue;
            }

            StringBuilder result = new StringBuilder();

            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);

         
                if (i % 2 == 0) {
                    result.append(Character.toUpperCase(ch));  
                } else {
                    result.append(Character.toLowerCase(ch));  
                }
            }

            System.out.println(result.toString());
        }
    }
}