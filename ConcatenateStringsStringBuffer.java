public class ConcatenateStringsStringBuffer {
    public static void main(String[] args) {
        String[] strings = {"Hello", " ", "world", "!", " Welcome", " to", " Java."};

        try {
            // Using StringBuffer for efficient concatenation
            StringBuffer sb = new StringBuffer();
            for (String str : strings) {
                sb.append(str); // Append each string to StringBuffer
            }
            System.out.println("Concatenated string: " + sb.toString());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

/*
Output:
Hello world! Welcome to Java.
 */