public class BinarySearchFirstAndLastOccurrence {
    public static int findFirstOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid; // Update result and search in the left half
                right = mid - 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    public static int findLastOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid; // Update result and search in the right half
                left = mid + 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4, 5};
        int target = 2;

        // Find first and last occurrences
        int first = findFirstOccurrence(arr, target);
        int last = findLastOccurrence(arr, target);

        // Print the results
        if (first != -1 && last != -1) {
            System.out.println("First occurrence of " + target + " is at index: " + first);
            System.out.println("Last occurrence of " + target + " is at index: " + last);
        } else {
            System.out.println("Element " + target + " is not found in the array.");
        }
    }
}

/*
Input:
Array: {1, 2, 2, 2, 3, 4, 5}
Target: 2

Output:
First occurrence of 2 is at index: 1
Last occurrence of 2 is at index: 3
 */