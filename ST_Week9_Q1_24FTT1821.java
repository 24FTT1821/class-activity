import java.util.Scanner;

public class ST_Week9_Q1_24FTT1821 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

         System.out.print("Enter start num: ");
        int start = input.nextInt();

        System.out.print("Enter end num: ");
        int end = input.nextInt();

        for (int s = start; s <= end; s++) {
            System.out.print(s + " ");
        }

        input.close();
    }
}
