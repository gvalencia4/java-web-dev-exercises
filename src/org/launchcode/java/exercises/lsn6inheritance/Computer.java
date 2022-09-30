package org.launchcode.java.exercises.lsn6inheritance;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;
import java.util.Scanner;

public class Computer {

    private String user;
    private int screenBrightness;
    private String os;
    private boolean isLocked;

    Computer() {

    }

    @Override
    public String toString() {
        return "Hello " + user + "! You are using " + os + ".";
    }

    public void increaseBrightness() {
        Scanner input;
        String expression;

        System.out.print("Enter screen brightness: ");
        input = new Scanner(System.in);
        expression = input.next();
    }

    public static void calculator () throws ScriptException{
        Scanner input;
        String expression;
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");

        System.out.println("Enter Math");
        input = new Scanner(System.in);
        expression = input.next();

        System.out.print(" = " + engine.eval(expression));

    }

    public static void main(String[] args) throws ScriptException {
        Computer.calculator();
    }
}
