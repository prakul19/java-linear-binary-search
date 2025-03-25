import java.util.Arrays;

public class LinearAndBinarySearchChallenge {
    // Find the first missing positive integer
    public static int findFirstMissingPositive(int[] arr) {
        int n = arr.length;

        // Marking each number in the range [1, n] as visited
        for (int i = 0; i < n; i++) {
            while (arr[i] > 0 && arr[i] <= n && arr[arr[i] - 1] != arr[i]) {
                // Swap arr[i] and arr[arr[i]-1]
                int temp = arr[i];
                arr[i] = arr[temp - 1];
                arr[temp - 1] = temp;
            }
        }

        // Find the first positive integer that is not in place
        for (int i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }

        // If all positive integers from 1 to n are present, return n + 1
        return n + 1;
    }

    // Find the index of a target number
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Target found
            } else if (arr[mid] < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};
        int target = 4;

        // Find the first missing positive integer
        int firstMissingPositive = findFirstMissingPositive(arr);
        System.out.println("First missing positive integer: " + firstMissingPositive);

        // Sort the array for binary search
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        // Find the index of the target number
        int targetIndex = binarySearch(arr, target);
        if (targetIndex != -1) {
            System.out.println("The target " + target + " is at index: " + targetIndex);
        } else {
            System.out.println("The target " + target + " is not found in the array.");
        }
    }
}

/*
Input:
Array: {3, 4, -1, 1}
Target: 4

Output:
First missing positive integer: 2
Sorted array: [-1, 1, 3, 4]
The target 4 is at index: 3
 */