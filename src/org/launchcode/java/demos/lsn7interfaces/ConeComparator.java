package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class ConeComparator implements Comparator<Cone> {

    @Override
    public int compare(Cone o1, Cone o2) {
        // signum() returns 1, 0, or -1 as needed
        return (int) Math.signum((o1.getCost() - o2.getCost()));
    }
}
