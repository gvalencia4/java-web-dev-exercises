package org.launchcode.java.studios.funwithquizzes;


import java.util.Arrays;
import java.util.Scanner;

public class CheckBox extends Question {
    private final String questionString;
    private final String[] choicesStrings;
    private final String[] answer;

    CheckBox (String questionString, String[] choicesStrings, String[] answer) {
        this.questionString = questionString;
        this.choicesStrings = choicesStrings;
        this.answer = answer;
    }


    @Override
    void askQuestion() {
        int choiceNum = 1;
        System.out.println(questionString);
        System.out.println("Note: Answer must be in the form of comma separated numbers, no spaces, in descending order. (i.e. 1,3,4 NOT 3,1,4)");

        // Display choices for user to pick from
        for (String choice : choicesStrings) {
            System.out.printf("%d. %s\n", choiceNum++, choice);
        }
    }

    @Override
    boolean grade() {
        Scanner input = new Scanner(System.in);
        String userChoices = input.next();

        String[] userChoicesList = userChoices.split(",");

        return Arrays.equals(userChoicesList, answer);

    }
}
