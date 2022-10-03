package org.launchcode.java.exercises.lsn6inheritance.main;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;
import java.util.Scanner;

public class Computer extends AbstractEntity {

    private String user;
    private int screenBrightness;
    private String os;
    private boolean isUnlocked;
    private String pw;

    public Computer(String user, String os, String pw) {
        this.screenBrightness = 10;
        this.user = user;
        this.os = os;
        this.isUnlocked = false;
        this.pw = pw;
    }

    // TODO: ask about toString security; should I use getUser, or user? etc
    // lots of setters, but no getters?
    // pw?
    @Override
    public String toString() {
        return String.format("Hello %s! You are using %s.", user, os);
    }

    public String getUser() {
        return user;
    }

    public int getScreenBrightness() {
        return screenBrightness;
    }

    public String getOs() {
        return os;
    }

    public boolean checkUnlocked() {
        return isUnlocked;
    }

    public void unlock() {

        if (isUnlocked) {
            return;
        }

        Scanner input;
        String pwAttempt;
        int attemptsAllowed = 3;
        input = new Scanner(System.in);

        System.out.print("Please enter password to continue. ");
        for (int i = attemptsAllowed; i > 0; i--) {
            System.out.printf(i != 1 ? "%d attempts remaining.%n" : "%d attempt remaining.%n", i);
            pwAttempt = input.nextLine();

            if (pwAttempt.equals(this.pw)) {
                this.isUnlocked = true;
                System.out.println("Success!");
                return;
            }
        }
    }

    public void lock() {
        isUnlocked = false;
    }

    public void setBrightness() {

        unlock();
        if (!isUnlocked) {
            return;
        }

        Scanner input;
        System.out.print("Enter screen brightness: ");
        input = new Scanner(System.in);
        this.screenBrightness = input.nextInt();

        lock();
    }

    public void calculator () throws ScriptException{
        Scanner input;
        String expression;
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");

        System.out.println("Enter Math");
        input = new Scanner(System.in);
        expression = input.next();

        System.out.println(" = " + engine.eval(expression));

    }

//    public static void main(String[] args) throws ScriptException {
//        Computer box = new Computer("Robot", "Assembly", "0000");
//        System.out.println(box);
//        box.calculator();
//
//        SmartPhone gabeMini12 = new SmartPhone("Gabe", "iOS", "4321");
//        System.out.println(gabeMini12);
//        gabeMini12.takePicture();
//
//        System.out.println();
//        Laptop gabeMac = new Laptop("Gabriel", "macOS", "1234");
//        System.out.println(gabeMac);
//        gabeMac.setBrightness();
//        gabeMac.setBrightness();
//    }
}
