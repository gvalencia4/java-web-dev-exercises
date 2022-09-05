package exercises.lsn2controlflowandcollections;

import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {
        int[] anotherArray = {1, 1, 2, 3, 5, 8};

        System.out.println("All elements:");
        for (int element : anotherArray) {
            System.out.println(element);
        }

        System.out.println("\nOdd elements:");
        for (int element : anotherArray) {
            if (element % 2 != 0) {
                System.out.println(element);
            }
        }

        System.out.println("\nLet's split up a string by spaces:");
        String longString = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] splitString = longString.split(" ");
        System.out.println(Arrays.toString(splitString));

        System.out.println("\nLet's split up a string by sentences:");
        String[] splitSentenceString = longString.split("\\.");
        System.out.println(Arrays.toString(splitSentenceString));
    }

}
