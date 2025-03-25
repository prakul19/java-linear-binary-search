public class BinarySearchIn2DMatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;
        int left = 0;
        int right = rows * cols - 1;

        // Perform binary search
        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Convert mid into row and column indices
            int row = mid / cols;
            int col = mid % cols;
            int midValue = matrix[row][col];

            if (midValue == target) {
                return true; // Target value found
            } else if (midValue < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }

        return false; // Target value not found
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };

        int target = 3;

        // Perform the search and print the result
        boolean result = searchMatrix(matrix, target);
        if (result) {
            System.out.println("The target " + target + " is found in the matrix.");
        } else {
            System.out.println("The target " + target + " is not found in the matrix.");
        }
    }
}

/*
Input:
Matrix:
[
    [1, 3, 5, 7],
    [10, 11, 16, 20],
    [23, 30, 34, 60]
]
Target: 3

Output:
The target 3 is found in the matrix.
 */