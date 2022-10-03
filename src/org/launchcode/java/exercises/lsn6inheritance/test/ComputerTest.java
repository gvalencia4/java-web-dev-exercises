package org.launchcode.java.exercises.lsn6inheritance.test;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import org.launchcode.java.exercises.lsn6inheritance.main.Computer;
import org.launchcode.java.exercises.lsn6inheritance.main.Laptop;
import org.launchcode.java.exercises.lsn6inheritance.main.SmartPhone;

import java.io.ByteArrayInputStream;

public class ComputerTest {

    static Computer box;
    static Laptop mac;
    static SmartPhone iphone;

    static String computerPW = "0000";
    static String laptopPW = "1234";
    static String phonePW = "4321";

    @BeforeClass
    public static void createTestObjects() {
        box = new Computer("Robot", "Assembly", computerPW);
        mac = new Laptop("Gabe", "macOS", laptopPW);
        iphone = new SmartPhone("Robot", "Assembly", phonePW);
    }

    @Test
    public void isLockedWhenInitiated() {
        assertFalse(box.checkUnlocked());
    }

    @Test
    public void boxIDIsCorrect() {
        assertEquals(box.getID(), 1000);
    }

    @Test
    public void macIDIsCorrect() {
        assertEquals(mac.getID(), 1001);
    }

    @Test
    public void iphoneIDIsCorrect() {
        assertEquals(iphone.getID(), 1002);
    }

//    @Test
//    public void setsBrightnessCorrectly() {
//        String userInput = String.format("0000%s10", System.lineSeparator());
//        ByteArrayInputStream bais = new ByteArrayInputStream(userInput.getBytes());
//        System.setIn(bais);
//
//        box.setBrightness();
//        System.out.println(box.getScreenBrightness());
//
//        assertEquals(box.getScreenBrightness(), "100");
//    }


}
