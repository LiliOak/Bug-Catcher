package main.bugs.easy;

public class questionTwo {
    private static void performStartupChecks() {
        // Dummy method for distraction
        System.out.println("Performing startup checks...");
    }

    private static void terminateProgram() {
        // Dummy method for distraction
        System.out.println("Porgram ended.");
    }

    private static void incrementAndPrint() {
        int i = 0;
        // Hidden logic issue: due to the calculations inside, 'i' will never be 10.
        while (i < 10) {
            i += 2;
            i = complexIncrement(i);
            System.out.println("i is " + i);
        }
    }

    private static int complexIncrement(int value) {
        // The overly complicated logic is a misdirection
        // Solution: just return value + 1;
        if (value < 5) {
            return value + 3;
        } else {
            return (value + 3) % 10;
        }
    }

    public static void main(String[] args) {
        System.out.println("Starting program...");

        performStartupChecks();
        // Bug: forgetting to call incrementAndPrint();
        terminateProgram();
    }

}
