package main.bugs.easy;

public class questionThree {
    public static void main(String[] args) {
        int numberOfItems = 50;
        int additionalItems = 10;
        int totalCost = 1000;

        // Bug: Using division instead of addition to calculate the total number
        // of items. Should be +
        int totalItems = numberOfItems / additionalItems;

        int costPerItem = totalCost / totalItems;

        System.out.println("Total items (incorrect due to logical bug): " + totalItems);
        System.out.println("Cost per item (also incorrect): " + costPerItem);
    }
}
