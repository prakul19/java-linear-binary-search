import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicatesStringBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            // Using StringBuilder and HashSet to remove duplicates
            StringBuilder sb = new StringBuilder();
            HashSet<Character> seen = new HashSet<>();

            for (char c : input.toCharArray()) {
                if (!seen.contains(c)) {
                    sb.append(c); // Append character if not seen before
                    seen.add(c); // Add character to HashSet
                }
            }
            System.out.println("String without duplicates: " + sb.toString());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

/*
Input:
programming

Output:
String without duplicates: progamin
 */
