public class BinarySearchFindPeakElement {
    public static int findPeakElement(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // Check conditions to determine peak element
            if (arr[mid] > arr[mid + 1]) {
                // Potential peak; search the left side
                right = mid;
            } else {
                // Peak must be on the right side
                left = mid + 1;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1};

        // Find and print the peak element index
        int peakIndex = findPeakElement(arr);
        System.out.println("The peak element is at index: " + peakIndex);
        System.out.println("The peak element is: " + arr[peakIndex]);
    }
}

/*
Input:
Array: {1, 2, 3, 1}

Output:
The peak element is at index: 2
The peak element is: 3
 */