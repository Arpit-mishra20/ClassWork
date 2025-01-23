import java.util.sc;

public class Bonus {
    public static void main(String[] args) {
        sc sc = new sc(System.in);
        System.out.print("Enter the employee salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter the years of service: ");
        int yearsOfService = sc.nextInt();
        double bonus = 0.0;
        if (yearsOfService > 5) {
            bonus = salary * 0.05; // 5% bonus
        }
        System.out.println("The bonus amount is: " + bonus);
        sc.close();
    }
}