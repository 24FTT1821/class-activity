import java.util.Scanner;

public class Week10_2_ST_Q02_24FTT1821 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int reject = 0;
        
        while (reject < 3) {
            System.out.print("Enter a word that is more than 5 characters: ");
            String w = input.next();

            if (w.length() <= 5) {
                reject++;
                System.out.println("Word too short!");
            } 
            else {
                System.out.println(w.toUpperCase());
            }
        }
        System.out.println("Rejected words: " +reject+ ". Limit has been reached. Exiting now..");

        input.close();
    }
}