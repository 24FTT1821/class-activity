import java.util.Scanner;

public class Week10_2_ST_Q01c_24FTT1821 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a character: ");
            String str = input.next();

            if (str.length() == 0) {
                System.out.println("You must enter at least one character!");
                continue;
            }

            if (str.length() > 1) {
                System.out.println("you entered more than 1 character. The first character will be selected!");
            }

            char cr = Character.toLowerCase(str.charAt(0));
            cr = Character.toLowerCase(cr);

            if (cr == 'a' || cr == 'e' || cr == 'i' || cr == 'o' || cr == 'u' ){
                System.out.println("It is vowel");
            } 
            else {
                System.out.println("It is consonant");
            }
        }
    }
}
