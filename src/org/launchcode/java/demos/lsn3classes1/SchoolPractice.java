package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student aStudent = new Student("Gabe", 1134, 1, 4.0);
        System.out.println(aStudent.getName());
    }

    public class Teacher {
        private String firstName;
        private String lastName;
        private String subject;
        private int yearsTeaching;

        // Getters
        public String getFirstName() {
            return firstName;
        }
        public String getLastName() {
            return lastName;
        }
        public String getSubject() {
            return subject;
        }
        public int getYearsTeaching() {
            return yearsTeaching;
        }

        // Setters
        private void setFirstName(String aFirstName) {
            this.firstName = aFirstName;
        }
        private void setLastName(String aLastName) {
            this.lastName = aLastName;
        }
        private void setSubject(String aSubject) {
            this.subject = aSubject;
        }
        private void setYearsTeaching(int aYearsTeaching) {
            this.yearsTeaching = aYearsTeaching;
        }
    }

    public class Course {
        private String topic;
        private Teacher instructor;
        private ArrayList<Student> enrolledStudents;
    }
}
