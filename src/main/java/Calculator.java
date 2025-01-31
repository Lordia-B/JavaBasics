import java.util.Scanner;
public class Calculator {

    // Method that contains the switch statement logic
    public int performOperation(int num1, int num2, char operator) {
        int result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    throw new ArithmeticException("Division by zero is not allowed.");
                }
                break;
            default:
                throw new IllegalArgumentException("Invalid operator!");
        }

        return result;
    }

    public class CalculatorApp {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Calculator calculator = new Calculator();

            // Input the first number
            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();

            // Input the second number
            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();

            // Input the operator
            System.out.print("Enter operation (+, -, *, /): ");
            char operator = scanner.next().charAt(0);
                int result = calculator.performOperation(num1, num2, operator);
                System.out.println("Result: " + result);
            }
            }
        }



