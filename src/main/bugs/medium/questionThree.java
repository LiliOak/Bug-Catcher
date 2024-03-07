package main.bugs.medium;

import java.util.Scanner;

// Not sure how to simulate performance bottleneck, so if-else's instead!
public class questionThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10: ");
        int number = scanner.nextInt();

        // More statements for extra confusion
        if (number > 5 && number <= 10) {
            System.out.println("The number is greater than 5 and less or equal to 10.");
        } else if (number < 5 && number >= 1) {
            System.out.println("The number is less than 5 and greater or equal to 1.");
        } else if (number == 10) {
            System.out.println("You entered the maximum value!");
        } else if (number == 1) {
            System.out.println("You entered the minimum value!");
        }
        // Bug: There's no else clause or specific condition for when number is exactly 5.
        // Solution: add a case when (number == 5)

        scanner.close();
    }
}
