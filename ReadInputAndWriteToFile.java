import java.io.*;

public class ReadInputAndWriteToFile {
    public static void main(String[] args) {
        String filePath = "output.txt";

        try (InputStreamReader isr = new InputStreamReader(System.in);
             BufferedReader br = new BufferedReader(isr);
             FileWriter writer = new FileWriter(filePath)) {
            System.out.println("Enter text to write to the file (type 'exit' to stop):");
            String userInput;
            while (true) {
                userInput = br.readLine();
                // Check for exit condition
                if (userInput.equalsIgnoreCase("exit")) {
                    break;
                }
                // Write input to the file
                writer.write(userInput + System.lineSeparator());
            }
            System.out.println("All inputs have been written to " + filePath);

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
