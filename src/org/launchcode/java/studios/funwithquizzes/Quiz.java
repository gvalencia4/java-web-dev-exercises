package org.launchcode.java.studios.funwithquizzes;

import java.util.ArrayList;

public class Quiz {
    ArrayList<Question> questions;
    int score = 0;

    Quiz (ArrayList<Question> questions) {
        this.questions = questions;
    }

    public void gradeQuiz() {
        int counter = 1;
        for(Question q : questions) {

            System.out.printf("Question %d:\n", counter++);

            q.askQuestion();
            if (q.grade()) {
                score++;
                System.out.println("Correct!\n");
            } else {
                System.out.println("False.\n");
            }
        }

        System.out.printf("Your final score is: %d / %d\n", score, questions.size());
    }
}
