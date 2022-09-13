package org.launchcode.java.studios.countingcharacters;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import static java.lang.Character.toUpperCase;

// Count characters in a string, either from the console or from a file.
// Can I make this a CLI tool?
public class CountingCharacters {
    public static void main(String[] args) throws Exception {

        // Get file location
        String filePath = "/Users/gabrielvalencia/LC101/Java/java-web-dev-exercises/src/org/launchcode/java/studios/countingcharacters/read_this_text.txt";
        String textString = readFileAsString(filePath);

        // Convert a string into an array of characters
        char[] characterArray = textString.toCharArray();

        // HashMap <letter, charactersCounted>
        HashMap<String, Integer> charactersCounted = new HashMap<>();

        // Loop through each letter in the array of chars
        for (char letter : characterArray) {
            // Make case-insensitive
            letter = toUpperCase(letter);

            // Increment the value (count) for each letter.
            // If a key is not found, a new one is added via getOrDefault
            charactersCounted.put(String.valueOf(letter), charactersCounted.getOrDefault(String.valueOf(letter), 0) + 1);
        }

        // Print map to console
        for (Map.Entry<String, Integer> pair : charactersCounted.entrySet()) {
            System.out.println(pair.getKey() + " (" + pair.getValue() + ")");
        }

    }

    // Takes a path to a text file and returns the contents of the file as a string
    public static String readFileAsString(String filePath) throws Exception {
        String data;
        data = new String(Files.readAllBytes(Paths.get(filePath)));
        return data;
    }
}
