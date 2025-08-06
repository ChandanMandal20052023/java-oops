
import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double number1, number2, result;
        char operator;

        System.out.print("Enter first number: ");
        number1 = sc.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        operator = sc.next().charAt(0);

        System.out.print("Enter second number: ");
        number2 = sc.nextDouble();
        switch (operator) {
            case '+':
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;

            case '-':
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;

            case '*':
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;

            case '/':
                if (number2 == 0) {
                    System.out.println("Error! Cannot divide by zero.");
                } else {
                    result = number1 / number2;
                    System.out.println(number1 + " / " + number2 + " = " + result);
                }
                break;

            default:
                System.out.println("Invalid operator! Please use +, -, *, or /.");
                break;
        }
    }
}