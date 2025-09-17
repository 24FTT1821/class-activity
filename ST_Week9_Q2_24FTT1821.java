import java.util.Scanner;

public class ST_Week9_Q2_24FTT1821 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter start num: ");
        int start = input.nextInt();

        System.out.print("Enter end num: ");
        int end = input.nextInt();
        
        System.out.print("List of even: ");
        for (int s = start; s <= end; s++) {
            if (s % 2 == 0) {
            System.out.print(s + " ");
        }
    }
    
    System.out.println();

    System.out.print("List of odd: ");
    for (int s = start; s <= end; s++){
        if (s % 2 !=0){
            System.out.print(s + " ");
        }
    }
        input.close();
    }
}
