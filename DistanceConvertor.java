import java.util.Scanner;

public class DistanceConvertor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the distance in kilometers: ");
        double km = sc.nextDouble();
        
        // Conversion formula: 1 mile = 1.6 km
        double miles = km / 1.6;
        
        System.out.printf("The total miles is %.2f mile for the given %.2f km%n", miles, km);
        
        sc.close();
    }
}
