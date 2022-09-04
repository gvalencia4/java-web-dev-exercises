package exercises.lsn1datatypes;

import java.util.Scanner;

public class AliceSlice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String aliceText = "Alice was beginning to get very tired of sitting " +
                "by her sister on the bank, and of having nothing to do: " +
                "once or twice she had peeped into the book her sister was " +
                "reading, but it had no pictures or conversations in it, " +
                "'and what is the use of a book,' thought Alice 'without " +
                "pictures or conversation?";
        aliceText = aliceText.toLowerCase();
        boolean wasFound;
        boolean riddleSolved = false;
        String riddleAnswer = "it is not";
        String query;

        System.out.println("Search for a word or phrase within the first sentence of Alice and Wonderland.");
        System.out.println("To escape, answer this riddle: \"Why is a raven like a writing desk?\"");

        do {
            System.out.println();
            System.out.println("Type your word or phase:");
            query = input.nextLine();
            query = query.toLowerCase();
            wasFound = aliceText.contains(query);

            if (query.equals(riddleAnswer)) {
                riddleSolved = true;
            } else if (!wasFound) {
                System.out.println("Word was not found.");
            } else {
                System.out.println("SNIP!!");
                aliceText = aliceText.replace(query, "");
                System.out.println("'" + aliceText + "'");
            }
        } while (!riddleSolved);
        System.out.println("You are free!!");
        System.out.println("\uD83D\uDC07☕️\uD83C\uDFA9\uD83C\uDF70\uD83C\uDCCF\uD83E\uDE84\uD83E\uDED6\uD83D\uDC01\uD83C\uDF44\uD83D\uDC90⏱️\uD83D\uDC08\u200D⬛\uD83D\uDD2E");
    }
}