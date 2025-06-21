import java.util.Scanner;

// CALCULATOR
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        char operator;
        double num1;
        double num2;
        double result = 0;
        boolean isValid = true;

        System.out.print("Enter an operator (+, -, *, /, ^): ");
        operator = scanner.next().charAt(0);
        System.out.print("Enter the first number: ");
        num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        num2 = scanner.nextInt();

        switch(operator){
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if(num2 == 0){
                    isValid = false;
                    System.out.println("Cannot divide by 0!");
                }else {
                    result = num1 / num2;
                }
            }
            case '^' -> result = Math.pow(num1,num2);
            default -> {
                isValid = false;
                System.out.println("Invalid operator!");
            }
        };

        if(isValid){
            System.out.println("Result: " + result);
        }

        scanner.close();
    }
}