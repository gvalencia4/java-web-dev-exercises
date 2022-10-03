package org.launchcode.java.exercises.lsn6inheritance.main;

public class Laptop extends Computer {

    private int keyboardBrightness;
    private boolean trackpadOn;

    public Laptop(String user, String os, String pw) {
        super(user, os, pw);
        trackpadOn = true;
    }

    @Override
    public String toString() {
        return String.format("Hello %s! You are using %s.", getUser(), getOs());
    }

    public void trackpadToggle() {
        trackpadOn = !trackpadOn;
        System.out.println("Trackpad On: " + trackpadOn);
    }
}
