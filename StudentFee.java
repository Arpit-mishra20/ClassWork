import java.util.Scanner;

public class StudentFee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the student fee (INR): ");
        double fee = sc.nextDouble();
        
        System.out.print("Enter the discount percentage: ");
        double discountPercent = sc.nextDouble();
        
        double discount = (discountPercent / 100) * fee;
        
        double finalFee = fee - discount;
        
        System.out.printf("The discount amount is INR %.2f and final discounted fee is INR %.2f%n", discount, finalFee);
        
        sc.close();
    }
}
