import java.util.Scanner;

public class LinearSearchFirstNegativeNumber {
    public static int findFirstNegative(int[] array) {
        // Iterate through the array
        for (int i = 0; i < array.length; i++) {
            // Check if the current element is negative
            if (array[i] < 0) {
                return i; // Return the index of the first negative number
            }
        }
        // Return -1 if no negative number is found
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the number of elements in the array: ");
            int n = scanner.nextInt();
            int[] array = new int[n];
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }

            // Find the first negative number
            int result = findFirstNegative(array);

            if (result != -1) {
                System.out.println("The first negative number is at index: " + result);
            } else {
                System.out.println("No negative number found in the array.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

/*
Input:
Enter the number of elements in the array: 6
Enter the elements of the array:
3 5 7 -2 8 -4

Output:
The first negative number is at index: 3
 */