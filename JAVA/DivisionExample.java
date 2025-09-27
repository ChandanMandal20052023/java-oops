import java.util.Scanner;

public class DivisionExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numerator: ");
        int numerator = sc.nextInt();
        System.out.print("Enter denominator: ");
        int denominator = sc.nextInt();
        // Division with exception handling
        try {
            int result = numerator / denominator;  // integer division
            double resultDouble = (double) numerator / denominator; // precise division
            System.out.println("Division Result: " + result);
            System.out.println("Division Result: " + resultDouble);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed!");
        }
        sc.close();
    }
}
