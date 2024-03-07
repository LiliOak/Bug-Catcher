package main.bugs.finalBoss;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Device {
    int id;
    String status;
    double connectivityStrength;
    List<String> eventLog;

    Device(int id) {
        this.id = id;
        this.status = "active";
        this.connectivityStrength = new Random().nextDouble();
        this.eventLog = new ArrayList<>();
    }

    void updateStatus() {
        // Simulates complex status update logic
        if (connectivityStrength < 0.2) {
            status = "inactive";
            eventLog.add("Disconnected due to low connectivity.");
        } else {
            status = "active";
            connectivityStrength += 0.01; // Simulate changing connectivity
            eventLog.add("Status checked: active.");
        }
    }
}

public class questionOne {
    public static void main(String[] args) {
        List<Device> devices = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            devices.add(new Device(i));
        }

        // Simulate 100 loops
        for (int i = 0; i < 100; i++) {
            for (Device device : devices) {
                // Try using the debugger here, beats 100 print statements
                device.updateStatus();
                // Bug: One specific device behaves unexpectedly
                // Solution: this special condition causing unexpected behavior
                if (device.id == 50 && i == 50) {
                    device.status = "error";
                    device.eventLog.add("Unexpected error at iteration 50.");
                }
            }
        }

        // TODO: At the end of the simulation, all devices should be active, but one will not be due to the bug.
        for (Device device : devices) {
            if (!device.status.equals("active")) {
                System.out.println("Device " + device.id + " has an unexpected status: " + device.status);
            }
        }
    }
}
