import java.util.sc;

public class Factorial {
    public static void main(String[] args) {
        sc sc = new sc(System.in);
        
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt(); 
        if (number < 0) {
            System.out.println("Factorial is not for negative numbers");
        } else {
            long factorial = 1;
            int counter = 1;
            while (counter <= number) {
                factorial *= counter;
                counter++;
            }            
            System.out.println("The factorial of " + number + " is: " + factorial);
        }        
        sc.close();
    }
}