package org.launchcode.java.studios.funwithquizzes;
import java.util.Scanner;

public class MultipleChoice extends Question {

    private final String questionString;
    private final String[] choicesStrings;
    private final int answer;

    MultipleChoice (String questionString, String[] choicesStrings, int answer) {
        this.questionString = questionString;
        this.choicesStrings = choicesStrings;
        this.answer = answer;
    }


    @Override
    void askQuestion() {
        int choiceNum = 1;
        System.out.println(questionString);

        // Display choices for user to pick from
        for (String choice : choicesStrings) {
            System.out.printf("%d. %s\n", choiceNum++, choice);
        }
    }

    @Override
    boolean grade() {
        Scanner input = new Scanner(System.in);
        int userChoice = input.nextInt();

        return userChoice == answer;
    }
}
