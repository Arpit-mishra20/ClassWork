import java.util.Scanner;
public class RemoveString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.print("Enter character to remove: ");
        char charToRemove = sc.next().charAt(0);
        sc.close();

        String modifiedStr = removeCharacter(str, charToRemove);
        System.out.println("Modified String: " + modifiedStr);
    }

    public static String removeCharacter(String str, char charToRemove) {
        return str.replaceAll(String.valueOf(charToRemove), "");
    }
}