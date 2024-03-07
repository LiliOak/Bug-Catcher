package main.bugs.easy;

public class questionThree {
    public static void main(String[] args) {
        int baseStoragePerDevice = 256; // Base storage in GB for each device.
        int additionalStoragePerDevice = 128; // Additional storage module in GB that can be attached.
        int numberOfDevices = 10;

        // Bug: Using division instead of addition to calculate the total storage capacity per device.
        // Should be + instead of /
        int totalStoragePerDevice = baseStoragePerDevice / additionalStoragePerDevice;
        int totalSystemStorage = totalStoragePerDevice * numberOfDevices;

        System.out.println("Total storage per device: " + totalStoragePerDevice + " GB");
        System.out.println("Total number of devices: " + numberOfDevices);
        System.out.println("Total system storage: " + totalSystemStorage + " GB");
    }
}
