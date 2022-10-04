package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();

        System.out.println("Before:");
        for(Flavor f : flavors) {
            System.out.println(f.getName());
        }

        // Use a Comparator class to sort the 'flavors' array alphabetically by the 'name' field.
        // flavors.sort(new FlavorComparator());
        System.out.println("After:");
        Comparator<Flavor> comparatorF = new FlavorComparator();
        flavors.sort(comparatorF);

        for(Flavor f : flavors) {
            System.out.println(f.getName());
        }
        System.out.println();

        //Use a Comparator class to sort the 'cones' array in increasing order by the 'cost' field.
        System.out.println("Before:");
        for(Cone c : cones) {
            System.out.printf("$%.2f - %s\n", c.getCost(), c.getName());
        }

        Comparator<Cone> comparatorC = new ConeComparator();
        cones.sort(comparatorC);

        System.out.println("After:");
        for(Cone c : cones) {
            System.out.printf("$%.2f - %s\n", c.getCost(), c.getName());
        }
        System.out.println();
    }
}
