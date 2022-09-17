package org.launchcode.java.demos.lsn4classes2;

import java.util.ArrayList;
import java.util.Objects;

public class Course {
    private String topic;
    private Teacher instructor;
    private ArrayList<Student> enrolledStudents;

    public Course(String topic, Teacher instructor) {
        this.topic = topic;
        this.instructor = instructor;
    }

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather than
    //  just the class fields.

    @java.lang.Override
    public java.lang.String toString() {
        return String.format("This is %s, taught by %s %s.", this.topic, this.instructor.getFirstName(), this.instructor.getLastName());
        // String.format("%s is a %s with %d credits and a GPA of %.2f", this.name, this.getGradeLevel(this.numberOfCredits), this.getNumberOfCredits(), this.getGpa());
//                "Course{" +
//                "topic='" + topic + '\'' +
//                ", instructor=" + instructor +
//                ", enrolledStudents=" + enrolledStudents +
//                '}';
    }


    // TODO Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Course objects equal.

    public boolean equals(Course courseToBeCompared) {
        if (topic == courseToBeCompared.topic) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(topic);
    }

    public static void main(String[] args) {
        Teacher bob = new Teacher("Bob", "The Builder", "Math", 10);
        Teacher henry = new Teacher("Henry", "The Coder", "Math", 2);

        Course math101bob = new Course("Math 101", bob);
        Course math101henry = new Course("Math 101", henry);
        Course cs50 = new Course("CS50", henry);

        System.out.println(math101bob.toString());
        System.out.println(cs50.toString());
        System.out.println("Are these equal?");
        System.out.println(math101bob.equals(cs50) + "\n");

        System.out.println(math101bob.toString());
        System.out.println(math101henry.toString());
        System.out.println("Are these equal?");
        System.out.println(math101bob.equals(math101henry) + "\n");
    }
}


