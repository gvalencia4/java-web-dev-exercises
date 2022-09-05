package exercises.lsn2controlflowandcollections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(7);
        nums.add(6);
        nums.add(2);
        nums.add(9);
        nums.add(3);
        System.out.println("Even sum: " + evenSum(nums));

        ArrayList<String> words = new ArrayList<>();
        words.add("Hello");
        words.add("World");
        words.add("Molly");
        words.add("Brown");
        words.add("CLX");
        words.add("KCU");
        words.add("Smokestack");
        words.add("Fury");
        words.add("Loco");


        String longString = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] longStringSplit = longString.split(" ");
        ArrayList<String> longStringList = new ArrayList<>(Arrays.asList(longStringSplit));

        wordListPrint(words, 4);
        System.out.println();
        wordListPrint(longStringList, 5);
    }

    public static int evenSum(ArrayList<Integer> numList) {
        int sum = 0;
        for (int num : numList) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }
    // Removes "." and "," before checking word length
    public static void wordListPrint(ArrayList<String> wordList, int length) {
        for (String word : wordList) {
            word = word.replace(",", "");
            word = word.replace(".", "");
            if (word.length() == length) {
                System.out.println(word);
            }
        }
    }
}
