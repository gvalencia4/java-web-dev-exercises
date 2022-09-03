package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String aliceText = "Alice was beginning to get very tired of sitting " +
                "by her sister on the bank, and of having nothing to do: " +
                "once or twice she had peeped into the book her sister was " +
                "reading, but it had no pictures or conversations in it, " +
                "'and what is the use of a book,' thought Alice 'without " +
                "pictures or conversation?";
        aliceText = aliceText.toLowerCase();

        System.out.println("Search for a word or phrase within the first sentence of Alice and Wonderland.");
        System.out.println("Type your word or phase:");
        String query = input.nextLine();
        query = query.toLowerCase();

        boolean wasFound = aliceText.contains(query);

        System.out.println(wasFound);

    }
}


