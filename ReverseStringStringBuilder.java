import java.util.Scanner;

public class ReverseStringStringBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            // Using StringBuilder to reverse the string
            StringBuilder sb = new StringBuilder(input);
            String reversedString = sb.reverse().toString();
            System.out.println("Reversed string: " + reversedString);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

/*
Input:
hello

Output:
olleh
 */