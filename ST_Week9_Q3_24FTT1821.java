import java.util.Scanner;

public class ST_Week9_Q3_24FTT1821 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter how many words you want to enter: ");
        int K = input.nextInt();
        input.nextLine();

        for (int p = 0; p < K; p++) {
           System.out.print("Enter a word: ");
           String word = input.nextLine();
            System.out.println("The word "+ word + " has " + word.length() + " characters.");
        }
        input.close();
    }
}
