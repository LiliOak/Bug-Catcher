package main.bugs.medium;

public class questionTwo {
    public static void main(String[] args) {
        String original = "Hello";
        String modified = " Hel" + "lo".trim(); // Seems like it should be equal to "Hello"

        // Adding complexity by involving string manipulation
        String transformedOriginal = transformString(original);
        String transformedModified = transformString(modified);

        // Bug: using '==' to compare results of string transformations
        // Solution: should be using '.equals()' instead
        if (transformedOriginal == transformedModified) {
            System.out.println("Using '==': transformedOriginal and transformedModified are considered equal.");
        } else {
            System.out.println("Using '==': transformedOriginal and transformedModified are not considered equal.");
        }
    }

    private static String transformString(String input) {
        // This function does not do anything, it returns the string as originally is
        String result = input.toLowerCase().toUpperCase();
        return result + "";
    }
}
