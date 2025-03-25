public class BinarySearchFindRotationPoint {
    public static int findRotationPoint(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // If mid element is greater than the rightmost element,
            // the smallest element is in the right half
            if (arr[mid] > arr[right]) {
                left = mid + 1;
            }
            // Otherwise, the smallest element is in the left half
            else {
                right = mid;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] arr = {6, 7, 9, 1, 2, 3, 4, 5};

        // Find and print the rotation point
        int rotationPoint = findRotationPoint(arr);
        System.out.println("The rotation point (index of smallest element) is: " + rotationPoint);
    }
}

/*
Input:
Array: {6, 7, 9, 1, 2, 3, 4, 5}

Output:
The rotation point (index of smallest element) is: 3
 */