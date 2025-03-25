import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileLineByLine {
    public static void main(String[] args) {
        String filePath = "example.txt"; // Specify the file path here

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            // Reading and printing each line
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            // Handle exceptions
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

/*
Output:
hello world
 */