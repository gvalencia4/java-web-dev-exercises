package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double r = 0; // radius
        boolean worky = false;
        Scanner input;

        // Radius must be a number and positive
        do {
            input = new Scanner(System.in);
            System.out.print("Enter a radius: ");
            if (input.hasNextDouble()) {
                r = input.nextDouble();
                if (r < 0) {
                    System.out.println("No worky, please give a positive number.");
                } else {
                    worky = true;
                }
            } else {
                System.out.println("No worky, please give a number.");
            }
        } while (!worky);

        // Area
        double area = Circle.getArea(r);
        area = DoubleRound(area, 3);
        System.out.println("The area of a circle of radius " + r + " is: " + area);
    }
    public static Double DoubleRound(Double number, Integer zeroes) {
        double x = Math.pow(10, zeroes);
        return (double) Math.round(number * x) / x;
    }
}

