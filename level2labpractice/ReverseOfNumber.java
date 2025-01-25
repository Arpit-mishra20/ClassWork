import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

       
        int temp = number;
        int count = 0;
        while (temp != 0) {
            temp /= 10;
            count++;
        }

        
        int[] digits = new int[count];
        temp = number;

       
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10; 
            temp /= 10;
        }

        System.out.print("Reversed number: ");
        for (int digit : digits) {
            System.out.print(digit);
        }
        System.out.println();

        sc.close();
    }
}
