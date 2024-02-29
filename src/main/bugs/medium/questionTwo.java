package main.bugs.medium;

public class questionTwo {
    public static void main(String[] args) {
        String str1 = new String("Hello");
        String str2 = new String("Hello");

        // Bug: using '==' to compare strings which compares reference not the content
        // The correct way to compare strings: using .equals() method
        if (str1 == str2) {
            System.out.println("Using '==': str1 and str2 are considered equal.");
        } else {
            System.out.println("Using '==': str1 and str2 are not considered equal.");
        }
    }
}
