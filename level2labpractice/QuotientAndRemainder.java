import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number (number1): ");
        int number1 = scanner.nextInt();
        
        System.out.print("Enter the second number (number2): ");
        int number2 = scanner.nextInt();
        
        int quotient = number1 / number2;
        int remainder = number1 % number2;
        
        System.out.printf("The Quotient is %d and Remainder is %d of two numbers %d and %d%n", quotient, remainder, number1, number2);
        
        scanner.close();
    }
}