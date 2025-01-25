import java.util.Scanner;

public class BMICalculation2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of individuals: ");
        int numberOfPersons = sc.nextInt();

        double[][] personData = new double[numberOfPersons][3];
        String[] weightStatus = new String[numberOfPersons];

        for (int i = 0; i < numberOfPersons; i++) {
            double weight;
            do {
                System.out.print("Enter weight (in kg) " + (i + 1) + ": ");
                weight = sc.nextDouble();
                if (weight < 0) {
                    System.out.println("enter a positive weight.");
                }
            } while (weight < 0);
            personData[i][1] = weight;

            double height;
            do {
                System.out.print("Enter height (in meters) " + (i + 1) + ": ");
                height = sc.nextDouble();
                if (height < 0) {
                    System.out.println("enter a positive height.");
                }
            } while (height < 0);
            personData[i][0] = height;

            personData[i][2] = weight / (height * height);
            weightStatus[i] = determineWeightStatus(personData[i][2]);
        }

        System.out.printf("%-10s %-10s %-10s %-15s%n", "Height", "Weight", "BMI", "Weight Status");
        System.out.println("-----------------------------------------------------");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s%n", personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }

        sc.close();
    }

    private static String determineWeightStatus(double bmi) {
        if (bmi <= 18.4) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            return "Normal";
        } else if (bmi >= 25 && bmi <= 39.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}
