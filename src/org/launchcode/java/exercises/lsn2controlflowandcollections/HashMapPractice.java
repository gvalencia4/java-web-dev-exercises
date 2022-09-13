package org.launchcode.java.exercises.lsn2controlflowandcollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<String, String> students = new HashMap<>();

        String newStudentID;
        System.out.println("Enter your student's ID # (or ENTER to finish):");

        // Get student names and ID numbers
        do {
            System.out.print("ID #: ");
            newStudentID = input.next();

            if (!newStudentID.equals("")) {
                System.out.print("Student Name: ");
                String newStudent = input.next();
                students.put(newStudentID, newStudent);

                // Read in the newline before looping back
                input.nextLine();
            }

        } while(!newStudentID.equals(""));

        // Print class roster
        System.out.println("\nClass roster:");

        for (Map.Entry<String, String> student : students.entrySet()) {
            System.out.println(student.getKey() + " (" + student.getValue() + ")");
        }
    }
}
