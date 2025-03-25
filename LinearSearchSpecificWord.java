import java.util.Scanner;

public class LinearSearchSpecificWord {
    public static String findSentenceWithWord(String[] sentences, String word) {
        for (String sentence : sentences) {
            // Check if the sentence contains the specific word
            if (sentence.contains(word)) {
                return sentence; // Return the first matching sentence
            }
        }
        // Return "Not Found" if no sentence contains the word
        return "Not Found";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the number of sentences: ");
            int n = scanner.nextInt();
            scanner.nextLine();

            String[] sentences = new String[n];

            System.out.println("Enter the sentences:");
            for (int i = 0; i < n; i++) {
                sentences[i] = scanner.nextLine();
            }
            System.out.print("Enter the word to search: ");
            String word = scanner.nextLine();

            // Find the first sentence containing the word
            String result = findSentenceWithWord(sentences, word);

            if (!result.equals("Not Found")) {
                System.out.println("The first sentence containing the word \"" + word + "\" is:");
                System.out.println(result);
            } else {
                System.out.println("No sentence contains the word \"" + word + "\".");
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

/*
Input:
Enter the number of sentences: 3
Enter the sentences:
Hello, what's up!
Hi, what's up!
Hey, what's up!
Enter the word to search: up

Output:
The first sentence containing the word "up" is:
Hello, what's up!
 */