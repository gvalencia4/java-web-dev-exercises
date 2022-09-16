package org.launchcode.java.studios.countingcharacters;

import java.awt.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import static java.lang.Character.toUpperCase;
import java.util.Scanner;

// Count characters in a string, either from the console or from a file.
// Can I make this a CLI tool?
public class CountingCharacters {
    public static void main(String[] args) throws Exception {

        // Prompt user for file or typed string
        Scanner input;
        input = new Scanner(System.in);
        System.out.print("Type a string or '/' to select you own text file: ");
        String textString = input.nextLine();

        if (textString.equals("")) {
            // Get default file location
            String filePath = "/Users/gabrielvalencia/LC101/Java/java-web-dev-exercises/src/org/launchcode/java/studios/countingcharacters/read_this_text.txt";
            textString = readFileAsString(filePath);
        } else if (textString.charAt(0) == '/') {
            // Select file from prompt

            // NOTE, as per: https://stackoverflow.com/questions/1241984/need-filedialog-with-a-file-type-filter-in-java
            // "AWT isn't really the preferred way of writing Java GUI apps these days. Sun seems to have mostly abandoned it.
            // The two most popular options are Swing and SWT. So I think they didn't really develop the APIs very extensively
            // to add modern features. (err, to answer your question: No you don't appear to be able to do that with AWT)"

            FileDialog dialog = new FileDialog((Frame)null, "Select File to Open");
            dialog.setMode(FileDialog.LOAD);
            dialog.setVisible(true);
            dialog.isModal();

            // Program will get caught if user clicks away from the window, setModalityType doesn't work (maybe this would work in a browser)
            dialog.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);

            // Limit file selection to text files (works, but only for a second)
            // dialog.setFilenameFilter("*.txt;");

            // Return filepath and get string within .txt
            String filePath = dialog.getDirectory() + dialog.getFile();
            System.out.print(filePath);
            textString = readFileAsString(filePath);
        }

        // Remove non-alpha characters (thanks Toby)
        textString = textString.replaceAll("[^a-zA-Z]", "");

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
