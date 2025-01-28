import java.util.Scanner;

public class AthletePark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the three sides of the triangle: ");
        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        double side3 = sc.nextDouble();
        
        int rounds = calculateRounds(side1, side2, side3);
        System.out.println("The number of rounds to complete a 5 km run is " + rounds);
        
        sc.close();
    }
    
    public static int calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        double distance = 5000; 
        return (int) Math.ceil(distance / perimeter);
    }
}