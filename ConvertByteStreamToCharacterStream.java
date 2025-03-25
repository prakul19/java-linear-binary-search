import java.io.*;

public class ConvertByteStreamToCharacterStream {
    public static void main(String[] args) {
        String filePath = "example3.txt"; // File path

        try (FileInputStream fis = new FileInputStream(filePath);
             InputStreamReader isr = new InputStreamReader(fis, "UTF-8"); // Specify the charset
             BufferedReader br = new BufferedReader(isr)) {

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (UnsupportedEncodingException e) {
            // Handle encoding issues
            System.out.println("The specified charset is unsupported: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}

/*
Output:
Hello, world!
UTF-8 encoding is working.
 */