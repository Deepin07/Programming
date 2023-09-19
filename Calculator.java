import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner cal = new Scanner(System.in);

        double num1, num2, result;
        char operator;

        System.out.println("Enter your First number");
        num1 = cal.nextDouble();

        System.out.println("Enter an operator (+, -, *, /)");
        operator = cal.next().charAt(0);

        System.out.println("Enter your Second number");
        num2 = cal.nextDouble();

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("result - " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println("result - " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println("result - " + result);
                break;

            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result - " + result);

                } else {
                    System.err.println("Error : Divided By Zero");
                }
                break;
            default:
                System.out.println("Error : Invalid operation");
        }

        cal.close();

    }

}