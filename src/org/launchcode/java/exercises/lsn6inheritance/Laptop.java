package org.launchcode.java.exercises.lsn6inheritance;

public class Laptop extends Computer {

    private int keyboardBrightness;
    private boolean trackpadOn;

    Laptop() {

    }

    private void trackpadToggle() {
        trackpadOn = !trackpadOn;
        System.out.println("Trackpad On: " + trackpadOn);
    }
}
