import java.util.Scanner;

public class SumTillZeroOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double total = 0.0;
        double userInput;

        System.out.println("Enter numbers :");
        
        while (true) {
            userInput = sc.nextDouble();
            
            if (userInput <= 0) {
                break; 
            }
            
            total += userInput; 
        }
        
        System.out.println("The total sum is: " + total);
        sc.close();
    }
}