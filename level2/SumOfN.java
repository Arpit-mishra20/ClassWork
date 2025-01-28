import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a natural number: ");
        int n = sc.nextInt();
        
        if (n < 1) {
            System.out.println("Please enter a natural number greater than 0.");
            return;
        }
        
        int recursiveSum = sumOfNaturalNumbers(n);
        int formulaSum = formulaSumOfNaturalNumbers(n);
        
        System.out.println("Sum using recursion: " + recursiveSum);
        System.out.println("Sum using formula: " + formulaSum);
        
        if (recursiveSum == formulaSum) {
            System.out.println("Both results are correct and equal.");
        } else {
            System.out.println("Results do not match.");
        }
        
        sc.close();
    }
    
    public static int sumOfNaturalNumbers(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumOfNaturalNumbers(n - 1);
    }
    
    public static int formulaSumOfNaturalNumbers(int n) {
        return n * (n + 1) / 2;
    }
}
