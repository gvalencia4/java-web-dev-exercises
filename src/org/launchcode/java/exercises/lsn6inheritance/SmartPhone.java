package org.launchcode.java.exercises.lsn6inheritance;

public class SmartPhone extends Computer {

    private int batteryPercent;

    SmartPhone() {

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

}
