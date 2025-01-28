import java.util.Scanner;

public class MaxHandShake2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number of students: ");
        int numberOfStudents = sc.nextInt();
        
        int handshakes = calculateHandshakes(numberOfStudents);
        System.out.println("The maximum number of handshakes is " + handshakes);
        
        sc.close();
    }
    
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }
}