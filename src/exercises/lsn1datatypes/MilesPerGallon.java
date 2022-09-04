package exercises.lsn1datatypes;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Let's see how efficient your vehicle is.");

        System.out.println("Miles driven: ");
        double miles = input.nextDouble();
        System.out.println("Gallons of fuel used: ");
        double fuel = input.nextDouble();

        double mpg = miles/fuel;

        System.out.println("Your MPG is: " + mpg);

    }
}
