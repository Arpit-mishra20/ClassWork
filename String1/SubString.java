import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the main string: ");
        String mainString = sc.nextLine();
        System.out.print("Enter the substring: ");
        String subString = sc.nextLine();
        sc.close();

        int count = countOccurrences(mainString, subString);
        System.out.println("Occurrences of '" + subString + "': " + count);
    }

    public static int countOccurrences(String mainString, String subString) {
        int count = 0, index = 0;
        while ((index = mainString.indexOf(subString, index)) != -1) {
            count++;
            index += subString.length();
        }
        return count;
    }
}