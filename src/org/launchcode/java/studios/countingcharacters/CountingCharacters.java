package org.launchcode.java.studios.countingcharacters;

// Count characters in a string, either from the console or from a file.
// Can I make this a CLI tool?
public class CountingCharacters {
    public static void main(String[] args) {
        String hiddenFigures =
                "If the product of two terms is zero then common sense says at" +
                        " least one of the two terms has to be zero to start " +
                        "with. So if you move all the terms over to one side," +
                        " you can put the quadratics into a form that can be " +
                        "factored allowing that side of the equation to equal" +
                        " zero. Once you’ve done that, it’s pretty " +
                        "straightforward from there.";

        // Convert a string into an array of characters
        char[] charactersInString = hiddenFigures.toCharArray();

        // As new characters are found, add them to the hash map
        // Constraints on what is counted should be added here
    }
}
