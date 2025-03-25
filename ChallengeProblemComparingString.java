import java.io.*;

public class ChallengeProblemComparingString {
    public static void main(String[] args) {
        //Compare StringBuilder and StringBuffer
        compareStringBuilderAndStringBuffer();

        //Compare FileReader and InputStreamReader for word counting
        String filePath = "largefile.txt";
        countWordsUsingFileReader(filePath);
        countWordsUsingInputStreamReader(filePath);
    }

    private static void compareStringBuilderAndStringBuffer() {
        int iterations = 1_000_000; // Number of concatenations
        String text = "hello";

        // Measure time for StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        long startTimeBuilder = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            stringBuilder.append(text);
        }
        long endTimeBuilder = System.nanoTime();
        System.out.println("Time taken by StringBuilder: " + (endTimeBuilder - startTimeBuilder) + " nanoseconds");

        // Measure time for StringBuffer
        StringBuffer stringBuffer = new StringBuffer();
        long startTimeBuffer = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            stringBuffer.append(text);
        }
        long endTimeBuffer = System.nanoTime();
        System.out.println("Time taken by StringBuffer: " + (endTimeBuffer - startTimeBuffer) + " nanoseconds");
    }

    private static void countWordsUsingFileReader(String filePath) {
        long startTime = System.nanoTime();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            int wordCount = 0;

            // Count words
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }

            long endTime = System.nanoTime();
            System.out.println("Word count using FileReader: " + wordCount);
            System.out.println("Time taken by FileReader: " + (endTime - startTime) + " nanoseconds");
        } catch (IOException e) {
            System.out.println("An error occurred while reading with FileReader: " + e.getMessage());
        }
    }

    private static void countWordsUsingInputStreamReader(String filePath) {
        long startTime = System.nanoTime();
        try (InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath), "UTF-8");
             BufferedReader br = new BufferedReader(isr)) {
            String line;
            int wordCount = 0;

            // Count words
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }

            long endTime = System.nanoTime();
            System.out.println("Word count using InputStreamReader: " + wordCount);
            System.out.println("Time taken by InputStreamReader: " + (endTime - startTime) + " nanoseconds");
        } catch (IOException e) {
            System.out.println("An error occurred while reading with InputStreamReader: " + e.getMessage());
        }
    }
}

/*
Output:
Time taken by StringBuilder: 13206541 nanoseconds
Time taken by StringBuffer: 16932541 nanoseconds
Word count using FileReader: 146
Time taken by FileReader: 2668458 nanoseconds
Word count using InputStreamReader: 146
Time taken by InputStreamReader: 1826792 nanoseconds
 */