import java.util.Scanner;

public class Week10_2_ST_Q01a_24FTT1821 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

         while (true) {
            System.out.print("Enter a character: ");
            String str = input.next();

            char cr = Character.toLowerCase(str.charAt(0));

            if (cr == 'a' || cr == 'e' || cr == 'i' || cr == 'o' || cr == 'u' ){
                System.out.println("It is vowel");
            } 
            else {
                System.out.println("It is consonant");
            }
        }
    }
}
