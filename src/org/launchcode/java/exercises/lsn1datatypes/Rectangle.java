package org.launchcode.java.exercises.lsn1datatypes;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Let's calculate the area of a rectangle.");
        System.out.println("Length: ");
        int length = input.nextInt();
        System.out.println("Width: ");
        int width = input.nextInt();

        int area = length * width;

        System.out.println("The area of this rectangle is: " + area);

    }
}
