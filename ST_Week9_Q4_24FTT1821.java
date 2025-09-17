import java.util.Scanner;

public class ST_Week9_Q4_24FTT1821 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = input.nextLine();

        System.out.println("Spelling it backward...");
        for (int R = word.length() - 1; R >= 0; R--) {
            System.out.print(word.charAt(R));
        }
        input.close();
    }
}