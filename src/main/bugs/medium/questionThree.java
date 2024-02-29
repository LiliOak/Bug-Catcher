package main.bugs.medium;

import java.util.Scanner;

public class questionThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10: ");
        int number = scanner.nextInt();

        if (number > 5) {
            System.out.println("The number is greater than 5.");
        } else if (number < 5) {
            System.out.println("The number is less than 5.");
        }
        // Bug: missed handling the case when number is exactly 5
        scanner.close();
    }
}
