import java.util.Scanner;

public class Week_7_ST_2 {
 public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Muhammad Haiqal Bin Helmy DCNG04

        System.out.print("Enter num1: ");
        double num1 = input.nextDouble();

        System.out.print("Enter num2: ");
        double num2 = input.nextDouble();

        System.out.println("Here is the menu:");
        System.out.println("Add");
        System.out.println("Subtract");
        System.out.println("Multiply");
        System.out.println("Divide");

        System.out.print("Enter your choice: ");
        String choice = input.next();

        double result = 0;

        if (choice.equalsIgnoreCase("add")) {
            result = num1 + num2;
        } else if (choice.equalsIgnoreCase("subtract")) {
            result = num1 - num2;
        } else if (choice.equalsIgnoreCase("multiply")) {
            result = num1 * num2;
        } else if (choice.equalsIgnoreCase("divide")) {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Error: Cannot divide by zero.");
                return;
            }
        } else {
            System.out.println("Invalid choice.");
            return;
        }

        System.out.println("You selected: " + choice);
        System.out.println("The answer is: " + result);
    }
}