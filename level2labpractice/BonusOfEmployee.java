import java.util.Scanner;

public class BonusOfEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int NUMBER_OF_EMPLOYEES = 10;
        double[] salaries = new double[NUMBER_OF_EMPLOYEES];
        double[] yearsOfService = new double[NUMBER_OF_EMPLOYEES];
        double[] bonuses = new double[NUMBER_OF_EMPLOYEES];
        double[] newSalaries = new double[NUMBER_OF_EMPLOYEES];
        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        for (int i = 0; i < NUMBER_OF_EMPLOYEES; i++) {
            while (true) {
                System.out.print("Enter salary for employee " + (i + 1) + ": ");
                salaries[i] = sc.nextDouble();
                if (salaries[i] < 0) {
                    System.out.println("Invalid salary. Please enter a positive number.");
                    continue;
                }

                System.out.print("Enter years of service for employee " + (i + 1) + ": ");
                yearsOfService[i] = sc.nextDouble();
                if (yearsOfService[i] < 0) {
                    System.out.println("Invalid years of service. Please enter a positive number.");
                    continue;
                }
                break;
            }
        }

        for (int i = 0; i < NUMBER_OF_EMPLOYEES; i++) {
            if (yearsOfService[i] > 5) {
                bonuses[i] = salaries[i] * 0.05;
            } else {
                bonuses[i] = salaries[i] * 0.02;
            }
            newSalaries[i] = salaries[i] + bonuses[i];
            totalBonus += bonuses[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);

        sc.close();
    }
}
