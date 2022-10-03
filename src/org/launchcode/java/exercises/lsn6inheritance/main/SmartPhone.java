package org.launchcode.java.exercises.lsn6inheritance.main;

public class SmartPhone extends Computer {

    private int batteryPercent;

    public SmartPhone(String user, String os, String pw) {
        super(user, os, pw);
        batteryPercent = 100;
    }

    @Override
    public String toString() {
        return String.format("Hello %s! You are using %s. Battery is at %d%%.", getUser(), getOs(), getBatteryPercent());
    }

    public int getBatteryPercent() {
        return batteryPercent;
    }

    public void setBatteryPercent(int batteryPercent) {
        if (batteryPercent > 100) {
            batteryPercent = 100;
        } else if (batteryPercent < 0) {
            batteryPercent = 0;
        }

        this.batteryPercent = batteryPercent;
    }

    public void takePicture() {
        unlock();
        if (!this.checkUnlocked()) {
            return;
        }
        System.out.println();
        System.out.println("*click*");
        System.out.println();

        lock();
    }

}
