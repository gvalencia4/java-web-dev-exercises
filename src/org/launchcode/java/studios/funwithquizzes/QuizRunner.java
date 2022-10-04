package org.launchcode.java.studios.funwithquizzes;

import java.util.ArrayList;

public class QuizRunner {
    public static void main(String[] args) {
        // Initialize questions
        MultipleChoice aMultipleChoiceQuestion = new MultipleChoice("What is the first letter in LOVE?", new String[]{"V", "O", "L", "E"}, 3);
        TrueFalse aTrueFalse = new TrueFalse("10 * 10 = 100", 1);
        CheckBox aCheckBox = new CheckBox("Which of these letters are vowels?", new String[] {"a", "12", "b", "e"}, new String[] {"1", "4"});

        // Add each question to an ArrayList
        ArrayList<Question> questionList = new ArrayList<>();
        questionList.add(aMultipleChoiceQuestion);
        questionList.add(aTrueFalse);
        questionList.add(aCheckBox);

        // Create a quiz
        Quiz theQuiz = new Quiz(questionList);

        // Grade the quiz
        theQuiz.gradeQuiz();
    }


}
