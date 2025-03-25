import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountWordOccurrences {
    public static void main(String[] args) {
        String filePath = "example2.txt"; // File path
        String targetWord = "hello";    // Words to count

        int wordCount = 0; // Counter for occurrences

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            // Read each line from the file
            while ((line = br.readLine()) != null) {
                // Split the line into words
                String[] words = line.split("\\s+");

                // Count occurrences of the target word
                for (String word : words) {
                    if (word.equals(targetWord)) {
                        wordCount++;
                    }
                }
            }
            System.out.println("The word \"" + targetWord + "\" appears " + wordCount + " times in the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}

/*
Output:
The word "hello" appears 3 times in the file.
 */