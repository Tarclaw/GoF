package edu.examples.structural.b_briidge;

import edu.examples.structural.b_briidge.devices.Device;
import edu.examples.structural.b_briidge.devices.Radio;
import edu.examples.structural.b_briidge.devices.Tv;
import edu.examples.structural.b_briidge.remotes.AdvancedRemote;
import edu.examples.structural.b_briidge.remotes.BasicRemote;

public class Demo {
    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
