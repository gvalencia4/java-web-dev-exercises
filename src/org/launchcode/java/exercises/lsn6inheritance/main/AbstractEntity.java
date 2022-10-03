package org.launchcode.java.exercises.lsn6inheritance.main;

abstract class AbstractEntity {
    private static int idCount = 1000;
    private final int ID;

    AbstractEntity () {
        ID = idCount++;
    }

    public int getID() {
        return ID;
    }
}
