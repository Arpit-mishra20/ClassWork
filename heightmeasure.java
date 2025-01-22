import java.util.Scanner;

public class heightmeasure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your height in centimeters: ");
        double heightCm = sc.nextDouble();
        
        double cmPerInch = 2.54;
        double inchesPerFoot = 12.0;
        
        double heightInches = heightCm / cmPerInch;
        
        int feet = (int) (heightInches / inchesPerFoot);
        double remainingInches = heightInches % inchesPerFoot;
        
        System.out.printf("Your Height in cm is %.2f while in feet is %d and inches is %.2f%n", heightCm, feet, remainingInches);
        
        sc.close();
    }
}
