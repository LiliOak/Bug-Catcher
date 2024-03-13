package main.bugs.easy;

import java.util.ArrayList;
import java.util.List;

class Bug {
    String type;
    int effort;

    Bug(String type, int effort) {
        this.type = type;
        this.effort = effort;
    }
}

public class questionThree {
    public static void main(String[] args) {
        List<Bug> bugs = initializeBugs();

        // Total effort starts at 0 and accumulates based on bug resolutions
        int totalEffort = 0;
        for (Bug bug : bugs) {
            // The effort to fix each bug type is computed within the resolveBug method
            totalEffort += resolveBug(bug);
        }

        System.out.println("Total effort to resolve all bugs (in hours): " + totalEffort);
    }

    private static List<Bug> initializeBugs() {
        List<Bug> bugs = new ArrayList<>();
        bugs.add(new Bug("Critical", 8));
        bugs.add(new Bug("Major", 5));
        bugs.add(new Bug("Minor", 2));

        return bugs;
    }

    private static int resolveBug(Bug bug) {
        switch (bug.type) {
            case "Critical":
                // Unnecessry complex logic
                return bug.effort / 2; // Bug: should be simply added
            case "Major":
                return bug.effort;
            case "Minor":
                // Unnecessry complex logic
                if (bug.effort > 1) {
                    return bug.effort - 1; // Simulating reduced effort for minor bugs, a misdirection
                } else {
                    return bug.effort;
                }
            default:
                return 0;
        }
    }
}
